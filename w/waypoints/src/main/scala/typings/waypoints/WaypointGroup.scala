package typings.waypoints

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaypointGroup extends js.Object {
  var axis: String = js.native
  var name: String = js.native
  var waypoints: js.Array[Waypoint] = js.native
  def first(): Waypoint = js.native
  def last(): Waypoint = js.native
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
  @scala.inline
  implicit class WaypointGroupOps[Self <: WaypointGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAxis(value: String): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirst(value: () => Waypoint): Self = this.set("first", js.Any.fromFunction0(value))
    @scala.inline
    def setLast(value: () => Waypoint): Self = this.set("last", js.Any.fromFunction0(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setWaypointsVarargs(value: Waypoint*): Self = this.set("waypoints", js.Array(value :_*))
    @scala.inline
    def setWaypoints(value: js.Array[Waypoint]): Self = this.set("waypoints", value.asInstanceOf[js.Any])
  }
  
}

