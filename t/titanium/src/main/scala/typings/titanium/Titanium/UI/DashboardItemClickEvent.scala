package typings.titanium.Titanium.UI

import typings.titanium.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when a click is detected against the view.
		 */
trait DashboardItemClickEvent extends DashboardItemBaseEvent {
  /**
  			 * Item that was clicked.
  			 */
  var item: DashboardItem
  /**
  			 * Coordinates `x` and `y` of the event from the parent view's coordinate system.
  			 */
  var location: Point
}

object DashboardItemClickEvent {
  @scala.inline
  def apply(item: DashboardItem, location: Point, source: DashboardItem): DashboardItemClickEvent = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardItemClickEvent]
  }
}

