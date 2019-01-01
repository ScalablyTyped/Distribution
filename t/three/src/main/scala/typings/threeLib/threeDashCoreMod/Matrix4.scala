package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "Matrix4")
@js.native
class Matrix4 () extends Matrix {
  /**
    * @deprecated Use {@link Matrix4#applyToBufferAttribute matrix4.applyToBufferAttribute( attribute )} instead.
    */
  def applyToBuffer(buffer: BufferAttribute): BufferAttribute = js.native
  def applyToBuffer(buffer: BufferAttribute, offset: scala.Double): BufferAttribute = js.native
  def applyToBuffer(buffer: BufferAttribute, offset: scala.Double, length: scala.Double): BufferAttribute = js.native
  def applyToBufferAttribute(attribute: BufferAttribute): BufferAttribute = js.native
  /**
    * Sets this matrix to the transformation composed of translation, rotation and scale.
    */
  def compose(translation: Vector3, rotation: Quaternion, scale: Vector3): Matrix4 = js.native
  def copy(m: Matrix4): this.type = js.native
  def copyPosition(m: Matrix4): Matrix4 = js.native
  /**
    * @deprecated Use {@link Vector3#applyMatrix4 vector.applyMatrix4( matrix )} instead.
    */
  def crossVector(v: js.Any): scala.Unit = js.native
  /**
    * Decomposes this matrix into the translation, rotation and scale components.
    * If parameters are not passed, new instances will be created.
    */
  def decompose(): js.Array[js.Object] = js.native
  def decompose(translation: Vector3): js.Array[js.Object] = js.native
  def decompose(translation: Vector3, rotation: Quaternion): js.Array[js.Object] = js.native
  def decompose(translation: Vector3, rotation: Quaternion, scale: Vector3): js.Array[js.Object] = js.native
  def equals(matrix: Matrix4): scala.Boolean = js.native
  def extractBasis(xAxis: Vector3, yAxis: Vector3, zAxis: Vector3): Matrix4 = js.native
  /**
    * @deprecated Use {@link Matrix4#copyPosition .copyPosition()} instead.
    */
  def extractPosition(m: Matrix4): Matrix4 = js.native
  /**
    * Copies the rotation component of the supplied matrix m into this matrix rotation component.
    */
  def extractRotation(m: Matrix4): Matrix4 = js.native
  /**
    * @deprecated Use {@link Matrix4#toArray .toArray()} instead.
    */
  def flattenToArrayOffset(array: js.Array[scala.Double], offset: scala.Double): js.Array[scala.Double] = js.native
  def fromArray(array: js.Array[scala.Double]): Matrix4 = js.native
  def fromArray(array: js.Array[scala.Double], offset: scala.Double): Matrix4 = js.native
  /**
    * Sets this matrix to the inverse of matrix m.
    * Based on http://www.euclideanspace.com/maths/algebra/matrix/functions/inverse/fourD/index.htm.
    */
  def getInverse(m: Matrix4): Matrix4 = js.native
  def getInverse(m: Matrix4, throwOnDegeneratee: scala.Boolean): Matrix4 = js.native
  def getMaxScaleOnAxis(): scala.Double = js.native
  /**
    * Constructs a rotation matrix, looking from eye towards center with defined up vector.
    */
  def lookAt(eye: Vector3, target: Vector3, up: Vector3): Matrix4 = js.native
  def makeBasis(xAxis: Vector3, yAxis: Vector3, zAxis: Vector3): Matrix4 = js.native
  /**
    * Creates an orthographic projection matrix.
    */
  def makeOrthographic(
    left: scala.Double,
    right: scala.Double,
    top: scala.Double,
    bottom: scala.Double,
    near: scala.Double,
    far: scala.Double
  ): Matrix4 = js.native
  /**
    * Creates a perspective projection matrix.
    */
  def makePerspective(fov: scala.Double, aspect: scala.Double, near: scala.Double, far: scala.Double): Matrix4 = js.native
   // [Vector3, Quaternion, Vector3]
  /**
    * Creates a frustum matrix.
    */
  def makePerspective(
    left: scala.Double,
    right: scala.Double,
    bottom: scala.Double,
    top: scala.Double,
    near: scala.Double,
    far: scala.Double
  ): Matrix4 = js.native
  /**
    * Sets this matrix as rotation transform around axis by angle radians.
    * Based on http://www.gamedev.net/reference/articles/article1199.asp.
    *
    * @param axis Rotation axis.
    * @param theta Rotation angle in radians.
    */
  def makeRotationAxis(axis: Vector3, angle: scala.Double): Matrix4 = js.native
  def makeRotationFromEuler(euler: Euler): Matrix4 = js.native
  def makeRotationFromQuaternion(q: Quaternion): Matrix4 = js.native
  /**
    * Sets this matrix as rotation transform around x axis by theta radians.
    *
    * @param theta Rotation angle in radians.
    */
  def makeRotationX(theta: scala.Double): Matrix4 = js.native
  /**
    * Sets this matrix as rotation transform around y axis by theta radians.
    *
    * @param theta Rotation angle in radians.
    */
  def makeRotationY(theta: scala.Double): Matrix4 = js.native
  /**
    * Sets this matrix as rotation transform around z axis by theta radians.
    *
    * @param theta Rotation angle in radians.
    */
  def makeRotationZ(theta: scala.Double): Matrix4 = js.native
  /**
    * Sets this matrix as scale transform.
    */
  def makeScale(x: scala.Double, y: scala.Double, z: scala.Double): Matrix4 = js.native
  /**
    * Sets this matrix as translation transform.
    */
  def makeTranslation(x: scala.Double, y: scala.Double, z: scala.Double): Matrix4 = js.native
  /**
    * Multiplies this matrix by m.
    */
  def multiply(m: Matrix4): Matrix4 = js.native
  /**
    * Sets this matrix to a x b.
    */
  def multiplyMatrices(a: Matrix4, b: Matrix4): Matrix4 = js.native
  /**
    * Sets this matrix to a x b and stores the result into the flat array r.
    * r can be either a regular Array or a TypedArray.
    *
    * @deprecated This method has been removed completely.
    */
  def multiplyToArray(a: Matrix4, b: Matrix4, r: js.Array[scala.Double]): Matrix4 = js.native
  /**
    * @deprecated Use {@link Vector3#applyMatrix4 vector.applyMatrix4( matrix )} instead.
    */
  def multiplyVector3(v: js.Any): js.Any = js.native
  /**
    * @deprecated This method has been removed completely.
    */
  def multiplyVector3Array(array: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  /**
    * @deprecated Use {@link Vector4#applyMatrix4 vector.applyMatrix4( matrix )} instead.
    */
  def multiplyVector4(v: js.Any): js.Any = js.native
  def premultiply(m: Matrix4): Matrix4 = js.native
  /**
    * @deprecated Use {@link Vector3#transformDirection Vector3.transformDirection( matrix )} instead.
    */
  def rotateAxis(v: js.Any): scala.Unit = js.native
  /**
    * Multiplies the columns of this matrix by vector v.
    */
  def scale(v: Vector3): Matrix4 = js.native
  /**
    * Sets all fields of this matrix.
    */
  def set(
    n11: scala.Double,
    n12: scala.Double,
    n13: scala.Double,
    n14: scala.Double,
    n21: scala.Double,
    n22: scala.Double,
    n23: scala.Double,
    n24: scala.Double,
    n31: scala.Double,
    n32: scala.Double,
    n33: scala.Double,
    n34: scala.Double,
    n41: scala.Double,
    n42: scala.Double,
    n43: scala.Double,
    n44: scala.Double
  ): Matrix4 = js.native
  /**
    * Sets the position component for this matrix from vector v.
    */
  def setPosition(v: Vector3): Matrix4 = js.native
  /**
    * @deprecated Use {@link Matrix4#makeRotationFromQuaternion .makeRotationFromQuaternion()} instead.
    */
  def setRotationFromQuaternion(q: Quaternion): Matrix4 = js.native
  def toArray(): js.Array[scala.Double] = js.native
}

