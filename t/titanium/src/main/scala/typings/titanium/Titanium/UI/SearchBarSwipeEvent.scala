package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the device detects a swipe gesture against the view.
		 */
trait SearchBarSwipeEvent extends SearchBarBaseEvent {
  /**
  			 * Direction of the swipe--either 'left', 'right', 'up', or 'down'.
  			 */
  var direction: String
  /**
  			 * X coordinate of the event's endpoint from the `source` view's coordinate system.
  			 */
  var x: Double
  /**
  			 * Y coordinate of the event's endpoint from the `source` view's coordinate system.
  			 */
  var y: Double
}

object SearchBarSwipeEvent {
  @scala.inline
  def apply(direction: String, source: SearchBar, x: Double, y: Double): SearchBarSwipeEvent = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBarSwipeEvent]
  }
}

