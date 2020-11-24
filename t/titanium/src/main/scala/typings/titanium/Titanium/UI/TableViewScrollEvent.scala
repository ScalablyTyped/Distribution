package typings.titanium.Titanium.UI

import typings.titanium.Point
import typings.titanium.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the table view is scrolled.
  */
@js.native
trait TableViewScrollEvent extends TableViewBaseEvent {
  
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
    * Row index of the topmost visible row in the view.
    */
  var firstVisibleItem: Double = js.native
  
  /**
    * Dictionary with `width` and `height` properties containing the size of the visible
    * table view
    */
  var size: Size = js.native
  
  /**
    * Total number of rows in the view.
    */
  var totalItemCount: Double = js.native
  
  /**
    * Number of rows currently visible in the view.
    */
  var visibleItemCount: Double = js.native
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
  
  @scala.inline
  implicit class TableViewScrollEventOps[Self <: TableViewScrollEvent] (val x: Self) extends AnyVal {
    
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
    def setFirstVisibleItem(value: Double): Self = this.set("firstVisibleItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalItemCount(value: Double): Self = this.set("totalItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleItemCount(value: Double): Self = this.set("visibleItemCount", value.asInstanceOf[js.Any])
  }
}
