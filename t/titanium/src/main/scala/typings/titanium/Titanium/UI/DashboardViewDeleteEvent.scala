package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when an item is deleted in edit mode.
		 */
trait DashboardViewDeleteEvent extends DashboardViewBaseEvent {
  /**
  			 * Item that was deleted.
  			 */
  var item: DashboardItem
}

object DashboardViewDeleteEvent {
  @scala.inline
  def apply(item: DashboardItem, source: DashboardView): DashboardViewDeleteEvent = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardViewDeleteEvent]
  }
}

