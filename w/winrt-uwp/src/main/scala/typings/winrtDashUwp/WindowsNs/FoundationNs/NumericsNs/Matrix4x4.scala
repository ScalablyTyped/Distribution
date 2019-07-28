package typings.winrtDashUwp.WindowsNs.FoundationNs.NumericsNs

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
    val __obj = js.Dynamic.literal(m11 = m11, m12 = m12, m13 = m13, m14 = m14, m21 = m21, m22 = m22, m23 = m23, m24 = m24, m31 = m31, m32 = m32, m33 = m33, m34 = m34, m41 = m41, m42 = m42, m43 = m43, m44 = m44)
  
    __obj.asInstanceOf[Matrix4x4]
  }
}

