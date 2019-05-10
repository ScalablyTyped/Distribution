package typings
package sylvesterDashEs6Lib.sylvesterDashEs6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sylvester-es6", "Plane")
@js.native
class Plane protected () extends js.Object {
  /**
    * Constructor function.
    */
  def this(anchor: js.Array[scala.Double], v1: js.Array[scala.Double]) = this()
  def this(anchor: js.Array[scala.Double], v1: Vector) = this()
  def this(anchor: Vector, v1: js.Array[scala.Double]) = this()
  def this(anchor: Vector, v1: Vector) = this()
  def this(anchor: js.Array[scala.Double], v1: js.Array[scala.Double], v2: js.Array[scala.Double]) = this()
  def this(anchor: js.Array[scala.Double], v1: js.Array[scala.Double], v2: Vector) = this()
  def this(anchor: js.Array[scala.Double], v1: Vector, v2: js.Array[scala.Double]) = this()
  def this(anchor: js.Array[scala.Double], v1: Vector, v2: Vector) = this()
  def this(anchor: Vector, v1: js.Array[scala.Double], v2: js.Array[scala.Double]) = this()
  def this(anchor: Vector, v1: js.Array[scala.Double], v2: Vector) = this()
  def this(anchor: Vector, v1: Vector, v2: js.Array[scala.Double]) = this()
  def this(anchor: Vector, v1: Vector, v2: Vector) = this()
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
    */
  def eql(plane: Plane): scala.Boolean = js.native
  /**
    * Returns the unique intersection with the argument, if one exists.
    */
  def intersectionWith(line: Line): Vector = js.native
  /**
    * Returns the unique intersection with the argument, if one exists.
    */
  def intersectionWith(plane: Plane): Line = js.native
  /**
    * Returns true if the plane has a unique point/line of intersection with the argument.
    */
  def intersects(obj: Line): scala.Boolean = js.native
  def intersects(obj: Plane): scala.Boolean = js.native
  /**
    * Returns true if the plane is parallel to the argument. Will return true if the planes are equal,
    * or if you give a line and it lies in the plane.
    */
  def isParallelTo(obj: Line): scala.Boolean = js.native
  def isParallelTo(obj: Plane): scala.Boolean = js.native
  /**
    * Returns true if the receiver is perpendicular to the argument.
    */
  def isPerpendicularTo(plane: Plane): scala.Boolean = js.native
  def pointClosestTo(point: js.Array[scala.Double]): Vector = js.native
  /**
    * Returns the point in the plane closest to the given point.
    */
  def pointClosestTo(point: Vector): Vector = js.native
  def reflectionIn(obj: Line): Plane = js.native
  def reflectionIn(obj: Plane): Plane = js.native
  /**
    * Returns the reflection of the plane in the given point, line or plane.
    */
  def reflectionIn(obj: Vector): Plane = js.native
  /**
    * Returns a copy of the plane, rotated by t radians about the given line. See notes on Line#rotate.
    */
  def rotate(t: scala.Double, axis: Line): Plane = js.native
  /**
    * Sets the anchor point and normal to the plane. The normal is calculated by assuming the three points
    * should lie in the same plane. Normal vector is normalised before storage.
    */
  def setVectors(anchor: js.Array[scala.Double], v1: js.Array[scala.Double]): Plane = js.native
  def setVectors(anchor: js.Array[scala.Double], v1: js.Array[scala.Double], v2: js.Array[scala.Double]): Plane = js.native
  def setVectors(anchor: js.Array[scala.Double], v1: js.Array[scala.Double], v2: Vector): Plane = js.native
  def setVectors(anchor: js.Array[scala.Double], v1: Vector): Plane = js.native
  def setVectors(anchor: js.Array[scala.Double], v1: Vector, v2: js.Array[scala.Double]): Plane = js.native
  def setVectors(anchor: js.Array[scala.Double], v1: Vector, v2: Vector): Plane = js.native
  def setVectors(anchor: Vector, v1: js.Array[scala.Double]): Plane = js.native
  def setVectors(anchor: Vector, v1: js.Array[scala.Double], v2: js.Array[scala.Double]): Plane = js.native
  def setVectors(anchor: Vector, v1: js.Array[scala.Double], v2: Vector): Plane = js.native
  def setVectors(anchor: Vector, v1: Vector): Plane = js.native
  def setVectors(anchor: Vector, v1: Vector, v2: js.Array[scala.Double]): Plane = js.native
  def setVectors(anchor: Vector, v1: Vector, v2: Vector): Plane = js.native
  /**
    * Returns the result of translating the plane by the given vector.
    */
  def translate(vector: js.Array[scala.Double]): Plane = js.native
  def translate(vector: Vector): Plane = js.native
}

/* static members */
@JSImport("sylvester-es6", "Plane")
@js.native
object Plane extends js.Object {
  var XY: sylvesterDashEs6Lib.sylvesterDashEs6Mod.Plane = js.native
  var YX: sylvesterDashEs6Lib.sylvesterDashEs6Mod.Plane = js.native
  var YZ: sylvesterDashEs6Lib.sylvesterDashEs6Mod.Plane = js.native
  var ZX: sylvesterDashEs6Lib.sylvesterDashEs6Mod.Plane = js.native
  /**
    * Constructs a plane from a list of points.
    */
  def fromPoints(points: js.Array[js.Array[scala.Double] | sylvesterDashEs6Lib.sylvesterDashEs6Mod.Vector]): sylvesterDashEs6Lib.sylvesterDashEs6Mod.Plane = js.native
}

