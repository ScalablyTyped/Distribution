package typings.titanium.Titanium.UI.iOS

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LivePhotoViewEventMap extends ProxyEventMap {
  var click: LivePhotoViewClickEvent = js.native
  var dblclick: LivePhotoViewDblclickEvent = js.native
  var doubletap: LivePhotoViewDoubletapEvent = js.native
  var keypressed: LivePhotoViewKeypressedEvent = js.native
  var longpress: LivePhotoViewLongpressEvent = js.native
  var pinch: LivePhotoViewPinchEvent = js.native
  var postlayout: LivePhotoViewPostlayoutEvent = js.native
  var singletap: LivePhotoViewSingletapEvent = js.native
  var start: LivePhotoViewStartEvent = js.native
  var stop: LivePhotoViewStopEvent = js.native
  var swipe: LivePhotoViewSwipeEvent = js.native
  var touchcancel: LivePhotoViewTouchcancelEvent = js.native
  var touchend: LivePhotoViewTouchendEvent = js.native
  var touchmove: LivePhotoViewTouchmoveEvent = js.native
  var touchstart: LivePhotoViewTouchstartEvent = js.native
  var twofingertap: LivePhotoViewTwofingertapEvent = js.native
}

object LivePhotoViewEventMap {
  @scala.inline
  def apply(
    click: LivePhotoViewClickEvent,
    dblclick: LivePhotoViewDblclickEvent,
    doubletap: LivePhotoViewDoubletapEvent,
    keypressed: LivePhotoViewKeypressedEvent,
    longpress: LivePhotoViewLongpressEvent,
    pinch: LivePhotoViewPinchEvent,
    postlayout: LivePhotoViewPostlayoutEvent,
    singletap: LivePhotoViewSingletapEvent,
    start: LivePhotoViewStartEvent,
    stop: LivePhotoViewStopEvent,
    swipe: LivePhotoViewSwipeEvent,
    touchcancel: LivePhotoViewTouchcancelEvent,
    touchend: LivePhotoViewTouchendEvent,
    touchmove: LivePhotoViewTouchmoveEvent,
    touchstart: LivePhotoViewTouchstartEvent,
    twofingertap: LivePhotoViewTwofingertapEvent
  ): LivePhotoViewEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[LivePhotoViewEventMap]
  }
  @scala.inline
  implicit class LivePhotoViewEventMapOps[Self <: LivePhotoViewEventMap] (val x: Self) extends AnyVal {
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
    def setClick(value: LivePhotoViewClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    @scala.inline
    def setDblclick(value: LivePhotoViewDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setDoubletap(value: LivePhotoViewDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeypressed(value: LivePhotoViewKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongpress(value: LivePhotoViewLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    @scala.inline
    def setPinch(value: LivePhotoViewPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostlayout(value: LivePhotoViewPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingletap(value: LivePhotoViewSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: LivePhotoViewStartEvent): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setStop(value: LivePhotoViewStopEvent): Self = this.set("stop", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwipe(value: LivePhotoViewSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchcancel(value: LivePhotoViewTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchend(value: LivePhotoViewTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchmove(value: LivePhotoViewTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchstart(value: LivePhotoViewTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setTwofingertap(value: LivePhotoViewTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
  
}

