package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollableViewEventMap extends ProxyEventMap {
  var click: ScrollableViewClickEvent = js.native
  var dblclick: ScrollableViewDblclickEvent = js.native
  var doubletap: ScrollableViewDoubletapEvent = js.native
  var dragend: ScrollableViewDragendEvent = js.native
  var focus: ScrollableViewFocusEvent = js.native
  var keypressed: ScrollableViewKeypressedEvent = js.native
  var longclick: ScrollableViewLongclickEvent = js.native
  var longpress: ScrollableViewLongpressEvent = js.native
  var pinch: ScrollableViewPinchEvent = js.native
  var postlayout: ScrollableViewPostlayoutEvent = js.native
  var scroll: ScrollableViewScrollEvent = js.native
  var scrollend: ScrollableViewScrollendEvent = js.native
  var singletap: ScrollableViewSingletapEvent = js.native
  var swipe: ScrollableViewSwipeEvent = js.native
  var touchcancel: ScrollableViewTouchcancelEvent = js.native
  var touchend: ScrollableViewTouchendEvent = js.native
  var touchmove: ScrollableViewTouchmoveEvent = js.native
  var touchstart: ScrollableViewTouchstartEvent = js.native
  var twofingertap: ScrollableViewTwofingertapEvent = js.native
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
  @scala.inline
  implicit class ScrollableViewEventMapOps[Self <: ScrollableViewEventMap] (val x: Self) extends AnyVal {
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
    def setClick(value: ScrollableViewClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    @scala.inline
    def setDblclick(value: ScrollableViewDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setDoubletap(value: ScrollableViewDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragend(value: ScrollableViewDragendEvent): Self = this.set("dragend", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocus(value: ScrollableViewFocusEvent): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeypressed(value: ScrollableViewKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongclick(value: ScrollableViewLongclickEvent): Self = this.set("longclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongpress(value: ScrollableViewLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    @scala.inline
    def setPinch(value: ScrollableViewPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostlayout(value: ScrollableViewPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    @scala.inline
    def setScroll(value: ScrollableViewScrollEvent): Self = this.set("scroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollend(value: ScrollableViewScrollendEvent): Self = this.set("scrollend", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingletap(value: ScrollableViewSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwipe(value: ScrollableViewSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchcancel(value: ScrollableViewTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchend(value: ScrollableViewTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchmove(value: ScrollableViewTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchstart(value: ScrollableViewTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setTwofingertap(value: ScrollableViewTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
  
}

