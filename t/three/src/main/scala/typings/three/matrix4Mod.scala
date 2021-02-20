package typings.three

import typings.std.ArrayLike
import typings.three.eulerMod.Euler
import typings.three.matrix3Mod.Matrix
import typings.three.quaternionMod.Quaternion
import typings.three.vector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matrix4Mod {
  
  @JSImport("three/src/math/Matrix4", "Matrix4")
  @js.native
  class Matrix4 () extends Matrix {
    
    /**
    	 * Sets this matrix to the transformation composed of translation, rotation and scale.
    	 */
    def compose(translation: Vector3, rotation: Quaternion, scale: Vector3): Matrix4 = js.native
    
    def copy(m: Matrix4): this.type = js.native
    
    def copyPosition(m: Matrix4): Matrix4 = js.native
    
    /**
    	 * @deprecated Use {@link Vector3#applyMatrix4 vector.applyMatrix4( matrix )} instead.
    	 */
    def crossVector(v: js.Any): Unit = js.native
    
    /**
    	 * Decomposes this matrix into it's position, quaternion and scale components.
    	 */
    def decompose(translation: Vector3, rotation: Quaternion, scale: Vector3): Matrix4 = js.native
    
    def equals(matrix: Matrix4): Boolean = js.native
    
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
    def flattenToArrayOffset(array: js.Array[Double], offset: Double): js.Array[Double] = js.native
    
    /**
    	 * Sets the values of this matrix from the provided array.
    	 * @param array the source array.
    	 * @param offset (optional) offset into the array. Default is 0.
    	 */
    def fromArray(array: js.Array[Double]): Matrix4 = js.native
    def fromArray(array: js.Array[Double], offset: Double): Matrix4 = js.native
    /**
    	 * Sets the values of this matrix from the provided array-like.
    	 * @param array the source array-like.
    	 * @param offset (optional) offset into the array-like. Default is 0.
    	 */
    def fromArray(array: ArrayLike[Double]): Matrix4 = js.native
    def fromArray(array: ArrayLike[Double], offset: Double): Matrix4 = js.native
    
    /**
    	 * Sets this matrix to the inverse of matrix m.
    	 * Based on http://www.euclideanspace.com/maths/algebra/matrix/functions/inverse/fourD/index.htm.
    	 */
    def getInverse(m: Matrix4): Matrix4 = js.native
    
    def getMaxScaleOnAxis(): Double = js.native
    
    /**
    	 * Constructs a rotation matrix, looking from eye towards center with defined up vector.
    	 */
    def lookAt(eye: Vector3, target: Vector3, up: Vector3): Matrix4 = js.native
    
    def makeBasis(xAxis: Vector3, yAxis: Vector3, zAxis: Vector3): Matrix4 = js.native
    
    /**
    	 * Creates an orthographic projection matrix.
    	 */
    def makeOrthographic(left: Double, right: Double, top: Double, bottom: Double, near: Double, far: Double): Matrix4 = js.native
    
    /**
    	 * Creates a perspective projection matrix.
    	 */
    def makePerspective(fov: Double, aspect: Double, near: Double, far: Double): Matrix4 = js.native
    /**
    	 * Creates a frustum matrix.
    	 */
    def makePerspective(left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): Matrix4 = js.native
    
    /**
    	 * Sets this matrix as rotation transform around axis by angle radians.
    	 * Based on http://www.gamedev.net/reference/articles/article1199.asp.
    	 *
    	 * @param axis Rotation axis.
    	 * @param theta Rotation angle in radians.
    	 */
    def makeRotationAxis(axis: Vector3, angle: Double): Matrix4 = js.native
    
    def makeRotationFromEuler(euler: Euler): Matrix4 = js.native
    
    def makeRotationFromQuaternion(q: Quaternion): Matrix4 = js.native
    
    /**
    	 * Sets this matrix as rotation transform around x axis by theta radians.
    	 *
    	 * @param theta Rotation angle in radians.
    	 */
    def makeRotationX(theta: Double): Matrix4 = js.native
    
    /**
    	 * Sets this matrix as rotation transform around y axis by theta radians.
    	 *
    	 * @param theta Rotation angle in radians.
    	 */
    def makeRotationY(theta: Double): Matrix4 = js.native
    
    /**
    	 * Sets this matrix as rotation transform around z axis by theta radians.
    	 *
    	 * @param theta Rotation angle in radians.
    	 */
    def makeRotationZ(theta: Double): Matrix4 = js.native
    
    /**
    	 * Sets this matrix as scale transform.
    	 */
    def makeScale(x: Double, y: Double, z: Double): Matrix4 = js.native
    
    /**
    	 * Sets this matrix as translation transform.
    	 */
    def makeTranslation(x: Double, y: Double, z: Double): Matrix4 = js.native
    
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
    def multiplyToArray(a: Matrix4, b: Matrix4, r: js.Array[Double]): Matrix4 = js.native
    
    /**
    	 * @deprecated Use {@link Vector3#applyMatrix4 vector.applyMatrix4( matrix )} instead.
    	 */
    def multiplyVector3(v: js.Any): js.Any = js.native
    
    /**
    	 * @deprecated This method has been removed completely.
    	 */
    def multiplyVector3Array(array: js.Array[Double]): js.Array[Double] = js.native
    
    /**
    	 * @deprecated Use {@link Vector4#applyMatrix4 vector.applyMatrix4( matrix )} instead.
    	 */
    def multiplyVector4(v: js.Any): js.Any = js.native
    
    def premultiply(m: Matrix4): Matrix4 = js.native
    
    /**
    	 * @deprecated Use {@link Vector3#transformDirection Vector3.transformDirection( matrix )} instead.
    	 */
    def rotateAxis(v: js.Any): Unit = js.native
    
    /**
    	 * Multiplies the columns of this matrix by vector v.
    	 */
    def scale(v: Vector3): Matrix4 = js.native
    
    /**
    	 * Sets all fields of this matrix.
    	 */
    def set(
      n11: Double,
      n12: Double,
      n13: Double,
      n14: Double,
      n21: Double,
      n22: Double,
      n23: Double,
      n24: Double,
      n31: Double,
      n32: Double,
      n33: Double,
      n34: Double,
      n41: Double,
      n42: Double,
      n43: Double,
      n44: Double
    ): Matrix4 = js.native
    
    def setPosition(v: Double): Matrix4 = js.native
    def setPosition(v: Double, y: js.UndefOr[scala.Nothing], z: Double): Matrix4 = js.native
    def setPosition(v: Double, y: Double): Matrix4 = js.native
    def setPosition(v: Double, y: Double, z: Double): Matrix4 = js.native
    /**
    	 * Sets the position component for this matrix from vector v.
    	 */
    def setPosition(v: Vector3): Matrix4 = js.native
    def setPosition(v: Vector3, y: js.UndefOr[scala.Nothing], z: Double): Matrix4 = js.native
    def setPosition(v: Vector3, y: Double): Matrix4 = js.native
    def setPosition(v: Vector3, y: Double, z: Double): Matrix4 = js.native
    
    /**
    	 * @deprecated Use {@link Matrix4#makeRotationFromQuaternion .makeRotationFromQuaternion()} instead.
    	 */
    def setRotationFromQuaternion(q: Quaternion): Matrix4 = js.native
    
    /**
    	 * Copies he values of this matrix into the provided array-like.
    	 * @param array array-like to store the matrix to.
    	 * @param offset (optional) optional offset into the array-like.
    	 * @return The provided array-like.
    	 */
    def toArray(): ArrayLike[Double] = js.native
    def toArray(array: js.UndefOr[scala.Nothing], offset: Double): ArrayLike[Double] = js.native
    def toArray(array: js.Array[Double]): js.Array[Double] = js.native
    def toArray(array: js.Array[Double], offset: Double): js.Array[Double] = js.native
    def toArray(array: ArrayLike[Double]): ArrayLike[Double] = js.native
    def toArray(array: ArrayLike[Double], offset: Double): ArrayLike[Double] = js.native
    /**
    	 * Returns an array with the values of this matrix, or copies them into the provided array.
    	 * @param array (optional) array to store the matrix to. If this is not provided, a new array will be created.
    	 * @param offset (optional) optional offset into the array.
    	 * @return The created or provided array.
    	 */
    @JSName("toArray")
    def toArray_Array(): js.Array[Double] = js.native
    @JSName("toArray")
    def toArray_Array(array: js.UndefOr[scala.Nothing], offset: Double): js.Array[Double] = js.native
  }
}
