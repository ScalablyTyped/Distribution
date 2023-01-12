package typings.winrtUwp.Windows.Globalization.NumberFormatting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Rounds numbers to a specified number of significant digits. */
trait SignificantDigitsNumberRounder extends StObject {
  
  /**
    * Rounds a Double number to the specified number of significant digits.
    * @param value The Double value to be rounded.
    * @return The rounded number. This result is a double precision floating point number, which is not necessarily an integer.
    */
  def roundDouble(value: Double): Double
  
  /**
    * Rounds an Int32 number to the specified number of significant digits.
    * @param value The Int32 value to be rounded.
    * @return The rounded 32 bit integer.
    */
  def roundInt32(value: Double): Double
  
  /**
    * Rounds an Int64 number to the specified number of significant digits.
    * @param value The Int64 value to be rounded.
    * @return The rounded 64 bit integer.
    */
  def roundInt64(value: Double): Double
  
  /**
    * Rounds a Single number to the specified number of significant digits.
    * @param value The Single value to be rounded.
    * @return The rounded number. This result is a single precision floating point number, which is not necessarily an integer.
    */
  def roundSingle(value: Double): Double
  
  /**
    * Rounds a UInt32 number to the specified number of significant digits.
    * @param value The UInt32 value to be rounded.
    * @return The rounded unsigned 32 bit integer.
    */
  def roundUInt32(value: Double): Double
  
  /**
    * Rounds a UInt64 number to the specified number of significant digits.
    * @param value The UInt64 value to be rounded.
    * @return The rounded unsigned 64 bit integer.
    */
  def roundUInt64(value: Double): Double
  
  /** Gets or sets the rounding strategy value for this SignificantDigitsNumberRounder object. */
  var roundingAlgorithm: RoundingAlgorithm
  
  /** Gets or sets the number of significant digits this SignificantDigitsNumberRounder object uses for rounding. */
  var significantDigits: Double
}
object SignificantDigitsNumberRounder {
  
  inline def apply(
    roundDouble: Double => Double,
    roundInt32: Double => Double,
    roundInt64: Double => Double,
    roundSingle: Double => Double,
    roundUInt32: Double => Double,
    roundUInt64: Double => Double,
    roundingAlgorithm: RoundingAlgorithm,
    significantDigits: Double
  ): SignificantDigitsNumberRounder = {
    val __obj = js.Dynamic.literal(roundDouble = js.Any.fromFunction1(roundDouble), roundInt32 = js.Any.fromFunction1(roundInt32), roundInt64 = js.Any.fromFunction1(roundInt64), roundSingle = js.Any.fromFunction1(roundSingle), roundUInt32 = js.Any.fromFunction1(roundUInt32), roundUInt64 = js.Any.fromFunction1(roundUInt64), roundingAlgorithm = roundingAlgorithm.asInstanceOf[js.Any], significantDigits = significantDigits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignificantDigitsNumberRounder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignificantDigitsNumberRounder] (val x: Self) extends AnyVal {
    
    inline def setRoundDouble(value: Double => Double): Self = StObject.set(x, "roundDouble", js.Any.fromFunction1(value))
    
    inline def setRoundInt32(value: Double => Double): Self = StObject.set(x, "roundInt32", js.Any.fromFunction1(value))
    
    inline def setRoundInt64(value: Double => Double): Self = StObject.set(x, "roundInt64", js.Any.fromFunction1(value))
    
    inline def setRoundSingle(value: Double => Double): Self = StObject.set(x, "roundSingle", js.Any.fromFunction1(value))
    
    inline def setRoundUInt32(value: Double => Double): Self = StObject.set(x, "roundUInt32", js.Any.fromFunction1(value))
    
    inline def setRoundUInt64(value: Double => Double): Self = StObject.set(x, "roundUInt64", js.Any.fromFunction1(value))
    
    inline def setRoundingAlgorithm(value: RoundingAlgorithm): Self = StObject.set(x, "roundingAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignificantDigits(value: Double): Self = StObject.set(x, "significantDigits", value.asInstanceOf[js.Any])
  }
}
