package typings.titanium.Titanium.UI.iOS

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoverFlowViewEventMap extends ProxyEventMap {
  var change: CoverFlowViewChangeEvent = js.native
  var click: CoverFlowViewClickEvent = js.native
  var dblclick: CoverFlowViewDblclickEvent = js.native
  var doubletap: CoverFlowViewDoubletapEvent = js.native
  var keypressed: CoverFlowViewKeypressedEvent = js.native
  var longpress: CoverFlowViewLongpressEvent = js.native
  var pinch: CoverFlowViewPinchEvent = js.native
  var postlayout: CoverFlowViewPostlayoutEvent = js.native
  var singletap: CoverFlowViewSingletapEvent = js.native
  var swipe: CoverFlowViewSwipeEvent = js.native
  var touchcancel: CoverFlowViewTouchcancelEvent = js.native
  var touchend: CoverFlowViewTouchendEvent = js.native
  var touchmove: CoverFlowViewTouchmoveEvent = js.native
  var touchstart: CoverFlowViewTouchstartEvent = js.native
  var twofingertap: CoverFlowViewTwofingertapEvent = js.native
}

object CoverFlowViewEventMap {
  @scala.inline
  def apply(
    change: CoverFlowViewChangeEvent,
    click: CoverFlowViewClickEvent,
    dblclick: CoverFlowViewDblclickEvent,
    doubletap: CoverFlowViewDoubletapEvent,
    keypressed: CoverFlowViewKeypressedEvent,
    longpress: CoverFlowViewLongpressEvent,
    pinch: CoverFlowViewPinchEvent,
    postlayout: CoverFlowViewPostlayoutEvent,
    singletap: CoverFlowViewSingletapEvent,
    swipe: CoverFlowViewSwipeEvent,
    touchcancel: CoverFlowViewTouchcancelEvent,
    touchend: CoverFlowViewTouchendEvent,
    touchmove: CoverFlowViewTouchmoveEvent,
    touchstart: CoverFlowViewTouchstartEvent,
    twofingertap: CoverFlowViewTwofingertapEvent
  ): CoverFlowViewEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverFlowViewEventMap]
  }
  @scala.inline
  implicit class CoverFlowViewEventMapOps[Self <: CoverFlowViewEventMap] (val x: Self) extends AnyVal {
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
    def setChange(value: CoverFlowViewChangeEvent): Self = this.set("change", value.asInstanceOf[js.Any])
    @scala.inline
    def setClick(value: CoverFlowViewClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    @scala.inline
    def setDblclick(value: CoverFlowViewDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setDoubletap(value: CoverFlowViewDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeypressed(value: CoverFlowViewKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongpress(value: CoverFlowViewLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    @scala.inline
    def setPinch(value: CoverFlowViewPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostlayout(value: CoverFlowViewPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingletap(value: CoverFlowViewSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwipe(value: CoverFlowViewSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchcancel(value: CoverFlowViewTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchend(value: CoverFlowViewTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchmove(value: CoverFlowViewTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchstart(value: CoverFlowViewTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setTwofingertap(value: CoverFlowViewTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
  
}

