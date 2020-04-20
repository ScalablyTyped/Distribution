package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when an item starts being dragged in edit mode.
		 */
trait DashboardViewDragstartEvent extends DashboardViewBaseEvent {
  /**
  			 * Item that was dragged.
  			 */
  var item: DashboardItem
}

object DashboardViewDragstartEvent {
  @scala.inline
  def apply(item: DashboardItem, source: DashboardView): DashboardViewDragstartEvent = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardViewDragstartEvent]
  }
}

