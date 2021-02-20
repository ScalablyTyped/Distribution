package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonEventMap extends ProxyEventMap {
  
  var click: ButtonClickEvent = js.native
  
  var dblclick: ButtonDblclickEvent = js.native
  
  var doubletap: ButtonDoubletapEvent = js.native
  
  var focus: ButtonFocusEvent = js.native
  
  var keypressed: ButtonKeypressedEvent = js.native
  
  var longclick: ButtonLongclickEvent = js.native
  
  var longpress: ButtonLongpressEvent = js.native
  
  var pinch: ButtonPinchEvent = js.native
  
  var postlayout: ButtonPostlayoutEvent = js.native
  
  var singletap: ButtonSingletapEvent = js.native
  
  var swipe: ButtonSwipeEvent = js.native
  
  var touchcancel: ButtonTouchcancelEvent = js.native
  
  var touchend: ButtonTouchendEvent = js.native
  
  var touchmove: ButtonTouchmoveEvent = js.native
  
  var touchstart: ButtonTouchstartEvent = js.native
  
  var twofingertap: ButtonTwofingertapEvent = js.native
}
object ButtonEventMap {
  
  @scala.inline
  def apply(
    click: ButtonClickEvent,
    dblclick: ButtonDblclickEvent,
    doubletap: ButtonDoubletapEvent,
    focus: ButtonFocusEvent,
    keypressed: ButtonKeypressedEvent,
    longclick: ButtonLongclickEvent,
    longpress: ButtonLongpressEvent,
    pinch: ButtonPinchEvent,
    postlayout: ButtonPostlayoutEvent,
    singletap: ButtonSingletapEvent,
    swipe: ButtonSwipeEvent,
    touchcancel: ButtonTouchcancelEvent,
    touchend: ButtonTouchendEvent,
    touchmove: ButtonTouchmoveEvent,
    touchstart: ButtonTouchstartEvent,
    twofingertap: ButtonTwofingertapEvent
  ): ButtonEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonEventMap]
  }
  
  @scala.inline
  implicit class ButtonEventMapMutableBuilder[Self <: ButtonEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: ButtonClickEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: ButtonDblclickEvent): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: ButtonDoubletapEvent): Self = StObject.set(x, "doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: ButtonFocusEvent): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: ButtonKeypressedEvent): Self = StObject.set(x, "keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: ButtonLongclickEvent): Self = StObject.set(x, "longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: ButtonLongpressEvent): Self = StObject.set(x, "longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: ButtonPinchEvent): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: ButtonPostlayoutEvent): Self = StObject.set(x, "postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: ButtonSingletapEvent): Self = StObject.set(x, "singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: ButtonSwipeEvent): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: ButtonTouchcancelEvent): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: ButtonTouchendEvent): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: ButtonTouchmoveEvent): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: ButtonTouchstartEvent): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: ButtonTwofingertapEvent): Self = StObject.set(x, "twofingertap", value.asInstanceOf[js.Any])
  }
}
