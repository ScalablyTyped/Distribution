package typings.sylvesterDashEs6.sylvesterDashEs6Mod

import typings.sylvesterDashEs6.sylvesterDashEs6Strings.convex
import typings.sylvesterDashEs6.sylvesterDashEs6Strings.reflex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sylvester-es6", "Vertex")
@js.native
class Vertex protected () extends Vector {
  def this(point: js.Array[Double]) = this()
  /**
    * The constructor function.
    */
  def this(point: Vector) = this()
  /**
    * Returns true iff the vertex's internal angle is 0 <= x < 180
    * in the context of the given polygon object. Returns null if the
    * vertex does not exist in the polygon.
    */
  def isConvex(polygon: Polygon): Boolean | Null = js.native
  /**
    * Returns true iff the vertex's internal angle is 180 <= x < 360.
    */
  def isReflex(polygon: Polygon): Boolean | Null = js.native
  /**
    * Returns the type of the vertex.
    */
  def `type`(polygon: Polygon): convex | reflex | Null = js.native
}

/* static members */
@JSImport("sylvester-es6", "Vertex")
@js.native
object Vertex extends js.Object {
  /**
    * Convert points into an array of Vertex.
    */
  def convert(points: js.Array[js.Array[Double] | Vector]): js.Array[Vertex] = js.native
}

