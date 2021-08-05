package typings.waypoints

import typings.std.HTMLElement
import typings.std.Window
import typings.waypoints.anon.Horizontal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaypointContext extends StObject {
  
  var adapter: WaypointAdapter
  
  // http://imakewebthings.com/waypoints/api/context/#waypoints-property
  def destroy(): Waypoint
  
  var element: HTMLElement | Window
  
  def refresh(): Waypoint
  
  var waypoints: Horizontal
}
object WaypointContext {
  
  inline def apply(
    adapter: WaypointAdapter,
    destroy: () => Waypoint,
    element: HTMLElement | Window,
    refresh: () => Waypoint,
    waypoints: Horizontal
  ): WaypointContext = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), element = element.asInstanceOf[js.Any], refresh = js.Any.fromFunction0(refresh), waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaypointContext]
  }
  
  extension [Self <: WaypointContext](x: Self) {
    
    inline def setAdapter(value: WaypointAdapter): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: () => Waypoint): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setElement(value: HTMLElement | Window): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: () => Waypoint): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    
    inline def setWaypoints(value: Horizontal): Self = StObject.set(x, "waypoints", value.asInstanceOf[js.Any])
  }
}
