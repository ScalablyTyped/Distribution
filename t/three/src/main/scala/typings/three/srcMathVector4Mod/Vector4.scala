package typings.three.srcMathVector4Mod

import typings.three.srcCoreBufferAttributeMod.BufferAttribute
import typings.three.srcMathMatrix3Mod.Matrix3
import typings.three.srcMathMatrix4Mod.Matrix4
import typings.three.srcMathQuaternionMod.Quaternion
import typings.three.srcMathVector2Mod.Vector
import typings.three.threeNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/math/Vector4", "Vector4")
@js.native
class Vector4 () extends Vector {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
  var height: Double = js.native
  var isVector4: `true` = js.native
  var w: Double = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  /**
  	 * Adds v to this vector.
  	 */
  def add(v: Vector4): this.type = js.native
  def add(v: Vector4, w: Vector4): this.type = js.native
  def addScaledVector(v: Vector4, s: Double): this.type = js.native
  /**
  	 * Sets this vector to a + b.
  	 */
  def addVectors(a: Vector4, b: Vector4): this.type = js.native
  def applyMatrix4(m: Matrix4): this.type = js.native
  def ceil(): this.type = js.native
  def clamp(min: Vector4, max: Vector4): this.type = js.native
  def clampScalar(min: Double, max: Double): this.type = js.native
  /**
  	 * Copies value of v to this vector.
  	 */
  def copy(v: Vector4): this.type = js.native
  /**
  	 * Computes dot product of this vector and v.
  	 */
  def dot(v: Vector4): Double = js.native
  /**
  	 * Checks for strict equality of this vector and v.
  	 */
  def equals(v: Vector4): Boolean = js.native
  def floor(): this.type = js.native
  def fromArray(xyzw: js.Array[Double]): this.type = js.native
  def fromArray(xyzw: js.Array[Double], offset: Double): this.type = js.native
  def fromBufferAttribute(attribute: BufferAttribute, index: Double): this.type = js.native
  def fromBufferAttribute(attribute: BufferAttribute, index: Double, offset: Double): this.type = js.native
  /**
  	 * Linearly interpolate between this vector and v with alpha factor.
  	 */
  def lerp(v: Vector4, alpha: Double): this.type = js.native
  def lerpVectors(v1: Vector4, v2: Vector4, alpha: Double): this.type = js.native
  /**
  	 * Computes the Manhattan length of this vector.
  	 *
  	 * @return {number}
  	 *
  	 * @see {@link http://en.wikipedia.org/wiki/Taxicab_geometry|Wikipedia: Taxicab Geometry}
  	 */
  def manhattanLength(): Double = js.native
  def max(v: Vector4): this.type = js.native
  def min(v: Vector4): this.type = js.native
  def round(): this.type = js.native
  def roundToZero(): this.type = js.native
  /**
  	 * Sets value of this vector.
  	 */
  def set(x: Double, y: Double, z: Double, w: Double): this.type = js.native
  /**
  	 * http://www.euclideanspace.com/maths/geometry/rotations/conversions/quaternionToAngle/index.htm
  	 * @param q is assumed to be normalized
  	 */
  def setAxisAngleFromQuaternion(q: Quaternion): this.type = js.native
  /**
  	 * http://www.euclideanspace.com/maths/geometry/rotations/conversions/matrixToAngle/index.htm
  	 * @param m assumes the upper 3x3 of m is a pure rotation matrix (i.e, unscaled)
  	 */
  def setAxisAngleFromRotationMatrix(m: Matrix3): this.type = js.native
  /**
  	 * Sets w component of this vector.
  	 */
  def setW(w: Double): this.type = js.native
  /**
  	 * Sets X component of this vector.
  	 */
  def setX(x: Double): this.type = js.native
  /**
  	 * Sets Y component of this vector.
  	 */
  def setY(y: Double): this.type = js.native
  /**
  	 * Sets Z component of this vector.
  	 */
  def setZ(z: Double): this.type = js.native
  /**
  	 * Subtracts v from this vector.
  	 */
  def sub(v: Vector4): this.type = js.native
  def subScalar(s: Double): this.type = js.native
  /**
  	 * Sets this vector to a - b.
  	 */
  def subVectors(a: Vector4, b: Vector4): this.type = js.native
  def toArray(): js.Array[Double] = js.native
  def toArray(xyzw: js.Array[Double]): js.Array[Double] = js.native
  def toArray(xyzw: js.Array[Double], offset: Double): js.Array[Double] = js.native
}

