package typings.titanium.Titanium.UI.iOS

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LivePhotoViewEventMap extends ProxyEventMap {
  var click: LivePhotoViewClickEvent
  var dblclick: LivePhotoViewDblclickEvent
  var doubletap: LivePhotoViewDoubletapEvent
  var keypressed: LivePhotoViewKeypressedEvent
  var longpress: LivePhotoViewLongpressEvent
  var pinch: LivePhotoViewPinchEvent
  var postlayout: LivePhotoViewPostlayoutEvent
  var singletap: LivePhotoViewSingletapEvent
  var start: LivePhotoViewStartEvent
  var stop: LivePhotoViewStopEvent
  var swipe: LivePhotoViewSwipeEvent
  var touchcancel: LivePhotoViewTouchcancelEvent
  var touchend: LivePhotoViewTouchendEvent
  var touchmove: LivePhotoViewTouchmoveEvent
  var touchstart: LivePhotoViewTouchstartEvent
  var twofingertap: LivePhotoViewTwofingertapEvent
}

object LivePhotoViewEventMap {
  @scala.inline
  def apply(
    click: LivePhotoViewClickEvent,
    dblclick: LivePhotoViewDblclickEvent,
    doubletap: LivePhotoViewDoubletapEvent,
    keypressed: LivePhotoViewKeypressedEvent,
    longpress: LivePhotoViewLongpressEvent,
    pinch: LivePhotoViewPinchEvent,
    postlayout: LivePhotoViewPostlayoutEvent,
    singletap: LivePhotoViewSingletapEvent,
    start: LivePhotoViewStartEvent,
    stop: LivePhotoViewStopEvent,
    swipe: LivePhotoViewSwipeEvent,
    touchcancel: LivePhotoViewTouchcancelEvent,
    touchend: LivePhotoViewTouchendEvent,
    touchmove: LivePhotoViewTouchmoveEvent,
    touchstart: LivePhotoViewTouchstartEvent,
    twofingertap: LivePhotoViewTwofingertapEvent
  ): LivePhotoViewEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[LivePhotoViewEventMap]
  }
}

