package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableViewEventMap extends ProxyEventMap {
  var click: TableViewClickEvent
  var dblclick: TableViewDblclickEvent
  var delete: TableViewDeleteEvent
  var doubletap: TableViewDoubletapEvent
  var dragend: TableViewDragendEvent
  var dragstart: TableViewDragstartEvent
  var focus: TableViewFocusEvent
  var indexclick: TableViewIndexclickEvent
  var keypressed: TableViewKeypressedEvent
  var longclick: TableViewLongclickEvent
  var longpress: TableViewLongpressEvent
  var move: TableViewMoveEvent
  var pinch: TableViewPinchEvent
  var postlayout: TableViewPostlayoutEvent
  var rowsselected: TableViewRowsselectedEvent
  var scroll: TableViewScrollEvent
  var scrollend: TableViewScrollendEvent
  var singletap: TableViewSingletapEvent
  var swipe: TableViewSwipeEvent
  var touchcancel: TableViewTouchcancelEvent
  var touchend: TableViewTouchendEvent
  var touchmove: TableViewTouchmoveEvent
  var touchstart: TableViewTouchstartEvent
  var twofingertap: TableViewTwofingertapEvent
}

object TableViewEventMap {
  @scala.inline
  def apply(
    click: TableViewClickEvent,
    dblclick: TableViewDblclickEvent,
    delete: TableViewDeleteEvent,
    doubletap: TableViewDoubletapEvent,
    dragend: TableViewDragendEvent,
    dragstart: TableViewDragstartEvent,
    focus: TableViewFocusEvent,
    indexclick: TableViewIndexclickEvent,
    keypressed: TableViewKeypressedEvent,
    longclick: TableViewLongclickEvent,
    longpress: TableViewLongpressEvent,
    move: TableViewMoveEvent,
    pinch: TableViewPinchEvent,
    postlayout: TableViewPostlayoutEvent,
    rowsselected: TableViewRowsselectedEvent,
    scroll: TableViewScrollEvent,
    scrollend: TableViewScrollendEvent,
    singletap: TableViewSingletapEvent,
    swipe: TableViewSwipeEvent,
    touchcancel: TableViewTouchcancelEvent,
    touchend: TableViewTouchendEvent,
    touchmove: TableViewTouchmoveEvent,
    touchstart: TableViewTouchstartEvent,
    twofingertap: TableViewTwofingertapEvent
  ): TableViewEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], indexclick = indexclick.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], rowsselected = rowsselected.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], scrollend = scrollend.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewEventMap]
  }
}

