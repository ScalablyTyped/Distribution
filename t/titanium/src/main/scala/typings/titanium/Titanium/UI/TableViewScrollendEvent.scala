package typings.titanium.Titanium.UI

import typings.titanium.Point
import typings.titanium.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the table view stops scrolling.
  */
trait TableViewScrollendEvent extends TableViewBaseEvent {
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
    * Dictionary with `width` and `height` properties containing the size of the visible
    * table view.
    */
  var size: Size
  /**
    * X coordinate of the event from the `source` view's coordinate system.
    */
  var x: Double
  /**
    * Y coordinate of the event from the `source` view's coordinate system.
    */
  var y: Double
}

object TableViewScrollendEvent {
  @scala.inline
  def apply(contentOffset: Point, contentSize: Size, size: Size, source: TableView, x: Double, y: Double): TableViewScrollendEvent = {
    val __obj = js.Dynamic.literal(contentOffset = contentOffset.asInstanceOf[js.Any], contentSize = contentSize.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewScrollendEvent]
  }
}

