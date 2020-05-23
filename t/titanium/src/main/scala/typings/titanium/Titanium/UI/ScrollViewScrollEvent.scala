package typings.titanium.Titanium.UI

import typings.titanium.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the scrollable region is scrolled.
  */
trait ScrollViewScrollEvent extends ScrollViewBaseEvent {
  /**
    * The current content size of the scroll view defined by its `width` and `height` properties.
    */
  var contentSize: Size
  /**
    * The current scaling factor of the scroll view content. This might not be equal to
    * the `zoomScale` property or be within the range specified by `minZoomScale` and `maxZoomScale`.
    * This is only available from Release 3.2.3 of the Titanium Mobile SDK.
    */
  var curZoomScale: Double
  /**
    * Indicates whether the scroll is decelerating.
    */
  var decelerating: Boolean
  /**
    * Indicates whether the event was fired during a dragging gesture, where the touch
    * remained in contact with the display to physically drag the view, as opposed to it being
    * the result of scrolling momentum.
    */
  var dragging: Boolean
  /**
    * X coordinate of the event from the `source` view's coordinate system.
    */
  var x: Double
  /**
    * Y coordinate of the event from the `source` view's coordinate system.
    */
  var y: Double
  /**
    * Indicates whether the event was fired during a zooming operation. This is only available
    * from Release 3.2.3 of the Titanium Mobile SDK.
    */
  var zooming: Boolean
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
}

