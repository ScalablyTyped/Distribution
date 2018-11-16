package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "Vector4")
@js.native
class Vector4 () extends Vector {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double) = this()
  var isVector4: threeLib.threeLibNumbers.`true` = js.native
  var w: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  var z: scala.Double = js.native
  /**
       * Adds v to this vector.
       */
  def add(v: Vector4): this.type = js.native
  /**
       * Adds v to this vector.
       */
  def add(v: Vector4, w: Vector4): this.type = js.native
  def addScaledVector(v: Vector4, s: scala.Double): this.type = js.native
  /**
       * Sets this vector to a + b.
       */
  def addVectors(a: Vector4, b: Vector4): this.type = js.native
  def applyMatrix4(m: Matrix4): this.type = js.native
  def ceil(): this.type = js.native
  def clamp(min: Vector4, max: Vector4): this.type = js.native
  def clampScalar(min: scala.Double, max: scala.Double): this.type = js.native
  /**
       * Copies value of v to this vector.
       */
  def copy(v: this.type): this.type = js.native
  /**
       * Computes dot product of this vector and v.
       */
  def dot(v: Vector4): scala.Double = js.native
  /**
       * Checks for strict equality of this vector and v.
       */
  def equals(v: Vector4): scala.Boolean = js.native
  def floor(): this.type = js.native
  def fromArray(xyzw: js.Array[scala.Double]): this.type = js.native
  def fromArray(xyzw: js.Array[scala.Double], offset: scala.Double): this.type = js.native
  def fromBufferAttribute(attribute: BufferAttribute, index: scala.Double): this.type = js.native
  def fromBufferAttribute(attribute: BufferAttribute, index: scala.Double, offset: scala.Double): this.type = js.native
  /**
       * Linearly interpolate between this vector and v with alpha factor.
       */
  def lerp(v: Vector4, alpha: scala.Double): this.type = js.native
  def lerpVectors(v1: Vector4, v2: Vector4, alpha: scala.Double): this.type = js.native
  /**
       * Computes the Manhattan length of this vector.
       *
       * @return {number}
       *
       * @see {@link http://en.wikipedia.org/wiki/Taxicab_geometry|Wikipedia: Taxicab Geometry}
       */
  def manhattanLength(): scala.Double = js.native
  def max(v: Vector4): this.type = js.native
  def min(v: Vector4): this.type = js.native
  def round(): this.type = js.native
  def roundToZero(): this.type = js.native
  /**
       * Sets value of this vector.
       */
  def set(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double): this.type = js.native
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
  def setW(w: scala.Double): this.type = js.native
  /**
       * Sets X component of this vector.
       */
  def setX(x: scala.Double): this.type = js.native
  /**
       * Sets Y component of this vector.
       */
  def setY(y: scala.Double): this.type = js.native
  /**
       * Sets Z component of this vector.
       */
  def setZ(z: scala.Double): this.type = js.native
  /**
       * Subtracts v from this vector.
       */
  def sub(v: Vector4): this.type = js.native
  def subScalar(s: scala.Double): this.type = js.native
  /**
       * Sets this vector to a - b.
       */
  def subVectors(a: Vector4, b: Vector4): this.type = js.native
  def toArray(): js.Array[scala.Double] = js.native
  def toArray(xyzw: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def toArray(xyzw: js.Array[scala.Double], offset: scala.Double): js.Array[scala.Double] = js.native
}

