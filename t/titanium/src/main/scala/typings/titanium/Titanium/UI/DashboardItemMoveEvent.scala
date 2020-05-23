package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when an item is moved during editing mode.
  */
trait DashboardItemMoveEvent extends DashboardItemBaseEvent {
  /**
    * Item that was moved.
    */
  var item: DashboardItem
  /**
    * List of items to be committed, possibly in new order, when edit mode ends.
    */
  var items: js.Array[DashboardItem]
}

object DashboardItemMoveEvent {
  @scala.inline
  def apply(item: DashboardItem, items: js.Array[DashboardItem], source: DashboardItem): DashboardItemMoveEvent = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardItemMoveEvent]
  }
}

