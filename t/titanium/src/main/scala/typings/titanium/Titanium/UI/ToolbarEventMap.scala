package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolbarEventMap extends ProxyEventMap {
  
  var click: ToolbarClickEvent = js.native
  
  var dblclick: ToolbarDblclickEvent = js.native
  
  var doubletap: ToolbarDoubletapEvent = js.native
  
  var focus: ToolbarFocusEvent = js.native
  
  var keypressed: ToolbarKeypressedEvent = js.native
  
  var longclick: ToolbarLongclickEvent = js.native
  
  var longpress: ToolbarLongpressEvent = js.native
  
  var pinch: ToolbarPinchEvent = js.native
  
  var postlayout: ToolbarPostlayoutEvent = js.native
  
  var singletap: ToolbarSingletapEvent = js.native
  
  var swipe: ToolbarSwipeEvent = js.native
  
  var touchcancel: ToolbarTouchcancelEvent = js.native
  
  var touchend: ToolbarTouchendEvent = js.native
  
  var touchmove: ToolbarTouchmoveEvent = js.native
  
  var touchstart: ToolbarTouchstartEvent = js.native
  
  var twofingertap: ToolbarTwofingertapEvent = js.native
}
object ToolbarEventMap {
  
  @scala.inline
  def apply(
    click: ToolbarClickEvent,
    dblclick: ToolbarDblclickEvent,
    doubletap: ToolbarDoubletapEvent,
    focus: ToolbarFocusEvent,
    keypressed: ToolbarKeypressedEvent,
    longclick: ToolbarLongclickEvent,
    longpress: ToolbarLongpressEvent,
    pinch: ToolbarPinchEvent,
    postlayout: ToolbarPostlayoutEvent,
    singletap: ToolbarSingletapEvent,
    swipe: ToolbarSwipeEvent,
    touchcancel: ToolbarTouchcancelEvent,
    touchend: ToolbarTouchendEvent,
    touchmove: ToolbarTouchmoveEvent,
    touchstart: ToolbarTouchstartEvent,
    twofingertap: ToolbarTwofingertapEvent
  ): ToolbarEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarEventMap]
  }
  
  @scala.inline
  implicit class ToolbarEventMapMutableBuilder[Self <: ToolbarEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: ToolbarClickEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: ToolbarDblclickEvent): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: ToolbarDoubletapEvent): Self = StObject.set(x, "doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: ToolbarFocusEvent): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: ToolbarKeypressedEvent): Self = StObject.set(x, "keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: ToolbarLongclickEvent): Self = StObject.set(x, "longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: ToolbarLongpressEvent): Self = StObject.set(x, "longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: ToolbarPinchEvent): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: ToolbarPostlayoutEvent): Self = StObject.set(x, "postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: ToolbarSingletapEvent): Self = StObject.set(x, "singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: ToolbarSwipeEvent): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: ToolbarTouchcancelEvent): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: ToolbarTouchendEvent): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: ToolbarTouchmoveEvent): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: ToolbarTouchstartEvent): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: ToolbarTwofingertapEvent): Self = StObject.set(x, "twofingertap", value.asInstanceOf[js.Any])
  }
}
