package typings
package sylvesterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plane extends js.Object {
  /**
    * Gets the 3D vector corresponding to a point in the plane.
    */
  var anchor: Vector = js.native
  /**
    * Gets a normalized 3D vector perpendicular to the plane.
    */
  var normal: Vector = js.native
  def contains(obj: Line): scala.Boolean = js.native
  /**
    * Returns true if the plane contains the given point or line.
    *
    * @param {Vector|Line} obj The object.
    */
  def contains(obj: Vector): scala.Boolean = js.native
  def distanceFrom(obj: Line): scala.Double = js.native
  def distanceFrom(obj: Plane): scala.Double = js.native
  /**
    * Returns the plane's distance from the given object (point, line or plane).
    *
    * @parm {Vector|Line|Plane} obj The object.
    */
  def distanceFrom(obj: Vector): scala.Double = js.native
  /**
    * Returns a copy of the plane.
    */
  def dup(): Plane = js.native
  /**
    * Returns true if the plane occupies the same space as the argument.
    *
    * @param {Plane} plane The other plane.
    */
  def eql(plane: Plane): scala.Boolean = js.native
  /**
    * Returns the unique intersection with the argument, if one exists.
    *
    * @param {Line} line The line.
    */
  def intersectionWith(line: Line): Vector = js.native
  /**
    * Returns the unique intersection with the argument, if one exists.
    *
    * @param {Plane} plane The plane.
    */
  def intersectionWith(plane: Plane): Line = js.native
  /**
    * Returns true if the plane has a unique point/line of intersection with the argument.
    *
    * @param {Line|Plane} obj The object.
    */
  def intersects(obj: Line): scala.Boolean = js.native
  def intersects(obj: Plane): scala.Boolean = js.native
  /**
    * Returns true if the plane is parallel to the argument. Will return true if the planes are equal,
    * or if you give a line and it lies in the plane.
    *
    * @param {Line|Plane} obj The object.
    */
  def isParallelTo(obj: Line): scala.Boolean = js.native
  def isParallelTo(obj: Plane): scala.Boolean = js.native
  /**
    * Returns true if the receiver is perpendicular to the argument.
    *
    * @param {Plane} plane The other plane.
    */
  def isPerpendicularTo(plane: Plane): scala.Boolean = js.native
  /**
    * Returns the point in the plane closest to the given point.
    *
    * @param {Vector} point The point.
    */
  def pointClosestTo(point: Vector): Vector = js.native
  def reflectionIn(obj: Line): Plane = js.native
  def reflectionIn(obj: Plane): Plane = js.native
  /**
    * Returns the reflection of the plane in the given point, line or plane.
    *
    * @param {Vector|Line|Plane} obj The object.
    */
  def reflectionIn(obj: Vector): Plane = js.native
  /**
    * Returns a copy of the plane, rotated by t radians about the given line. See notes on Line#rotate.
    *
    * @param {number} t The angle in radians.
    * @param {Line} axis The line axis.
    */
  def rotate(t: scala.Double, axis: Line): Plane = js.native
  /**
    * Sets the anchor point and normal to the plane. Normal vector is normalised before storage.
    *
    * @param {Array<number>|Vector} anchor The anchor vector.
    * @param {Array<number>|Vector} normal The normal vector.
    */
  def setVectors(anchor: js.Array[scala.Double], normal: js.Array[scala.Double]): Plane = js.native
  def setVectors(anchor: js.Array[scala.Double], normal: Vector): Plane = js.native
  /**
    * Sets the anchor point and normal to the plane. The normal is calculated by assuming the three points
    * should lie in the same plane. Normal vector is normalised before storage.
    *
    * @param {Array<number>|Vector} anchor The anchor vector.
    * @param {Array<number>|Vector} v1 The first direction vector.
    * @param {Array<number>|Vector} v2 The second direction vector.
    */
  def setVectors(anchor: js.Array[scala.Double], v1: js.Array[scala.Double], v2: js.Array[scala.Double]): Plane = js.native
  def setVectors(anchor: js.Array[scala.Double], v1: js.Array[scala.Double], v2: Vector): Plane = js.native
  def setVectors(anchor: js.Array[scala.Double], v1: Vector, v2: js.Array[scala.Double]): Plane = js.native
  def setVectors(anchor: js.Array[scala.Double], v1: Vector, v2: Vector): Plane = js.native
  def setVectors(anchor: Vector, normal: js.Array[scala.Double]): Plane = js.native
  def setVectors(anchor: Vector, normal: Vector): Plane = js.native
  def setVectors(anchor: Vector, v1: js.Array[scala.Double], v2: js.Array[scala.Double]): Plane = js.native
  def setVectors(anchor: Vector, v1: js.Array[scala.Double], v2: Vector): Plane = js.native
  def setVectors(anchor: Vector, v1: Vector, v2: js.Array[scala.Double]): Plane = js.native
  def setVectors(anchor: Vector, v1: Vector, v2: Vector): Plane = js.native
  /**
    * Returns the result of translating the plane by the given vector.
    *
    * @param {Array<number>|Vector} vector The translation vector.
    */
  def translate(vector: js.Array[scala.Double]): Plane = js.native
  def translate(vector: Vector): Plane = js.native
}

