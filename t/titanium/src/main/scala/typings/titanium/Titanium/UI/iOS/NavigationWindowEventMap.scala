package typings.titanium.Titanium.UI.iOS

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationWindowEventMap extends ProxyEventMap {
  
  var blur: NavigationWindowBlurEvent = js.native
  
  var click: NavigationWindowClickEvent = js.native
  
  var close: NavigationWindowCloseEvent = js.native
  
  var dblclick: NavigationWindowDblclickEvent = js.native
  
  var doubletap: NavigationWindowDoubletapEvent = js.native
  
  var focus: NavigationWindowFocusEvent = js.native
  
  var keypressed: NavigationWindowKeypressedEvent = js.native
  
  var longpress: NavigationWindowLongpressEvent = js.native
  
  var open: NavigationWindowOpenEvent = js.native
  
  var pinch: NavigationWindowPinchEvent = js.native
  
  var postlayout: NavigationWindowPostlayoutEvent = js.native
  
  var singletap: NavigationWindowSingletapEvent = js.native
  
  var swipe: NavigationWindowSwipeEvent = js.native
  
  var touchcancel: NavigationWindowTouchcancelEvent = js.native
  
  var touchend: NavigationWindowTouchendEvent = js.native
  
  var touchmove: NavigationWindowTouchmoveEvent = js.native
  
  var touchstart: NavigationWindowTouchstartEvent = js.native
  
  var twofingertap: NavigationWindowTwofingertapEvent = js.native
}
object NavigationWindowEventMap {
  
  @scala.inline
  def apply(
    blur: NavigationWindowBlurEvent,
    click: NavigationWindowClickEvent,
    close: NavigationWindowCloseEvent,
    dblclick: NavigationWindowDblclickEvent,
    doubletap: NavigationWindowDoubletapEvent,
    focus: NavigationWindowFocusEvent,
    keypressed: NavigationWindowKeypressedEvent,
    longpress: NavigationWindowLongpressEvent,
    open: NavigationWindowOpenEvent,
    pinch: NavigationWindowPinchEvent,
    postlayout: NavigationWindowPostlayoutEvent,
    singletap: NavigationWindowSingletapEvent,
    swipe: NavigationWindowSwipeEvent,
    touchcancel: NavigationWindowTouchcancelEvent,
    touchend: NavigationWindowTouchendEvent,
    touchmove: NavigationWindowTouchmoveEvent,
    touchstart: NavigationWindowTouchstartEvent,
    twofingertap: NavigationWindowTwofingertapEvent
  ): NavigationWindowEventMap = {
    val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationWindowEventMap]
  }
  
  @scala.inline
  implicit class NavigationWindowEventMapMutableBuilder[Self <: NavigationWindowEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlur(value: NavigationWindowBlurEvent): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClick(value: NavigationWindowClickEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: NavigationWindowCloseEvent): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: NavigationWindowDblclickEvent): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: NavigationWindowDoubletapEvent): Self = StObject.set(x, "doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: NavigationWindowFocusEvent): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: NavigationWindowKeypressedEvent): Self = StObject.set(x, "keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: NavigationWindowLongpressEvent): Self = StObject.set(x, "longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: NavigationWindowOpenEvent): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: NavigationWindowPinchEvent): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: NavigationWindowPostlayoutEvent): Self = StObject.set(x, "postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: NavigationWindowSingletapEvent): Self = StObject.set(x, "singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: NavigationWindowSwipeEvent): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: NavigationWindowTouchcancelEvent): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: NavigationWindowTouchendEvent): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: NavigationWindowTouchmoveEvent): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: NavigationWindowTouchstartEvent): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: NavigationWindowTwofingertapEvent): Self = StObject.set(x, "twofingertap", value.asInstanceOf[js.Any])
  }
}
