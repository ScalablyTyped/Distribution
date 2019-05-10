package typings
package sylvesterDashEs6Lib.sylvesterDashEs6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sylvester-es6", "Vector")
@js.native
class Vector protected () extends js.Object {
  def this(elements: js.Array[scala.Double]) = this()
  /**
    * Constructor function.
    */
  def this(elements: Vector) = this()
  /**
    * Gets an array containing the vector's elements.
    */
  var elements: js.Array[scala.Double] = js.native
  def add(vector: js.Array[scala.Double]): Vector = js.native
  /**
    * Returns the result of adding the argument to the vector.
    */
  def add(vector: Vector): Vector = js.native
  /**
    * Returns the angle between the vector and the argument (also a vector).
    */
  def angleFrom(vector: Vector): scala.Double = js.native
  def cross(vector: js.Array[scala.Double]): Vector = js.native
  /**
    * Returns the vector product of the vector with the argument. Both vectors must have dimensionality 3.
    */
  def cross(vector: Vector): Vector = js.native
  /**
    * Returns the number of elements the vector has.
    */
  def dimensions(): scala.Double = js.native
  def distanceFrom(obj: Line): scala.Double = js.native
  def distanceFrom(obj: Plane): scala.Double = js.native
  /**
    * Returns the vector's distance from the argument, when considered as a point in space.
    */
  def distanceFrom(obj: Vector): scala.Double = js.native
  def dot(vector: js.Array[scala.Double]): scala.Double = js.native
  /**
    * Returns the scalar product of the vector with the argument. Both vectors must have equal dimensionality.
    *
    * @param: {Vector|number[]} vector The other vector.
    */
  def dot(vector: Vector): scala.Double = js.native
  /**
    * Returns a copy of the vector.
    */
  def dup(): Vector = js.native
  /**
    * Returns element i of the vector.
    */
  def e(i: scala.Double): scala.Double = js.native
  /**
    * Calls the iterator for each element of the vector in turn.
    */
  def each(fn: js.Function2[/* x */ scala.Double, /* i */ scala.Double, _]): scala.Unit = js.native
  def eql(vector: js.Array[scala.Double]): scala.Boolean = js.native
  /**
    * Returns true if the vector is equal to the argument.
    */
  def eql(vector: Vector): scala.Boolean = js.native
  /**
    * Returns the index of the first match found.
    */
  def indexOf(x: scala.Double): scala.Double = js.native
  /**
    * Returns a string representation of the vector.
    */
  def inspect(): java.lang.String = js.native
  /**
    * Returns true if the vector is antiparallel to the argument.
    */
  def isAntiparallelTo(vector: Vector): scala.Boolean = js.native
  /**
    * Returns true if the vector is parallel to the argument.
    */
  def isParallelTo(vector: Vector): scala.Boolean = js.native
  /**
    * Returns true iff the vector is perpendicular to the argument.
    */
  def isPerpendicularTo(vector: Vector): scala.Boolean = js.native
  /**
    * Return true if the vector is a point in the given plane.
    */
  def liesIn(plane: Plane): scala.Boolean = js.native
  /**
    * Returns true if the vector is point on the given line.
    */
  def liesOn(line: Line): scala.Boolean = js.native
  /**
    * Maps the vector to another vector according to the given function.
    */
  def map(fn: js.Function2[/* x */ scala.Double, /* i */ scala.Double, _]): Vector = js.native
  /**
    * Returns the (absolute) largest element of the vector.
    */
  def max(): scala.Double = js.native
  /**
    * Returns the modulus ('length') of the vector.
    */
  def modulus(): scala.Double = js.native
  /**
    * Returns the result of multiplying the elements of the vector by the argument.
    */
  def multiply(k: scala.Double): Vector = js.native
  def reflectionIn(obj: Line): Vector = js.native
  def reflectionIn(obj: Plane): Vector = js.native
  /**
    * Returns the result of reflecting the point in the given point, line or plane.
    */
  def reflectionIn(obj: Vector): Vector = js.native
  def rotate(t: scala.Double, obj: Line): Vector = js.native
  /**
    * Rotates the vector about the given object. The object should be a point if the vector is 2D,
    * and a line if it is 3D. Be careful with line directions!
    */
  def rotate(t: scala.Double, obj: Vector): Vector = js.native
  /**
    * Returns the result of rounding the elements of the vector.
    */
  def round(): Vector = js.native
  def setElements(els: js.Array[scala.Double]): Vector = js.native
  /**
    * Set vector's elements from an array.
    */
  def setElements(els: Vector): Vector = js.native
  /**
    * Returns a copy of the vector with elements set to the given value if they differ from
    * it by less than Sylvester.precision.
    */
  def snapTo(x: scala.Double): Vector = js.native
  def subtract(vector: js.Array[scala.Double]): Vector = js.native
  /**
    * Returns the result of subtracting the argument from the vector.
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
    */
  def x(k: scala.Double): Vector = js.native
}

/* static members */
@JSImport("sylvester-es6", "Vector")
@js.native
object Vector extends js.Object {
  var i: sylvesterDashEs6Lib.sylvesterDashEs6Mod.Vector = js.native
  var j: sylvesterDashEs6Lib.sylvesterDashEs6Mod.Vector = js.native
  var k: sylvesterDashEs6Lib.sylvesterDashEs6Mod.Vector = js.native
  /**
    * Random vector of size n.
    */
  def Random(n: scala.Double): sylvesterDashEs6Lib.sylvesterDashEs6Mod.Vector = js.native
  /**
    * Vector filled with zeros.
    */
  def Zero(n: scala.Double): sylvesterDashEs6Lib.sylvesterDashEs6Mod.Vector = js.native
}

