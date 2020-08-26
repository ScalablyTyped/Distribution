package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelEventMap extends ProxyEventMap {
  var click: LabelClickEvent = js.native
  var dblclick: LabelDblclickEvent = js.native
  var doubletap: LabelDoubletapEvent = js.native
  var focus: LabelFocusEvent = js.native
  var keypressed: LabelKeypressedEvent = js.native
  var link: LabelLinkEvent = js.native
  var longclick: LabelLongclickEvent = js.native
  var longpress: LabelLongpressEvent = js.native
  var pinch: LabelPinchEvent = js.native
  var postlayout: LabelPostlayoutEvent = js.native
  var singletap: LabelSingletapEvent = js.native
  var swipe: LabelSwipeEvent = js.native
  var touchcancel: LabelTouchcancelEvent = js.native
  var touchend: LabelTouchendEvent = js.native
  var touchmove: LabelTouchmoveEvent = js.native
  var touchstart: LabelTouchstartEvent = js.native
  var twofingertap: LabelTwofingertapEvent = js.native
}

object LabelEventMap {
  @scala.inline
  def apply(
    click: LabelClickEvent,
    dblclick: LabelDblclickEvent,
    doubletap: LabelDoubletapEvent,
    focus: LabelFocusEvent,
    keypressed: LabelKeypressedEvent,
    link: LabelLinkEvent,
    longclick: LabelLongclickEvent,
    longpress: LabelLongpressEvent,
    pinch: LabelPinchEvent,
    postlayout: LabelPostlayoutEvent,
    singletap: LabelSingletapEvent,
    swipe: LabelSwipeEvent,
    touchcancel: LabelTouchcancelEvent,
    touchend: LabelTouchendEvent,
    touchmove: LabelTouchmoveEvent,
    touchstart: LabelTouchstartEvent,
    twofingertap: LabelTwofingertapEvent
  ): LabelEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelEventMap]
  }
  @scala.inline
  implicit class LabelEventMapOps[Self <: LabelEventMap] (val x: Self) extends AnyVal {
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
    def setClick(value: LabelClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    @scala.inline
    def setDblclick(value: LabelDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setDoubletap(value: LabelDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocus(value: LabelFocusEvent): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeypressed(value: LabelKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setLink(value: LabelLinkEvent): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongclick(value: LabelLongclickEvent): Self = this.set("longclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongpress(value: LabelLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    @scala.inline
    def setPinch(value: LabelPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostlayout(value: LabelPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingletap(value: LabelSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwipe(value: LabelSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchcancel(value: LabelTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchend(value: LabelTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchmove(value: LabelTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchstart(value: LabelTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setTwofingertap(value: LabelTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
  
}

