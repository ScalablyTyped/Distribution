package typings.titanium.Titanium.UI.iOS

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationWindowEventMap extends ProxyEventMap {
  var blur: NavigationWindowBlurEvent = js.native
  var click: NavigationWindowClickEvent = js.native
  var close: NavigationWindowCloseEvent = js.native
  var dblclick: NavigationWindowDblclickEvent = js.native
  var doubletap: NavigationWindowDoubletapEvent = js.native
  var focus: NavigationWindowFocusEvent = js.native
  var keypressed: NavigationWindowKeypressedEvent = js.native
  var longpress: NavigationWindowLongpressEvent = js.native
  var open: NavigationWindowOpenEvent = js.native
  var pinch: NavigationWindowPinchEvent = js.native
  var postlayout: NavigationWindowPostlayoutEvent = js.native
  var singletap: NavigationWindowSingletapEvent = js.native
  var swipe: NavigationWindowSwipeEvent = js.native
  var touchcancel: NavigationWindowTouchcancelEvent = js.native
  var touchend: NavigationWindowTouchendEvent = js.native
  var touchmove: NavigationWindowTouchmoveEvent = js.native
  var touchstart: NavigationWindowTouchstartEvent = js.native
  var twofingertap: NavigationWindowTwofingertapEvent = js.native
}

object NavigationWindowEventMap {
  @scala.inline
  def apply(
    blur: NavigationWindowBlurEvent,
    click: NavigationWindowClickEvent,
    close: NavigationWindowCloseEvent,
    dblclick: NavigationWindowDblclickEvent,
    doubletap: NavigationWindowDoubletapEvent,
    focus: NavigationWindowFocusEvent,
    keypressed: NavigationWindowKeypressedEvent,
    longpress: NavigationWindowLongpressEvent,
    open: NavigationWindowOpenEvent,
    pinch: NavigationWindowPinchEvent,
    postlayout: NavigationWindowPostlayoutEvent,
    singletap: NavigationWindowSingletapEvent,
    swipe: NavigationWindowSwipeEvent,
    touchcancel: NavigationWindowTouchcancelEvent,
    touchend: NavigationWindowTouchendEvent,
    touchmove: NavigationWindowTouchmoveEvent,
    touchstart: NavigationWindowTouchstartEvent,
    twofingertap: NavigationWindowTwofingertapEvent
  ): NavigationWindowEventMap = {
    val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationWindowEventMap]
  }
  @scala.inline
  implicit class NavigationWindowEventMapOps[Self <: NavigationWindowEventMap] (val x: Self) extends AnyVal {
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
    def setBlur(value: NavigationWindowBlurEvent): Self = this.set("blur", value.asInstanceOf[js.Any])
    @scala.inline
    def setClick(value: NavigationWindowClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    @scala.inline
    def setClose(value: NavigationWindowCloseEvent): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def setDblclick(value: NavigationWindowDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setDoubletap(value: NavigationWindowDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocus(value: NavigationWindowFocusEvent): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeypressed(value: NavigationWindowKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongpress(value: NavigationWindowLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpen(value: NavigationWindowOpenEvent): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def setPinch(value: NavigationWindowPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostlayout(value: NavigationWindowPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingletap(value: NavigationWindowSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwipe(value: NavigationWindowSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchcancel(value: NavigationWindowTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchend(value: NavigationWindowTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchmove(value: NavigationWindowTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchstart(value: NavigationWindowTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setTwofingertap(value: NavigationWindowTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
  
}

