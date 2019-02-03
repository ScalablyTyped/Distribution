package typings
package waypointsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Waypoint")
@js.native
class Waypoint protected () extends js.Object {
  def this(options: WaypointOptions) = this()
  // properties
  var adapter: WaypointAdapter = js.native
  var context: WaypointContext = js.native
  var element: stdLib.HTMLElement = js.native
  var group: WaypointGroup = js.native
  var options: WaypointOptions = js.native
  var triggerPoint: scala.Double = js.native
  // Instance Methods
  def destroy(): Waypoint = js.native
  def disable(): Waypoint = js.native
  def enable(): Waypoint = js.native
  def next(): Waypoint | java.lang.String = js.native
   // actually `null` not string
  def previous(): Waypoint | java.lang.String = js.native
}

/* static members */
@JSGlobal("Waypoint")
@js.native
object Waypoint extends js.Object {
  var Adapter: waypointsLib.WaypointAdapter = js.native
  // Waypoint.Context
  var Context: waypointsLib.Anon_Element = js.native
  var adapters: waypointsLib.Anon_Push = js.native
   // actually `null` not string
  // Class Methods
  def destroyAll(): scala.Unit = js.native
  def disableAll(): scala.Unit = js.native
  def enableAll(): scala.Unit = js.native
  def refreshAll(): scala.Unit = js.native
  def viewportHeight(): scala.Double = js.native
  def viewportWidth(): scala.Double = js.native
}

