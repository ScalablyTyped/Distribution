package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwitchEventMap extends ProxyEventMap {
  
  var change: SwitchChangeEvent = js.native
  
  var click: SwitchClickEvent = js.native
  
  var dblclick: SwitchDblclickEvent = js.native
  
  var doubletap: SwitchDoubletapEvent = js.native
  
  var focus: SwitchFocusEvent = js.native
  
  var keypressed: SwitchKeypressedEvent = js.native
  
  var longclick: SwitchLongclickEvent = js.native
  
  var longpress: SwitchLongpressEvent = js.native
  
  var pinch: SwitchPinchEvent = js.native
  
  var postlayout: SwitchPostlayoutEvent = js.native
  
  var singletap: SwitchSingletapEvent = js.native
  
  var swipe: SwitchSwipeEvent = js.native
  
  var touchcancel: SwitchTouchcancelEvent = js.native
  
  var touchend: SwitchTouchendEvent = js.native
  
  var touchmove: SwitchTouchmoveEvent = js.native
  
  var touchstart: SwitchTouchstartEvent = js.native
  
  var twofingertap: SwitchTwofingertapEvent = js.native
}
object SwitchEventMap {
  
  @scala.inline
  def apply(
    change: SwitchChangeEvent,
    click: SwitchClickEvent,
    dblclick: SwitchDblclickEvent,
    doubletap: SwitchDoubletapEvent,
    focus: SwitchFocusEvent,
    keypressed: SwitchKeypressedEvent,
    longclick: SwitchLongclickEvent,
    longpress: SwitchLongpressEvent,
    pinch: SwitchPinchEvent,
    postlayout: SwitchPostlayoutEvent,
    singletap: SwitchSingletapEvent,
    swipe: SwitchSwipeEvent,
    touchcancel: SwitchTouchcancelEvent,
    touchend: SwitchTouchendEvent,
    touchmove: SwitchTouchmoveEvent,
    touchstart: SwitchTouchstartEvent,
    twofingertap: SwitchTwofingertapEvent
  ): SwitchEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchEventMap]
  }
  
  @scala.inline
  implicit class SwitchEventMapMutableBuilder[Self <: SwitchEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: SwitchChangeEvent): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClick(value: SwitchClickEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: SwitchDblclickEvent): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: SwitchDoubletapEvent): Self = StObject.set(x, "doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: SwitchFocusEvent): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: SwitchKeypressedEvent): Self = StObject.set(x, "keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: SwitchLongclickEvent): Self = StObject.set(x, "longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: SwitchLongpressEvent): Self = StObject.set(x, "longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: SwitchPinchEvent): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: SwitchPostlayoutEvent): Self = StObject.set(x, "postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: SwitchSingletapEvent): Self = StObject.set(x, "singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: SwitchSwipeEvent): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: SwitchTouchcancelEvent): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: SwitchTouchendEvent): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: SwitchTouchmoveEvent): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: SwitchTouchstartEvent): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: SwitchTwofingertapEvent): Self = StObject.set(x, "twofingertap", value.asInstanceOf[js.Any])
  }
}
