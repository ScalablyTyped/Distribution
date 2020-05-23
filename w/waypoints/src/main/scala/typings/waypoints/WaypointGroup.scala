package typings.waypoints

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaypointGroup extends js.Object {
  var axis: String
  var name: String
  var waypoints: js.Array[Waypoint]
  def first(): Waypoint
  def last(): Waypoint
}

object WaypointGroup {
  @scala.inline
  def apply(
    axis: String,
    first: () => Waypoint,
    last: () => Waypoint,
    name: String,
    waypoints: js.Array[Waypoint]
  ): WaypointGroup = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), name = name.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaypointGroup]
  }
}

