package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
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
  implicit class PickerColumnEventMapOps[Self <: PickerColumnEventMap] (val x: Self) extends AnyVal {
    
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
    def setClick(value: PickerColumnClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: PickerColumnDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: PickerColumnDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: PickerColumnFocusEvent): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: PickerColumnKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: PickerColumnLongclickEvent): Self = this.set("longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: PickerColumnLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: PickerColumnPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: PickerColumnPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: PickerColumnSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: PickerColumnSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: PickerColumnTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: PickerColumnTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: PickerColumnTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: PickerColumnTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: PickerColumnTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
}
