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

object Matrix3D {
  @scala.inline
  def apply(
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getM11: js.Function0[scala.Double],
    getM12: js.Function0[scala.Double],
    getM13: js.Function0[scala.Double],
    getM14: js.Function0[scala.Double],
    getM21: js.Function0[scala.Double],
    getM22: js.Function0[scala.Double],
    getM23: js.Function0[scala.Double],
    getM24: js.Function0[scala.Double],
    getM31: js.Function0[scala.Double],
    getM32: js.Function0[scala.Double],
    getM33: js.Function0[scala.Double],
    getM34: js.Function0[scala.Double],
    getM41: js.Function0[scala.Double],
    getM42: js.Function0[scala.Double],
    getM43: js.Function0[scala.Double],
    getM44: js.Function0[scala.Double],
    invert: js.Function0[titaniumLib.TitaniumNs.UINs.Matrix3D],
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
    m44: scala.Double,
    multiply: js.Function1[titaniumLib.TitaniumNs.UINs.Matrix3D, titaniumLib.TitaniumNs.UINs.Matrix3D],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    rotate: js.Function4[
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      titaniumLib.TitaniumNs.UINs.Matrix3D
    ],
    scale: js.Function3[scala.Double, scala.Double, scala.Double, titaniumLib.TitaniumNs.UINs.Matrix3D],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setM11: js.Function1[scala.Double, scala.Unit],
    setM12: js.Function1[scala.Double, scala.Unit],
    setM13: js.Function1[scala.Double, scala.Unit],
    setM14: js.Function1[scala.Double, scala.Unit],
    setM21: js.Function1[scala.Double, scala.Unit],
    setM22: js.Function1[scala.Double, scala.Unit],
    setM23: js.Function1[scala.Double, scala.Unit],
    setM24: js.Function1[scala.Double, scala.Unit],
    setM31: js.Function1[scala.Double, scala.Unit],
    setM32: js.Function1[scala.Double, scala.Unit],
    setM33: js.Function1[scala.Double, scala.Unit],
    setM34: js.Function1[scala.Double, scala.Unit],
    setM41: js.Function1[scala.Double, scala.Unit],
    setM42: js.Function1[scala.Double, scala.Unit],
    setM43: js.Function1[scala.Double, scala.Unit],
    setM44: js.Function1[scala.Double, scala.Unit],
    translate: js.Function3[scala.Double, scala.Double, scala.Double, titaniumLib.TitaniumNs.UINs.Matrix3D],
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): Matrix3D = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener, apiName = apiName, applyProperties = applyProperties, bubbleParent = bubbleParent, fireEvent = fireEvent, getApiName = getApiName, getBubbleParent = getBubbleParent, getM11 = getM11, getM12 = getM12, getM13 = getM13, getM14 = getM14, getM21 = getM21, getM22 = getM22, getM23 = getM23, getM24 = getM24, getM31 = getM31, getM32 = getM32, getM33 = getM33, getM34 = getM34, getM41 = getM41, getM42 = getM42, getM43 = getM43, getM44 = getM44, invert = invert, m11 = m11, m12 = m12, m13 = m13, m14 = m14, m21 = m21, m22 = m22, m23 = m23, m24 = m24, m31 = m31, m32 = m32, m33 = m33, m34 = m34, m41 = m41, m42 = m42, m43 = m43, m44 = m44, multiply = multiply, removeEventListener = removeEventListener, rotate = rotate, scale = scale, setBubbleParent = setBubbleParent, setM11 = setM11, setM12 = setM12, setM13 = setM13, setM14 = setM14, setM21 = setM21, setM22 = setM22, setM23 = setM23, setM24 = setM24, setM31 = setM31, setM32 = setM32, setM33 = setM33, setM34 = setM34, setM41 = setM41, setM42 = setM42, setM43 = setM43, setM44 = setM44, translate = translate)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Matrix3D]
  }
}

