package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "Quaternion")
@js.native
/**
  * @param x x coordinate
  * @param y y coordinate
  * @param z z coordinate
  * @param w w coordinate
  */
class Quaternion () extends js.Object {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double) = this()
  var onChangeCallback: js.Function = js.native
  var w: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  var z: scala.Double = js.native
  def conjugate(): Quaternion = js.native
  /**
    * Copies values of q to this quaternion.
    */
  def copy(q: this.type): this.type = js.native
  def dot(v: Quaternion): scala.Double = js.native
  def equals(v: Quaternion): scala.Boolean = js.native
  def fromArray(n: js.Array[scala.Double]): Quaternion = js.native
  def fromArray(xyzw: js.Array[scala.Double], offset: scala.Double): Quaternion = js.native
  /**
    * Inverts this quaternion.
    */
  def inverse(): Quaternion = js.native
  /**
    * Computes length of this quaternion.
    */
  def length(): scala.Double = js.native
  def lengthSq(): scala.Double = js.native
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
  def onChange(callback: js.Function): Quaternion = js.native
  def premultiply(q: Quaternion): Quaternion = js.native
  /**
    * Sets values of this quaternion.
    */
  def set(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double): Quaternion = js.native
  /**
    * Sets this quaternion from rotation specified by axis and angle.
    * Adapted from http://www.euclideanspace.com/maths/geometry/rotations/conversions/angleToQuaternion/index.htm.
    * Axis have to be normalized, angle is in radians.
    */
  def setFromAxisAngle(axis: Vector3, angle: scala.Double): Quaternion = js.native
  /**
    * Sets this quaternion from rotation specified by Euler angles.
    */
  def setFromEuler(euler: Euler): Quaternion = js.native
  def setFromEuler(euler: Euler, update: scala.Boolean): Quaternion = js.native
  /**
    * Sets this quaternion from rotation component of m. Adapted from http://www.euclideanspace.com/maths/geometry/rotations/conversions/matrixToQuaternion/index.htm.
    */
  def setFromRotationMatrix(m: Matrix4): Quaternion = js.native
  def setFromUnitVectors(vFrom: Vector3, vTo: Vector3): Quaternion = js.native
  def slerp(qb: Quaternion, t: scala.Double): Quaternion = js.native
  def toArray(): js.Array[scala.Double] = js.native
  def toArray(xyzw: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def toArray(xyzw: js.Array[scala.Double], offset: scala.Double): js.Array[scala.Double] = js.native
}

@JSImport("three/three-core", "Quaternion")
@js.native
object Quaternion extends js.Object {
  /**
    * Adapted from http://www.euclideanspace.com/maths/algebra/realNormedAlgebra/quaternions/slerp/.
    */
  def slerp(
    qa: threeLib.threeDashCoreMod.Quaternion,
    qb: threeLib.threeDashCoreMod.Quaternion,
    qm: threeLib.threeDashCoreMod.Quaternion,
    t: scala.Double
  ): threeLib.threeDashCoreMod.Quaternion = js.native
  def slerpFlat(
    dst: js.Array[scala.Double],
    dstOffset: scala.Double,
    src0: js.Array[scala.Double],
    srcOffset: scala.Double,
    src1: js.Array[scala.Double],
    stcOffset1: scala.Double,
    t: scala.Double
  ): threeLib.threeDashCoreMod.Quaternion = js.native
}

