package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlertDialogEventMap extends ProxyEventMap {
  
  var click: AlertDialogClickEvent = js.native
  
  var dblclick: AlertDialogDblclickEvent = js.native
  
  var doubletap: AlertDialogDoubletapEvent = js.native
  
  var focus: AlertDialogFocusEvent = js.native
  
  var keypressed: AlertDialogKeypressedEvent = js.native
  
  var longclick: AlertDialogLongclickEvent = js.native
  
  var longpress: AlertDialogLongpressEvent = js.native
  
  var pinch: AlertDialogPinchEvent = js.native
  
  var postlayout: AlertDialogPostlayoutEvent = js.native
  
  var singletap: AlertDialogSingletapEvent = js.native
  
  var swipe: AlertDialogSwipeEvent = js.native
  
  var touchcancel: AlertDialogTouchcancelEvent = js.native
  
  var touchend: AlertDialogTouchendEvent = js.native
  
  var touchmove: AlertDialogTouchmoveEvent = js.native
  
  var touchstart: AlertDialogTouchstartEvent = js.native
  
  var twofingertap: AlertDialogTwofingertapEvent = js.native
}
object AlertDialogEventMap {
  
  @scala.inline
  def apply(
    click: AlertDialogClickEvent,
    dblclick: AlertDialogDblclickEvent,
    doubletap: AlertDialogDoubletapEvent,
    focus: AlertDialogFocusEvent,
    keypressed: AlertDialogKeypressedEvent,
    longclick: AlertDialogLongclickEvent,
    longpress: AlertDialogLongpressEvent,
    pinch: AlertDialogPinchEvent,
    postlayout: AlertDialogPostlayoutEvent,
    singletap: AlertDialogSingletapEvent,
    swipe: AlertDialogSwipeEvent,
    touchcancel: AlertDialogTouchcancelEvent,
    touchend: AlertDialogTouchendEvent,
    touchmove: AlertDialogTouchmoveEvent,
    touchstart: AlertDialogTouchstartEvent,
    twofingertap: AlertDialogTwofingertapEvent
  ): AlertDialogEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertDialogEventMap]
  }
  
  @scala.inline
  implicit class AlertDialogEventMapMutableBuilder[Self <: AlertDialogEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: AlertDialogClickEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: AlertDialogDblclickEvent): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: AlertDialogDoubletapEvent): Self = StObject.set(x, "doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: AlertDialogFocusEvent): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: AlertDialogKeypressedEvent): Self = StObject.set(x, "keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: AlertDialogLongclickEvent): Self = StObject.set(x, "longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: AlertDialogLongpressEvent): Self = StObject.set(x, "longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: AlertDialogPinchEvent): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: AlertDialogPostlayoutEvent): Self = StObject.set(x, "postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: AlertDialogSingletapEvent): Self = StObject.set(x, "singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: AlertDialogSwipeEvent): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: AlertDialogTouchcancelEvent): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: AlertDialogTouchendEvent): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: AlertDialogTouchmoveEvent): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: AlertDialogTouchstartEvent): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: AlertDialogTwofingertapEvent): Self = StObject.set(x, "twofingertap", value.asInstanceOf[js.Any])
  }
}
