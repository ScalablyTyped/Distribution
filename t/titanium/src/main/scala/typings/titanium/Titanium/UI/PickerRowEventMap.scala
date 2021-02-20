package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PickerRowEventMap extends ProxyEventMap {
  
  var click: PickerRowClickEvent = js.native
  
  var dblclick: PickerRowDblclickEvent = js.native
  
  var doubletap: PickerRowDoubletapEvent = js.native
  
  var focus: PickerRowFocusEvent = js.native
  
  var keypressed: PickerRowKeypressedEvent = js.native
  
  var longclick: PickerRowLongclickEvent = js.native
  
  var longpress: PickerRowLongpressEvent = js.native
  
  var pinch: PickerRowPinchEvent = js.native
  
  var postlayout: PickerRowPostlayoutEvent = js.native
  
  var singletap: PickerRowSingletapEvent = js.native
  
  var swipe: PickerRowSwipeEvent = js.native
  
  var touchcancel: PickerRowTouchcancelEvent = js.native
  
  var touchend: PickerRowTouchendEvent = js.native
  
  var touchmove: PickerRowTouchmoveEvent = js.native
  
  var touchstart: PickerRowTouchstartEvent = js.native
  
  var twofingertap: PickerRowTwofingertapEvent = js.native
}
object PickerRowEventMap {
  
  @scala.inline
  def apply(
    click: PickerRowClickEvent,
    dblclick: PickerRowDblclickEvent,
    doubletap: PickerRowDoubletapEvent,
    focus: PickerRowFocusEvent,
    keypressed: PickerRowKeypressedEvent,
    longclick: PickerRowLongclickEvent,
    longpress: PickerRowLongpressEvent,
    pinch: PickerRowPinchEvent,
    postlayout: PickerRowPostlayoutEvent,
    singletap: PickerRowSingletapEvent,
    swipe: PickerRowSwipeEvent,
    touchcancel: PickerRowTouchcancelEvent,
    touchend: PickerRowTouchendEvent,
    touchmove: PickerRowTouchmoveEvent,
    touchstart: PickerRowTouchstartEvent,
    twofingertap: PickerRowTwofingertapEvent
  ): PickerRowEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerRowEventMap]
  }
  
  @scala.inline
  implicit class PickerRowEventMapMutableBuilder[Self <: PickerRowEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: PickerRowClickEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: PickerRowDblclickEvent): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: PickerRowDoubletapEvent): Self = StObject.set(x, "doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: PickerRowFocusEvent): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: PickerRowKeypressedEvent): Self = StObject.set(x, "keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: PickerRowLongclickEvent): Self = StObject.set(x, "longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: PickerRowLongpressEvent): Self = StObject.set(x, "longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: PickerRowPinchEvent): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: PickerRowPostlayoutEvent): Self = StObject.set(x, "postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: PickerRowSingletapEvent): Self = StObject.set(x, "singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: PickerRowSwipeEvent): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: PickerRowTouchcancelEvent): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: PickerRowTouchendEvent): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: PickerRowTouchmoveEvent): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: PickerRowTouchstartEvent): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: PickerRowTwofingertapEvent): Self = StObject.set(x, "twofingertap", value.asInstanceOf[js.Any])
  }
}
