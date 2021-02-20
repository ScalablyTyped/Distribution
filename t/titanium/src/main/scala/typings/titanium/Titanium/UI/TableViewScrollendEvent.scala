package typings.titanium.Titanium.UI

import typings.titanium.Point
import typings.titanium.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class TableViewScrollendEventMutableBuilder[Self <: TableViewScrollendEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentOffset(value: Point): Self = StObject.set(x, "contentOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentSize(value: Size): Self = StObject.set(x, "contentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
