package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when an item is deleted in edit mode.
  */
@js.native
trait DashboardViewDeleteEvent extends DashboardViewBaseEvent {
  
  /**
    * Item that was deleted.
    */
  var item: DashboardItem = js.native
}
object DashboardViewDeleteEvent {
  
  @scala.inline
  def apply(item: DashboardItem, source: DashboardView): DashboardViewDeleteEvent = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardViewDeleteEvent]
  }
  
  @scala.inline
  implicit class DashboardViewDeleteEventMutableBuilder[Self <: DashboardViewDeleteEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: DashboardItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
