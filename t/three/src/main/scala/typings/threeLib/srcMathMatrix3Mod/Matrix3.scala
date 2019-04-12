package typings
package threeLib.srcMathMatrix3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/math/Matrix3", "Matrix3")
@js.native
/**
  * Creates an identity matrix.
  */
class Matrix3 () extends Matrix {
  /**
    * @deprecated Use {@link Matrix3#applyToBufferAttribute matrix3.applyToBufferAttribute( attribute )} instead.
    */
  def applyToBuffer(buffer: threeLib.srcCoreBufferAttributeMod.BufferAttribute): threeLib.srcCoreBufferAttributeMod.BufferAttribute = js.native
  def applyToBuffer(buffer: threeLib.srcCoreBufferAttributeMod.BufferAttribute, offset: scala.Double): threeLib.srcCoreBufferAttributeMod.BufferAttribute = js.native
  def applyToBuffer(
    buffer: threeLib.srcCoreBufferAttributeMod.BufferAttribute,
    offset: scala.Double,
    length: scala.Double
  ): threeLib.srcCoreBufferAttributeMod.BufferAttribute = js.native
  def applyToBufferAttribute(attribute: threeLib.srcCoreBufferAttributeMod.BufferAttribute): threeLib.srcCoreBufferAttributeMod.BufferAttribute = js.native
  def copy(m: Matrix3): this.type = js.native
  /**
    * @deprecated Use {@link Matrix3#toArray .toArray()} instead.
    */
  def flattenToArrayOffset(array: js.Array[scala.Double], offset: scala.Double): js.Array[scala.Double] = js.native
  def fromArray(array: js.Array[scala.Double]): Matrix3 = js.native
  def fromArray(array: js.Array[scala.Double], offset: scala.Double): Matrix3 = js.native
  def getInverse(matrix: Matrix3): Matrix3 = js.native
  def getInverse(matrix: Matrix3, throwOnDegenerate: scala.Boolean): Matrix3 = js.native
  def getInverse(matrix: threeLib.srcMathMatrix4Mod.Matrix4): Matrix3 = js.native
  def getInverse(matrix: threeLib.srcMathMatrix4Mod.Matrix4, throwOnDegenerate: scala.Boolean): Matrix3 = js.native
  def getNormalMatrix(matrix4: threeLib.srcMathMatrix4Mod.Matrix4): Matrix3 = js.native
  /**
    * Multiplies this matrix by m.
    */
  def multiply(m: Matrix3): Matrix3 = js.native
  /**
    * Sets this matrix to a x b.
    */
  def multiplyMatrices(a: Matrix3, b: Matrix3): Matrix3 = js.native
  /**
    * @deprecated Use {@link Vector3.applyMatrix3 vector.applyMatrix3( matrix )} instead.
    */
  def multiplyVector3(vector: threeLib.srcMathVector3Mod.Vector3): js.Any = js.native
  /**
    * @deprecated This method has been removed completely.
    */
  def multiplyVector3Array(a: js.Any): js.Any = js.native
  def premultiply(m: Matrix3): Matrix3 = js.native
  def set(
    n11: scala.Double,
    n12: scala.Double,
    n13: scala.Double,
    n21: scala.Double,
    n22: scala.Double,
    n23: scala.Double,
    n31: scala.Double,
    n32: scala.Double,
    n33: scala.Double
  ): Matrix3 = js.native
  def setFromMatrix4(m: threeLib.srcMathMatrix4Mod.Matrix4): Matrix3 = js.native
  def toArray(): js.Array[scala.Double] = js.native
  /**
    * Transposes this matrix into the supplied array r, and returns itself.
    */
  def transposeIntoArray(r: js.Array[scala.Double]): js.Array[scala.Double] = js.native
}

