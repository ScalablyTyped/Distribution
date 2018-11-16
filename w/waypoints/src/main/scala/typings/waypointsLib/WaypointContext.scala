package typings
package waypointsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WaypointContext")
@js.native
class WaypointContext () extends js.Object {
  var adapter: WaypointAdapter = js.native
  var element: stdLib.HTMLElement | stdLib.Window = js.native
  var waypoints: Anon_Horizontal = js.native
   // http://imakewebthings.com/waypoints/api/context/#waypoints-property
  def destroy(): Waypoint = js.native
  def refresh(): Waypoint = js.native
}

