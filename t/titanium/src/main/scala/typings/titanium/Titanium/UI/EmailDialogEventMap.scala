package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailDialogEventMap extends ProxyEventMap {
  
  var click: EmailDialogClickEvent = js.native
  
  var complete: EmailDialogCompleteEvent = js.native
  
  var dblclick: EmailDialogDblclickEvent = js.native
  
  var doubletap: EmailDialogDoubletapEvent = js.native
  
  var focus: EmailDialogFocusEvent = js.native
  
  var keypressed: EmailDialogKeypressedEvent = js.native
  
  var longclick: EmailDialogLongclickEvent = js.native
  
  var longpress: EmailDialogLongpressEvent = js.native
  
  var pinch: EmailDialogPinchEvent = js.native
  
  var postlayout: EmailDialogPostlayoutEvent = js.native
  
  var singletap: EmailDialogSingletapEvent = js.native
  
  var swipe: EmailDialogSwipeEvent = js.native
  
  var touchcancel: EmailDialogTouchcancelEvent = js.native
  
  var touchend: EmailDialogTouchendEvent = js.native
  
  var touchmove: EmailDialogTouchmoveEvent = js.native
  
  var touchstart: EmailDialogTouchstartEvent = js.native
  
  var twofingertap: EmailDialogTwofingertapEvent = js.native
}
object EmailDialogEventMap {
  
  @scala.inline
  def apply(
    click: EmailDialogClickEvent,
    complete: EmailDialogCompleteEvent,
    dblclick: EmailDialogDblclickEvent,
    doubletap: EmailDialogDoubletapEvent,
    focus: EmailDialogFocusEvent,
    keypressed: EmailDialogKeypressedEvent,
    longclick: EmailDialogLongclickEvent,
    longpress: EmailDialogLongpressEvent,
    pinch: EmailDialogPinchEvent,
    postlayout: EmailDialogPostlayoutEvent,
    singletap: EmailDialogSingletapEvent,
    swipe: EmailDialogSwipeEvent,
    touchcancel: EmailDialogTouchcancelEvent,
    touchend: EmailDialogTouchendEvent,
    touchmove: EmailDialogTouchmoveEvent,
    touchstart: EmailDialogTouchstartEvent,
    twofingertap: EmailDialogTwofingertapEvent
  ): EmailDialogEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailDialogEventMap]
  }
  
  @scala.inline
  implicit class EmailDialogEventMapMutableBuilder[Self <: EmailDialogEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: EmailDialogClickEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: EmailDialogCompleteEvent): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: EmailDialogDblclickEvent): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: EmailDialogDoubletapEvent): Self = StObject.set(x, "doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: EmailDialogFocusEvent): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: EmailDialogKeypressedEvent): Self = StObject.set(x, "keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: EmailDialogLongclickEvent): Self = StObject.set(x, "longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: EmailDialogLongpressEvent): Self = StObject.set(x, "longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: EmailDialogPinchEvent): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: EmailDialogPostlayoutEvent): Self = StObject.set(x, "postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: EmailDialogSingletapEvent): Self = StObject.set(x, "singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: EmailDialogSwipeEvent): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: EmailDialogTouchcancelEvent): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: EmailDialogTouchendEvent): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: EmailDialogTouchmoveEvent): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: EmailDialogTouchstartEvent): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: EmailDialogTwofingertapEvent): Self = StObject.set(x, "twofingertap", value.asInstanceOf[js.Any])
  }
}
