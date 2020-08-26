package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableViewEventMap extends ProxyEventMap {
  var click: TableViewClickEvent = js.native
  var dblclick: TableViewDblclickEvent = js.native
  var delete: TableViewDeleteEvent = js.native
  var doubletap: TableViewDoubletapEvent = js.native
  var dragend: TableViewDragendEvent = js.native
  var dragstart: TableViewDragstartEvent = js.native
  var focus: TableViewFocusEvent = js.native
  var indexclick: TableViewIndexclickEvent = js.native
  var keypressed: TableViewKeypressedEvent = js.native
  var longclick: TableViewLongclickEvent = js.native
  var longpress: TableViewLongpressEvent = js.native
  var move: TableViewMoveEvent = js.native
  var pinch: TableViewPinchEvent = js.native
  var postlayout: TableViewPostlayoutEvent = js.native
  var rowsselected: TableViewRowsselectedEvent = js.native
  var scroll: TableViewScrollEvent = js.native
  var scrollend: TableViewScrollendEvent = js.native
  var singletap: TableViewSingletapEvent = js.native
  var swipe: TableViewSwipeEvent = js.native
  var touchcancel: TableViewTouchcancelEvent = js.native
  var touchend: TableViewTouchendEvent = js.native
  var touchmove: TableViewTouchmoveEvent = js.native
  var touchstart: TableViewTouchstartEvent = js.native
  var twofingertap: TableViewTwofingertapEvent = js.native
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
  @scala.inline
  implicit class TableViewEventMapOps[Self <: TableViewEventMap] (val x: Self) extends AnyVal {
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
    def setClick(value: TableViewClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    @scala.inline
    def setDblclick(value: TableViewDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: TableViewDeleteEvent): Self = this.set("delete", value.asInstanceOf[js.Any])
    @scala.inline
    def setDoubletap(value: TableViewDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragend(value: TableViewDragendEvent): Self = this.set("dragend", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragstart(value: TableViewDragstartEvent): Self = this.set("dragstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocus(value: TableViewFocusEvent): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndexclick(value: TableViewIndexclickEvent): Self = this.set("indexclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeypressed(value: TableViewKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongclick(value: TableViewLongclickEvent): Self = this.set("longclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongpress(value: TableViewLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    @scala.inline
    def setMove(value: TableViewMoveEvent): Self = this.set("move", value.asInstanceOf[js.Any])
    @scala.inline
    def setPinch(value: TableViewPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostlayout(value: TableViewPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowsselected(value: TableViewRowsselectedEvent): Self = this.set("rowsselected", value.asInstanceOf[js.Any])
    @scala.inline
    def setScroll(value: TableViewScrollEvent): Self = this.set("scroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollend(value: TableViewScrollendEvent): Self = this.set("scrollend", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingletap(value: TableViewSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwipe(value: TableViewSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchcancel(value: TableViewTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchend(value: TableViewTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchmove(value: TableViewTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchstart(value: TableViewTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setTwofingertap(value: TableViewTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
  
}

