package typings
package sylvesterDashEs6Lib.sylvesterDashEs6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sylvester-es6", "Vertex")
@js.native
class Vertex protected () extends Vector {
  def this(point: js.Array[scala.Double]) = this()
  /**
    * The constructor function.
    */
  def this(point: Vector) = this()
  /**
    * Returns true iff the vertex's internal angle is 0 <= x < 180
    * in the context of the given polygon object. Returns null if the
    * vertex does not exist in the polygon.
    */
  def isConvex(polygon: Polygon): scala.Boolean | scala.Null = js.native
  /**
    * Returns true iff the vertex's internal angle is 180 <= x < 360.
    */
  def isReflex(polygon: Polygon): scala.Boolean | scala.Null = js.native
  /**
    * Returns the type of the vertex.
    */
  def `type`(polygon: Polygon): sylvesterDashEs6Lib.sylvesterDashEs6LibStrings.convex | sylvesterDashEs6Lib.sylvesterDashEs6LibStrings.reflex | scala.Null = js.native
}

/* static members */
@JSImport("sylvester-es6", "Vertex")
@js.native
object Vertex extends js.Object {
  /**
    * Convert points into an array of Vertex.
    */
  def convert(points: js.Array[js.Array[scala.Double] | sylvesterDashEs6Lib.sylvesterDashEs6Mod.Vector]): js.Array[sylvesterDashEs6Lib.sylvesterDashEs6Mod.Vertex] = js.native
}

