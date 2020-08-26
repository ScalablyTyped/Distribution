package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressBarEventMap extends ProxyEventMap {
  var click: ProgressBarClickEvent = js.native
  var dblclick: ProgressBarDblclickEvent = js.native
  var doubletap: ProgressBarDoubletapEvent = js.native
  var focus: ProgressBarFocusEvent = js.native
  var keypressed: ProgressBarKeypressedEvent = js.native
  var longclick: ProgressBarLongclickEvent = js.native
  var longpress: ProgressBarLongpressEvent = js.native
  var pinch: ProgressBarPinchEvent = js.native
  var postlayout: ProgressBarPostlayoutEvent = js.native
  var singletap: ProgressBarSingletapEvent = js.native
  var swipe: ProgressBarSwipeEvent = js.native
  var touchcancel: ProgressBarTouchcancelEvent = js.native
  var touchend: ProgressBarTouchendEvent = js.native
  var touchmove: ProgressBarTouchmoveEvent = js.native
  var touchstart: ProgressBarTouchstartEvent = js.native
  var twofingertap: ProgressBarTwofingertapEvent = js.native
}

object ProgressBarEventMap {
  @scala.inline
  def apply(
    click: ProgressBarClickEvent,
    dblclick: ProgressBarDblclickEvent,
    doubletap: ProgressBarDoubletapEvent,
    focus: ProgressBarFocusEvent,
    keypressed: ProgressBarKeypressedEvent,
    longclick: ProgressBarLongclickEvent,
    longpress: ProgressBarLongpressEvent,
    pinch: ProgressBarPinchEvent,
    postlayout: ProgressBarPostlayoutEvent,
    singletap: ProgressBarSingletapEvent,
    swipe: ProgressBarSwipeEvent,
    touchcancel: ProgressBarTouchcancelEvent,
    touchend: ProgressBarTouchendEvent,
    touchmove: ProgressBarTouchmoveEvent,
    touchstart: ProgressBarTouchstartEvent,
    twofingertap: ProgressBarTwofingertapEvent
  ): ProgressBarEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarEventMap]
  }
  @scala.inline
  implicit class ProgressBarEventMapOps[Self <: ProgressBarEventMap] (val x: Self) extends AnyVal {
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
    def setClick(value: ProgressBarClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    @scala.inline
    def setDblclick(value: ProgressBarDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setDoubletap(value: ProgressBarDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocus(value: ProgressBarFocusEvent): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeypressed(value: ProgressBarKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongclick(value: ProgressBarLongclickEvent): Self = this.set("longclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongpress(value: ProgressBarLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    @scala.inline
    def setPinch(value: ProgressBarPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostlayout(value: ProgressBarPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingletap(value: ProgressBarSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwipe(value: ProgressBarSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchcancel(value: ProgressBarTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchend(value: ProgressBarTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchmove(value: ProgressBarTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchstart(value: ProgressBarTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setTwofingertap(value: ProgressBarTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
  
}

