package typings.three.srcMathMatrix3Mod

import typings.three.srcCoreBufferAttributeMod.BufferAttribute
import typings.three.srcMathMatrix4Mod.Matrix4
import typings.three.srcMathVector3Mod.Vector3
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
  def applyToBuffer(buffer: BufferAttribute): BufferAttribute = js.native
  def applyToBuffer(buffer: BufferAttribute, offset: Double): BufferAttribute = js.native
  def applyToBuffer(buffer: BufferAttribute, offset: Double, length: Double): BufferAttribute = js.native
  def applyToBufferAttribute(attribute: BufferAttribute): BufferAttribute = js.native
  def copy(m: Matrix3): this.type = js.native
  /**
  	 * @deprecated Use {@link Matrix3#toArray .toArray()} instead.
  	 */
  def flattenToArrayOffset(array: js.Array[Double], offset: Double): js.Array[Double] = js.native
  def fromArray(array: js.Array[Double]): Matrix3 = js.native
  def fromArray(array: js.Array[Double], offset: Double): Matrix3 = js.native
  def getInverse(matrix: Matrix3): Matrix3 = js.native
  def getInverse(matrix: Matrix3, throwOnDegenerate: Boolean): Matrix3 = js.native
  def getInverse(matrix: Matrix4): Matrix3 = js.native
  def getInverse(matrix: Matrix4, throwOnDegenerate: Boolean): Matrix3 = js.native
  def getNormalMatrix(matrix4: Matrix4): Matrix3 = js.native
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
  def multiplyVector3(vector: Vector3): js.Any = js.native
  /**
  	 * @deprecated This method has been removed completely.
  	 */
  def multiplyVector3Array(a: js.Any): js.Any = js.native
  def premultiply(m: Matrix3): Matrix3 = js.native
  def set(
    n11: Double,
    n12: Double,
    n13: Double,
    n21: Double,
    n22: Double,
    n23: Double,
    n31: Double,
    n32: Double,
    n33: Double
  ): Matrix3 = js.native
  def setFromMatrix4(m: Matrix4): Matrix3 = js.native
  def toArray(): js.Array[Double] = js.native
  /**
  	 * Transposes this matrix into the supplied array r, and returns itself.
  	 */
  def transposeIntoArray(r: js.Array[Double]): js.Array[Double] = js.native
}

