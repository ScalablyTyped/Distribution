package typings.waypoints

import typings.std.HTMLElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WaypointContext")
@js.native
class WaypointContext () extends js.Object {
  var adapter: WaypointAdapter = js.native
  var element: HTMLElement | Window = js.native
  var waypoints: Anon_Horizontal = js.native
   // http://imakewebthings.com/waypoints/api/context/#waypoints-property
  def destroy(): Waypoint = js.native
  def refresh(): Waypoint = js.native
}

