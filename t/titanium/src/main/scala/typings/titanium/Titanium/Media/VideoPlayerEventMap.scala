package typings.titanium.Titanium.Media

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoPlayerEventMap extends ProxyEventMap {
  var click: VideoPlayerClickEvent = js.native
  var complete: VideoPlayerCompleteEvent = js.native
  var dblclick: VideoPlayerDblclickEvent = js.native
  var doubletap: VideoPlayerDoubletapEvent = js.native
  var durationavailable: VideoPlayerDurationavailableEvent = js.native
  var error: VideoPlayerErrorEvent = js.native
  var focus: VideoPlayerFocusEvent = js.native
  var keypressed: VideoPlayerKeypressedEvent = js.native
  var load: VideoPlayerLoadEvent = js.native
  var loadstate: VideoPlayerLoadstateEvent = js.native
  var longclick: VideoPlayerLongclickEvent = js.native
  var longpress: VideoPlayerLongpressEvent = js.native
  var naturalsizeavailable: VideoPlayerNaturalsizeavailableEvent = js.native
  var pinch: VideoPlayerPinchEvent = js.native
  var playbackstate: VideoPlayerPlaybackstateEvent = js.native
  var playing: VideoPlayerPlayingEvent = js.native
  var postlayout: VideoPlayerPostlayoutEvent = js.native
  var preload: VideoPlayerPreloadEvent = js.native
  var resize: VideoPlayerResizeEvent = js.native
  var singletap: VideoPlayerSingletapEvent = js.native
  var swipe: VideoPlayerSwipeEvent = js.native
  var touchcancel: VideoPlayerTouchcancelEvent = js.native
  var touchend: VideoPlayerTouchendEvent = js.native
  var touchmove: VideoPlayerTouchmoveEvent = js.native
  var touchstart: VideoPlayerTouchstartEvent = js.native
  var twofingertap: VideoPlayerTwofingertapEvent = js.native
}

object VideoPlayerEventMap {
  @scala.inline
  def apply(
    click: VideoPlayerClickEvent,
    complete: VideoPlayerCompleteEvent,
    dblclick: VideoPlayerDblclickEvent,
    doubletap: VideoPlayerDoubletapEvent,
    durationavailable: VideoPlayerDurationavailableEvent,
    error: VideoPlayerErrorEvent,
    focus: VideoPlayerFocusEvent,
    keypressed: VideoPlayerKeypressedEvent,
    load: VideoPlayerLoadEvent,
    loadstate: VideoPlayerLoadstateEvent,
    longclick: VideoPlayerLongclickEvent,
    longpress: VideoPlayerLongpressEvent,
    naturalsizeavailable: VideoPlayerNaturalsizeavailableEvent,
    pinch: VideoPlayerPinchEvent,
    playbackstate: VideoPlayerPlaybackstateEvent,
    playing: VideoPlayerPlayingEvent,
    postlayout: VideoPlayerPostlayoutEvent,
    preload: VideoPlayerPreloadEvent,
    resize: VideoPlayerResizeEvent,
    singletap: VideoPlayerSingletapEvent,
    swipe: VideoPlayerSwipeEvent,
    touchcancel: VideoPlayerTouchcancelEvent,
    touchend: VideoPlayerTouchendEvent,
    touchmove: VideoPlayerTouchmoveEvent,
    touchstart: VideoPlayerTouchstartEvent,
    twofingertap: VideoPlayerTwofingertapEvent
  ): VideoPlayerEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], durationavailable = durationavailable.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadstate = loadstate.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], naturalsizeavailable = naturalsizeavailable.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], playbackstate = playbackstate.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoPlayerEventMap]
  }
  @scala.inline
  implicit class VideoPlayerEventMapOps[Self <: VideoPlayerEventMap] (val x: Self) extends AnyVal {
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
    def setClick(value: VideoPlayerClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: VideoPlayerCompleteEvent): Self = this.set("complete", value.asInstanceOf[js.Any])
    @scala.inline
    def setDblclick(value: VideoPlayerDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setDoubletap(value: VideoPlayerDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    @scala.inline
    def setDurationavailable(value: VideoPlayerDurationavailableEvent): Self = this.set("durationavailable", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: VideoPlayerErrorEvent): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocus(value: VideoPlayerFocusEvent): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeypressed(value: VideoPlayerKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoad(value: VideoPlayerLoadEvent): Self = this.set("load", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadstate(value: VideoPlayerLoadstateEvent): Self = this.set("loadstate", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongclick(value: VideoPlayerLongclickEvent): Self = this.set("longclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongpress(value: VideoPlayerLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    @scala.inline
    def setNaturalsizeavailable(value: VideoPlayerNaturalsizeavailableEvent): Self = this.set("naturalsizeavailable", value.asInstanceOf[js.Any])
    @scala.inline
    def setPinch(value: VideoPlayerPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaybackstate(value: VideoPlayerPlaybackstateEvent): Self = this.set("playbackstate", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaying(value: VideoPlayerPlayingEvent): Self = this.set("playing", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostlayout(value: VideoPlayerPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreload(value: VideoPlayerPreloadEvent): Self = this.set("preload", value.asInstanceOf[js.Any])
    @scala.inline
    def setResize(value: VideoPlayerResizeEvent): Self = this.set("resize", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingletap(value: VideoPlayerSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwipe(value: VideoPlayerSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchcancel(value: VideoPlayerTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchend(value: VideoPlayerTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchmove(value: VideoPlayerTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchstart(value: VideoPlayerTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setTwofingertap(value: VideoPlayerTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
  
}

