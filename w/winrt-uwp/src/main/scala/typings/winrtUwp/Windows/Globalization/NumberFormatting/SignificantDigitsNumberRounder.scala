package typings.winrtUwp.Windows.Globalization.NumberFormatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Rounds numbers to a specified number of significant digits. */
@js.native
trait SignificantDigitsNumberRounder extends js.Object {
  
  /**
    * Rounds a Double number to the specified number of significant digits.
    * @param value The Double value to be rounded.
    * @return The rounded number. This result is a double precision floating point number, which is not necessarily an integer.
    */
  def roundDouble(value: Double): Double = js.native
  
  /**
    * Rounds an Int32 number to the specified number of significant digits.
    * @param value The Int32 value to be rounded.
    * @return The rounded 32 bit integer.
    */
  def roundInt32(value: Double): Double = js.native
  
  /**
    * Rounds an Int64 number to the specified number of significant digits.
    * @param value The Int64 value to be rounded.
    * @return The rounded 64 bit integer.
    */
  def roundInt64(value: Double): Double = js.native
  
  /**
    * Rounds a Single number to the specified number of significant digits.
    * @param value The Single value to be rounded.
    * @return The rounded number. This result is a single precision floating point number, which is not necessarily an integer.
    */
  def roundSingle(value: Double): Double = js.native
  
  /**
    * Rounds a UInt32 number to the specified number of significant digits.
    * @param value The UInt32 value to be rounded.
    * @return The rounded unsigned 32 bit integer.
    */
  def roundUInt32(value: Double): Double = js.native
  
  /**
    * Rounds a UInt64 number to the specified number of significant digits.
    * @param value The UInt64 value to be rounded.
    * @return The rounded unsigned 64 bit integer.
    */
  def roundUInt64(value: Double): Double = js.native
  
  /** Gets or sets the rounding strategy value for this SignificantDigitsNumberRounder object. */
  var roundingAlgorithm: RoundingAlgorithm = js.native
  
  /** Gets or sets the number of significant digits this SignificantDigitsNumberRounder object uses for rounding. */
  var significantDigits: Double = js.native
}
object SignificantDigitsNumberRounder {
  
  @scala.inline
  def apply(
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
  implicit class SignificantDigitsNumberRounderOps[Self <: SignificantDigitsNumberRounder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRoundDouble(value: Double => Double): Self = this.set("roundDouble", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRoundInt32(value: Double => Double): Self = this.set("roundInt32", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRoundInt64(value: Double => Double): Self = this.set("roundInt64", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRoundSingle(value: Double => Double): Self = this.set("roundSingle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRoundUInt32(value: Double => Double): Self = this.set("roundUInt32", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRoundUInt64(value: Double => Double): Self = this.set("roundUInt64", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRoundingAlgorithm(value: RoundingAlgorithm): Self = this.set("roundingAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignificantDigits(value: Double): Self = this.set("significantDigits", value.asInstanceOf[js.Any])
  }
}
