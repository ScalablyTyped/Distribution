package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityIndicatorEventMap extends ProxyEventMap {
  
  var click: ActivityIndicatorClickEvent = js.native
  
  var dblclick: ActivityIndicatorDblclickEvent = js.native
  
  var doubletap: ActivityIndicatorDoubletapEvent = js.native
  
  var focus: ActivityIndicatorFocusEvent = js.native
  
  var keypressed: ActivityIndicatorKeypressedEvent = js.native
  
  var longclick: ActivityIndicatorLongclickEvent = js.native
  
  var longpress: ActivityIndicatorLongpressEvent = js.native
  
  var pinch: ActivityIndicatorPinchEvent = js.native
  
  var postlayout: ActivityIndicatorPostlayoutEvent = js.native
  
  var singletap: ActivityIndicatorSingletapEvent = js.native
  
  var swipe: ActivityIndicatorSwipeEvent = js.native
  
  var touchcancel: ActivityIndicatorTouchcancelEvent = js.native
  
  var touchend: ActivityIndicatorTouchendEvent = js.native
  
  var touchmove: ActivityIndicatorTouchmoveEvent = js.native
  
  var touchstart: ActivityIndicatorTouchstartEvent = js.native
  
  var twofingertap: ActivityIndicatorTwofingertapEvent = js.native
}
object ActivityIndicatorEventMap {
  
  @scala.inline
  def apply(
    click: ActivityIndicatorClickEvent,
    dblclick: ActivityIndicatorDblclickEvent,
    doubletap: ActivityIndicatorDoubletapEvent,
    focus: ActivityIndicatorFocusEvent,
    keypressed: ActivityIndicatorKeypressedEvent,
    longclick: ActivityIndicatorLongclickEvent,
    longpress: ActivityIndicatorLongpressEvent,
    pinch: ActivityIndicatorPinchEvent,
    postlayout: ActivityIndicatorPostlayoutEvent,
    singletap: ActivityIndicatorSingletapEvent,
    swipe: ActivityIndicatorSwipeEvent,
    touchcancel: ActivityIndicatorTouchcancelEvent,
    touchend: ActivityIndicatorTouchendEvent,
    touchmove: ActivityIndicatorTouchmoveEvent,
    touchstart: ActivityIndicatorTouchstartEvent,
    twofingertap: ActivityIndicatorTwofingertapEvent
  ): ActivityIndicatorEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityIndicatorEventMap]
  }
  
  @scala.inline
  implicit class ActivityIndicatorEventMapMutableBuilder[Self <: ActivityIndicatorEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: ActivityIndicatorClickEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: ActivityIndicatorDblclickEvent): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: ActivityIndicatorDoubletapEvent): Self = StObject.set(x, "doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: ActivityIndicatorFocusEvent): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: ActivityIndicatorKeypressedEvent): Self = StObject.set(x, "keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: ActivityIndicatorLongclickEvent): Self = StObject.set(x, "longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: ActivityIndicatorLongpressEvent): Self = StObject.set(x, "longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: ActivityIndicatorPinchEvent): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: ActivityIndicatorPostlayoutEvent): Self = StObject.set(x, "postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: ActivityIndicatorSingletapEvent): Self = StObject.set(x, "singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: ActivityIndicatorSwipeEvent): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: ActivityIndicatorTouchcancelEvent): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: ActivityIndicatorTouchendEvent): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: ActivityIndicatorTouchmoveEvent): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: ActivityIndicatorTouchstartEvent): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: ActivityIndicatorTwofingertapEvent): Self = StObject.set(x, "twofingertap", value.asInstanceOf[js.Any])
  }
}
