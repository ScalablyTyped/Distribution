package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderEventMap extends ProxyEventMap {
  
  var change: SliderChangeEvent = js.native
  
  var click: SliderClickEvent = js.native
  
  var dblclick: SliderDblclickEvent = js.native
  
  var doubletap: SliderDoubletapEvent = js.native
  
  var focus: SliderFocusEvent = js.native
  
  var keypressed: SliderKeypressedEvent = js.native
  
  var longclick: SliderLongclickEvent = js.native
  
  var longpress: SliderLongpressEvent = js.native
  
  var pinch: SliderPinchEvent = js.native
  
  var postlayout: SliderPostlayoutEvent = js.native
  
  var singletap: SliderSingletapEvent = js.native
  
  var start: SliderStartEvent = js.native
  
  var stop: SliderStopEvent = js.native
  
  var swipe: SliderSwipeEvent = js.native
  
  var touchcancel: SliderTouchcancelEvent = js.native
  
  var touchend: SliderTouchendEvent = js.native
  
  var touchmove: SliderTouchmoveEvent = js.native
  
  var touchstart: SliderTouchstartEvent = js.native
  
  var twofingertap: SliderTwofingertapEvent = js.native
}
object SliderEventMap {
  
  @scala.inline
  def apply(
    change: SliderChangeEvent,
    click: SliderClickEvent,
    dblclick: SliderDblclickEvent,
    doubletap: SliderDoubletapEvent,
    focus: SliderFocusEvent,
    keypressed: SliderKeypressedEvent,
    longclick: SliderLongclickEvent,
    longpress: SliderLongpressEvent,
    pinch: SliderPinchEvent,
    postlayout: SliderPostlayoutEvent,
    singletap: SliderSingletapEvent,
    start: SliderStartEvent,
    stop: SliderStopEvent,
    swipe: SliderSwipeEvent,
    touchcancel: SliderTouchcancelEvent,
    touchend: SliderTouchendEvent,
    touchmove: SliderTouchmoveEvent,
    touchstart: SliderTouchstartEvent,
    twofingertap: SliderTwofingertapEvent
  ): SliderEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderEventMap]
  }
  
  @scala.inline
  implicit class SliderEventMapOps[Self <: SliderEventMap] (val x: Self) extends AnyVal {
    
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
    def setChange(value: SliderChangeEvent): Self = this.set("change", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClick(value: SliderClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: SliderDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: SliderDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: SliderFocusEvent): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: SliderKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: SliderLongclickEvent): Self = this.set("longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: SliderLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: SliderPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: SliderPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: SliderSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: SliderStartEvent): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStop(value: SliderStopEvent): Self = this.set("stop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: SliderSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: SliderTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: SliderTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: SliderTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: SliderTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: SliderTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
}
