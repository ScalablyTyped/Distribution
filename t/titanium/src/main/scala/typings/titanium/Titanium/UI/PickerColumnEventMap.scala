package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PickerColumnEventMap extends ProxyEventMap {
  
  var click: PickerColumnClickEvent = js.native
  
  var dblclick: PickerColumnDblclickEvent = js.native
  
  var doubletap: PickerColumnDoubletapEvent = js.native
  
  var focus: PickerColumnFocusEvent = js.native
  
  var keypressed: PickerColumnKeypressedEvent = js.native
  
  var longclick: PickerColumnLongclickEvent = js.native
  
  var longpress: PickerColumnLongpressEvent = js.native
  
  var pinch: PickerColumnPinchEvent = js.native
  
  var postlayout: PickerColumnPostlayoutEvent = js.native
  
  var singletap: PickerColumnSingletapEvent = js.native
  
  var swipe: PickerColumnSwipeEvent = js.native
  
  var touchcancel: PickerColumnTouchcancelEvent = js.native
  
  var touchend: PickerColumnTouchendEvent = js.native
  
  var touchmove: PickerColumnTouchmoveEvent = js.native
  
  var touchstart: PickerColumnTouchstartEvent = js.native
  
  var twofingertap: PickerColumnTwofingertapEvent = js.native
}
object PickerColumnEventMap {
  
  @scala.inline
  def apply(
    click: PickerColumnClickEvent,
    dblclick: PickerColumnDblclickEvent,
    doubletap: PickerColumnDoubletapEvent,
    focus: PickerColumnFocusEvent,
    keypressed: PickerColumnKeypressedEvent,
    longclick: PickerColumnLongclickEvent,
    longpress: PickerColumnLongpressEvent,
    pinch: PickerColumnPinchEvent,
    postlayout: PickerColumnPostlayoutEvent,
    singletap: PickerColumnSingletapEvent,
    swipe: PickerColumnSwipeEvent,
    touchcancel: PickerColumnTouchcancelEvent,
    touchend: PickerColumnTouchendEvent,
    touchmove: PickerColumnTouchmoveEvent,
    touchstart: PickerColumnTouchstartEvent,
    twofingertap: PickerColumnTwofingertapEvent
  ): PickerColumnEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerColumnEventMap]
  }
  
  @scala.inline
  implicit class PickerColumnEventMapMutableBuilder[Self <: PickerColumnEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: PickerColumnClickEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: PickerColumnDblclickEvent): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: PickerColumnDoubletapEvent): Self = StObject.set(x, "doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: PickerColumnFocusEvent): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: PickerColumnKeypressedEvent): Self = StObject.set(x, "keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: PickerColumnLongclickEvent): Self = StObject.set(x, "longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: PickerColumnLongpressEvent): Self = StObject.set(x, "longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: PickerColumnPinchEvent): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: PickerColumnPostlayoutEvent): Self = StObject.set(x, "postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: PickerColumnSingletapEvent): Self = StObject.set(x, "singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: PickerColumnSwipeEvent): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: PickerColumnTouchcancelEvent): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: PickerColumnTouchendEvent): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: PickerColumnTouchmoveEvent): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: PickerColumnTouchstartEvent): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: PickerColumnTwofingertapEvent): Self = StObject.set(x, "twofingertap", value.asInstanceOf[js.Any])
  }
}
