package typings.waypoints

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaypointOptionsJQuery
  extends StObject
     with WaypointOptionsBase {
  
  var context: js.UndefOr[HTMLElement | String] = js.undefined
  
  var handler: js.UndefOr[js.ThisFunction1[/* this */ Waypoint, /* direction */ js.UndefOr[String], Unit]] = js.undefined
}
object WaypointOptionsJQuery {
  
  @scala.inline
  def apply(): WaypointOptionsJQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaypointOptionsJQuery]
  }
  
  @scala.inline
  implicit class WaypointOptionsJQueryMutableBuilder[Self <: WaypointOptionsJQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: HTMLElement | String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setHandler(value: js.ThisFunction1[/* this */ Waypoint, /* direction */ js.UndefOr[String], Unit]): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
  }
}
