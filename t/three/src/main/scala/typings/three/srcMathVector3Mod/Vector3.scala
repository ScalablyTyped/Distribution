package typings.three.srcMathVector3Mod

import typings.std.ArrayLike
import typings.three.srcCamerasCameraMod.Camera
import typings.three.srcCoreBufferAttributeMod.BufferAttribute
import typings.three.srcMathCylindricalMod.Cylindrical
import typings.three.srcMathEulerMod.Euler
import typings.three.srcMathMatrix3Mod.Matrix3
import typings.three.srcMathMatrix4Mod.Matrix4
import typings.three.srcMathQuaternionMod.Quaternion
import typings.three.srcMathSphericalMod.Spherical
import typings.three.srcMathVector2Mod.Vector
import typings.three.threeNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/math/Vector3", "Vector3")
@js.native
class Vector3 () extends Vector {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  var isVector3: `true` = js.native
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  /**
  	 * Adds v to this vector.
  	 */
  def add(a: Vector3): this.type = js.native
  def add(a: Vector3, b: Vector3): this.type = js.native
  def addScaledVector(v: Vector3, s: Double): this.type = js.native
  /**
  	 * Sets this vector to a + b.
  	 */
  def addVectors(a: Vector3, b: Vector3): this.type = js.native
  def angleTo(v: Vector3): Double = js.native
  def applyAxisAngle(axis: Vector3, angle: Double): this.type = js.native
  def applyEuler(euler: Euler): this.type = js.native
  def applyMatrix3(m: Matrix3): this.type = js.native
  def applyMatrix4(m: Matrix4): this.type = js.native
  def applyQuaternion(q: Quaternion): this.type = js.native
  def ceil(): this.type = js.native
  def clamp(min: Vector3, max: Vector3): this.type = js.native
  def clampLength(min: Double, max: Double): this.type = js.native
  def clampScalar(min: Double, max: Double): this.type = js.native
  /**
  	 * Copies value of v to this vector.
  	 */
  def copy(v: Vector3): this.type = js.native
  /**
  	 * Sets this vector to cross product of itself and v.
  	 */
  def cross(a: Vector3): this.type = js.native
  def cross(a: Vector3, w: Vector3): this.type = js.native
  /**
  	 * Sets this vector to cross product of a and b.
  	 */
  def crossVectors(a: Vector3, b: Vector3): this.type = js.native
  /**
  	 * @deprecated Use {@link Vector3#manhattanDistanceTo .manhattanDistanceTo()} instead.
  	 */
  def distanceToManhattan(v: Vector3): Double = js.native
  /**
  	 * Computes squared distance of this vector to v.
  	 */
  @JSName("distanceToSquared")
  def distanceToSquared_MVector3(v: Vector3): Double = js.native
  /**
  	 * Computes distance of this vector to v.
  	 */
  @JSName("distanceTo")
  def distanceTo_MVector3(v: Vector3): Double = js.native
  def divide(v: Vector3): this.type = js.native
  /**
  	 * Computes dot product of this vector and v.
  	 */
  def dot(v: Vector3): Double = js.native
  /**
  	 * Checks for strict equality of this vector and v.
  	 */
  def equals(v: Vector3): Boolean = js.native
  def floor(): this.type = js.native
  def fromArray(xyz: js.Array[Double]): Vector3 = js.native
  def fromArray(xyz: js.Array[Double], offset: Double): Vector3 = js.native
  def fromBufferAttribute(attribute: BufferAttribute, index: Double): this.type = js.native
  def fromBufferAttribute(attribute: BufferAttribute, index: Double, offset: Double): this.type = js.native
  /**
  	 * Computes Manhattan length of this vector.
  	 * http://en.wikipedia.org/wiki/Taxicab_geometry
  	 *
  	 * @deprecated Use {@link Vector3#manhattanLength .manhattanLength()} instead.
  	 */
  def lengthManhattan(): Double = js.native
  def lerp(v: Vector3, alpha: Double): this.type = js.native
  def lerpVectors(v1: Vector3, v2: Vector3, alpha: Double): this.type = js.native
  /**
  	 * Computes the Manhattan length (distance) from this vector to the given vector v
  	 *
  	 * @param {Vector3} v
  	 *
  	 * @return {number}
  	 *
  	 * @see {@link http://en.wikipedia.org/wiki/Taxicab_geometry|Wikipedia: Taxicab Geometry}
  	 */
  def manhattanDistanceTo(v: Vector3): Double = js.native
  /**
  	 * Computes the Manhattan length of this vector.
  	 *
  	 * @return {number}
  	 *
  	 * @see {@link http://en.wikipedia.org/wiki/Taxicab_geometry|Wikipedia: Taxicab Geometry}
  	 */
  def manhattanLength(): Double = js.native
  def max(v: Vector3): this.type = js.native
  def min(v: Vector3): this.type = js.native
  def multiply(v: Vector3): this.type = js.native
  def multiplyVectors(a: Vector3, b: Vector3): this.type = js.native
  def project(camera: Camera): this.type = js.native
  def projectOnPlane(planeNormal: Vector3): this.type = js.native
  def projectOnVector(v: Vector3): this.type = js.native
  def reflect(vector: Vector3): this.type = js.native
  def round(): this.type = js.native
  def roundToZero(): this.type = js.native
  /**
  	 * Sets value of this vector.
  	 */
  def set(x: Double, y: Double, z: Double): this.type = js.native
  def setFromCylindrical(s: Cylindrical): this.type = js.native
  def setFromMatrixColumn(matrix: Matrix4, index: Double): this.type = js.native
  def setFromMatrixPosition(m: Matrix4): this.type = js.native
  def setFromMatrixScale(m: Matrix4): this.type = js.native
  def setFromSpherical(s: Spherical): this.type = js.native
  /**
  	 * Sets x value of this vector.
  	 */
  def setX(x: Double): Vector3 = js.native
  /**
  	 * Sets y value of this vector.
  	 */
  def setY(y: Double): Vector3 = js.native
  /**
  	 * Sets z value of this vector.
  	 */
  def setZ(z: Double): Vector3 = js.native
  /**
  	 * Subtracts v from this vector.
  	 */
  def sub(a: Vector3): this.type = js.native
  def subScalar(s: Double): this.type = js.native
  /**
  	 * Sets this vector to a - b.
  	 */
  def subVectors(a: Vector3, b: Vector3): this.type = js.native
  /**
  	 * Returns an array [x, y, z], or copies x, y and z into the provided array.
  	 * @param array (optional) array to store the vector to. If this is not provided, a new array will be created.
  	 * @param offset (optional) optional offset into the array.
  	 * @return The created or provided array.
  	 */
  def toArray(): js.Array[Double] = js.native
  def toArray(xyz: js.Array[Double]): js.Array[Double] = js.native
  def toArray(xyz: js.Array[Double], offset: Double): js.Array[Double] = js.native
  /**
  	 * Copies x, y and z into the provided array-like.
  	 * @param array array-like to store the vector to.
  	 * @param offset (optional) optional offset into the array.
  	 * @return The provided array-like.
  	 */
  def toArray(xyz: ArrayLike[Double]): ArrayLike[Double] = js.native
  def toArray(xyz: ArrayLike[Double], offset: Double): ArrayLike[Double] = js.native
  def transformDirection(m: Matrix4): this.type = js.native
  def unproject(camera: Camera): this.type = js.native
}

