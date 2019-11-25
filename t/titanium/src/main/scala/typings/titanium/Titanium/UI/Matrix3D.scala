package typings.titanium.Titanium.UI

import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The 3D Matrix is an object for holding values for a 3D affine transform.
		 */
trait Matrix3D extends Proxy {
  /**
  			 * The entry at position [1,1] in the matrix.
  			 */
  var m11: Double
  /**
  			 * The entry at position [1,2] in the matrix.
  			 */
  var m12: Double
  /**
  			 * The entry at position [1,3] in the matrix.
  			 */
  var m13: Double
  /**
  			 * The entry at position [1,4] in the matrix.
  			 */
  var m14: Double
  /**
  			 * The entry at position [2,1] in the matrix.
  			 */
  var m21: Double
  /**
  			 * The entry at position [2,2] in the matrix.
  			 */
  var m22: Double
  /**
  			 * The entry at position [2,3] in the matrix.
  			 */
  var m23: Double
  /**
  			 * The entry at position [2,4] in the matrix.
  			 */
  var m24: Double
  /**
  			 * The entry at position [3,1] in the matrix.
  			 */
  var m31: Double
  /**
  			 * The entry at position [3,2] in the matrix.
  			 */
  var m32: Double
  /**
  			 * The entry at position [3,3] in the matrix.
  			 */
  var m33: Double
  /**
  			 * The entry at position [3,4] in the matrix.
  			 */
  var m34: Double
  /**
  			 * The entry at position [4,1] in the matrix.
  			 */
  var m41: Double
  /**
  			 * The entry at position [4,2] in the matrix.
  			 */
  var m42: Double
  /**
  			 * The entry at position [4,3] in the matrix.
  			 */
  var m43: Double
  /**
  			 * The entry at position [4,4] in the matrix.
  			 */
  var m44: Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m11> property.
  			 */
  def getM11(): Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m12> property.
  			 */
  def getM12(): Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m13> property.
  			 */
  def getM13(): Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m14> property.
  			 */
  def getM14(): Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m21> property.
  			 */
  def getM21(): Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m22> property.
  			 */
  def getM22(): Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m23> property.
  			 */
  def getM23(): Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m24> property.
  			 */
  def getM24(): Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m31> property.
  			 */
  def getM31(): Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m32> property.
  			 */
  def getM32(): Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m33> property.
  			 */
  def getM33(): Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m34> property.
  			 */
  def getM34(): Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m41> property.
  			 */
  def getM41(): Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m42> property.
  			 */
  def getM42(): Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m43> property.
  			 */
  def getM43(): Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m44> property.
  			 */
  def getM44(): Double
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
  def rotate(angle: Double, x: Double, y: Double, z: Double): Matrix3D
  /**
  			 * Returns a matrix constructed by scaling this matrix.
  			 */
  def scale(sx: Double, sy: Double, sz: Double): Matrix3D
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m11> property.
  			 */
  def setM11(m11: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m12> property.
  			 */
  def setM12(m12: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m13> property.
  			 */
  def setM13(m13: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m14> property.
  			 */
  def setM14(m14: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m21> property.
  			 */
  def setM21(m21: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m22> property.
  			 */
  def setM22(m22: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m23> property.
  			 */
  def setM23(m23: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m24> property.
  			 */
  def setM24(m24: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m31> property.
  			 */
  def setM31(m31: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m32> property.
  			 */
  def setM32(m32: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m33> property.
  			 */
  def setM33(m33: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m34> property.
  			 */
  def setM34(m34: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m41> property.
  			 */
  def setM41(m41: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m42> property.
  			 */
  def setM42(m42: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m43> property.
  			 */
  def setM43(m43: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m44> property.
  			 */
  def setM44(m44: Double): Unit
  /**
  			 * Returns a matrix constructed by translating an existing matrix.
  			 */
  def translate(tx: Double, ty: Double, tz: Double): Matrix3D
}

object Matrix3D {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getM11: () => Double,
    getM12: () => Double,
    getM13: () => Double,
    getM14: () => Double,
    getM21: () => Double,
    getM22: () => Double,
    getM23: () => Double,
    getM24: () => Double,
    getM31: () => Double,
    getM32: () => Double,
    getM33: () => Double,
    getM34: () => Double,
    getM41: () => Double,
    getM42: () => Double,
    getM43: () => Double,
    getM44: () => Double,
    invert: () => Matrix3D,
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
    m44: Double,
    multiply: Matrix3D => Matrix3D,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    rotate: (Double, Double, Double, Double) => Matrix3D,
    scale: (Double, Double, Double) => Matrix3D,
    setBubbleParent: Boolean => Unit,
    setM11: Double => Unit,
    setM12: Double => Unit,
    setM13: Double => Unit,
    setM14: Double => Unit,
    setM21: Double => Unit,
    setM22: Double => Unit,
    setM23: Double => Unit,
    setM24: Double => Unit,
    setM31: Double => Unit,
    setM32: Double => Unit,
    setM33: Double => Unit,
    setM34: Double => Unit,
    setM41: Double => Unit,
    setM42: Double => Unit,
    setM43: Double => Unit,
    setM44: Double => Unit,
    translate: (Double, Double, Double) => Matrix3D,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): Matrix3D = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName.asInstanceOf[js.Any], applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent.asInstanceOf[js.Any], fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getM11 = js.Any.fromFunction0(getM11), getM12 = js.Any.fromFunction0(getM12), getM13 = js.Any.fromFunction0(getM13), getM14 = js.Any.fromFunction0(getM14), getM21 = js.Any.fromFunction0(getM21), getM22 = js.Any.fromFunction0(getM22), getM23 = js.Any.fromFunction0(getM23), getM24 = js.Any.fromFunction0(getM24), getM31 = js.Any.fromFunction0(getM31), getM32 = js.Any.fromFunction0(getM32), getM33 = js.Any.fromFunction0(getM33), getM34 = js.Any.fromFunction0(getM34), getM41 = js.Any.fromFunction0(getM41), getM42 = js.Any.fromFunction0(getM42), getM43 = js.Any.fromFunction0(getM43), getM44 = js.Any.fromFunction0(getM44), invert = js.Any.fromFunction0(invert), m11 = m11.asInstanceOf[js.Any], m12 = m12.asInstanceOf[js.Any], m13 = m13.asInstanceOf[js.Any], m14 = m14.asInstanceOf[js.Any], m21 = m21.asInstanceOf[js.Any], m22 = m22.asInstanceOf[js.Any], m23 = m23.asInstanceOf[js.Any], m24 = m24.asInstanceOf[js.Any], m31 = m31.asInstanceOf[js.Any], m32 = m32.asInstanceOf[js.Any], m33 = m33.asInstanceOf[js.Any], m34 = m34.asInstanceOf[js.Any], m41 = m41.asInstanceOf[js.Any], m42 = m42.asInstanceOf[js.Any], m43 = m43.asInstanceOf[js.Any], m44 = m44.asInstanceOf[js.Any], multiply = js.Any.fromFunction1(multiply), removeEventListener = js.Any.fromFunction2(removeEventListener), rotate = js.Any.fromFunction4(rotate), scale = js.Any.fromFunction3(scale), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setM11 = js.Any.fromFunction1(setM11), setM12 = js.Any.fromFunction1(setM12), setM13 = js.Any.fromFunction1(setM13), setM14 = js.Any.fromFunction1(setM14), setM21 = js.Any.fromFunction1(setM21), setM22 = js.Any.fromFunction1(setM22), setM23 = js.Any.fromFunction1(setM23), setM24 = js.Any.fromFunction1(setM24), setM31 = js.Any.fromFunction1(setM31), setM32 = js.Any.fromFunction1(setM32), setM33 = js.Any.fromFunction1(setM33), setM34 = js.Any.fromFunction1(setM34), setM41 = js.Any.fromFunction1(setM41), setM42 = js.Any.fromFunction1(setM42), setM43 = js.Any.fromFunction1(setM43), setM44 = js.Any.fromFunction1(setM44), translate = js.Any.fromFunction3(translate))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matrix3D]
  }
}

