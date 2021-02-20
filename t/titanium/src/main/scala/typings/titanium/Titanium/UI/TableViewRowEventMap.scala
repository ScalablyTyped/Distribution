package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableViewRowEventMap extends ProxyEventMap {
  
  var click: TableViewRowClickEvent = js.native
  
  var dblclick: TableViewRowDblclickEvent = js.native
  
  var doubletap: TableViewRowDoubletapEvent = js.native
  
  var focus: TableViewRowFocusEvent = js.native
  
  var keypressed: TableViewRowKeypressedEvent = js.native
  
  var longclick: TableViewRowLongclickEvent = js.native
  
  var longpress: TableViewRowLongpressEvent = js.native
  
  var pinch: TableViewRowPinchEvent = js.native
  
  var postlayout: TableViewRowPostlayoutEvent = js.native
  
  var singletap: TableViewRowSingletapEvent = js.native
  
  var swipe: TableViewRowSwipeEvent = js.native
  
  var touchcancel: TableViewRowTouchcancelEvent = js.native
  
  var touchend: TableViewRowTouchendEvent = js.native
  
  var touchmove: TableViewRowTouchmoveEvent = js.native
  
  var touchstart: TableViewRowTouchstartEvent = js.native
  
  var twofingertap: TableViewRowTwofingertapEvent = js.native
}
object TableViewRowEventMap {
  
  @scala.inline
  def apply(
    click: TableViewRowClickEvent,
    dblclick: TableViewRowDblclickEvent,
    doubletap: TableViewRowDoubletapEvent,
    focus: TableViewRowFocusEvent,
    keypressed: TableViewRowKeypressedEvent,
    longclick: TableViewRowLongclickEvent,
    longpress: TableViewRowLongpressEvent,
    pinch: TableViewRowPinchEvent,
    postlayout: TableViewRowPostlayoutEvent,
    singletap: TableViewRowSingletapEvent,
    swipe: TableViewRowSwipeEvent,
    touchcancel: TableViewRowTouchcancelEvent,
    touchend: TableViewRowTouchendEvent,
    touchmove: TableViewRowTouchmoveEvent,
    touchstart: TableViewRowTouchstartEvent,
    twofingertap: TableViewRowTwofingertapEvent
  ): TableViewRowEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewRowEventMap]
  }
  
  @scala.inline
  implicit class TableViewRowEventMapMutableBuilder[Self <: TableViewRowEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: TableViewRowClickEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: TableViewRowDblclickEvent): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: TableViewRowDoubletapEvent): Self = StObject.set(x, "doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: TableViewRowFocusEvent): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: TableViewRowKeypressedEvent): Self = StObject.set(x, "keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: TableViewRowLongclickEvent): Self = StObject.set(x, "longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: TableViewRowLongpressEvent): Self = StObject.set(x, "longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: TableViewRowPinchEvent): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: TableViewRowPostlayoutEvent): Self = StObject.set(x, "postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: TableViewRowSingletapEvent): Self = StObject.set(x, "singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: TableViewRowSwipeEvent): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: TableViewRowTouchcancelEvent): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: TableViewRowTouchendEvent): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: TableViewRowTouchmoveEvent): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: TableViewRowTouchstartEvent): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: TableViewRowTwofingertapEvent): Self = StObject.set(x, "twofingertap", value.asInstanceOf[js.Any])
  }
}
