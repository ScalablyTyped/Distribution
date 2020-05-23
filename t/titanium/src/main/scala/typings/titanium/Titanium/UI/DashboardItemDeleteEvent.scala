package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when an item is deleted during editing mode.
  */
trait DashboardItemDeleteEvent extends DashboardItemBaseEvent {
  /**
    * Item that was deleted.
    */
  var item: DashboardItem
}

object DashboardItemDeleteEvent {
  @scala.inline
  def apply(item: DashboardItem, source: DashboardItem): DashboardItemDeleteEvent = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardItemDeleteEvent]
  }
}

