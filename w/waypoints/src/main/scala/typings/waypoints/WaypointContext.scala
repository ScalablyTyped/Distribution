package typings.waypoints

import typings.std.HTMLElement
import typings.std.Window
import typings.waypoints.anon.Horizontal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaypointContext extends js.Object {
  var adapter: WaypointAdapter
  var element: HTMLElement | Window
  var waypoints: Horizontal
   // http://imakewebthings.com/waypoints/api/context/#waypoints-property
  def destroy(): Waypoint
  def refresh(): Waypoint
}

object WaypointContext {
  @scala.inline
  def apply(
    adapter: WaypointAdapter,
    destroy: () => Waypoint,
    element: HTMLElement | Window,
    refresh: () => Waypoint,
    waypoints: Horizontal
  ): WaypointContext = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), element = element.asInstanceOf[js.Any], refresh = js.Any.fromFunction0(refresh), waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaypointContext]
  }
}

