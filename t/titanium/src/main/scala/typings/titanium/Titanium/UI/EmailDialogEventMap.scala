package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailDialogEventMap extends ProxyEventMap {
  
  var click: EmailDialogClickEvent = js.native
  
  var complete: EmailDialogCompleteEvent = js.native
  
  var dblclick: EmailDialogDblclickEvent = js.native
  
  var doubletap: EmailDialogDoubletapEvent = js.native
  
  var focus: EmailDialogFocusEvent = js.native
  
  var keypressed: EmailDialogKeypressedEvent = js.native
  
  var longclick: EmailDialogLongclickEvent = js.native
  
  var longpress: EmailDialogLongpressEvent = js.native
  
  var pinch: EmailDialogPinchEvent = js.native
  
  var postlayout: EmailDialogPostlayoutEvent = js.native
  
  var singletap: EmailDialogSingletapEvent = js.native
  
  var swipe: EmailDialogSwipeEvent = js.native
  
  var touchcancel: EmailDialogTouchcancelEvent = js.native
  
  var touchend: EmailDialogTouchendEvent = js.native
  
  var touchmove: EmailDialogTouchmoveEvent = js.native
  
  var touchstart: EmailDialogTouchstartEvent = js.native
  
  var twofingertap: EmailDialogTwofingertapEvent = js.native
}
object EmailDialogEventMap {
  
  @scala.inline
  def apply(
    click: EmailDialogClickEvent,
    complete: EmailDialogCompleteEvent,
    dblclick: EmailDialogDblclickEvent,
    doubletap: EmailDialogDoubletapEvent,
    focus: EmailDialogFocusEvent,
    keypressed: EmailDialogKeypressedEvent,
    longclick: EmailDialogLongclickEvent,
    longpress: EmailDialogLongpressEvent,
    pinch: EmailDialogPinchEvent,
    postlayout: EmailDialogPostlayoutEvent,
    singletap: EmailDialogSingletapEvent,
    swipe: EmailDialogSwipeEvent,
    touchcancel: EmailDialogTouchcancelEvent,
    touchend: EmailDialogTouchendEvent,
    touchmove: EmailDialogTouchmoveEvent,
    touchstart: EmailDialogTouchstartEvent,
    twofingertap: EmailDialogTwofingertapEvent
  ): EmailDialogEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailDialogEventMap]
  }
  
  @scala.inline
  implicit class EmailDialogEventMapOps[Self <: EmailDialogEventMap] (val x: Self) extends AnyVal {
    
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
    def setClick(value: EmailDialogClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: EmailDialogCompleteEvent): Self = this.set("complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: EmailDialogDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: EmailDialogDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: EmailDialogFocusEvent): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: EmailDialogKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: EmailDialogLongclickEvent): Self = this.set("longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: EmailDialogLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: EmailDialogPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: EmailDialogPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: EmailDialogSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: EmailDialogSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: EmailDialogTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: EmailDialogTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: EmailDialogTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: EmailDialogTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: EmailDialogTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
}
