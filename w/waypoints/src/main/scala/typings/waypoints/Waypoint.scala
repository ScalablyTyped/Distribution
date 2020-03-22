package typings.waypoints

import typings.std.HTMLElement
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
  var element: HTMLElement = js.native
  var group: WaypointGroup = js.native
  var options: WaypointOptions = js.native
  var triggerPoint: Double = js.native
  // Instance Methods
  def destroy(): Waypoint = js.native
  def disable(): Waypoint = js.native
  def enable(): Waypoint = js.native
  def next(): Waypoint | String = js.native
   // actually `null` not string
  def previous(): Waypoint | String = js.native
}

/* static members */
@JSGlobal("Waypoint")
@js.native
object Waypoint extends js.Object {
  var Adapter: WaypointAdapter = js.native
  // Waypoint.Context
  var Context: AnonFindByElement = js.native
  var adapters: AnonPush = js.native
   // actually `null` not string
  // Class Methods
  def destroyAll(): Unit = js.native
  def disableAll(): Unit = js.native
  def enableAll(): Unit = js.native
  def refreshAll(): Unit = js.native
  def viewportHeight(): Double = js.native
  def viewportWidth(): Double = js.native
}

