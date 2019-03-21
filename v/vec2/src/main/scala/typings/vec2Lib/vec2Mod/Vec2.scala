package typings
package vec2Lib.vec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vec2 extends js.Object {
  val x: scala.Double = js.native
  val y: scala.Double = js.native
  /**
    * Return a `Vec2` that contains the absolute value of each of this vector's parts.
    * If `returnNew` is truthy, create a new `Vec2` and return it. Otherwise apply the absolute values to to `this`.
    */
  def abs(): Vec2 = js.native
  def abs(returnNew: scala.Boolean): Vec2 = js.native
  def add(vec2: js.Array[scala.Double]): Vec2 = js.native
  def add(vec2: js.Array[scala.Double], returnNew: scala.Boolean): Vec2 = js.native
  def add(vec2: Vec2): Vec2 = js.native
  def add(vec2: Vec2, returnNew: scala.Boolean): Vec2 = js.native
  /**
    * Add the `x` and `y` to this vector's coordinates.
    * If `returnNew` is truthy, return a new vector containing the resulting coordinates. Otherwise apply them to this vector and return it.
    */
  def add(x: scala.Double, y: scala.Double): Vec2 = js.native
  def add(x: scala.Double, y: scala.Double, returnNew: scala.Boolean): Vec2 = js.native
  /**
    * Returns the angle from this vector to the incoming.
    */
  def angleTo(vec: Vec2): scala.Double = js.native
  /**
    * Add an observer `fn` that will be called whenever this vector changes.  Calling this method without a function causes it to notify observers.
    * `fn` signature: `function(vec, prev) {}` - where `prev` is a clone of the vector before the last operation.
    * this function returns the passed `fn`
    */
  def change(): Vec2 = js.native
  def change(fn: js.Function2[/* vec */ this.type, /* prev */ this.type, _]): Vec2 = js.native
  /**
    * Clamp the coordinates of this vector to the high/low of the incoming vec2s.  If `returnNew` apply the result to the new vector and return.
    * Otherwise apply to this vector.
    */
  def clamp(low: Vec2, high: Vec2): Vec2 = js.native
  def clamp(low: Vec2, high: Vec2, returnNew: scala.Boolean): Vec2 = js.native
  /**
    * _returns_: the distance between this vector and the incoming
    */
  def distance(vec2: Vec2): scala.Double = js.native
  def divide(scalarArrayVec2: js.Array[scala.Double]): Vec2 = js.native
  def divide(scalarArrayVec2: js.Array[scala.Double], returnNew: scala.Boolean): Vec2 = js.native
  def divide(scalarArrayVec2: scala.Double): Vec2 = js.native
  def divide(scalarArrayVec2: scala.Double, returnNew: scala.Boolean): Vec2 = js.native
  def divide(scalarArrayVec2: Vec2): Vec2 = js.native
  def divide(scalarArrayVec2: Vec2, returnNew: scala.Boolean): Vec2 = js.native
  /**
    * Divide this vectors components by the incoming, returning a clone if `returnNew` is truthy.
    * _note_: this method will throw if you attempt to divide by zero or pass values that cause NaNs
    */
  def divide(x: scala.Double, y: scala.Double): Vec2 = js.native
  def divide(x: scala.Double, y: scala.Double, returnNew: scala.Boolean): Vec2 = js.native
  /**
    * _returns_: `double`
    */
  def dot(): scala.Double = js.native
  def equal(arrayVec2: js.Array[scala.Double]): scala.Boolean = js.native
  def equal(arrayVec2: Vec2): scala.Boolean = js.native
  /**
    * Returns true if the incoming coordinates are the same as this vector's
    */
  def equal(x: scala.Double, y: scala.Double): scala.Boolean = js.native
  /**
    * Applies the `[0]` to `this.x` and `[1]` to `this.y`
    */
  def fromArray(array: js.Array[scala.Double]): Vec2 = js.native
  /**
    * Pass a `fn` to remove it from the observers list. Calling this function without a `fn` will remove all observers.
    */
  def ignore(): Vec2 = js.native
  def ignore(fn: js.Function2[/* vec */ this.type, /* prev */ this.type, _]): Vec2 = js.native
  /**
    * Where `start` and `end` are vec2-like (e.g. `start.x` and `start.y`)
    */
  def isPointOnLine(start: Vec2, end: Vec2): scala.Boolean = js.native
  /**
    * Returns the length of this vector from `(0,0)`
    */
  def length(): scala.Double = js.native
  /**
    * Returns the length of this vector prior to the `Math.sqrt` call.
    * This is usefull when you don't need to know the actual distance, but need a normalized value to compare with another `Vec2#lengthSquared` or similar.
    */
  def lengthSquared(): scala.Double = js.native
  /**
    *
    * Perform linear interpolation between this vector and the incoming.
    * `amount` - the percentage along the path to place the vector
    * `returnNew` - if `truthy`, apply the result to a new vector and return it, otherwise return `this`
    */
  def lerp(vec: Vec2, amount: scala.Double): Vec2 = js.native
  def lerp(vec: Vec2, amount: scala.Double, returnNew: scala.Boolean): Vec2 = js.native
  /**
    * Return a `Vec2` consisting of the largest values from this vector and the incoming
    * When returnNew is truthy, a new `Vec2` will be returned otherwise the maximum values in either `this` or `vec` will be applied to this vector.
    */
  def max(vec: Vec2): Vec2 = js.native
  def max(vec: Vec2, returnNew: scala.Boolean): Vec2 = js.native
  /**
    * Return a `Vec2` consisting of the smallest values from this vector and the incoming
    * When returnNew is truthy, a new `Vec2` will be returned otherwise the minimum values in either this or `vec` will be applied to this vector.
    */
  def min(vec: Vec2): Vec2 = js.native
  def min(vec: Vec2, returnNew: scala.Boolean): Vec2 = js.native
  def multiply(scalarArrayVec2: js.Array[scala.Double]): Vec2 = js.native
  def multiply(scalarArrayVec2: js.Array[scala.Double], returnNew: scala.Boolean): Vec2 = js.native
  def multiply(scalarArrayVec2: scala.Double): Vec2 = js.native
  def multiply(scalarArrayVec2: scala.Double, returnNew: scala.Boolean): Vec2 = js.native
  def multiply(scalarArrayVec2: Vec2): Vec2 = js.native
  def multiply(scalarArrayVec2: Vec2, returnNew: scala.Boolean): Vec2 = js.native
  /**
    * Multiply this vectors components with the incoming, returning a clone if `returnNew` is truthy.
    */
  def multiply(x: scala.Double, y: scala.Double): Vec2 = js.native
  def multiply(x: scala.Double, y: scala.Double, returnNew: scala.Boolean): Vec2 = js.native
  /**
    * _returns_: closest vector in array to this vector.
    */
  def nearest(array: js.Array[Vec2]): Vec2 = js.native
  /**
    * Negate the `x` and `y` coords of this vector.  If `returnNew` is truthy, a new vector with the negated coordinates will be returned.
    */
  def negate(): Vec2 = js.native
  def negate(returnNew: scala.Boolean): Vec2 = js.native
  /**
    * Normalizes this vector.  If `returnNew` is truthy, a new vector populated with the normalized coordinates will be returned.
    */
  def normalize(): Vec2 = js.native
  def normalize(returnNew: scala.Boolean): Vec2 = js.native
  /**
    * _returns_: `double`
    */
  def perpDot(): scala.Double = js.native
  /**
    * Rotate this vector's cordinates around `(0,0)`.  If `returnNew` is specified, a new `Vec2` will be created and populated with the result and returned.
    * Otherwise the result is applied to this vector and `this` is returned.
    * `inverse` - inverts the direction of the rotation
    * `returnNew` - causes the result to be applied to a new `Vec2`, otherwise the result is applied to `this`
    */
  def rotate(radians: scala.Double): Vec2 = js.native
  def rotate(radians: scala.Double, inverse: scala.Double): Vec2 = js.native
  def rotate(radians: scala.Double, inverse: scala.Double, returnNew: scala.Boolean): Vec2 = js.native
  /**
    * Sets the `x` and `y` coordinates of this vector.  If `false` is passed for `notify`, none of the observers will be called.
    */
  def set(x: scala.Double, y: scala.Double, notify: scala.Boolean): Vec2 = js.native
  /**
    * Returns a vector set with the `(-y,x)` coordinates of this vector.  If `returnNew` a new vector is created and the operation is applied to the new vector.
    */
  def skew(): Vec2 = js.native
  def skew(returnNew: scala.Boolean): Vec2 = js.native
  def subtract(vec2: js.Array[scala.Double]): Vec2 = js.native
  def subtract(vec2: js.Array[scala.Double], returnNew: scala.Boolean): Vec2 = js.native
  def subtract(vec2: Vec2): Vec2 = js.native
  def subtract(vec2: Vec2, returnNew: scala.Boolean): Vec2 = js.native
  def subtract(x: scala.Double, y: scala.Double): Vec2 = js.native
  def subtract(x: scala.Double, y: scala.Double, returnNew: scala.Boolean): Vec2 = js.native
  /**
    * _returns_: `[x, y]`
    */
  def toArray(): js.Array[scala.Double] = js.native
  def toJSON(): vec2Lib.Anon_X = js.native
  /**
    * Sets the `x` and `y` of this vector to `0`
    */
  def zero(): Vec2 = js.native
}

