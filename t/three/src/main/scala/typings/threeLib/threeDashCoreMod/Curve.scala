package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "Curve")
@js.native
class Curve[T /* <: Vector */] () extends js.Object {
  /**
    * This value determines the amount of divisions when calculating the cumulative segment lengths of a curve via .getLengths.
    * To ensure precision when using methods like .getSpacedPoints, it is recommended to increase .arcLengthDivisions if the curve is very large.
    * Default is 200.
    */
  var arcLengthDivisions: scala.Double = js.native
  /**
    * Get total curve arc length
    */
  def getLength(): scala.Double = js.native
  /**
    * Get list of cumulative segment lengths
    */
  def getLengths(): js.Array[scala.Double] = js.native
  def getLengths(divisions: scala.Double): js.Array[scala.Double] = js.native
  /**
    * Returns a vector for point t of the curve where t is between 0 and 1
    * getPoint(t: number): T;
    */
  def getPoint(t: scala.Double): T = js.native
  def getPoint(t: scala.Double, optionalTarget: T): T = js.native
  /**
    * Returns a vector for point at relative position in curve according to arc length
    * getPointAt(u: number): T;
    */
  def getPointAt(u: scala.Double): T = js.native
  def getPointAt(u: scala.Double, optionalTarget: T): T = js.native
  /**
    * Get sequence of points using getPoint( t )
    * getPoints(divisions?: number): T[];
    */
  def getPoints(): js.Array[T] = js.native
  def getPoints(divisions: scala.Double): js.Array[T] = js.native
  /**
    * Get sequence of equi-spaced points using getPointAt( u )
    * getSpacedPoints(divisions?: number): T[];
    */
  def getSpacedPoints(): js.Array[T] = js.native
  def getSpacedPoints(divisions: scala.Double): js.Array[T] = js.native
  /**
    * Returns a unit vector tangent at t. If the subclassed curve do not implement its tangent derivation, 2 points a small delta apart will be used to find its gradient which seems to give a reasonable approximation
    * getTangent(t: number): T;
    */
  def getTangent(t: scala.Double): T = js.native
  /**
    * Returns tangent at equidistance point u on the curve
    * getTangentAt(u: number): T;
    */
  def getTangentAt(u: scala.Double): T = js.native
  /**
    * Given u ( 0 .. 1 ), get a t to find p. This gives you points which are equi distance
    */
  def getUtoTmapping(u: scala.Double, distance: scala.Double): scala.Double = js.native
  /**
    * Update the cumlative segment distance cache
    */
  def updateArcLengths(): scala.Unit = js.native
}

/* static members */
@JSImport("three/three-core", "Curve")
@js.native
object Curve extends js.Object {
  /**
    * @deprecated since r84.
    */
  def create(constructorFunc: js.Function, getPointFunc: js.Function): js.Function = js.native
}

