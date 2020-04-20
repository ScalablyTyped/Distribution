package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the scrolling drag gesture on the view has been completed.
		 */
trait ScrollableViewDragendEvent extends ScrollableViewBaseEvent {
  /**
  			 * Index of the currently visible view of <Titanium.UI.ScrollableView.views>.
  			 */
  var currentPage: Double
  /**
  			 * The currently visible view.
  			 */
  var view: View
}

object ScrollableViewDragendEvent {
  @scala.inline
  def apply(currentPage: Double, source: ScrollableView, view: View): ScrollableViewDragendEvent = {
    val __obj = js.Dynamic.literal(currentPage = currentPage.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollableViewDragendEvent]
  }
}

