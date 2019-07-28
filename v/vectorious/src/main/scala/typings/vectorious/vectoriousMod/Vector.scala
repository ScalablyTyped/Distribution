package typings.vectorious.vectoriousMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vectorious", "Vector")
@js.native
class Vector protected () extends js.Object {
  /**
    * @method constructor
    * @desc Creates a two-dimensional `Vector` from the supplied arguments.
    **/
  def this(data: js.Array[Double]) = this()
  /**
    * Adds `vector` to the current vector.
    * @param {Vector} vector
    * @returns {Vector} this
    **/
  def add(vector: Vector): Vector = js.native
  /**
    * Determines the angle between the current vector and `vector`.
    * @param {Vector} vector
    * @returns {Number} the angle between the two vectors in radians
    **/
  def angle(vector: Vector): Double = js.native
  /**
    * Combines the current vector with `vector`
    * @param {Vector} vector
    * @returns {Vector} `vector` combined with current vector
    **/
  def combine(vector: Vector): Vector = js.native
  /**
    * Performs dot multiplication with current vector and `vector`
    * @param {Vector} vector
    * @returns {Number} the dot product of the two vectors
    **/
  def dot(vector: Vector): Double = js.native
  /**
    * Functional version of for-looping the vector, is equivalent
    * to `Array.prototype.forEach`.
    * @param {Function} callback
    * @returns {Vector} `this`
    **/
  def each(callback: js.Function1[/* element */ Double, Unit]): Vector = js.native
  /**
    * Checks the equality of the current vector and `vector`.
    * @param {Vector} vector
    * @returns {Boolean} `true` if the two vectors are equal, `false` otherwise
    **/
  def equals(vector: Vector): Boolean = js.native
  /**
    * Gets the element at `index` from current vector.
    * @param {Number} index
    * @returns {Number} the element at `index`
    **/
  def get(index: Double): Double = js.native
  /**
    * Calculates the magnitude of a vector (also called L2 norm or Euclidean length).
    * @returns {Number} the magnitude (L2 norm) of the vector
    **/
  def magnitude(): Double = js.native
  /**
    * Maps a function `callback` to all elements of current vector.
    * @param {Function} callback
    * @returns {Vector} `this`
    **/
  def map(callback: js.Function1[/* element */ Double, Double]): Vector = js.native
  /**
    * Gets the maximum value (largest) element of current vector.
    * @returns {Number} the largest element of current vector
    **/
  def max(): Double = js.native
  /**
    * Gets the minimum value (smallest) element of current vector.
    * @returns {Number} the smallest element of the current vector
    **/
  def min(): Double = js.native
  /**
    * Normalizes current vector.
    * @returns {Vector} a resultant normalized vector
    **/
  def normalize(): Vector = js.native
  /**
    * Projects the current vector onto `vector` using
    * the projection formula `(b * (a * b / b * b))`.
    * @param {Vector} vector
    * @returns {Vector} `vector`
    **/
  def project(vector: Vector): Vector = js.native
  /**
    * Pushes a new `value` into current vector.
    * @param {Number} value
    * @returns {Vector} `this`
    **/
  def push(value: Double): Vector = js.native
  /**
    * Equivalent to `TypedArray.prototype.reduce`.
    * @param {Function} callback
    * @param {Number} initialValue
    * @returns {Number} result of reduction
    **/
  def reduce(callback: js.Function2[/* memo */ Double, /* element */ Double, Double]): Double = js.native
  def reduce(callback: js.Function2[/* memo */ Double, /* element */ Double, Double], initialValue: Double): Double = js.native
  /**
    * Multiplies all elements of current vector with a specified `scalar`.
    * @param {Number} scalar
    * @returns {Vector} this
    **/
  def scale(scalar: Double): Vector = js.native
  /**
    * Sets the element at `index` to `value`.
    * @param {Number} index
    * @param {Number} value
    * @returns {Vector} this
    **/
  def set(index: Double, value: Double): Vector = js.native
  /**
    * Subtracts `vector` from the current vector.
    * @param {Vector} vector
    * @returns {Vector} this
    **/
  def subtract(vector: Vector): Vector = js.native
  /**
    * Converts current vector into a JavaScript array.
    * @returns {Array} an array containing all elements of current vector
    **/
  def toArray(): js.Array[Double] = js.native
}

