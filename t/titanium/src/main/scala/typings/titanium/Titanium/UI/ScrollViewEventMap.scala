package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollViewEventMap extends ProxyEventMap {
  var click: ScrollViewClickEvent
  var dblclick: ScrollViewDblclickEvent
  var doubletap: ScrollViewDoubletapEvent
  var dragEnd: ScrollView_DragEndEvent
  var dragStart: ScrollView_DragStartEvent
  var dragend: ScrollViewDragendEvent
  var dragstart: ScrollViewDragstartEvent
  var focus: ScrollViewFocusEvent
  var keypressed: ScrollViewKeypressedEvent
  var longclick: ScrollViewLongclickEvent
  var longpress: ScrollViewLongpressEvent
  var pinch: ScrollViewPinchEvent
  var postlayout: ScrollViewPostlayoutEvent
  var scale: ScrollViewScaleEvent
  var scroll: ScrollViewScrollEvent
  var singletap: ScrollViewSingletapEvent
  var swipe: ScrollViewSwipeEvent
  var touchcancel: ScrollViewTouchcancelEvent
  var touchend: ScrollViewTouchendEvent
  var touchmove: ScrollViewTouchmoveEvent
  var touchstart: ScrollViewTouchstartEvent
  var twofingertap: ScrollViewTwofingertapEvent
}

object ScrollViewEventMap {
  @scala.inline
  def apply(
    click: ScrollViewClickEvent,
    dblclick: ScrollViewDblclickEvent,
    doubletap: ScrollViewDoubletapEvent,
    dragEnd: ScrollView_DragEndEvent,
    dragStart: ScrollView_DragStartEvent,
    dragend: ScrollViewDragendEvent,
    dragstart: ScrollViewDragstartEvent,
    focus: ScrollViewFocusEvent,
    keypressed: ScrollViewKeypressedEvent,
    longclick: ScrollViewLongclickEvent,
    longpress: ScrollViewLongpressEvent,
    pinch: ScrollViewPinchEvent,
    postlayout: ScrollViewPostlayoutEvent,
    scale: ScrollViewScaleEvent,
    scroll: ScrollViewScrollEvent,
    singletap: ScrollViewSingletapEvent,
    swipe: ScrollViewSwipeEvent,
    touchcancel: ScrollViewTouchcancelEvent,
    touchend: ScrollViewTouchendEvent,
    touchmove: ScrollViewTouchmoveEvent,
    touchstart: ScrollViewTouchstartEvent,
    twofingertap: ScrollViewTwofingertapEvent
  ): ScrollViewEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], dragEnd = dragEnd.asInstanceOf[js.Any], dragStart = dragStart.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollViewEventMap]
  }
}

