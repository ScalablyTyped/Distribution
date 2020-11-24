package typings.titanium.Titanium.UI.iPad

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopoverEventMap extends ProxyEventMap {
  
  var click: PopoverClickEvent = js.native
  
  var dblclick: PopoverDblclickEvent = js.native
  
  var doubletap: PopoverDoubletapEvent = js.native
  
  var hide: PopoverHideEvent = js.native
  
  var keypressed: PopoverKeypressedEvent = js.native
  
  var longpress: PopoverLongpressEvent = js.native
  
  var pinch: PopoverPinchEvent = js.native
  
  var postlayout: PopoverPostlayoutEvent = js.native
  
  var singletap: PopoverSingletapEvent = js.native
  
  var swipe: PopoverSwipeEvent = js.native
  
  var touchcancel: PopoverTouchcancelEvent = js.native
  
  var touchend: PopoverTouchendEvent = js.native
  
  var touchmove: PopoverTouchmoveEvent = js.native
  
  var touchstart: PopoverTouchstartEvent = js.native
  
  var twofingertap: PopoverTwofingertapEvent = js.native
}
object PopoverEventMap {
  
  @scala.inline
  def apply(
    click: PopoverClickEvent,
    dblclick: PopoverDblclickEvent,
    doubletap: PopoverDoubletapEvent,
    hide: PopoverHideEvent,
    keypressed: PopoverKeypressedEvent,
    longpress: PopoverLongpressEvent,
    pinch: PopoverPinchEvent,
    postlayout: PopoverPostlayoutEvent,
    singletap: PopoverSingletapEvent,
    swipe: PopoverSwipeEvent,
    touchcancel: PopoverTouchcancelEvent,
    touchend: PopoverTouchendEvent,
    touchmove: PopoverTouchmoveEvent,
    touchstart: PopoverTouchstartEvent,
    twofingertap: PopoverTwofingertapEvent
  ): PopoverEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverEventMap]
  }
  
  @scala.inline
  implicit class PopoverEventMapOps[Self <: PopoverEventMap] (val x: Self) extends AnyVal {
    
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
    def setClick(value: PopoverClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: PopoverDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: PopoverDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHide(value: PopoverHideEvent): Self = this.set("hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: PopoverKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: PopoverLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: PopoverPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: PopoverPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: PopoverSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: PopoverSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: PopoverTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: PopoverTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: PopoverTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: PopoverTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: PopoverTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
}
