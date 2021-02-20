package typings.titanium.Titanium.UI

import typings.titanium.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when a click is detected against the view.
  */
@js.native
trait DashboardItemClickEvent extends DashboardItemBaseEvent {
  
  /**
    * Item that was clicked.
    */
  var item: DashboardItem = js.native
  
  /**
    * Coordinates `x` and `y` of the event from the parent view's coordinate system.
    */
  var location: Point = js.native
}
object DashboardItemClickEvent {
  
  @scala.inline
  def apply(item: DashboardItem, location: Point, source: DashboardItem): DashboardItemClickEvent = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardItemClickEvent]
  }
  
  @scala.inline
  implicit class DashboardItemClickEventMutableBuilder[Self <: DashboardItemClickEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: DashboardItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Point): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
  }
}
