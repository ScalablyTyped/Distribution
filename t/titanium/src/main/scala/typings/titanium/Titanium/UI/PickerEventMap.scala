package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PickerEventMap extends ProxyEventMap {
  
  var change: PickerChangeEvent = js.native
  
  var click: PickerClickEvent = js.native
  
  var dblclick: PickerDblclickEvent = js.native
  
  var doubletap: PickerDoubletapEvent = js.native
  
  var focus: PickerFocusEvent = js.native
  
  var keypressed: PickerKeypressedEvent = js.native
  
  var longclick: PickerLongclickEvent = js.native
  
  var longpress: PickerLongpressEvent = js.native
  
  var pinch: PickerPinchEvent = js.native
  
  var postlayout: PickerPostlayoutEvent = js.native
  
  var singletap: PickerSingletapEvent = js.native
  
  var swipe: PickerSwipeEvent = js.native
  
  var touchcancel: PickerTouchcancelEvent = js.native
  
  var touchend: PickerTouchendEvent = js.native
  
  var touchmove: PickerTouchmoveEvent = js.native
  
  var touchstart: PickerTouchstartEvent = js.native
  
  var twofingertap: PickerTwofingertapEvent = js.native
}
object PickerEventMap {
  
  @scala.inline
  def apply(
    change: PickerChangeEvent,
    click: PickerClickEvent,
    dblclick: PickerDblclickEvent,
    doubletap: PickerDoubletapEvent,
    focus: PickerFocusEvent,
    keypressed: PickerKeypressedEvent,
    longclick: PickerLongclickEvent,
    longpress: PickerLongpressEvent,
    pinch: PickerPinchEvent,
    postlayout: PickerPostlayoutEvent,
    singletap: PickerSingletapEvent,
    swipe: PickerSwipeEvent,
    touchcancel: PickerTouchcancelEvent,
    touchend: PickerTouchendEvent,
    touchmove: PickerTouchmoveEvent,
    touchstart: PickerTouchstartEvent,
    twofingertap: PickerTwofingertapEvent
  ): PickerEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerEventMap]
  }
  
  @scala.inline
  implicit class PickerEventMapMutableBuilder[Self <: PickerEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: PickerChangeEvent): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClick(value: PickerClickEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: PickerDblclickEvent): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: PickerDoubletapEvent): Self = StObject.set(x, "doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: PickerFocusEvent): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: PickerKeypressedEvent): Self = StObject.set(x, "keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: PickerLongclickEvent): Self = StObject.set(x, "longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: PickerLongpressEvent): Self = StObject.set(x, "longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: PickerPinchEvent): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: PickerPostlayoutEvent): Self = StObject.set(x, "postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: PickerSingletapEvent): Self = StObject.set(x, "singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: PickerSwipeEvent): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: PickerTouchcancelEvent): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: PickerTouchendEvent): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: PickerTouchmoveEvent): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: PickerTouchstartEvent): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: PickerTwofingertapEvent): Self = StObject.set(x, "twofingertap", value.asInstanceOf[js.Any])
  }
}
