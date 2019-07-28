package typings.winrtDashUwp.WindowsNs.GlobalizationNs.NumberFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Rounds numbers to a specified increment. */
@JSGlobal("Windows.Globalization.NumberFormatting.IncrementNumberRounder")
@js.native
/** Creates an IncrementNumberRounder object. */
class IncrementNumberRounder () extends js.Object {
  /** Gets or sets the increment this IncrementNumberRounder object uses for rounding. */
  var increment: Double = js.native
  /** Gets or sets the rounding strategy value for this IncrementNumberRounder object. */
  var roundingAlgorithm: RoundingAlgorithm = js.native
  /**
    * Rounds a Double number to the specified increment.
    * @param value The Double value to be rounded.
    * @return The rounded number. This result is a double precision floating point number, which is not necessarily an integer.
    */
  def roundDouble(value: Double): Double = js.native
  /**
    * Rounds an Int32 number to the specified increment.
    * @param value The Int32 value to be rounded.
    * @return The rounded 32 bit integer.
    */
  def roundInt32(value: Double): Double = js.native
  /**
    * Rounds an Int64 number to the specified increment.
    * @param value The Int64 value to be rounded.
    * @return The rounded 64 bit integer.
    */
  def roundInt64(value: Double): Double = js.native
  /**
    * Rounds a Single number to the specified increment.
    * @param value The Single value to be rounded.
    * @return The rounded number. This result is a single precision floating point number, which is not necessarily an integer.
    */
  def roundSingle(value: Double): Double = js.native
  /**
    * Rounds a UInt32 number to the specified increment.
    * @param value The UInt32 value to be rounded.
    * @return The rounded unsigned 32 bit integer.
    */
  def roundUInt32(value: Double): Double = js.native
  /**
    * Rounds a UInt64 number to the specified increment.
    * @param value The UInt64 value to be rounded.
    * @return The rounded unsigned 64 bit integer.
    */
  def roundUInt64(value: Double): Double = js.native
}

