package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.NumericsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a 3*2 floating point matrix. */
trait Matrix3x2 extends js.Object {
  /** The row one and column one element of the matrix. */
  var m11: scala.Double
  /** The row one and column two element of the matrix. */
  var m12: scala.Double
  /** The row two and column one element of the matrix. */
  var m21: scala.Double
  /** The row two and column two element of the matrix. */
  var m22: scala.Double
  /** The row three and column one element of the matrix. */
  var m31: scala.Double
  /** The row three and column two element of the matrix. */
  var m32: scala.Double
}

object Matrix3x2 {
  @scala.inline
  def apply(
    m11: scala.Double,
    m12: scala.Double,
    m21: scala.Double,
    m22: scala.Double,
    m31: scala.Double,
    m32: scala.Double
  ): Matrix3x2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("m11")(m11)
    __obj.updateDynamic("m12")(m12)
    __obj.updateDynamic("m21")(m21)
    __obj.updateDynamic("m22")(m22)
    __obj.updateDynamic("m31")(m31)
    __obj.updateDynamic("m32")(m32)
    __obj.asInstanceOf[Matrix3x2]
  }
}

