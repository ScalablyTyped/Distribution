package typings.titanium.Titanium.UI

import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The 3D Matrix is an object for holding values for a 3D affine transform.
		 */
@JSGlobal("Titanium.UI.Matrix3D")
@js.native
class Matrix3D () extends Proxy {
  /**
  			 * The entry at position [1,1] in the matrix.
  			 */
  var m11: Double = js.native
  /**
  			 * The entry at position [1,2] in the matrix.
  			 */
  var m12: Double = js.native
  /**
  			 * The entry at position [1,3] in the matrix.
  			 */
  var m13: Double = js.native
  /**
  			 * The entry at position [1,4] in the matrix.
  			 */
  var m14: Double = js.native
  /**
  			 * The entry at position [2,1] in the matrix.
  			 */
  var m21: Double = js.native
  /**
  			 * The entry at position [2,2] in the matrix.
  			 */
  var m22: Double = js.native
  /**
  			 * The entry at position [2,3] in the matrix.
  			 */
  var m23: Double = js.native
  /**
  			 * The entry at position [2,4] in the matrix.
  			 */
  var m24: Double = js.native
  /**
  			 * The entry at position [3,1] in the matrix.
  			 */
  var m31: Double = js.native
  /**
  			 * The entry at position [3,2] in the matrix.
  			 */
  var m32: Double = js.native
  /**
  			 * The entry at position [3,3] in the matrix.
  			 */
  var m33: Double = js.native
  /**
  			 * The entry at position [3,4] in the matrix.
  			 */
  var m34: Double = js.native
  /**
  			 * The entry at position [4,1] in the matrix.
  			 */
  var m41: Double = js.native
  /**
  			 * The entry at position [4,2] in the matrix.
  			 */
  var m42: Double = js.native
  /**
  			 * The entry at position [4,3] in the matrix.
  			 */
  var m43: Double = js.native
  /**
  			 * The entry at position [4,4] in the matrix.
  			 */
  var m44: Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Matrix3D.m11> property.
  			 * @deprecated Access <Titanium.UI.Matrix3D.m11> instead.
  			 */
  def getM11(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Matrix3D.m12> property.
  			 * @deprecated Access <Titanium.UI.Matrix3D.m12> instead.
  			 */
  def getM12(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Matrix3D.m13> property.
  			 * @deprecated Access <Titanium.UI.Matrix3D.m13> instead.
  			 */
  def getM13(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Matrix3D.m14> property.
  			 * @deprecated Access <Titanium.UI.Matrix3D.m14> instead.
  			 */
  def getM14(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Matrix3D.m21> property.
  			 * @deprecated Access <Titanium.UI.Matrix3D.m21> instead.
  			 */
  def getM21(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Matrix3D.m22> property.
  			 * @deprecated Access <Titanium.UI.Matrix3D.m22> instead.
  			 */
  def getM22(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Matrix3D.m23> property.
  			 * @deprecated Access <Titanium.UI.Matrix3D.m23> instead.
  			 */
  def getM23(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Matrix3D.m24> property.
  			 * @deprecated Access <Titanium.UI.Matrix3D.m24> instead.
  			 */
  def getM24(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Matrix3D.m31> property.
  			 * @deprecated Access <Titanium.UI.Matrix3D.m31> instead.
  			 */
  def getM31(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Matrix3D.m32> property.
  			 * @deprecated Access <Titanium.UI.Matrix3D.m32> instead.
  			 */
  def getM32(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Matrix3D.m33> property.
  			 * @deprecated Access <Titanium.UI.Matrix3D.m33> instead.
  			 */
  def getM33(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Matrix3D.m34> property.
  			 * @deprecated Access <Titanium.UI.Matrix3D.m34> instead.
  			 */
  def getM34(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Matrix3D.m41> property.
  			 * @deprecated Access <Titanium.UI.Matrix3D.m41> instead.
  			 */
  def getM41(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Matrix3D.m42> property.
  			 * @deprecated Access <Titanium.UI.Matrix3D.m42> instead.
  			 */
  def getM42(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Matrix3D.m43> property.
  			 * @deprecated Access <Titanium.UI.Matrix3D.m43> instead.
  			 */
  def getM43(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Matrix3D.m44> property.
  			 * @deprecated Access <Titanium.UI.Matrix3D.m44> instead.
  			 */
  def getM44(): Double = js.native
  /**
  			 * Returns a matrix constructed by inverting this matrix.
  			 */
  def invert(): Matrix3D = js.native
  /**
  			 * Returns a matrix constructed by combining two existing matrix.
  			 */
  def multiply(t2: Matrix3D): Matrix3D = js.native
  /**
  			 * Returns a matrix constructed by rotating this matrix.
  			 */
  def rotate(angle: Double, x: Double, y: Double, z: Double): Matrix3D = js.native
  /**
  			 * Returns a matrix constructed by scaling this matrix.
  			 */
  def scale(sx: Double, sy: Double, sz: Double): Matrix3D = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Matrix3D.m11> property.
  			 * @deprecated Set the value using <Titanium.UI.Matrix3D.m11> instead.
  			 */
  def setM11(m11: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Matrix3D.m12> property.
  			 * @deprecated Set the value using <Titanium.UI.Matrix3D.m12> instead.
  			 */
  def setM12(m12: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Matrix3D.m13> property.
  			 * @deprecated Set the value using <Titanium.UI.Matrix3D.m13> instead.
  			 */
  def setM13(m13: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Matrix3D.m14> property.
  			 * @deprecated Set the value using <Titanium.UI.Matrix3D.m14> instead.
  			 */
  def setM14(m14: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Matrix3D.m21> property.
  			 * @deprecated Set the value using <Titanium.UI.Matrix3D.m21> instead.
  			 */
  def setM21(m21: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Matrix3D.m22> property.
  			 * @deprecated Set the value using <Titanium.UI.Matrix3D.m22> instead.
  			 */
  def setM22(m22: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Matrix3D.m23> property.
  			 * @deprecated Set the value using <Titanium.UI.Matrix3D.m23> instead.
  			 */
  def setM23(m23: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Matrix3D.m24> property.
  			 * @deprecated Set the value using <Titanium.UI.Matrix3D.m24> instead.
  			 */
  def setM24(m24: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Matrix3D.m31> property.
  			 * @deprecated Set the value using <Titanium.UI.Matrix3D.m31> instead.
  			 */
  def setM31(m31: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Matrix3D.m32> property.
  			 * @deprecated Set the value using <Titanium.UI.Matrix3D.m32> instead.
  			 */
  def setM32(m32: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Matrix3D.m33> property.
  			 * @deprecated Set the value using <Titanium.UI.Matrix3D.m33> instead.
  			 */
  def setM33(m33: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Matrix3D.m34> property.
  			 * @deprecated Set the value using <Titanium.UI.Matrix3D.m34> instead.
  			 */
  def setM34(m34: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Matrix3D.m41> property.
  			 * @deprecated Set the value using <Titanium.UI.Matrix3D.m41> instead.
  			 */
  def setM41(m41: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Matrix3D.m42> property.
  			 * @deprecated Set the value using <Titanium.UI.Matrix3D.m42> instead.
  			 */
  def setM42(m42: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Matrix3D.m43> property.
  			 * @deprecated Set the value using <Titanium.UI.Matrix3D.m43> instead.
  			 */
  def setM43(m43: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Matrix3D.m44> property.
  			 * @deprecated Set the value using <Titanium.UI.Matrix3D.m44> instead.
  			 */
  def setM44(m44: Double): Unit = js.native
  /**
  			 * Returns a matrix constructed by translating an existing matrix.
  			 */
  def translate(tx: Double, ty: Double, tz: Double): Matrix3D = js.native
}

