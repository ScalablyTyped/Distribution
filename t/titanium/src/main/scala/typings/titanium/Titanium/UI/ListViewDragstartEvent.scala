package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the user starts dragging the list view.
		 */
trait ListViewDragstartEvent extends ListViewBaseEvent {
  /**
  			 * false. This event does not bubble.
  			 */
  var bubbles: Boolean
}

object ListViewDragstartEvent {
  @scala.inline
  def apply(bubbles: Boolean, source: ListView): ListViewDragstartEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewDragstartEvent]
  }
}

