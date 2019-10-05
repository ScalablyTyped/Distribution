package typings.sylvester

import org.scalablytyped.runtime.TopLevel
import typings.sylvester.Sylvester.LineStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Line extends js.Object {
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
    *
    * @param {Vector} point The point.
    */
  def contains(point: Vector): Boolean = js.native
  def distanceFrom(obj: Line): Double = js.native
  def distanceFrom(obj: Plane): Double = js.native
  /**
    * Returns the line's perpendicular distance from the argument, which can be a point, a line or a plane.
    *
    * @param {Vector|Line|Plane} obj The object.
    */
  def distanceFrom(obj: Vector): Double = js.native
  /**
    * Returns a copy of the line.
    */
  def dup(): Line = js.native
  /**
    * Returns true if the argument occupies the same space as the line.
    *
    * @param {Line} line The other line.
    */
  def eql(line: Line): Boolean = js.native
  /**
    * Returns the unique intersection point with the argument, if one exists.
    *
    * @param {Line|Plane} obj The object.
    */
  def intersectionWith(obj: Line): Vector = js.native
  def intersectionWith(obj: Plane): Vector = js.native
  /**
    * Returns true if the line has a unique point of intersection with the argument.
    *
    * @param {Line|Plane} obj The object.
    */
  def intersects(obj: Line): Boolean = js.native
  def intersects(obj: Plane): Boolean = js.native
  /**
    * Returns true if the line is parallel to the argument. Here, 'parallel to' means that the argument's
    * direction is either parallel or antiparallel to the line's own direction. A line is parallel to a
    * plane if the two do not have a unique intersection.
    *
    * @param {Line|Plane} obj The object.
    */
  def isParallelTo(obj: Line): Boolean = js.native
  def isParallelTo(obj: Plane): Boolean = js.native
  /**
    * Returns true if the line lies in the given plane.
    *
    * @param {Plane} plane The plane.
    */
  def liesIn(plane: Plane): Boolean = js.native
  def pointClosestTo(obj: Line): Vector = js.native
  /**
    * Returns the point on the line that is closest to the given point or line.
    *
    * @param {Vector|Line} obj The object.
    */
  def pointClosestTo(obj: Vector): Vector = js.native
  def reflectionIn(obj: Line): Line = js.native
  def reflectionIn(obj: Plane): Line = js.native
  /**
    * Returns the line's reflection in the given point or line.
    *
    * @param {Vector|Line|Plane} obj The object.
    */
  def reflectionIn(obj: Vector): Line = js.native
  def rotate(t: Double, axis: Line): Line = js.native
  /**
    * Returns a copy of the line rotated by t radians about the given line. Works by finding the argument's
    * closest point to this line's anchor point (call this C) and rotating the anchor about C. Also rotates
    * the line's direction about the argument's. Be careful with this - the rotation axis' direction
    * affects the outcome!
    *
    * @param {number} t The angle in radians.
    * @param {Vector|Line} axis The axis.
    */
  def rotate(t: Double, axis: Vector): Line = js.native
  /**
    * Set the line's anchor point and direction.
    *
    * @param {Array<number>|Vector} anchor The anchor vector.
    * @param {Array<number>|Vector} direction The direction vector.
    */
  def setVectors(anchor: js.Array[Double], direction: js.Array[Double]): Line = js.native
  def setVectors(anchor: js.Array[Double], direction: Vector): Line = js.native
  def setVectors(anchor: Vector, direction: js.Array[Double]): Line = js.native
  def setVectors(anchor: Vector, direction: Vector): Line = js.native
  def translate(vector: js.Array[Double]): Line = js.native
  /**
    * Returns the result of translating the line by the given vector/array.
    *
    * @param {Vector|Array<number>} vector The translation vector.
    */
  def translate(vector: Vector): Line = js.native
}

@JSGlobal("Line")
@js.native
object Line extends TopLevel[LineStatic]

