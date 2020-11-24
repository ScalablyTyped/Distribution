package typings.titanium.Titanium.UI

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
  implicit class DashboardViewDragendEventOps[Self <: DashboardViewDragendEvent] (val x: Self) extends AnyVal {
    
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
    def setItem(value: DashboardItem): Self = this.set("item", value.asInstanceOf[js.Any])
  }
}
