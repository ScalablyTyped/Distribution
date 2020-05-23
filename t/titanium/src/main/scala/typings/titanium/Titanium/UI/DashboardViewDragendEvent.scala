package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when an item finishes being dragged in edit mode.
  */
trait DashboardViewDragendEvent extends DashboardViewBaseEvent {
  /**
    * Item that was dragged.
    */
  var item: DashboardItem
}

object DashboardViewDragendEvent {
  @scala.inline
  def apply(item: DashboardItem, source: DashboardView): DashboardViewDragendEvent = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardViewDragendEvent]
  }
}

