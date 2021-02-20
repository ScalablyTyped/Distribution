package typings.titanium.Titanium.UI.iPad

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
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
  implicit class PopoverEventMapMutableBuilder[Self <: PopoverEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: PopoverClickEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: PopoverDblclickEvent): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: PopoverDoubletapEvent): Self = StObject.set(x, "doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHide(value: PopoverHideEvent): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: PopoverKeypressedEvent): Self = StObject.set(x, "keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: PopoverLongpressEvent): Self = StObject.set(x, "longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: PopoverPinchEvent): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: PopoverPostlayoutEvent): Self = StObject.set(x, "postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: PopoverSingletapEvent): Self = StObject.set(x, "singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: PopoverSwipeEvent): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: PopoverTouchcancelEvent): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: PopoverTouchendEvent): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: PopoverTouchmoveEvent): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: PopoverTouchstartEvent): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: PopoverTwofingertapEvent): Self = StObject.set(x, "twofingertap", value.asInstanceOf[js.Any])
  }
}
