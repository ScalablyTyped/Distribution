package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when an item is deleted during editing mode.
  */
@js.native
trait DashboardItemDeleteEvent extends DashboardItemBaseEvent {
  
  /**
    * Item that was deleted.
    */
  var item: DashboardItem = js.native
}
object DashboardItemDeleteEvent {
  
  @scala.inline
  def apply(item: DashboardItem, source: DashboardItem): DashboardItemDeleteEvent = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardItemDeleteEvent]
  }
  
  @scala.inline
  implicit class DashboardItemDeleteEventMutableBuilder[Self <: DashboardItemDeleteEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: DashboardItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
