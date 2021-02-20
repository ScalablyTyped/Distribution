package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when an item finishes being dragged in edit mode.
  */
@js.native
trait DashboardViewDragendEvent extends DashboardViewBaseEvent {
  
  /**
    * Item that was dragged.
    */
  var item: DashboardItem = js.native
}
object DashboardViewDragendEvent {
  
  @scala.inline
  def apply(item: DashboardItem, source: DashboardView): DashboardViewDragendEvent = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardViewDragendEvent]
  }
  
  @scala.inline
  implicit class DashboardViewDragendEventMutableBuilder[Self <: DashboardViewDragendEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: DashboardItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
