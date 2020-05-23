package typings.waypoints

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Waypoint extends js.Object {
  // properties
  var adapter: WaypointAdapter
  var context: WaypointContext
  var element: HTMLElement
  var group: WaypointGroup
  var options: WaypointOptions
  var triggerPoint: Double
  // Instance Methods
  def destroy(): Waypoint
  def disable(): Waypoint
  def enable(): Waypoint
  def next(): Waypoint | String
   // actually `null` not string
  def previous(): Waypoint | String
}

object Waypoint {
  @scala.inline
  def apply(
    adapter: WaypointAdapter,
    context: WaypointContext,
    destroy: () => Waypoint,
    disable: () => Waypoint,
    element: HTMLElement,
    enable: () => Waypoint,
    group: WaypointGroup,
    next: () => Waypoint | String,
    options: WaypointOptions,
    previous: () => Waypoint | String,
    triggerPoint: Double
  ): Waypoint = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), disable = js.Any.fromFunction0(disable), element = element.asInstanceOf[js.Any], enable = js.Any.fromFunction0(enable), group = group.asInstanceOf[js.Any], next = js.Any.fromFunction0(next), options = options.asInstanceOf[js.Any], previous = js.Any.fromFunction0(previous), triggerPoint = triggerPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Waypoint]
  }
}

