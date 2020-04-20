package typings.titanium.Titanium.UI

import typings.titanium.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the device detects a click against the view.
		 */
trait DashboardViewClickEvent extends DashboardViewBaseEvent {
  /**
  			 * Item that was clicked.
  			 */
  var item: js.Any
  /**
  			 * Coordinates x and y of the event from the parent view's coordinate system.
  			 */
  var location: Point
}

object DashboardViewClickEvent {
  @scala.inline
  def apply(item: js.Any, location: Point, source: DashboardView): DashboardViewClickEvent = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardViewClickEvent]
  }
}

