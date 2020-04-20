package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashboardViewEventMap extends ProxyEventMap {
  var click: DashboardViewClickEvent
  var commit: DashboardViewCommitEvent
  var dblclick: DashboardViewDblclickEvent
  var delete: DashboardViewDeleteEvent
  var doubletap: DashboardViewDoubletapEvent
  var dragend: DashboardViewDragendEvent
  var dragstart: DashboardViewDragstartEvent
  var edit: DashboardViewEditEvent
  var keypressed: DashboardViewKeypressedEvent
  var longpress: DashboardViewLongpressEvent
  var move: DashboardViewMoveEvent
  var pagechanged: DashboardViewPagechangedEvent
  var pinch: DashboardViewPinchEvent
  var postlayout: DashboardViewPostlayoutEvent
  var singletap: DashboardViewSingletapEvent
  var swipe: DashboardViewSwipeEvent
  var touchcancel: DashboardViewTouchcancelEvent
  var touchend: DashboardViewTouchendEvent
  var touchmove: DashboardViewTouchmoveEvent
  var touchstart: DashboardViewTouchstartEvent
  var twofingertap: DashboardViewTwofingertapEvent
}

object DashboardViewEventMap {
  @scala.inline
  def apply(
    click: DashboardViewClickEvent,
    commit: DashboardViewCommitEvent,
    dblclick: DashboardViewDblclickEvent,
    delete: DashboardViewDeleteEvent,
    doubletap: DashboardViewDoubletapEvent,
    dragend: DashboardViewDragendEvent,
    dragstart: DashboardViewDragstartEvent,
    edit: DashboardViewEditEvent,
    keypressed: DashboardViewKeypressedEvent,
    longpress: DashboardViewLongpressEvent,
    move: DashboardViewMoveEvent,
    pagechanged: DashboardViewPagechangedEvent,
    pinch: DashboardViewPinchEvent,
    postlayout: DashboardViewPostlayoutEvent,
    singletap: DashboardViewSingletapEvent,
    swipe: DashboardViewSwipeEvent,
    touchcancel: DashboardViewTouchcancelEvent,
    touchend: DashboardViewTouchendEvent,
    touchmove: DashboardViewTouchmoveEvent,
    touchstart: DashboardViewTouchstartEvent,
    twofingertap: DashboardViewTwofingertapEvent
  ): DashboardViewEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], pagechanged = pagechanged.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardViewEventMap]
  }
}

