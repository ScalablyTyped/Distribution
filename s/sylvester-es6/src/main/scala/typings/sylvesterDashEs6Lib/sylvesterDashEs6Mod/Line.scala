package typings
package sylvesterDashEs6Lib.sylvesterDashEs6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sylvester-es6", "Line")
@js.native
class Line protected () extends js.Object {
  /**
    * Constructor function.
    */
  def this(anchor: js.Array[scala.Double], direction: js.Array[scala.Double]) = this()
  def this(anchor: js.Array[scala.Double], direction: Vector) = this()
  def this(anchor: Vector, direction: js.Array[scala.Double]) = this()
  def this(anchor: Vector, direction: Vector) = this()
  /**
    * Gets the 3D vector corresponding to a point on the line.
    */
  var anchor: Vector = js.native
  /**
    * Gets a normalized 3D vector representing the line's direction.
    */
  var direction: Vector = js.native
  /**
    * Returns true if the argument is a point on the line.
    */
  def contains(point: Vector): scala.Boolean = js.native
  def distanceFrom(obj: Line): scala.Double = js.native
  def distanceFrom(obj: Plane): scala.Double = js.native
  /**
    * Returns the line's perpendicular distance from the argument, which can be a point, a line or a plane.
    */
  def distanceFrom(obj: Vector): scala.Double = js.native
  /**
    * Returns a copy of the line.
    */
  def dup(): Line = js.native
  /**
    * Returns true if the argument occupies the same space as the line.
    */
  def eql(line: Line): scala.Boolean = js.native
  /**
    * Returns the unique intersection point with the argument, if one exists.
    */
  def intersectionWith(obj: Line): Vector = js.native
  def intersectionWith(obj: Plane): Vector = js.native
  /**
    * Returns true if the line has a unique point of intersection with the argument.
    */
  def intersects(obj: Line): scala.Boolean = js.native
  def intersects(obj: Plane): scala.Boolean = js.native
  /**
    * Returns true if the line is parallel to the argument. Here, 'parallel to' means that the argument's
    * direction is either parallel or antiparallel to the line's own direction. A line is parallel to a
    * plane if the two do not have a unique intersection.
    */
  def isParallelTo(obj: Line): scala.Boolean = js.native
  def isParallelTo(obj: Plane): scala.Boolean = js.native
  /**
    * Returns true if the line lies in the given plane.
    */
  def liesIn(plane: Plane): scala.Boolean = js.native
  def pointClosestTo(obj: js.Array[scala.Double]): Vector = js.native
  def pointClosestTo(obj: Line): Vector = js.native
  /**
    * Returns the point on the line that is closest to the given point or line.
    */
  def pointClosestTo(obj: Vector): Vector = js.native
  def reflectionIn(obj: Line): Line = js.native
  def reflectionIn(obj: Plane): Line = js.native
  /**
    * Returns the line's reflection in the given point or line.
    */
  def reflectionIn(obj: Vector): Line = js.native
  def rotate(t: scala.Double, axis: Line): Line = js.native
  /**
    * Returns a copy of the line rotated by t radians about the given line. Works by finding the argument's
    * closest point to this line's anchor point (call this C) and rotating the anchor about C. Also rotates
    * the line's direction about the argument's. Be careful with this - the rotation axis' direction
    * affects the outcome!
    */
  def rotate(t: scala.Double, axis: Vector): Line = js.native
  /**
    * Set the line's anchor point and direction.
    */
  def setVectors(anchor: js.Array[scala.Double], direction: js.Array[scala.Double]): Line = js.native
  def setVectors(anchor: js.Array[scala.Double], direction: Vector): Line = js.native
  def setVectors(anchor: Vector, direction: js.Array[scala.Double]): Line = js.native
  def setVectors(anchor: Vector, direction: Vector): Line = js.native
  def translate(vector: js.Array[scala.Double]): Line = js.native
  /**
    * Returns the result of translating the line by the given vector/array.
    */
  def translate(vector: Vector): Line = js.native
}

/* static members */
@JSImport("sylvester-es6", "Line")
@js.native
object Line extends js.Object {
  var X: sylvesterDashEs6Lib.sylvesterDashEs6Mod.Line = js.native
  var Y: sylvesterDashEs6Lib.sylvesterDashEs6Mod.Line = js.native
  var Z: sylvesterDashEs6Lib.sylvesterDashEs6Mod.Line = js.native
}

