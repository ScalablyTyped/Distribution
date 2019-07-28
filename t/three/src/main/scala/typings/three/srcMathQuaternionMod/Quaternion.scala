package typings.three.srcMathQuaternionMod

import typings.three.srcMathEulerMod.Euler
import typings.three.srcMathMatrix4Mod.Matrix4
import typings.three.srcMathVector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/math/Quaternion", "Quaternion")
@js.native
/**
	 * @param x x coordinate
	 * @param y y coordinate
	 * @param z z coordinate
	 * @param w w coordinate
	 */
class Quaternion () extends js.Object {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
  var _onChangeCallback: js.Function = js.native
  var w: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  def _onChange(callback: js.Function): Quaternion = js.native
  def angleTo(q: Quaternion): Double = js.native
  def conjugate(): Quaternion = js.native
  /**
  	 * Copies values of q to this quaternion.
  	 */
  def copy(q: Quaternion): this.type = js.native
  def dot(v: Quaternion): Double = js.native
  def equals(v: Quaternion): Boolean = js.native
  def fromArray(n: js.Array[Double]): Quaternion = js.native
  def fromArray(xyzw: js.Array[Double], offset: Double): Quaternion = js.native
  /**
  	 * Inverts this quaternion.
  	 */
  def inverse(): Quaternion = js.native
  /**
  	 * Computes length of this quaternion.
  	 */
  def length(): Double = js.native
  def lengthSq(): Double = js.native
  /**
  	 * Multiplies this quaternion by b.
  	 */
  def multiply(q: Quaternion): Quaternion = js.native
  /**
  	 * Sets this quaternion to a x b
  	 * Adapted from http://www.euclideanspace.com/maths/algebra/realNormedAlgebra/quaternions/code/index.htm.
  	 */
  def multiplyQuaternions(a: Quaternion, b: Quaternion): Quaternion = js.native
  /**
  	 * @deprecated Use {@link Vector#applyQuaternion vector.applyQuaternion( quaternion )} instead.
  	 */
  def multiplyVector3(v: js.Any): js.Any = js.native
  /**
  	 * Normalizes this quaternion.
  	 */
  def normalize(): Quaternion = js.native
  def premultiply(q: Quaternion): Quaternion = js.native
  def rotateTowards(q: Quaternion, step: Double): Quaternion = js.native
  /**
  	 * Sets values of this quaternion.
  	 */
  def set(x: Double, y: Double, z: Double, w: Double): Quaternion = js.native
  /**
  	 * Sets this quaternion from rotation specified by axis and angle.
  	 * Adapted from http://www.euclideanspace.com/maths/geometry/rotations/conversions/angleToQuaternion/index.htm.
  	 * Axis have to be normalized, angle is in radians.
  	 */
  def setFromAxisAngle(axis: Vector3, angle: Double): Quaternion = js.native
  /**
  	 * Sets this quaternion from rotation specified by Euler angles.
  	 */
  def setFromEuler(euler: Euler): Quaternion = js.native
  /**
  	 * Sets this quaternion from rotation component of m. Adapted from http://www.euclideanspace.com/maths/geometry/rotations/conversions/matrixToQuaternion/index.htm.
  	 */
  def setFromRotationMatrix(m: Matrix4): Quaternion = js.native
  def setFromUnitVectors(vFrom: Vector3, vTo: Vector3): Quaternion = js.native
  def slerp(qb: Quaternion, t: Double): Quaternion = js.native
  def toArray(): js.Array[Double] = js.native
  def toArray(xyzw: js.Array[Double]): js.Array[Double] = js.native
  def toArray(xyzw: js.Array[Double], offset: Double): js.Array[Double] = js.native
}

/* static members */
@JSImport("three/src/math/Quaternion", "Quaternion")
@js.native
object Quaternion extends js.Object {
  /**
  	 * Adapted from http://www.euclideanspace.com/maths/algebra/realNormedAlgebra/quaternions/slerp/.
  	 */
  def slerp(qa: Quaternion, qb: Quaternion, qm: Quaternion, t: Double): Quaternion = js.native
  def slerpFlat(
    dst: js.Array[Double],
    dstOffset: Double,
    src0: js.Array[Double],
    srcOffset: Double,
    src1: js.Array[Double],
    stcOffset1: Double,
    t: Double
  ): Quaternion = js.native
}

