package typings.winrtUwp.Windows.Foundation.Numerics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a 4*4 floating point matrix. */
trait Matrix4x4 extends js.Object {
  /** The row one and column one element of the matrix. */
  var m11: Double
  /** The row one and column two element of the matrix. */
  var m12: Double
  /** The row one and column three element of the matrix. */
  var m13: Double
  /** The row one and column four element of the matrix. */
  var m14: Double
  /** The row two and column one element of the matrix. */
  var m21: Double
  /** The row two and column two element of the matrix. */
  var m22: Double
  /** The row two and column three element of the matrix. */
  var m23: Double
  /** The row two and column four element of the matrix. */
  var m24: Double
  /** The row three and column one element of the matrix. */
  var m31: Double
  /** The row three and column two element of the matrix. */
  var m32: Double
  /** The row three and column three element of the matrix. */
  var m33: Double
  /** The row three and column four element of the matrix. */
  var m34: Double
  /** The row four and column one element of the matrix. */
  var m41: Double
  /** The row four and column two element of the matrix. */
  var m42: Double
  /** The row four and column three element of the matrix. */
  var m43: Double
  /** The row four and column four element of the matrix. */
  var m44: Double
}

object Matrix4x4 {
  @scala.inline
  def apply(
    m11: Double,
    m12: Double,
    m13: Double,
    m14: Double,
    m21: Double,
    m22: Double,
    m23: Double,
    m24: Double,
    m31: Double,
    m32: Double,
    m33: Double,
    m34: Double,
    m41: Double,
    m42: Double,
    m43: Double,
    m44: Double
  ): Matrix4x4 = {
    val __obj = js.Dynamic.literal(m11 = m11.asInstanceOf[js.Any], m12 = m12.asInstanceOf[js.Any], m13 = m13.asInstanceOf[js.Any], m14 = m14.asInstanceOf[js.Any], m21 = m21.asInstanceOf[js.Any], m22 = m22.asInstanceOf[js.Any], m23 = m23.asInstanceOf[js.Any], m24 = m24.asInstanceOf[js.Any], m31 = m31.asInstanceOf[js.Any], m32 = m32.asInstanceOf[js.Any], m33 = m33.asInstanceOf[js.Any], m34 = m34.asInstanceOf[js.Any], m41 = m41.asInstanceOf[js.Any], m42 = m42.asInstanceOf[js.Any], m43 = m43.asInstanceOf[js.Any], m44 = m44.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matrix4x4]
  }
}

