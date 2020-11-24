package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
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
  implicit class TableViewRowEventMapOps[Self <: TableViewRowEventMap] (val x: Self) extends AnyVal {
    
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
    def setClick(value: TableViewRowClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: TableViewRowDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: TableViewRowDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: TableViewRowFocusEvent): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: TableViewRowKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: TableViewRowLongclickEvent): Self = this.set("longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: TableViewRowLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: TableViewRowPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: TableViewRowPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: TableViewRowSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: TableViewRowSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: TableViewRowTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: TableViewRowTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: TableViewRowTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: TableViewRowTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: TableViewRowTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
}
