package typings
package vectoriousLib.vectoriousMod

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
  def this(data: js.Array[scala.Double]) = this()
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
  def angle(vector: Vector): scala.Double = js.native
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
  def dot(vector: Vector): scala.Double = js.native
  /**
       * Functional version of for-looping the vector, is equivalent
       * to `Array.prototype.forEach`.
       * @param {Function} callback
       * @returns {Vector} `this`
       **/
  def each(callback: js.Function1[/* element */ scala.Double, scala.Unit]): Vector = js.native
  /**
       * Checks the equality of the current vector and `vector`.
       * @param {Vector} vector
       * @returns {Boolean} `true` if the two vectors are equal, `false` otherwise
       **/
  def equals(vector: Vector): scala.Boolean = js.native
  /**
       * Gets the element at `index` from current vector.
       * @param {Number} index
       * @returns {Number} the element at `index`
       **/
  def get(index: scala.Double): scala.Double = js.native
  /**
       * Calculates the magnitude of a vector (also called L2 norm or Euclidean length).
       * @returns {Number} the magnitude (L2 norm) of the vector
       **/
  def magnitude(): scala.Double = js.native
  /**
       * Maps a function `callback` to all elements of current vector.
       * @param {Function} callback
       * @returns {Vector} `this`
       **/
  def map(callback: js.Function1[/* element */ scala.Double, scala.Double]): Vector = js.native
  /**
       * Gets the maximum value (largest) element of current vector.
       * @returns {Number} the largest element of current vector
       **/
  def max(): scala.Double = js.native
  /**
       * Gets the minimum value (smallest) element of current vector.
       * @returns {Number} the smallest element of the current vector
       **/
  def min(): scala.Double = js.native
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
  def push(value: scala.Double): Vector = js.native
  /**
       * Equivalent to `TypedArray.prototype.reduce`.
       * @param {Function} callback
       * @param {Number} initialValue
       * @returns {Number} result of reduction
       **/
  def reduce(callback: js.Function2[/* memo */ scala.Double, /* element */ scala.Double, scala.Double]): scala.Double = js.native
  /**
       * Equivalent to `TypedArray.prototype.reduce`.
       * @param {Function} callback
       * @param {Number} initialValue
       * @returns {Number} result of reduction
       **/
  def reduce(
    callback: js.Function2[/* memo */ scala.Double, /* element */ scala.Double, scala.Double],
    initialValue: scala.Double
  ): scala.Double = js.native
  /**
       * Multiplies all elements of current vector with a specified `scalar`.
       * @param {Number} scalar
       * @returns {Vector} this
       **/
  def scale(scalar: scala.Double): Vector = js.native
  /**
       * Sets the element at `index` to `value`.
       * @param {Number} index
       * @param {Number} value
       * @returns {Vector} this
       **/
  def set(index: scala.Double, value: scala.Double): Vector = js.native
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
  def toArray(): js.Array[scala.Double] = js.native
}

