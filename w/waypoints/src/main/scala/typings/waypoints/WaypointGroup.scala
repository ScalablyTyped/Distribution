package typings.waypoints

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WaypointGroup")
@js.native
class WaypointGroup () extends js.Object {
  var axis: String = js.native
  var name: String = js.native
  var waypoints: js.Array[Waypoint] = js.native
  def first(): Waypoint = js.native
  def last(): Waypoint = js.native
}

