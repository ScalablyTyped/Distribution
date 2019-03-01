package typings
package winrtDashUwpLib.WindowsNs.GlobalizationNs.NumberFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface that returns rounded results for provided numbers of several data types. */
trait INumberRounder extends js.Object {
  /**
    * Rounds a Double number.
    * @param value The Double value to be rounded.
    * @return The rounded number. This result is a double precision floating point number, which is not necessarily an integer.
    */
  def roundDouble(value: scala.Double): scala.Double
  /**
    * Rounds an Int32 number.
    * @param value The Int32 value to be rounded.
    * @return The rounded 32 bit integer.
    */
  def roundInt32(value: scala.Double): scala.Double
  /**
    * Rounds an Int64 number.
    * @param value The Int64 value to be rounded.
    * @return The rounded 64 bit integer.
    */
  def roundInt64(value: scala.Double): scala.Double
  /**
    * Rounds a Single number.
    * @param value The Single value to be rounded.
    * @return The rounded number. This result is a single precision floating point number, which is not necessarily an integer.
    */
  def roundSingle(value: scala.Double): scala.Double
  /**
    * Rounds a UInt32 number.
    * @param value The UInt32 value to be rounded.
    * @return The rounded unsigned 32 bit integer.
    */
  def roundUInt32(value: scala.Double): scala.Double
  /**
    * Rounds a UInt64 number.
    * @param value The UInt64 value to be rounded.
    * @return The rounded unsigned 64 bit integer.
    */
  def roundUInt64(value: scala.Double): scala.Double
}

object INumberRounder {
  @scala.inline
  def apply(
    roundDouble: js.Function1[scala.Double, scala.Double],
    roundInt32: js.Function1[scala.Double, scala.Double],
    roundInt64: js.Function1[scala.Double, scala.Double],
    roundSingle: js.Function1[scala.Double, scala.Double],
    roundUInt32: js.Function1[scala.Double, scala.Double],
    roundUInt64: js.Function1[scala.Double, scala.Double]
  ): INumberRounder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("roundDouble")(roundDouble)
    __obj.updateDynamic("roundInt32")(roundInt32)
    __obj.updateDynamic("roundInt64")(roundInt64)
    __obj.updateDynamic("roundSingle")(roundSingle)
    __obj.updateDynamic("roundUInt32")(roundUInt32)
    __obj.updateDynamic("roundUInt64")(roundUInt64)
    __obj.asInstanceOf[INumberRounder]
  }
}

