package typings.titanium.Titanium.UI

import typings.titanium.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the device detects a click against the view.
  */
@js.native
trait DashboardViewClickEvent extends DashboardViewBaseEvent {
  
  /**
    * Item that was clicked.
    */
  var item: js.Any = js.native
  
  /**
    * Coordinates x and y of the event from the parent view's coordinate system.
    */
  var location: Point = js.native
}
object DashboardViewClickEvent {
  
  @scala.inline
  def apply(item: js.Any, location: Point, source: DashboardView): DashboardViewClickEvent = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardViewClickEvent]
  }
  
  @scala.inline
  implicit class DashboardViewClickEventMutableBuilder[Self <: DashboardViewClickEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Point): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
  }
}
