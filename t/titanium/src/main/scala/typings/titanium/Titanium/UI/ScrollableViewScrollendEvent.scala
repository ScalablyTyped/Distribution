package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the view has stopped moving completely.
  */
trait ScrollableViewScrollendEvent extends ScrollableViewBaseEvent {
  /**
    * Index of the currently visible view of <Titanium.UI.ScrollableView.views>.
    */
  var currentPage: Double
  /**
    * The currently visible view.
    */
  var view: View
}

object ScrollableViewScrollendEvent {
  @scala.inline
  def apply(currentPage: Double, source: ScrollableView, view: View): ScrollableViewScrollendEvent = {
    val __obj = js.Dynamic.literal(currentPage = currentPage.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollableViewScrollendEvent]
  }
}

