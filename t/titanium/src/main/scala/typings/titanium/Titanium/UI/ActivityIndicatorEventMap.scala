package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityIndicatorEventMap extends ProxyEventMap {
  var click: ActivityIndicatorClickEvent = js.native
  var dblclick: ActivityIndicatorDblclickEvent = js.native
  var doubletap: ActivityIndicatorDoubletapEvent = js.native
  var focus: ActivityIndicatorFocusEvent = js.native
  var keypressed: ActivityIndicatorKeypressedEvent = js.native
  var longclick: ActivityIndicatorLongclickEvent = js.native
  var longpress: ActivityIndicatorLongpressEvent = js.native
  var pinch: ActivityIndicatorPinchEvent = js.native
  var postlayout: ActivityIndicatorPostlayoutEvent = js.native
  var singletap: ActivityIndicatorSingletapEvent = js.native
  var swipe: ActivityIndicatorSwipeEvent = js.native
  var touchcancel: ActivityIndicatorTouchcancelEvent = js.native
  var touchend: ActivityIndicatorTouchendEvent = js.native
  var touchmove: ActivityIndicatorTouchmoveEvent = js.native
  var touchstart: ActivityIndicatorTouchstartEvent = js.native
  var twofingertap: ActivityIndicatorTwofingertapEvent = js.native
}

object ActivityIndicatorEventMap {
  @scala.inline
  def apply(
    click: ActivityIndicatorClickEvent,
    dblclick: ActivityIndicatorDblclickEvent,
    doubletap: ActivityIndicatorDoubletapEvent,
    focus: ActivityIndicatorFocusEvent,
    keypressed: ActivityIndicatorKeypressedEvent,
    longclick: ActivityIndicatorLongclickEvent,
    longpress: ActivityIndicatorLongpressEvent,
    pinch: ActivityIndicatorPinchEvent,
    postlayout: ActivityIndicatorPostlayoutEvent,
    singletap: ActivityIndicatorSingletapEvent,
    swipe: ActivityIndicatorSwipeEvent,
    touchcancel: ActivityIndicatorTouchcancelEvent,
    touchend: ActivityIndicatorTouchendEvent,
    touchmove: ActivityIndicatorTouchmoveEvent,
    touchstart: ActivityIndicatorTouchstartEvent,
    twofingertap: ActivityIndicatorTwofingertapEvent
  ): ActivityIndicatorEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityIndicatorEventMap]
  }
  @scala.inline
  implicit class ActivityIndicatorEventMapOps[Self <: ActivityIndicatorEventMap] (val x: Self) extends AnyVal {
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
    def setClick(value: ActivityIndicatorClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    @scala.inline
    def setDblclick(value: ActivityIndicatorDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setDoubletap(value: ActivityIndicatorDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocus(value: ActivityIndicatorFocusEvent): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeypressed(value: ActivityIndicatorKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongclick(value: ActivityIndicatorLongclickEvent): Self = this.set("longclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongpress(value: ActivityIndicatorLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    @scala.inline
    def setPinch(value: ActivityIndicatorPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostlayout(value: ActivityIndicatorPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingletap(value: ActivityIndicatorSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwipe(value: ActivityIndicatorSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchcancel(value: ActivityIndicatorTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchend(value: ActivityIndicatorTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchmove(value: ActivityIndicatorTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchstart(value: ActivityIndicatorTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setTwofingertap(value: ActivityIndicatorTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
  
}

