package typings
package threeLib.srcMathVector2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/math/Vector2", "Vector2")
@js.native
class Vector2 () extends Vector {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  var height: scala.Double = js.native
  var isVector2: threeLib.threeLibNumbers.`true` = js.native
  var width: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  /**
    * Adds v to this vector.
    */
  def add(v: Vector2): this.type = js.native
  def add(v: Vector2, w: Vector2): this.type = js.native
  /**
    * Adds the multiple of v and s to this vector.
    */
  def addScaledVector(v: Vector2, s: scala.Double): this.type = js.native
  /**
    * Sets this vector to a + b.
    */
  def addVectors(a: Vector2, b: Vector2): this.type = js.native
  /**
    * computes the angle in radians with respect to the positive x-axis
    */
  def angle(): scala.Double = js.native
  /**
    * Multiplies this vector (with an implicit 1 as the 3rd component) by m.
    */
  def applyMatrix3(m: threeLib.srcMathMatrix3Mod.Matrix3): this.type = js.native
  /**
    * The x and y components of the vector are rounded up to the nearest integer value.
    */
  def ceil(): this.type = js.native
  /**
    * If this vector's x or y value is greater than the max vector's x or y value, it is replaced by the corresponding value.
    * If this vector's x or y value is less than the min vector's x or y value, it is replaced by the corresponding value.
    * @param min the minimum x and y values.
    * @param max the maximum x and y values in the desired range.
    */
  def clamp(min: Vector2, max: Vector2): this.type = js.native
  /**
    * If this vector's length is greater than the max value, it is replaced by the max value.
    * If this vector's length is less than the min value, it is replaced by the min value.
    * @param min the minimum value the length will be clamped to.
    * @param max the maximum value the length will be clamped to.
    */
  def clampLength(min: scala.Double, max: scala.Double): this.type = js.native
  /**
    * If this vector's x or y values are greater than the max value, they are replaced by the max value.
    * If this vector's x or y values are less than the min value, they are replaced by the min value.
    * @param min the minimum value the components will be clamped to.
    * @param max the maximum value the components will be clamped to.
    */
  def clampScalar(min: scala.Double, max: scala.Double): this.type = js.native
  /**
    * Copies value of v to this vector.
    */
  def copy(v: Vector2): this.type = js.native
  /**
    * @deprecated Use {@link Vector2#manhattanDistanceTo .manhattanDistanceTo()} instead.
    */
  def distanceToManhattan(v: Vector2): scala.Double = js.native
  /**
    * Computes squared distance of this vector to v.
    */
  @JSName("distanceToSquared")
  def distanceToSquared_MVector2(v: Vector2): scala.Double = js.native
  /**
    * Computes distance of this vector to v.
    */
  @JSName("distanceTo")
  def distanceTo_MVector2(v: Vector2): scala.Double = js.native
  /**
    * Divides this vector by v.
    */
  def divide(v: Vector2): this.type = js.native
  /**
    * Computes dot product of this vector and v.
    */
  def dot(v: Vector2): scala.Double = js.native
  /**
    * Checks for strict equality of this vector and v.
    */
  def equals(v: Vector2): scala.Boolean = js.native
  /**
    * The components of the vector are rounded down to the nearest integer value.
    */
  def floor(): this.type = js.native
  /**
    * Sets this vector's x value to be array[offset] and y value to be array[offset + 1].
    * @param array the source array.
    * @param offset (optional) offset into the array. Default is 0.
    */
  def fromArray(array: js.Array[scala.Double]): this.type = js.native
  def fromArray(array: js.Array[scala.Double], offset: scala.Double): this.type = js.native
  /**
    * Sets this vector's x and y values from the attribute.
    * @param attribute the source attribute.
    * @param index index in the attribute.
    */
  def fromBufferAttribute(attribute: threeLib.srcCoreBufferAttributeMod.BufferAttribute, index: scala.Double): this.type = js.native
  /**
    * @deprecated Use {@link Vector2#manhattanLength .manhattanLength()} instead.
    */
  def lengthManhattan(): scala.Double = js.native
  /**
    * Linearly interpolates between this vector and v, where alpha is the distance along the line - alpha = 0 will be this vector, and alpha = 1 will be v.
    * @param v vector to interpolate towards.
    * @param alpha interpolation factor in the closed interval [0, 1].
    */
  def lerp(v: Vector2, alpha: scala.Double): this.type = js.native
  /**
    * Sets this vector to be the vector linearly interpolated between v1 and v2 where alpha is the distance along the line connecting the two vectors - alpha = 0 will be v1, and alpha = 1 will be v2.
    * @param v1 the starting vector.
    * @param v2 vector to interpolate towards.
    * @param alpha interpolation factor in the closed interval [0, 1].
    */
  def lerpVectors(v1: Vector2, v2: Vector2, alpha: scala.Double): this.type = js.native
  /**
    * Computes the Manhattan length (distance) from this vector to the given vector v
    *
    * @param {Vector2} v
    *
    * @return {number}
    *
    * @see {@link http://en.wikipedia.org/wiki/Taxicab_geometry|Wikipedia: Taxicab Geometry}
    */
  def manhattanDistanceTo(v: Vector2): scala.Double = js.native
  /**
    * Computes the Manhattan length of this vector.
    *
    * @return {number}
    *
    * @see {@link http://en.wikipedia.org/wiki/Taxicab_geometry|Wikipedia: Taxicab Geometry}
    */
  def manhattanLength(): scala.Double = js.native
  /**
    * If this vector's x or y value is less than v's x or y value, replace that value with the corresponding max value.
    */
  def max(v: Vector2): this.type = js.native
  /**
    * If this vector's x or y value is greater than v's x or y value, replace that value with the corresponding min value.
    */
  def min(v: Vector2): this.type = js.native
  /**
    * Multiplies this vector by v.
    */
  def multiply(v: Vector2): this.type = js.native
  /**
    * Rotates the vector around center by angle radians.
    * @param center the point around which to rotate.
    * @param angle the angle to rotate, in radians.
    */
  def rotateAround(center: Vector2, angle: scala.Double): this.type = js.native
  /**
    * The components of the vector are rounded to the nearest integer value.
    */
  def round(): this.type = js.native
  /**
    * The components of the vector are rounded towards zero (up if negative, down if positive) to an integer value.
    */
  def roundToZero(): this.type = js.native
  /**
    * Sets value of this vector.
    */
  def set(x: scala.Double, y: scala.Double): this.type = js.native
  /**
    * Sets X component of this vector.
    */
  def setX(x: scala.Double): this.type = js.native
  /**
    * Sets Y component of this vector.
    */
  def setY(y: scala.Double): this.type = js.native
  /**
    * Subtracts v from this vector.
    */
  def sub(v: Vector2): this.type = js.native
  /**
    * Subtracts s from this vector's x and y components.
    */
  def subScalar(s: scala.Double): this.type = js.native
  /**
    * Sets this vector to a - b.
    */
  def subVectors(a: Vector2, b: Vector2): this.type = js.native
  /**
    * Returns an array [x, y], or copies x and y into the provided array.
    * @param array (optional) array to store the vector to. If this is not provided, a new array will be created.
    * @param offset (optional) optional offset into the array.
    * @return The created or provided array.
    */
  def toArray(): js.Array[scala.Double] = js.native
  def toArray(array: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def toArray(array: js.Array[scala.Double], offset: scala.Double): js.Array[scala.Double] = js.native
  /**
    * Copies x and y into the provided array-like.
    * @param array array-like to store the vector to.
    * @param offset (optional) optional offset into the array.
    * @return The provided array-like.
    */
  def toArray(array: stdLib.ArrayLike[scala.Double]): stdLib.ArrayLike[scala.Double] = js.native
  def toArray(array: stdLib.ArrayLike[scala.Double], offset: scala.Double): stdLib.ArrayLike[scala.Double] = js.native
}

