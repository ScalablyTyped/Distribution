package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the list view displays the reference item.
		 */
trait ListViewMarkerEvent extends ListViewBaseEvent {
  /**
  			 * false. This event does not bubble.
  			 */
  var bubbles: Boolean
  /**
  			 * section item index of the reference item.
  			 */
  var itemIndex: Double
  /**
  			 * section index of the reference item.
  			 */
  var sectionIndex: Double
}

object ListViewMarkerEvent {
  @scala.inline
  def apply(bubbles: Boolean, itemIndex: Double, sectionIndex: Double, source: ListView): ListViewMarkerEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], sectionIndex = sectionIndex.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewMarkerEvent]
  }
}

