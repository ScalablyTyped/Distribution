package typings.titanium.Titanium.UI

import typings.titanium.Point
import typings.titanium.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the table view is scrolled.
  */
trait TableViewScrollEvent extends TableViewBaseEvent {
  /**
    * Dictionary with `x` and `y` properties containing the content offset.
    */
  var contentOffset: Point
  /**
    * Dictionary with `width` and `height` properties containing the size of the content
    * (regardless of the display size in the case of scrolling).
    */
  var contentSize: Size
  /**
    * Row index of the topmost visible row in the view.
    */
  var firstVisibleItem: Double
  /**
    * Dictionary with `width` and `height` properties containing the size of the visible
    * table view
    */
  var size: Size
  /**
    * Total number of rows in the view.
    */
  var totalItemCount: Double
  /**
    * Number of rows currently visible in the view.
    */
  var visibleItemCount: Double
}

object TableViewScrollEvent {
  @scala.inline
  def apply(
    contentOffset: Point,
    contentSize: Size,
    firstVisibleItem: Double,
    size: Size,
    source: TableView,
    totalItemCount: Double,
    visibleItemCount: Double
  ): TableViewScrollEvent = {
    val __obj = js.Dynamic.literal(contentOffset = contentOffset.asInstanceOf[js.Any], contentSize = contentSize.asInstanceOf[js.Any], firstVisibleItem = firstVisibleItem.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], totalItemCount = totalItemCount.asInstanceOf[js.Any], visibleItemCount = visibleItemCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewScrollEvent]
  }
}

