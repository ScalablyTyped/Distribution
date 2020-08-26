package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwitchEventMap extends ProxyEventMap {
  var change: SwitchChangeEvent = js.native
  var click: SwitchClickEvent = js.native
  var dblclick: SwitchDblclickEvent = js.native
  var doubletap: SwitchDoubletapEvent = js.native
  var focus: SwitchFocusEvent = js.native
  var keypressed: SwitchKeypressedEvent = js.native
  var longclick: SwitchLongclickEvent = js.native
  var longpress: SwitchLongpressEvent = js.native
  var pinch: SwitchPinchEvent = js.native
  var postlayout: SwitchPostlayoutEvent = js.native
  var singletap: SwitchSingletapEvent = js.native
  var swipe: SwitchSwipeEvent = js.native
  var touchcancel: SwitchTouchcancelEvent = js.native
  var touchend: SwitchTouchendEvent = js.native
  var touchmove: SwitchTouchmoveEvent = js.native
  var touchstart: SwitchTouchstartEvent = js.native
  var twofingertap: SwitchTwofingertapEvent = js.native
}

object SwitchEventMap {
  @scala.inline
  def apply(
    change: SwitchChangeEvent,
    click: SwitchClickEvent,
    dblclick: SwitchDblclickEvent,
    doubletap: SwitchDoubletapEvent,
    focus: SwitchFocusEvent,
    keypressed: SwitchKeypressedEvent,
    longclick: SwitchLongclickEvent,
    longpress: SwitchLongpressEvent,
    pinch: SwitchPinchEvent,
    postlayout: SwitchPostlayoutEvent,
    singletap: SwitchSingletapEvent,
    swipe: SwitchSwipeEvent,
    touchcancel: SwitchTouchcancelEvent,
    touchend: SwitchTouchendEvent,
    touchmove: SwitchTouchmoveEvent,
    touchstart: SwitchTouchstartEvent,
    twofingertap: SwitchTwofingertapEvent
  ): SwitchEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchEventMap]
  }
  @scala.inline
  implicit class SwitchEventMapOps[Self <: SwitchEventMap] (val x: Self) extends AnyVal {
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
    def setChange(value: SwitchChangeEvent): Self = this.set("change", value.asInstanceOf[js.Any])
    @scala.inline
    def setClick(value: SwitchClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    @scala.inline
    def setDblclick(value: SwitchDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setDoubletap(value: SwitchDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocus(value: SwitchFocusEvent): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeypressed(value: SwitchKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongclick(value: SwitchLongclickEvent): Self = this.set("longclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongpress(value: SwitchLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    @scala.inline
    def setPinch(value: SwitchPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostlayout(value: SwitchPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingletap(value: SwitchSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwipe(value: SwitchSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchcancel(value: SwitchTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchend(value: SwitchTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchmove(value: SwitchTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchstart(value: SwitchTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setTwofingertap(value: SwitchTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
  
}

