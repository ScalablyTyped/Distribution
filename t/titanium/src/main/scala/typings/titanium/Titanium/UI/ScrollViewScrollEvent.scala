package typings.titanium.Titanium.UI

import typings.titanium.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the scrollable region is scrolled.
  */
@js.native
trait ScrollViewScrollEvent extends ScrollViewBaseEvent {
  
  /**
    * The current content size of the scroll view defined by its `width` and `height` properties.
    */
  var contentSize: Size = js.native
  
  /**
    * The current scaling factor of the scroll view content. This might not be equal to
    * the `zoomScale` property or be within the range specified by `minZoomScale` and `maxZoomScale`.
    * This is only available from Release 3.2.3 of the Titanium Mobile SDK.
    */
  var curZoomScale: Double = js.native
  
  /**
    * Indicates whether the scroll is decelerating.
    */
  var decelerating: Boolean = js.native
  
  /**
    * Indicates whether the event was fired during a dragging gesture, where the touch
    * remained in contact with the display to physically drag the view, as opposed to it being
    * the result of scrolling momentum.
    */
  var dragging: Boolean = js.native
  
  /**
    * X coordinate of the event from the `source` view's coordinate system.
    */
  var x: Double = js.native
  
  /**
    * Y coordinate of the event from the `source` view's coordinate system.
    */
  var y: Double = js.native
  
  /**
    * Indicates whether the event was fired during a zooming operation. This is only available
    * from Release 3.2.3 of the Titanium Mobile SDK.
    */
  var zooming: Boolean = js.native
}
object ScrollViewScrollEvent {
  
  @scala.inline
  def apply(
    contentSize: Size,
    curZoomScale: Double,
    decelerating: Boolean,
    dragging: Boolean,
    source: ScrollView,
    x: Double,
    y: Double,
    zooming: Boolean
  ): ScrollViewScrollEvent = {
    val __obj = js.Dynamic.literal(contentSize = contentSize.asInstanceOf[js.Any], curZoomScale = curZoomScale.asInstanceOf[js.Any], decelerating = decelerating.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], zooming = zooming.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollViewScrollEvent]
  }
  
  @scala.inline
  implicit class ScrollViewScrollEventMutableBuilder[Self <: ScrollViewScrollEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentSize(value: Size): Self = StObject.set(x, "contentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurZoomScale(value: Double): Self = StObject.set(x, "curZoomScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecelerating(value: Boolean): Self = StObject.set(x, "decelerating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZooming(value: Boolean): Self = StObject.set(x, "zooming", value.asInstanceOf[js.Any])
  }
}
