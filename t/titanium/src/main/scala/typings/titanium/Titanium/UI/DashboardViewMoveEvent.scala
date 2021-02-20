package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when an item is moved in edit mode.
  */
@js.native
trait DashboardViewMoveEvent extends DashboardViewBaseEvent {
  
  /**
    * Item that was moved.
    */
  var item: DashboardItem = js.native
  
  /**
    * List of items to be committed, possibly in new order, when edit mode ends.
    */
  var items: js.Array[DashboardItem] = js.native
}
object DashboardViewMoveEvent {
  
  @scala.inline
  def apply(item: DashboardItem, items: js.Array[DashboardItem], source: DashboardView): DashboardViewMoveEvent = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardViewMoveEvent]
  }
  
  @scala.inline
  implicit class DashboardViewMoveEventMutableBuilder[Self <: DashboardViewMoveEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: DashboardItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[DashboardItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: DashboardItem*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
