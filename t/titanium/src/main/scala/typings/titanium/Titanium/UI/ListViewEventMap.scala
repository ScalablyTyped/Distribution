package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListViewEventMap extends ProxyEventMap {
  var cancelprefetch: ListViewCancelprefetchEvent = js.native
  var click: ListViewClickEvent = js.native
  var dblclick: ListViewDblclickEvent = js.native
  var delete: ListViewDeleteEvent = js.native
  var doubletap: ListViewDoubletapEvent = js.native
  var dragend: ListViewDragendEvent = js.native
  var dragstart: ListViewDragstartEvent = js.native
  var editaction: ListViewEditactionEvent = js.native
  var focus: ListViewFocusEvent = js.native
  var indexclick: ListViewIndexclickEvent = js.native
  var insert: ListViewInsertEvent = js.native
  var itemclick: ListViewItemclickEvent = js.native
  var itemsselected: ListViewItemsselectedEvent = js.native
  var keypressed: ListViewKeypressedEvent = js.native
  var longclick: ListViewLongclickEvent = js.native
  var longpress: ListViewLongpressEvent = js.native
  var marker: ListViewMarkerEvent = js.native
  var move: ListViewMoveEvent = js.native
  var noresults: ListViewNoresultsEvent = js.native
  var pinch: ListViewPinchEvent = js.native
  var postlayout: ListViewPostlayoutEvent = js.native
  var prefetch: ListViewPrefetchEvent = js.native
  var pull: ListViewPullEvent = js.native
  var pullend: ListViewPullendEvent = js.native
  var scrollend: ListViewScrollendEvent = js.native
  var scrolling: ListViewScrollingEvent = js.native
  var scrollstart: ListViewScrollstartEvent = js.native
  var singletap: ListViewSingletapEvent = js.native
  var swipe: ListViewSwipeEvent = js.native
  var touchcancel: ListViewTouchcancelEvent = js.native
  var touchend: ListViewTouchendEvent = js.native
  var touchmove: ListViewTouchmoveEvent = js.native
  var touchstart: ListViewTouchstartEvent = js.native
  var twofingertap: ListViewTwofingertapEvent = js.native
}

object ListViewEventMap {
  @scala.inline
  def apply(
    cancelprefetch: ListViewCancelprefetchEvent,
    click: ListViewClickEvent,
    dblclick: ListViewDblclickEvent,
    delete: ListViewDeleteEvent,
    doubletap: ListViewDoubletapEvent,
    dragend: ListViewDragendEvent,
    dragstart: ListViewDragstartEvent,
    editaction: ListViewEditactionEvent,
    focus: ListViewFocusEvent,
    indexclick: ListViewIndexclickEvent,
    insert: ListViewInsertEvent,
    itemclick: ListViewItemclickEvent,
    itemsselected: ListViewItemsselectedEvent,
    keypressed: ListViewKeypressedEvent,
    longclick: ListViewLongclickEvent,
    longpress: ListViewLongpressEvent,
    marker: ListViewMarkerEvent,
    move: ListViewMoveEvent,
    noresults: ListViewNoresultsEvent,
    pinch: ListViewPinchEvent,
    postlayout: ListViewPostlayoutEvent,
    prefetch: ListViewPrefetchEvent,
    pull: ListViewPullEvent,
    pullend: ListViewPullendEvent,
    scrollend: ListViewScrollendEvent,
    scrolling: ListViewScrollingEvent,
    scrollstart: ListViewScrollstartEvent,
    singletap: ListViewSingletapEvent,
    swipe: ListViewSwipeEvent,
    touchcancel: ListViewTouchcancelEvent,
    touchend: ListViewTouchendEvent,
    touchmove: ListViewTouchmoveEvent,
    touchstart: ListViewTouchstartEvent,
    twofingertap: ListViewTwofingertapEvent
  ): ListViewEventMap = {
    val __obj = js.Dynamic.literal(cancelprefetch = cancelprefetch.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], editaction = editaction.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], indexclick = indexclick.asInstanceOf[js.Any], insert = insert.asInstanceOf[js.Any], itemclick = itemclick.asInstanceOf[js.Any], itemsselected = itemsselected.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], noresults = noresults.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], prefetch = prefetch.asInstanceOf[js.Any], pull = pull.asInstanceOf[js.Any], pullend = pullend.asInstanceOf[js.Any], scrollend = scrollend.asInstanceOf[js.Any], scrolling = scrolling.asInstanceOf[js.Any], scrollstart = scrollstart.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewEventMap]
  }
  @scala.inline
  implicit class ListViewEventMapOps[Self <: ListViewEventMap] (val x: Self) extends AnyVal {
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
    def setCancelprefetch(value: ListViewCancelprefetchEvent): Self = this.set("cancelprefetch", value.asInstanceOf[js.Any])
    @scala.inline
    def setClick(value: ListViewClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    @scala.inline
    def setDblclick(value: ListViewDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: ListViewDeleteEvent): Self = this.set("delete", value.asInstanceOf[js.Any])
    @scala.inline
    def setDoubletap(value: ListViewDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragend(value: ListViewDragendEvent): Self = this.set("dragend", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragstart(value: ListViewDragstartEvent): Self = this.set("dragstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditaction(value: ListViewEditactionEvent): Self = this.set("editaction", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocus(value: ListViewFocusEvent): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndexclick(value: ListViewIndexclickEvent): Self = this.set("indexclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsert(value: ListViewInsertEvent): Self = this.set("insert", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemclick(value: ListViewItemclickEvent): Self = this.set("itemclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsselected(value: ListViewItemsselectedEvent): Self = this.set("itemsselected", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeypressed(value: ListViewKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongclick(value: ListViewLongclickEvent): Self = this.set("longclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongpress(value: ListViewLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarker(value: ListViewMarkerEvent): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def setMove(value: ListViewMoveEvent): Self = this.set("move", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoresults(value: ListViewNoresultsEvent): Self = this.set("noresults", value.asInstanceOf[js.Any])
    @scala.inline
    def setPinch(value: ListViewPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostlayout(value: ListViewPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefetch(value: ListViewPrefetchEvent): Self = this.set("prefetch", value.asInstanceOf[js.Any])
    @scala.inline
    def setPull(value: ListViewPullEvent): Self = this.set("pull", value.asInstanceOf[js.Any])
    @scala.inline
    def setPullend(value: ListViewPullendEvent): Self = this.set("pullend", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollend(value: ListViewScrollendEvent): Self = this.set("scrollend", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrolling(value: ListViewScrollingEvent): Self = this.set("scrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollstart(value: ListViewScrollstartEvent): Self = this.set("scrollstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingletap(value: ListViewSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwipe(value: ListViewSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchcancel(value: ListViewTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchend(value: ListViewTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchmove(value: ListViewTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchstart(value: ListViewTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setTwofingertap(value: ListViewTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
  
}

