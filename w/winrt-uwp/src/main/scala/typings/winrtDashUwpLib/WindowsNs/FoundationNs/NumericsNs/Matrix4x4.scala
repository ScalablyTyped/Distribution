package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.NumericsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a 4*4 floating point matrix. */
trait Matrix4x4 extends js.Object {
  /** The row one and column one element of the matrix. */
  var m11: scala.Double
  /** The row one and column two element of the matrix. */
  var m12: scala.Double
  /** The row one and column three element of the matrix. */
  var m13: scala.Double
  /** The row one and column four element of the matrix. */
  var m14: scala.Double
  /** The row two and column one element of the matrix. */
  var m21: scala.Double
  /** The row two and column two element of the matrix. */
  var m22: scala.Double
  /** The row two and column three element of the matrix. */
  var m23: scala.Double
  /** The row two and column four element of the matrix. */
  var m24: scala.Double
  /** The row three and column one element of the matrix. */
  var m31: scala.Double
  /** The row three and column two element of the matrix. */
  var m32: scala.Double
  /** The row three and column three element of the matrix. */
  var m33: scala.Double
  /** The row three and column four element of the matrix. */
  var m34: scala.Double
  /** The row four and column one element of the matrix. */
  var m41: scala.Double
  /** The row four and column two element of the matrix. */
  var m42: scala.Double
  /** The row four and column three element of the matrix. */
  var m43: scala.Double
  /** The row four and column four element of the matrix. */
  var m44: scala.Double
}

object Matrix4x4 {
  @scala.inline
  def apply(
    m11: scala.Double,
    m12: scala.Double,
    m13: scala.Double,
    m14: scala.Double,
    m21: scala.Double,
    m22: scala.Double,
    m23: scala.Double,
    m24: scala.Double,
    m31: scala.Double,
    m32: scala.Double,
    m33: scala.Double,
    m34: scala.Double,
    m41: scala.Double,
    m42: scala.Double,
    m43: scala.Double,
    m44: scala.Double
  ): Matrix4x4 = {
    val __obj = js.Dynamic.literal(m11 = m11, m12 = m12, m13 = m13, m14 = m14, m21 = m21, m22 = m22, m23 = m23, m24 = m24, m31 = m31, m32 = m32, m33 = m33, m34 = m34, m41 = m41, m42 = m42, m43 = m43, m44 = m44)
  
    __obj.asInstanceOf[Matrix4x4]
  }
}

