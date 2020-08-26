package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionDialogEventMap extends ProxyEventMap {
  var click: OptionDialogClickEvent = js.native
  var dblclick: OptionDialogDblclickEvent = js.native
  var doubletap: OptionDialogDoubletapEvent = js.native
  var focus: OptionDialogFocusEvent = js.native
  var keypressed: OptionDialogKeypressedEvent = js.native
  var longclick: OptionDialogLongclickEvent = js.native
  var longpress: OptionDialogLongpressEvent = js.native
  var pinch: OptionDialogPinchEvent = js.native
  var postlayout: OptionDialogPostlayoutEvent = js.native
  var singletap: OptionDialogSingletapEvent = js.native
  var swipe: OptionDialogSwipeEvent = js.native
  var touchcancel: OptionDialogTouchcancelEvent = js.native
  var touchend: OptionDialogTouchendEvent = js.native
  var touchmove: OptionDialogTouchmoveEvent = js.native
  var touchstart: OptionDialogTouchstartEvent = js.native
  var twofingertap: OptionDialogTwofingertapEvent = js.native
}

object OptionDialogEventMap {
  @scala.inline
  def apply(
    click: OptionDialogClickEvent,
    dblclick: OptionDialogDblclickEvent,
    doubletap: OptionDialogDoubletapEvent,
    focus: OptionDialogFocusEvent,
    keypressed: OptionDialogKeypressedEvent,
    longclick: OptionDialogLongclickEvent,
    longpress: OptionDialogLongpressEvent,
    pinch: OptionDialogPinchEvent,
    postlayout: OptionDialogPostlayoutEvent,
    singletap: OptionDialogSingletapEvent,
    swipe: OptionDialogSwipeEvent,
    touchcancel: OptionDialogTouchcancelEvent,
    touchend: OptionDialogTouchendEvent,
    touchmove: OptionDialogTouchmoveEvent,
    touchstart: OptionDialogTouchstartEvent,
    twofingertap: OptionDialogTwofingertapEvent
  ): OptionDialogEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionDialogEventMap]
  }
  @scala.inline
  implicit class OptionDialogEventMapOps[Self <: OptionDialogEventMap] (val x: Self) extends AnyVal {
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
    def setClick(value: OptionDialogClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    @scala.inline
    def setDblclick(value: OptionDialogDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setDoubletap(value: OptionDialogDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocus(value: OptionDialogFocusEvent): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeypressed(value: OptionDialogKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongclick(value: OptionDialogLongclickEvent): Self = this.set("longclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongpress(value: OptionDialogLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    @scala.inline
    def setPinch(value: OptionDialogPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostlayout(value: OptionDialogPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingletap(value: OptionDialogSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwipe(value: OptionDialogSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchcancel(value: OptionDialogTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchend(value: OptionDialogTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchmove(value: OptionDialogTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchstart(value: OptionDialogTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setTwofingertap(value: OptionDialogTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
  
}

