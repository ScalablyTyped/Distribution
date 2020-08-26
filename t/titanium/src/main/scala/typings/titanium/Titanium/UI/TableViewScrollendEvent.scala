package typings.titanium.Titanium.UI

import typings.titanium.Point
import typings.titanium.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the table view stops scrolling.
  */
@js.native
trait TableViewScrollendEvent extends TableViewBaseEvent {
  /**
    * Dictionary with `x` and `y` properties containing the content offset.
    */
  var contentOffset: Point = js.native
  /**
    * Dictionary with `width` and `height` properties containing the size of the content
    * (regardless of the display size in the case of scrolling).
    */
  var contentSize: Size = js.native
  /**
    * Dictionary with `width` and `height` properties containing the size of the visible
    * table view.
    */
  var size: Size = js.native
  /**
    * X coordinate of the event from the `source` view's coordinate system.
    */
  var x: Double = js.native
  /**
    * Y coordinate of the event from the `source` view's coordinate system.
    */
  var y: Double = js.native
}

object TableViewScrollendEvent {
  @scala.inline
  def apply(contentOffset: Point, contentSize: Size, size: Size, source: TableView, x: Double, y: Double): TableViewScrollendEvent = {
    val __obj = js.Dynamic.literal(contentOffset = contentOffset.asInstanceOf[js.Any], contentSize = contentSize.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewScrollendEvent]
  }
  @scala.inline
  implicit class TableViewScrollendEventOps[Self <: TableViewScrollendEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContentOffset(value: Point): Self = this.set("contentOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentSize(value: Size): Self = this.set("contentSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

