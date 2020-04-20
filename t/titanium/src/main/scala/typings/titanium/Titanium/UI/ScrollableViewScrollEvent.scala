package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired repeatedly as the view is being scrolled.
		 */
trait ScrollableViewScrollEvent extends ScrollableViewBaseEvent {
  /**
  			 * Index of the currently visible view of <Titanium.UI.ScrollableView.views>.
  			 */
  var currentPage: Double
  /**
  			 * Current page index that the view is scrolled to as a float. For
  			 * example, if the user is holding the `ScrollableView` in between
  			 * the first and second page, this will have a value of 0.5.
  			 */
  var currentPageAsFloat: Double
  /**
  			 * The currently visible view.
  			 */
  var view: View
}

object ScrollableViewScrollEvent {
  @scala.inline
  def apply(currentPage: Double, currentPageAsFloat: Double, source: ScrollableView, view: View): ScrollableViewScrollEvent = {
    val __obj = js.Dynamic.literal(currentPage = currentPage.asInstanceOf[js.Any], currentPageAsFloat = currentPageAsFloat.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollableViewScrollEvent]
  }
}

