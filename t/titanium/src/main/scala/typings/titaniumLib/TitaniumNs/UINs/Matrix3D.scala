package typings
package titaniumLib.TitaniumNs.UINs

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
  			 * Gets the value of the <Titanium.UI.3DMatrix.m11> property.
  			 */
  def getM11(): scala.Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m12> property.
  			 */
  def getM12(): scala.Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m13> property.
  			 */
  def getM13(): scala.Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m14> property.
  			 */
  def getM14(): scala.Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m21> property.
  			 */
  def getM21(): scala.Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m22> property.
  			 */
  def getM22(): scala.Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m23> property.
  			 */
  def getM23(): scala.Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m24> property.
  			 */
  def getM24(): scala.Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m31> property.
  			 */
  def getM31(): scala.Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m32> property.
  			 */
  def getM32(): scala.Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m33> property.
  			 */
  def getM33(): scala.Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m34> property.
  			 */
  def getM34(): scala.Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m41> property.
  			 */
  def getM41(): scala.Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m42> property.
  			 */
  def getM42(): scala.Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m43> property.
  			 */
  def getM43(): scala.Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m44> property.
  			 */
  def getM44(): scala.Double
  /**
  			 * Returns a matrix constructed by inverting this matrix.
  			 */
  def invert(): Matrix3D
  /**
  			 * Returns a matrix constructed by combining two existing matrix.
  			 */
  def multiply(t2: Matrix3D): Matrix3D
  /**
  			 * Returns a matrix constructed by rotating this matrix.
  			 */
  def rotate(angle: scala.Double, x: scala.Double, y: scala.Double, z: scala.Double): Matrix3D
  /**
  			 * Returns a matrix constructed by scaling this matrix.
  			 */
  def scale(sx: scala.Double, sy: scala.Double, sz: scala.Double): Matrix3D
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m11> property.
  			 */
  def setM11(m11: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m12> property.
  			 */
  def setM12(m12: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m13> property.
  			 */
  def setM13(m13: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m14> property.
  			 */
  def setM14(m14: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m21> property.
  			 */
  def setM21(m21: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m22> property.
  			 */
  def setM22(m22: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m23> property.
  			 */
  def setM23(m23: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m24> property.
  			 */
  def setM24(m24: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m31> property.
  			 */
  def setM31(m31: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m32> property.
  			 */
  def setM32(m32: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m33> property.
  			 */
  def setM33(m33: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m34> property.
  			 */
  def setM34(m34: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m41> property.
  			 */
  def setM41(m41: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m42> property.
  			 */
  def setM42(m42: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m43> property.
  			 */
  def setM43(m43: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m44> property.
  			 */
  def setM44(m44: scala.Double): scala.Unit
  /**
  			 * Returns a matrix constructed by translating an existing matrix.
  			 */
  def translate(tx: scala.Double, ty: scala.Double, tz: scala.Double): Matrix3D
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
    invert: js.Function0[Matrix3D],
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
    multiply: js.Function1[Matrix3D, Matrix3D],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    rotate: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, Matrix3D],
    scale: js.Function3[scala.Double, scala.Double, scala.Double, Matrix3D],
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
    translate: js.Function3[scala.Double, scala.Double, scala.Double, Matrix3D],
    getLifecycleContainer: js.Function0[Window | TabGroup] = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, scala.Unit]) = null
  ): Matrix3D = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("apiName")(apiName)
    __obj.updateDynamic("applyProperties")(applyProperties)
    __obj.updateDynamic("bubbleParent")(bubbleParent)
    __obj.updateDynamic("fireEvent")(fireEvent)
    __obj.updateDynamic("getApiName")(getApiName)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent)
    __obj.updateDynamic("getM11")(getM11)
    __obj.updateDynamic("getM12")(getM12)
    __obj.updateDynamic("getM13")(getM13)
    __obj.updateDynamic("getM14")(getM14)
    __obj.updateDynamic("getM21")(getM21)
    __obj.updateDynamic("getM22")(getM22)
    __obj.updateDynamic("getM23")(getM23)
    __obj.updateDynamic("getM24")(getM24)
    __obj.updateDynamic("getM31")(getM31)
    __obj.updateDynamic("getM32")(getM32)
    __obj.updateDynamic("getM33")(getM33)
    __obj.updateDynamic("getM34")(getM34)
    __obj.updateDynamic("getM41")(getM41)
    __obj.updateDynamic("getM42")(getM42)
    __obj.updateDynamic("getM43")(getM43)
    __obj.updateDynamic("getM44")(getM44)
    __obj.updateDynamic("invert")(invert)
    __obj.updateDynamic("m11")(m11)
    __obj.updateDynamic("m12")(m12)
    __obj.updateDynamic("m13")(m13)
    __obj.updateDynamic("m14")(m14)
    __obj.updateDynamic("m21")(m21)
    __obj.updateDynamic("m22")(m22)
    __obj.updateDynamic("m23")(m23)
    __obj.updateDynamic("m24")(m24)
    __obj.updateDynamic("m31")(m31)
    __obj.updateDynamic("m32")(m32)
    __obj.updateDynamic("m33")(m33)
    __obj.updateDynamic("m34")(m34)
    __obj.updateDynamic("m41")(m41)
    __obj.updateDynamic("m42")(m42)
    __obj.updateDynamic("m43")(m43)
    __obj.updateDynamic("m44")(m44)
    __obj.updateDynamic("multiply")(multiply)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("rotate")(rotate)
    __obj.updateDynamic("scale")(scale)
    __obj.updateDynamic("setBubbleParent")(setBubbleParent)
    __obj.updateDynamic("setM11")(setM11)
    __obj.updateDynamic("setM12")(setM12)
    __obj.updateDynamic("setM13")(setM13)
    __obj.updateDynamic("setM14")(setM14)
    __obj.updateDynamic("setM21")(setM21)
    __obj.updateDynamic("setM22")(setM22)
    __obj.updateDynamic("setM23")(setM23)
    __obj.updateDynamic("setM24")(setM24)
    __obj.updateDynamic("setM31")(setM31)
    __obj.updateDynamic("setM32")(setM32)
    __obj.updateDynamic("setM33")(setM33)
    __obj.updateDynamic("setM34")(setM34)
    __obj.updateDynamic("setM41")(setM41)
    __obj.updateDynamic("setM42")(setM42)
    __obj.updateDynamic("setM43")(setM43)
    __obj.updateDynamic("setM44")(setM44)
    __obj.updateDynamic("translate")(translate)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Matrix3D]
  }
}