@JSImport("vectorious", "Vector")
@js.native
object Vector extends js.Object {
  /**
       * Static method. Adds two vectors `a` and `b` together.
       * @param {Vector} a
       * @param {Vector} b
       * @returns {Vector} a vector containing the sum of `a` and `b`
       **/
  def add(a: vectoriousLib.vectoriousMod.Vector, v: vectoriousLib.vectoriousMod.Vector): vectoriousLib.vectoriousMod.Vector = js.native
  /**
       * Static method. Determines the angle between two vectors `a` and `b`.
       * @param {Vector} a
       * @param {Vector} b
       * @returns {Number} the angle between the two vectors in radians
       **/
  def angle(a: vectoriousLib.vectoriousMod.Vector, b: vectoriousLib.vectoriousMod.Vector): scala.Double = js.native
  /**
       * Static method. Combines two vectors `a` and `b` (appends `b` to `a`).
       * @param {Vector} a
       * @param {Vector} b
       * @returns {Vector} `b` appended to vector `a`
       **/
  def combine(a: vectoriousLib.vectoriousMod.Vector, b: vectoriousLib.vectoriousMod.Vector): vectoriousLib.vectoriousMod.Vector = js.native
  /**
       * Static method. Performs dot multiplication with two vectors `a` and `b`.
       * @param {Vector} a
       * @param {Vector} b
       * @returns {Number} the dot product of the two vectors
       **/
  def dot(a: vectoriousLib.vectoriousMod.Vector, b: vectoriousLib.vectoriousMod.Vector): scala.Double = js.native
  /**
       * Static method. Checks the equality of two vectors `a` and `b`.
       * @param {Vector} a
       * @param {Vector} b
       * @returns {Boolean} `true` if the two vectors are equal, `false` otherwise
       **/
  def equals(a: vectoriousLib.vectoriousMod.Vector, b: vectoriousLib.vectoriousMod.Vector): scala.Boolean = js.native
  /**
       * Static method. Normalizes `vector`, i.e. divides all elements with the magnitude.
       * @param {Vector} vector
       * @returns {Vector} a resultant normalized vector
       **/
  def normalize(vector: vectoriousLib.vectoriousMod.Vector): vectoriousLib.vectoriousMod.Vector = js.native
  /**
       * Static method. Creates a vector containing ones (`1`) of `count` size, takes
       * an optional `type` argument which should be an instance of `TypedArray`.
       * @param {Number} count
       * @param {TypedArray} type
       * @returns {Vector} a new vector of the specified size and `type`
       **/
  def ones(count: scala.Double): vectoriousLib.vectoriousMod.Vector = js.native
  /**
       * Static method. Creates a vector containing ones (`1`) of `count` size, takes
       * an optional `type` argument which should be an instance of `TypedArray`.
       * @param {Number} count
       * @param {TypedArray} type
       * @returns {Vector} a new vector of the specified size and `type`
       **/
  def ones(count: scala.Double, `type`: js.Any): vectoriousLib.vectoriousMod.Vector = js.native
  /**
       * Static method. Projects the vector `a` onto the vector `b` using
       * the projection formula `(b * (a * b / b * b))`.
       * @param {Vector} a
       * @param {Vector} b
       * @returns {Vector} a new resultant projected vector
       **/
  def project(a: vectoriousLib.vectoriousMod.Vector, b: vectoriousLib.vectoriousMod.Vector): vectoriousLib.vectoriousMod.Vector = js.native
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
  def random(count: scala.Double): vectoriousLib.vectoriousMod.Vector = js.native
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
  def random(count: scala.Double, deviation: scala.Double): vectoriousLib.vectoriousMod.Vector = js.native
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
  def random(count: scala.Double, deviation: scala.Double, mean: scala.Double): vectoriousLib.vectoriousMod.Vector = js.native
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
  def random(count: scala.Double, deviation: scala.Double, mean: scala.Double, `type`: js.Any): vectoriousLib.vectoriousMod.Vector = js.native
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
  def range(start: scala.Double, end: scala.Double): vectoriousLib.vectoriousMod.Vector = js.native
  def range(start: scala.Double, step: scala.Double, end: scala.Double): vectoriousLib.vectoriousMod.Vector = js.native
  /**
       * Static method. Multiplies all elements of `vector` with a specified `scalar`.
       * @param {Vector} vector
       * @param {Number} scalar
       * @returns {Vector} a resultant scaled vector
       **/
  def scale(vector: vectoriousLib.vectoriousMod.Vector, scalar: scala.Double): vectoriousLib.vectoriousMod.Vector = js.native
  /**
       * Static method. Subtracts the vector `b` from vector `a`.
       * @param {Vector} a
       * @param {Vector} b
       * @returns {Vector} a vector containing the difference between `a` and `b`
       **/
  def subtract(a: vectoriousLib.vectoriousMod.Vector, b: vectoriousLib.vectoriousMod.Vector): vectoriousLib.vectoriousMod.Vector = js.native
  /**
       * Static method. Creates a vector containing zeros (`0`) of `count` size, takes
       * an optional `type` argument which should be an instance of `TypedArray`.
       * @param {Number} count
       * @param {TypedArray} type
       * @returns {Vector} a new vector of the specified size and `type`
       **/
  def zeros(count: scala.Double): vectoriousLib.vectoriousMod.Vector = js.native
  /**
       * Static method. Creates a vector containing zeros (`0`) of `count` size, takes
       * an optional `type` argument which should be an instance of `TypedArray`.
       * @param {Number} count
       * @param {TypedArray} type
       * @returns {Vector} a new vector of the specified size and `type`
       **/
  def zeros(count: scala.Double, `type`: js.Any): vectoriousLib.vectoriousMod.Vector = js.native
}

