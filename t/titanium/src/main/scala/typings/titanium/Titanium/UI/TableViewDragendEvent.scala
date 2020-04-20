package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the scrollable region stops being dragged.
		 */
trait TableViewDragendEvent extends TableViewBaseEvent {
  /**
  			 * Indicates whether scrolling will continue but decelerate, now that the drag gesture has
  			 * been released by the touch. If `false`, scrolling will stop immediately.
  			 */
  var decelerate: Boolean
}

object TableViewDragendEvent {
  @scala.inline
  def apply(decelerate: Boolean, source: TableView): TableViewDragendEvent = {
    val __obj = js.Dynamic.literal(decelerate = decelerate.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewDragendEvent]
  }
}

