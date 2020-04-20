package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fires when the list view is scrolling. Calling the `scrollTo` methods will not fire this event
		 */
trait ListViewScrollingEvent extends ListViewBaseEvent {
  /**
  			 * Direction of the scroll either 'up', or 'down'.
  			 */
  var direction: String
  /**
  			 * The expected y axis offset when the scrolling action decelerates to a stop.
  			 */
  var targetContentOffset: Double
  /**
  			 * The velocity of the scroll in scale factor per second
  			 */
  var velocity: Double
}

object ListViewScrollingEvent {
  @scala.inline
  def apply(direction: String, source: ListView, targetContentOffset: Double, velocity: Double): ListViewScrollingEvent = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], targetContentOffset = targetContentOffset.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewScrollingEvent]
  }
}