/* static members */
@JSImport("vectorious", "Vector")
@js.native
object Vector extends js.Object {
  /**
    * Static method. Adds two vectors `a` and `b` together.
    * @param {Vector} a
    * @param {Vector} b
    * @returns {Vector} a vector containing the sum of `a` and `b`
    **/
  def add(a: Vector, v: Vector): Vector = js.native
  /**
    * Static method. Determines the angle between two vectors `a` and `b`.
    * @param {Vector} a
    * @param {Vector} b
    * @returns {Number} the angle between the two vectors in radians
    **/
  def angle(a: Vector, b: Vector): Double = js.native
  /**
    * Static method. Combines two vectors `a` and `b` (appends `b` to `a`).
    * @param {Vector} a
    * @param {Vector} b
    * @returns {Vector} `b` appended to vector `a`
    **/
  def combine(a: Vector, b: Vector): Vector = js.native
  /**
    * Static method. Performs dot multiplication with two vectors `a` and `b`.
    * @param {Vector} a
    * @param {Vector} b
    * @returns {Number} the dot product of the two vectors
    **/
  def dot(a: Vector, b: Vector): Double = js.native
  /**
    * Static method. Checks the equality of two vectors `a` and `b`.
    * @param {Vector} a
    * @param {Vector} b
    * @returns {Boolean} `true` if the two vectors are equal, `false` otherwise
    **/
  def equals(a: Vector, b: Vector): Boolean = js.native
  /**
    * Static method. Normalizes `vector`, i.e. divides all elements with the magnitude.
    * @param {Vector} vector
    * @returns {Vector} a resultant normalized vector
    **/
  def normalize(vector: Vector): Vector = js.native
  /**
    * Static method. Creates a vector containing ones (`1`) of `count` size, takes
    * an optional `type` argument which should be an instance of `TypedArray`.
    * @param {Number} count
    * @param {TypedArray} type
    * @returns {Vector} a new vector of the specified size and `type`
    **/
  def ones(count: Double): Vector = js.native
  def ones(count: Double, `type`: js.Any): Vector = js.native
  /**
    * Static method. Projects the vector `a` onto the vector `b` using
    * the projection formula `(b * (a * b / b * b))`.
    * @param {Vector} a
    * @param {Vector} b
    * @returns {Vector} a new resultant projected vector
    **/
  def project(a: Vector, b: Vector): Vector = js.native
  /**
    * Static method. Creates a vector of `count` elements containing random
    * values according to a normal distribution, takes an optional `type`
    * argument which should be an instance of `TypedArray`.
    * @param {Number} count
    * @param {Number} deviation (default 1)
    * @param {Number} mean (default 0)
    * @param {TypedArray} type
    * @returns {Vector} a new vector of the specified size and `type`
    **/
  def random(count: Double): Vector = js.native
  def random(count: Double, deviation: Double): Vector = js.native
  def random(count: Double, deviation: Double, mean: Double): Vector = js.native
  def random(count: Double, deviation: Double, mean: Double, `type`: js.Any): Vector = js.native
  /**
    * Static method. Creates a vector containing a range (can be either ascending or descending)
    * of numbers specified by the arguments provided (e.g. `Vector.range(0, .5, 2)`
    * gives a vector containing all numbers in the interval `[0, 2)` separated by
    * steps of `0.5`), takes an optional `type` argument which should be an instance of
    * `TypedArray`.
    * @param {Number} start
    * @param {Number} step - optional
    * @param {Number} end
    * @returns {Vector} a new vector containing the specified range of the specified `type`
    **/
  def range(start: Double, end: Double): Vector = js.native
  def range(start: Double, step: Double, end: Double): Vector = js.native
  /**
    * Static method. Multiplies all elements of `vector` with a specified `scalar`.
    * @param {Vector} vector
    * @param {Number} scalar
    * @returns {Vector} a resultant scaled vector
    **/
  def scale(vector: Vector, scalar: Double): Vector = js.native
  /**
    * Static method. Subtracts the vector `b` from vector `a`.
    * @param {Vector} a
    * @param {Vector} b
    * @returns {Vector} a vector containing the difference between `a` and `b`
    **/
  def subtract(a: Vector, b: Vector): Vector = js.native
  /**
    * Static method. Creates a vector containing zeros (`0`) of `count` size, takes
    * an optional `type` argument which should be an instance of `TypedArray`.
    * @param {Number} count
    * @param {TypedArray} type
    * @returns {Vector} a new vector of the specified size and `type`
    **/
  def zeros(count: Double): Vector = js.native
  def zeros(count: Double, `type`: js.Any): Vector = js.native
}

