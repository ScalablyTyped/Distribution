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

