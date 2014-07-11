package no.simonsen.midi;

/*
 * A pattern that outputs a single value.
 */
public class ConstantPattern implements ValueSupplier {
	double value;
	
	public ConstantPattern(double value) {
		this.value = value;
	}
	
	public double nextValue() {
		return value;
	}
	
	public boolean hasNext() {
		return false;
	}
	
	public void reset() { }
	
	public String toString() {
		return "" + value;
	}
}
