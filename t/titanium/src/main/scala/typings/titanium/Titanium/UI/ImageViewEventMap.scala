package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageViewEventMap extends ProxyEventMap {
  var change: ImageViewChangeEvent
  var click: ImageViewClickEvent
  var dblclick: ImageViewDblclickEvent
  var doubletap: ImageViewDoubletapEvent
  var error: ImageViewErrorEvent
  var focus: ImageViewFocusEvent
  var keypressed: ImageViewKeypressedEvent
  var load: ImageViewLoadEvent
  var longclick: ImageViewLongclickEvent
  var longpress: ImageViewLongpressEvent
  var pause: ImageViewPauseEvent
  var pinch: ImageViewPinchEvent
  var postlayout: ImageViewPostlayoutEvent
  var singletap: ImageViewSingletapEvent
  var start: ImageViewStartEvent
  var stop: ImageViewStopEvent
  var swipe: ImageViewSwipeEvent
  var touchcancel: ImageViewTouchcancelEvent
  var touchend: ImageViewTouchendEvent
  var touchmove: ImageViewTouchmoveEvent
  var touchstart: ImageViewTouchstartEvent
  var twofingertap: ImageViewTwofingertapEvent
}

object ImageViewEventMap {
  @scala.inline
  def apply(
    change: ImageViewChangeEvent,
    click: ImageViewClickEvent,
    dblclick: ImageViewDblclickEvent,
    doubletap: ImageViewDoubletapEvent,
    error: ImageViewErrorEvent,
    focus: ImageViewFocusEvent,
    keypressed: ImageViewKeypressedEvent,
    load: ImageViewLoadEvent,
    longclick: ImageViewLongclickEvent,
    longpress: ImageViewLongpressEvent,
    pause: ImageViewPauseEvent,
    pinch: ImageViewPinchEvent,
    postlayout: ImageViewPostlayoutEvent,
    singletap: ImageViewSingletapEvent,
    start: ImageViewStartEvent,
    stop: ImageViewStopEvent,
    swipe: ImageViewSwipeEvent,
    touchcancel: ImageViewTouchcancelEvent,
    touchend: ImageViewTouchendEvent,
    touchmove: ImageViewTouchmoveEvent,
    touchstart: ImageViewTouchstartEvent,
    twofingertap: ImageViewTwofingertapEvent
  ): ImageViewEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageViewEventMap]
  }
}

