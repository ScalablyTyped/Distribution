package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
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
  implicit class PickerRowEventMapOps[Self <: PickerRowEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClick(value: PickerRowClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: PickerRowDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: PickerRowDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: PickerRowFocusEvent): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: PickerRowKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: PickerRowLongclickEvent): Self = this.set("longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: PickerRowLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: PickerRowPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: PickerRowPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: PickerRowSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: PickerRowSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: PickerRowTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: PickerRowTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: PickerRowTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: PickerRowTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: PickerRowTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
}
