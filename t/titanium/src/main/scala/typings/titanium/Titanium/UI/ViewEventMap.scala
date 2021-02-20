package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewEventMap extends ProxyEventMap {
  
  var click: ViewClickEvent = js.native
  
  var dblclick: ViewDblclickEvent = js.native
  
  var doubletap: ViewDoubletapEvent = js.native
  
  var focus: ViewFocusEvent = js.native
  
  var keypressed: ViewKeypressedEvent = js.native
  
  var longclick: ViewLongclickEvent = js.native
  
  var longpress: ViewLongpressEvent = js.native
  
  var pinch: ViewPinchEvent = js.native
  
  var postlayout: ViewPostlayoutEvent = js.native
  
  var singletap: ViewSingletapEvent = js.native
  
  var swipe: ViewSwipeEvent = js.native
  
  var touchcancel: ViewTouchcancelEvent = js.native
  
  var touchend: ViewTouchendEvent = js.native
  
  var touchmove: ViewTouchmoveEvent = js.native
  
  var touchstart: ViewTouchstartEvent = js.native
  
  var twofingertap: ViewTwofingertapEvent = js.native
}
object ViewEventMap {
  
  @scala.inline
  def apply(
    click: ViewClickEvent,
    dblclick: ViewDblclickEvent,
    doubletap: ViewDoubletapEvent,
    focus: ViewFocusEvent,
    keypressed: ViewKeypressedEvent,
    longclick: ViewLongclickEvent,
    longpress: ViewLongpressEvent,
    pinch: ViewPinchEvent,
    postlayout: ViewPostlayoutEvent,
    singletap: ViewSingletapEvent,
    swipe: ViewSwipeEvent,
    touchcancel: ViewTouchcancelEvent,
    touchend: ViewTouchendEvent,
    touchmove: ViewTouchmoveEvent,
    touchstart: ViewTouchstartEvent,
    twofingertap: ViewTwofingertapEvent
  ): ViewEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewEventMap]
  }
  
  @scala.inline
  implicit class ViewEventMapMutableBuilder[Self <: ViewEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: ViewClickEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: ViewDblclickEvent): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: ViewDoubletapEvent): Self = StObject.set(x, "doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: ViewFocusEvent): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: ViewKeypressedEvent): Self = StObject.set(x, "keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: ViewLongclickEvent): Self = StObject.set(x, "longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: ViewLongpressEvent): Self = StObject.set(x, "longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: ViewPinchEvent): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: ViewPostlayoutEvent): Self = StObject.set(x, "postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: ViewSingletapEvent): Self = StObject.set(x, "singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: ViewSwipeEvent): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: ViewTouchcancelEvent): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: ViewTouchendEvent): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: ViewTouchmoveEvent): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: ViewTouchstartEvent): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: ViewTwofingertapEvent): Self = StObject.set(x, "twofingertap", value.asInstanceOf[js.Any])
  }
}
