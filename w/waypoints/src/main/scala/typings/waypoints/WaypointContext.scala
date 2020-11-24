package typings.waypoints

import typings.std.HTMLElement
import typings.std.Window
import typings.waypoints.anon.Horizontal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaypointContext extends js.Object {
  
  var adapter: WaypointAdapter = js.native
  
   // http://imakewebthings.com/waypoints/api/context/#waypoints-property
  def destroy(): Waypoint = js.native
  
  var element: HTMLElement | Window = js.native
  
  def refresh(): Waypoint = js.native
  
  var waypoints: Horizontal = js.native
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
  
  @scala.inline
  implicit class WaypointContextOps[Self <: WaypointContext] (val x: Self) extends AnyVal {
    
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
    def setAdapter(value: WaypointAdapter): Self = this.set("adapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroy(value: () => Waypoint): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setElement(value: HTMLElement | Window): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: () => Waypoint): Self = this.set("refresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWaypoints(value: Horizontal): Self = this.set("waypoints", value.asInstanceOf[js.Any])
  }
}
