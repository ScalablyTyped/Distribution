package typings.titanium.Titanium

import typings.titanium.RouteDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when an audio line type change is detected.
  */
@js.native
trait MediaRoutechangeEvent extends MediaBaseEvent {
  
  /**
    * Returns a description of the current route, consisting of zero or more input ports and zero or more output ports.
    */
  var currentRoute: RouteDescription = js.native
  
  /**
    * Returns a description of the old route, consisting of zero or more input ports and zero or more output ports.
    */
  var oldRoute: RouteDescription = js.native
  
  /**
    * The reason for route change.
    */
  var reason: String = js.native
}
object MediaRoutechangeEvent {
  
  @scala.inline
  def apply(currentRoute: RouteDescription, oldRoute: RouteDescription, reason: String, source: Media): MediaRoutechangeEvent = {
    val __obj = js.Dynamic.literal(currentRoute = currentRoute.asInstanceOf[js.Any], oldRoute = oldRoute.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRoutechangeEvent]
  }
  
  @scala.inline
  implicit class MediaRoutechangeEventOps[Self <: MediaRoutechangeEvent] (val x: Self) extends AnyVal {
    
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
    def setCurrentRoute(value: RouteDescription): Self = this.set("currentRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldRoute(value: RouteDescription): Self = this.set("oldRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
}
