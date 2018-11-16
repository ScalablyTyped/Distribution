package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * The 3D Matrix is an object for holding values for a 3D affine transform.
			 */

trait Matrix3D
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * The entry at position [1,1] in the matrix.
  				 */
  var m11: scala.Double
  /**
  				 * The entry at position [1,2] in the matrix.
  				 */
  var m12: scala.Double
  /**
  				 * The entry at position [1,3] in the matrix.
  				 */
  var m13: scala.Double
  /**
  				 * The entry at position [1,4] in the matrix.
  				 */
  var m14: scala.Double
  /**
  				 * The entry at position [2,1] in the matrix.
  				 */
  var m21: scala.Double
  /**
  				 * The entry at position [2,2] in the matrix.
  				 */
  var m22: scala.Double
  /**
  				 * The entry at position [2,3] in the matrix.
  				 */
  var m23: scala.Double
  /**
  				 * The entry at position [2,4] in the matrix.
  				 */
  var m24: scala.Double
  /**
  				 * The entry at position [3,1] in the matrix.
  				 */
  var m31: scala.Double
  /**
  				 * The entry at position [3,2] in the matrix.
  				 */
  var m32: scala.Double
  /**
  				 * The entry at position [3,3] in the matrix.
  				 */
  var m33: scala.Double
  /**
  				 * The entry at position [3,4] in the matrix.
  				 */
  var m34: scala.Double
  /**
  				 * The entry at position [4,1] in the matrix.
  				 */
  var m41: scala.Double
  /**
  				 * The entry at position [4,2] in the matrix.
  				 */
  var m42: scala.Double
  /**
  				 * The entry at position [4,3] in the matrix.
  				 */
  var m43: scala.Double
  /**
  				 * The entry at position [4,4] in the matrix.
  				 */
  var m44: scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.3DMatrix.m11> property.
  				 */
  def getM11(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.3DMatrix.m12> property.
  				 */
  def getM12(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.3DMatrix.m13> property.
  				 */
  def getM13(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.3DMatrix.m14> property.
  				 */
  def getM14(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.3DMatrix.m21> property.
  				 */
  def getM21(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.3DMatrix.m22> property.
  				 */
  def getM22(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.3DMatrix.m23> property.
  				 */
  def getM23(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.3DMatrix.m24> property.
  				 */
  def getM24(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.3DMatrix.m31> property.
  				 */
  def getM31(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.3DMatrix.m32> property.
  				 */
  def getM32(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.3DMatrix.m33> property.
  				 */
  def getM33(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.3DMatrix.m34> property.
  				 */
  def getM34(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.3DMatrix.m41> property.
  				 */
  def getM41(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.3DMatrix.m42> property.
  				 */
  def getM42(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.3DMatrix.m43> property.
  				 */
  def getM43(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.3DMatrix.m44> property.
  				 */
  def getM44(): scala.Double
  /**
  				 * Returns a matrix constructed by inverting an existing matrix.
  				 */
  def invert(): titaniumLib.TitaniumNs.UINs.Matrix3D
  /**
  				 * Returns a matrix constructed by combining two existing matrices.
  				 */
  def multiply(t2: titaniumLib.TitaniumNs.UINs.Matrix3D): titaniumLib.TitaniumNs.UINs.Matrix3D
  /**
  				 * Returns a matrix constructed by rotating an existing matrix.
  				 */
  def rotate(angle: scala.Double, x: scala.Double, y: scala.Double, z: scala.Double): titaniumLib.TitaniumNs.UINs.Matrix3D
  /**
  				 * Returns a matrix constructed by scaling an existing matrix.
  				 */
  def scale(sx: scala.Double, sy: scala.Double, sz: scala.Double): titaniumLib.TitaniumNs.UINs.Matrix3D
  /**
  				 * Sets the value of the <Titanium.UI.iOS.3DMatrix.m11> property.
  				 */
  def setM11(m11: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.3DMatrix.m12> property.
  				 */
  def setM12(m12: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.3DMatrix.m13> property.
  				 */
  def setM13(m13: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.3DMatrix.m14> property.
  				 */
  def setM14(m14: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.3DMatrix.m21> property.
  				 */
  def setM21(m21: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.3DMatrix.m22> property.
  				 */
  def setM22(m22: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.3DMatrix.m23> property.
  				 */
  def setM23(m23: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.3DMatrix.m24> property.
  				 */
  def setM24(m24: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.3DMatrix.m31> property.
  				 */
  def setM31(m31: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.3DMatrix.m32> property.
  				 */
  def setM32(m32: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.3DMatrix.m33> property.
  				 */
  def setM33(m33: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.3DMatrix.m34> property.
  				 */
  def setM34(m34: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.3DMatrix.m41> property.
  				 */
  def setM41(m41: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.3DMatrix.m42> property.
  				 */
  def setM42(m42: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.3DMatrix.m43> property.
  				 */
  def setM43(m43: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.3DMatrix.m44> property.
  				 */
  def setM44(m44: scala.Double): scala.Unit
  /**
  				 * Returns a matrix constructed by translating an existing matrix.
  				 */
  def translate(tx: scala.Double, ty: scala.Double, tz: scala.Double): titaniumLib.TitaniumNs.UINs.Matrix3D
}

