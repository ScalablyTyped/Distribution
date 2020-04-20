package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollableViewEventMap extends ProxyEventMap {
  var click: ScrollableViewClickEvent
  var dblclick: ScrollableViewDblclickEvent
  var doubletap: ScrollableViewDoubletapEvent
  var dragend: ScrollableViewDragendEvent
  var focus: ScrollableViewFocusEvent
  var keypressed: ScrollableViewKeypressedEvent
  var longclick: ScrollableViewLongclickEvent
  var longpress: ScrollableViewLongpressEvent
  var pinch: ScrollableViewPinchEvent
  var postlayout: ScrollableViewPostlayoutEvent
  var scroll: ScrollableViewScrollEvent
  var scrollend: ScrollableViewScrollendEvent
  var singletap: ScrollableViewSingletapEvent
  var swipe: ScrollableViewSwipeEvent
  var touchcancel: ScrollableViewTouchcancelEvent
  var touchend: ScrollableViewTouchendEvent
  var touchmove: ScrollableViewTouchmoveEvent
  var touchstart: ScrollableViewTouchstartEvent
  var twofingertap: ScrollableViewTwofingertapEvent
}

object ScrollableViewEventMap {
  @scala.inline
  def apply(
    click: ScrollableViewClickEvent,
    dblclick: ScrollableViewDblclickEvent,
    doubletap: ScrollableViewDoubletapEvent,
    dragend: ScrollableViewDragendEvent,
    focus: ScrollableViewFocusEvent,
    keypressed: ScrollableViewKeypressedEvent,
    longclick: ScrollableViewLongclickEvent,
    longpress: ScrollableViewLongpressEvent,
    pinch: ScrollableViewPinchEvent,
    postlayout: ScrollableViewPostlayoutEvent,
    scroll: ScrollableViewScrollEvent,
    scrollend: ScrollableViewScrollendEvent,
    singletap: ScrollableViewSingletapEvent,
    swipe: ScrollableViewSwipeEvent,
    touchcancel: ScrollableViewTouchcancelEvent,
    touchend: ScrollableViewTouchendEvent,
    touchmove: ScrollableViewTouchmoveEvent,
    touchstart: ScrollableViewTouchstartEvent,
    twofingertap: ScrollableViewTwofingertapEvent
  ): ScrollableViewEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], scrollend = scrollend.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollableViewEventMap]
  }
}

