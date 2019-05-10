package typings
package sylvesterDashEs6Lib.sylvesterDashEs6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sylvester-es6", "LineSegment")
@js.native
class LineSegment protected () extends js.Object {
  def this(v1: js.Array[scala.Double], v2: js.Array[scala.Double]) = this()
  def this(v1: js.Array[scala.Double], v2: Vector) = this()
  def this(v1: Vector, v2: js.Array[scala.Double]) = this()
  /**
    * Constructor function.
    */
  def this(v1: Vector, v2: Vector) = this()
  /**
    * Returns the plane that bisects this segment.
    */
  def bisectingPlane(): Plane = js.native
  def contains(point: Line): scala.Boolean = js.native
  def contains(point: Plane): scala.Boolean = js.native
  /**
    * Returns true if the argument is a point on the line.
    */
  def contains(point: Vector): scala.Boolean = js.native
  def distanceFrom(obj: Line): scala.Double = js.native
  def distanceFrom(obj: Plane): scala.Double = js.native
  /**
    * Returns the vector's distance from the argument, when considered as a point in space.
    */
  def distanceFrom(obj: Vector): scala.Double = js.native
  /**
    * Returns a duplicate of this segment.
    */
  def dup(): LineSegment = js.native
  /**
    * Whether a segment is equal to this segment.
    */
  def eql(segment: LineSegment): scala.Boolean = js.native
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
    * Returns the length of this segment.
    */
  def length(): scala.Double = js.native
  /**
    * Returns the midpoint of this segment as a vector.
    */
  def midpoint(): Vector = js.native
  def pointClosestTo(obj: js.Array[scala.Double]): Vector = js.native
  def pointClosestTo(obj: Line): Vector = js.native
  /**
    * Returns the point on the line that is closest to the given point or line.
    */
  def pointClosestTo(obj: Vector): Vector = js.native
  def setPoints(startPoint: js.Array[scala.Double], endPoint: js.Array[scala.Double]): LineSegment | scala.Null = js.native
  def setPoints(startPoint: js.Array[scala.Double], endPoint: Vector): LineSegment | scala.Null = js.native
  def setPoints(startPoint: Vector, endPoint: js.Array[scala.Double]): LineSegment | scala.Null = js.native
  /**
    * Sets the initial point of the line segments
    */
  def setPoints(startPoint: Vector, endPoint: Vector): LineSegment | scala.Null = js.native
  /**
    * Converts this segment into a single vector.
    */
  def toVector(): Vector = js.native
  def translate(vector: js.Array[scala.Double]): LineSegment = js.native
  /**
    * Translates this segment given a vector.
    */
  def translate(vector: Vector): LineSegment = js.native
}

