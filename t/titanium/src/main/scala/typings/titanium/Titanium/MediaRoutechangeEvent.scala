package typings.titanium.Titanium

import typings.titanium.RouteDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when an audio line type change is detected.
  */
trait MediaRoutechangeEvent extends MediaBaseEvent {
  /**
    * Returns a description of the current route, consisting of zero or more input ports and zero or more output ports.
    */
  var currentRoute: RouteDescription
  /**
    * Returns a description of the old route, consisting of zero or more input ports and zero or more output ports.
    */
  var oldRoute: RouteDescription
  /**
    * The reason for route change.
    */
  var reason: String
}

object MediaRoutechangeEvent {
  @scala.inline
  def apply(currentRoute: RouteDescription, oldRoute: RouteDescription, reason: String, source: Media): MediaRoutechangeEvent = {
    val __obj = js.Dynamic.literal(currentRoute = currentRoute.asInstanceOf[js.Any], oldRoute = oldRoute.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRoutechangeEvent]
  }
}

