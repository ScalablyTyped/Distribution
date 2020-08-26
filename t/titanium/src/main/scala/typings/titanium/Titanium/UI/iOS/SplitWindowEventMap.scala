package typings.titanium.Titanium.UI.iOS

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitWindowEventMap extends ProxyEventMap {
  var blur: SplitWindowBlurEvent = js.native
  var click: SplitWindowClickEvent = js.native
  var close: SplitWindowCloseEvent = js.native
  var dblclick: SplitWindowDblclickEvent = js.native
  var doubletap: SplitWindowDoubletapEvent = js.native
  var focus: SplitWindowFocusEvent = js.native
  var keypressed: SplitWindowKeypressedEvent = js.native
  var longpress: SplitWindowLongpressEvent = js.native
  var open: SplitWindowOpenEvent = js.native
  var pinch: SplitWindowPinchEvent = js.native
  var postlayout: SplitWindowPostlayoutEvent = js.native
  var singletap: SplitWindowSingletapEvent = js.native
  var swipe: SplitWindowSwipeEvent = js.native
  var touchcancel: SplitWindowTouchcancelEvent = js.native
  var touchend: SplitWindowTouchendEvent = js.native
  var touchmove: SplitWindowTouchmoveEvent = js.native
  var touchstart: SplitWindowTouchstartEvent = js.native
  var twofingertap: SplitWindowTwofingertapEvent = js.native
}

object SplitWindowEventMap {
  @scala.inline
  def apply(
    blur: SplitWindowBlurEvent,
    click: SplitWindowClickEvent,
    close: SplitWindowCloseEvent,
    dblclick: SplitWindowDblclickEvent,
    doubletap: SplitWindowDoubletapEvent,
    focus: SplitWindowFocusEvent,
    keypressed: SplitWindowKeypressedEvent,
    longpress: SplitWindowLongpressEvent,
    open: SplitWindowOpenEvent,
    pinch: SplitWindowPinchEvent,
    postlayout: SplitWindowPostlayoutEvent,
    singletap: SplitWindowSingletapEvent,
    swipe: SplitWindowSwipeEvent,
    touchcancel: SplitWindowTouchcancelEvent,
    touchend: SplitWindowTouchendEvent,
    touchmove: SplitWindowTouchmoveEvent,
    touchstart: SplitWindowTouchstartEvent,
    twofingertap: SplitWindowTwofingertapEvent
  ): SplitWindowEventMap = {
    val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitWindowEventMap]
  }
  @scala.inline
  implicit class SplitWindowEventMapOps[Self <: SplitWindowEventMap] (val x: Self) extends AnyVal {
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
    def setBlur(value: SplitWindowBlurEvent): Self = this.set("blur", value.asInstanceOf[js.Any])
    @scala.inline
    def setClick(value: SplitWindowClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    @scala.inline
    def setClose(value: SplitWindowCloseEvent): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def setDblclick(value: SplitWindowDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setDoubletap(value: SplitWindowDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocus(value: SplitWindowFocusEvent): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeypressed(value: SplitWindowKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongpress(value: SplitWindowLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpen(value: SplitWindowOpenEvent): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def setPinch(value: SplitWindowPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostlayout(value: SplitWindowPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingletap(value: SplitWindowSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwipe(value: SplitWindowSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchcancel(value: SplitWindowTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchend(value: SplitWindowTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchmove(value: SplitWindowTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchstart(value: SplitWindowTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setTwofingertap(value: SplitWindowTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
  
}

