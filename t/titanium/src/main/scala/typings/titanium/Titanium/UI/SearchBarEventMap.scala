package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchBarEventMap extends ProxyEventMap {
  var blur: SearchBarBlurEvent = js.native
  var bookmark: SearchBarBookmarkEvent = js.native
  var cancel: SearchBarCancelEvent = js.native
  var change: SearchBarChangeEvent = js.native
  var click: SearchBarClickEvent = js.native
  var dblclick: SearchBarDblclickEvent = js.native
  var doubletap: SearchBarDoubletapEvent = js.native
  var focus: SearchBarFocusEvent = js.native
  var keypressed: SearchBarKeypressedEvent = js.native
  var longclick: SearchBarLongclickEvent = js.native
  var longpress: SearchBarLongpressEvent = js.native
  var pinch: SearchBarPinchEvent = js.native
  var postlayout: SearchBarPostlayoutEvent = js.native
  var `return`: SearchBarReturnEvent = js.native
  var singletap: SearchBarSingletapEvent = js.native
  var swipe: SearchBarSwipeEvent = js.native
  var touchcancel: SearchBarTouchcancelEvent = js.native
  var touchend: SearchBarTouchendEvent = js.native
  var touchmove: SearchBarTouchmoveEvent = js.native
  var touchstart: SearchBarTouchstartEvent = js.native
  var twofingertap: SearchBarTwofingertapEvent = js.native
}

object SearchBarEventMap {
  @scala.inline
  def apply(
    blur: SearchBarBlurEvent,
    bookmark: SearchBarBookmarkEvent,
    cancel: SearchBarCancelEvent,
    change: SearchBarChangeEvent,
    click: SearchBarClickEvent,
    dblclick: SearchBarDblclickEvent,
    doubletap: SearchBarDoubletapEvent,
    focus: SearchBarFocusEvent,
    keypressed: SearchBarKeypressedEvent,
    longclick: SearchBarLongclickEvent,
    longpress: SearchBarLongpressEvent,
    pinch: SearchBarPinchEvent,
    postlayout: SearchBarPostlayoutEvent,
    `return`: SearchBarReturnEvent,
    singletap: SearchBarSingletapEvent,
    swipe: SearchBarSwipeEvent,
    touchcancel: SearchBarTouchcancelEvent,
    touchend: SearchBarTouchendEvent,
    touchmove: SearchBarTouchmoveEvent,
    touchstart: SearchBarTouchstartEvent,
    twofingertap: SearchBarTwofingertapEvent
  ): SearchBarEventMap = {
    val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any], bookmark = bookmark.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBarEventMap]
  }
  @scala.inline
  implicit class SearchBarEventMapOps[Self <: SearchBarEventMap] (val x: Self) extends AnyVal {
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
    def setBlur(value: SearchBarBlurEvent): Self = this.set("blur", value.asInstanceOf[js.Any])
    @scala.inline
    def setBookmark(value: SearchBarBookmarkEvent): Self = this.set("bookmark", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancel(value: SearchBarCancelEvent): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setChange(value: SearchBarChangeEvent): Self = this.set("change", value.asInstanceOf[js.Any])
    @scala.inline
    def setClick(value: SearchBarClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    @scala.inline
    def setDblclick(value: SearchBarDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setDoubletap(value: SearchBarDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocus(value: SearchBarFocusEvent): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeypressed(value: SearchBarKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongclick(value: SearchBarLongclickEvent): Self = this.set("longclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongpress(value: SearchBarLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    @scala.inline
    def setPinch(value: SearchBarPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostlayout(value: SearchBarPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturn(value: SearchBarReturnEvent): Self = this.set("return", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingletap(value: SearchBarSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwipe(value: SearchBarSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchcancel(value: SearchBarTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchend(value: SearchBarTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchmove(value: SearchBarTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchstart(value: SearchBarTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setTwofingertap(value: SearchBarTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
  
}

