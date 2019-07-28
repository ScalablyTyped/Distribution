package typings.sylvester

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vector extends js.Object {
  /**
    * Gets an array containing the vector's elements.
    */
  var elements: js.Array[Double] = js.native
  def add(vector: js.Array[Double]): Vector = js.native
  /**
    * Returns the result of adding the argument to the vector.
    *
    * @param {Vector|Array<number>} vector The vector.
    */
  def add(vector: Vector): Vector = js.native
  /**
    * Returns the angle between the vector and the argument (also a vector).
    *
    * @param {Vector} vector The other vector to calculate the angle.
    */
  def angleFrom(vector: Vector): Double = js.native
  def cross(vector: js.Array[Double]): Vector = js.native
  /**
    * Returns the vector product of the vector with the argument. Both vectors must have dimensionality 3.
    *
    * @param {Vector|Array<number>} vector The other vector.
    */
  def cross(vector: Vector): Vector = js.native
  /**
    * Returns the number of elements the vector has.
    */
  def dimensions(): Double = js.native
  def distanceFrom(obj: Line): Double = js.native
  def distanceFrom(obj: Plane): Double = js.native
  /**
    * Returns the vector's distance from the argument, when considered as a point in space.
    *
    * @param {Vector|Line|Plane} obj The object to calculate the distance.
    */
  def distanceFrom(obj: Vector): Double = js.native
  def dot(vector: js.Array[Double]): Double = js.native
  /**
    * Returns the scalar product of the vector with the argument. Both vectors must have equal dimensionality.
    *
    * @param: {Vector|Array<number>} vector The other vector.
    */
  def dot(vector: Vector): Double = js.native
  /**
    * Returns a copy of the vector.
    */
  def dup(): Vector = js.native
  /**
    * Returns element i of the vector.
    */
  def e(i: Double): Double = js.native
  /**
    * Calls the iterator for each element of the vector in turn.
    *
    * @param {Function} fn The function to apply to each element (x, i) => {}.
    */
  def each(fn: js.Function2[/* x */ Double, /* i */ Double, _]): Unit = js.native
  def eql(vector: js.Array[Double]): Boolean = js.native
  /**
    * Returns true if the vector is equal to the argument.
    *
    * @param {Vector|Array<number>} vector The vector to compare equality.
    */
  def eql(vector: Vector): Boolean = js.native
  /**
    * Returns the index of the first match found.
    *
    * @param {number} x The value.
    */
  def indexOf(x: Double): Double = js.native
  /**
    * Returns a string representation of the vector.
    */
  def inspect(): String = js.native
  /**
    * Returns true if the vector is antiparallel to the argument.
    *
    * @param {Vector} vector The other vector.
    */
  def isAntiparallelTo(vector: Vector): Boolean = js.native
  /**
    * Returns true if the vector is parallel to the argument.
    *
    * @param {Vector} vector The other vector.
    */
  def isParallelTo(vector: Vector): Boolean = js.native
  /**
    * Returns true iff the vector is perpendicular to the argument.
    *
    * @param {Vector} vector The other vector.
    */
  def isPerpendicularTo(vector: Vector): Boolean = js.native
  /**
    * Return true if the vector is a point in the given plane.
    *
    * @param {Plane} plane The plane.
    */
  def liesIn(plane: Plane): Boolean = js.native
  /**
    * Returns true if the vector is point on the given line.
    *
    * @param {Line} line The line.
    */
  def liesOn(line: Line): Boolean = js.native
  /**
    * Maps the vector to another vector according to the given function.
    *
    * @param {Function} fn The function to apply to each element (x, i) => {}.
    */
  def map(fn: js.Function2[/* x */ Double, /* i */ Double, _]): Vector = js.native
  /**
    * Returns the (absolute) largest element of the vector.
    */
  def max(): Double = js.native
  /**
    * Returns the modulus ('length') of the vector.
    */
  def modulus(): Double = js.native
  /**
    * Returns the result of multiplying the elements of the vector by the argument.
    *
    * @param {number} k The value by which to multiply the vector.
    */
  def multiply(k: Double): Vector = js.native
  def reflectionIn(obj: Line): Vector = js.native
  def reflectionIn(obj: Plane): Vector = js.native
  /**
    * Returns the result of reflecting the point in the given point, line or plane.
    *
    * @param {Vector|Line|Plane} obj The object.
    */
  def reflectionIn(obj: Vector): Vector = js.native
  def rotate(t: Double, obj: Line): Vector = js.native
  /**
    * Rotates the vector about the given object. The object should be a point if the vector is 2D,
    * and a line if it is 3D. Be careful with line directions!
    *
    * @param {number|Matrix} t The angle in radians or in rotation matrix.
    * @param {Vector|Line} obj The rotation axis.
    */
  def rotate(t: Double, obj: Vector): Vector = js.native
  def rotate(t: Matrix, obj: Line): Vector = js.native
  def rotate(t: Matrix, obj: Vector): Vector = js.native
  /**
    * Returns the result of rounding the elements of the vector.
    */
  def round(): Vector = js.native
  def setElements(els: js.Array[Double]): Vector = js.native
  /**
    * Set vector's elements from an array.
    *
    * @param {Vector|Array<number>} els The elements.
    */
  def setElements(els: Vector): Vector = js.native
  /**
    * Returns a copy of the vector with elements set to the given value if they differ from
    * it by less than Sylvester.precision.
    *
    * @param {number} x The value to snap to.
    */
  def snapTo(x: Double): Vector = js.native
  def subtract(vector: js.Array[Double]): Vector = js.native
  /**
    * Returns the result of subtracting the argument from the vector.
    *
    * @param {Vector|Array<number>} vector The vector.
    */
  def subtract(vector: Vector): Vector = js.native
  /**
    * Utility to make sure vectors are 3D. If they are 2D, a zero z-component is added.
    */
  def to3D(): Vector = js.native
  /**
    * Returns a diagonal matrix with the vector's elements as its diagonal elements.
    */
  def toDiagonalMatrix(): Matrix = js.native
  /**
    * Returns a new vector created by normalizing the receiver.
    */
  def toUnitVector(): Vector = js.native
  /**
    * Returns the result of multiplying the elements of the vector by the argument (Alias for multiply(k)).
    *
    * @param {number} k The value by which to multiply the vector.
    */
  def x(k: Double): Vector = js.native
}

