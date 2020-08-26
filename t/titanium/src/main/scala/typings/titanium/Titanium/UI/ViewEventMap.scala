package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewEventMap extends ProxyEventMap {
  var click: ViewClickEvent = js.native
  var dblclick: ViewDblclickEvent = js.native
  var doubletap: ViewDoubletapEvent = js.native
  var focus: ViewFocusEvent = js.native
  var keypressed: ViewKeypressedEvent = js.native
  var longclick: ViewLongclickEvent = js.native
  var longpress: ViewLongpressEvent = js.native
  var pinch: ViewPinchEvent = js.native
  var postlayout: ViewPostlayoutEvent = js.native
  var singletap: ViewSingletapEvent = js.native
  var swipe: ViewSwipeEvent = js.native
  var touchcancel: ViewTouchcancelEvent = js.native
  var touchend: ViewTouchendEvent = js.native
  var touchmove: ViewTouchmoveEvent = js.native
  var touchstart: ViewTouchstartEvent = js.native
  var twofingertap: ViewTwofingertapEvent = js.native
}

object ViewEventMap {
  @scala.inline
  def apply(
    click: ViewClickEvent,
    dblclick: ViewDblclickEvent,
    doubletap: ViewDoubletapEvent,
    focus: ViewFocusEvent,
    keypressed: ViewKeypressedEvent,
    longclick: ViewLongclickEvent,
    longpress: ViewLongpressEvent,
    pinch: ViewPinchEvent,
    postlayout: ViewPostlayoutEvent,
    singletap: ViewSingletapEvent,
    swipe: ViewSwipeEvent,
    touchcancel: ViewTouchcancelEvent,
    touchend: ViewTouchendEvent,
    touchmove: ViewTouchmoveEvent,
    touchstart: ViewTouchstartEvent,
    twofingertap: ViewTwofingertapEvent
  ): ViewEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewEventMap]
  }
  @scala.inline
  implicit class ViewEventMapOps[Self <: ViewEventMap] (val x: Self) extends AnyVal {
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
    def setClick(value: ViewClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    @scala.inline
    def setDblclick(value: ViewDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setDoubletap(value: ViewDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocus(value: ViewFocusEvent): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeypressed(value: ViewKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongclick(value: ViewLongclickEvent): Self = this.set("longclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongpress(value: ViewLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    @scala.inline
    def setPinch(value: ViewPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostlayout(value: ViewPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingletap(value: ViewSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwipe(value: ViewSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchcancel(value: ViewTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchend(value: ViewTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchmove(value: ViewTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchstart(value: ViewTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setTwofingertap(value: ViewTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
  
}

