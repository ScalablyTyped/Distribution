package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageViewEventMap extends ProxyEventMap {
  var change: ImageViewChangeEvent = js.native
  var click: ImageViewClickEvent = js.native
  var dblclick: ImageViewDblclickEvent = js.native
  var doubletap: ImageViewDoubletapEvent = js.native
  var error: ImageViewErrorEvent = js.native
  var focus: ImageViewFocusEvent = js.native
  var keypressed: ImageViewKeypressedEvent = js.native
  var load: ImageViewLoadEvent = js.native
  var longclick: ImageViewLongclickEvent = js.native
  var longpress: ImageViewLongpressEvent = js.native
  var pause: ImageViewPauseEvent = js.native
  var pinch: ImageViewPinchEvent = js.native
  var postlayout: ImageViewPostlayoutEvent = js.native
  var singletap: ImageViewSingletapEvent = js.native
  var start: ImageViewStartEvent = js.native
  var stop: ImageViewStopEvent = js.native
  var swipe: ImageViewSwipeEvent = js.native
  var touchcancel: ImageViewTouchcancelEvent = js.native
  var touchend: ImageViewTouchendEvent = js.native
  var touchmove: ImageViewTouchmoveEvent = js.native
  var touchstart: ImageViewTouchstartEvent = js.native
  var twofingertap: ImageViewTwofingertapEvent = js.native
}

object ImageViewEventMap {
  @scala.inline
  def apply(
    change: ImageViewChangeEvent,
    click: ImageViewClickEvent,
    dblclick: ImageViewDblclickEvent,
    doubletap: ImageViewDoubletapEvent,
    error: ImageViewErrorEvent,
    focus: ImageViewFocusEvent,
    keypressed: ImageViewKeypressedEvent,
    load: ImageViewLoadEvent,
    longclick: ImageViewLongclickEvent,
    longpress: ImageViewLongpressEvent,
    pause: ImageViewPauseEvent,
    pinch: ImageViewPinchEvent,
    postlayout: ImageViewPostlayoutEvent,
    singletap: ImageViewSingletapEvent,
    start: ImageViewStartEvent,
    stop: ImageViewStopEvent,
    swipe: ImageViewSwipeEvent,
    touchcancel: ImageViewTouchcancelEvent,
    touchend: ImageViewTouchendEvent,
    touchmove: ImageViewTouchmoveEvent,
    touchstart: ImageViewTouchstartEvent,
    twofingertap: ImageViewTwofingertapEvent
  ): ImageViewEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageViewEventMap]
  }
  @scala.inline
  implicit class ImageViewEventMapOps[Self <: ImageViewEventMap] (val x: Self) extends AnyVal {
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
    def setChange(value: ImageViewChangeEvent): Self = this.set("change", value.asInstanceOf[js.Any])
    @scala.inline
    def setClick(value: ImageViewClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    @scala.inline
    def setDblclick(value: ImageViewDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setDoubletap(value: ImageViewDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: ImageViewErrorEvent): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocus(value: ImageViewFocusEvent): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeypressed(value: ImageViewKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoad(value: ImageViewLoadEvent): Self = this.set("load", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongclick(value: ImageViewLongclickEvent): Self = this.set("longclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongpress(value: ImageViewLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    @scala.inline
    def setPause(value: ImageViewPauseEvent): Self = this.set("pause", value.asInstanceOf[js.Any])
    @scala.inline
    def setPinch(value: ImageViewPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostlayout(value: ImageViewPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingletap(value: ImageViewSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: ImageViewStartEvent): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setStop(value: ImageViewStopEvent): Self = this.set("stop", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwipe(value: ImageViewSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchcancel(value: ImageViewTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchend(value: ImageViewTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchmove(value: ImageViewTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchstart(value: ImageViewTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setTwofingertap(value: ImageViewTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
  
}

