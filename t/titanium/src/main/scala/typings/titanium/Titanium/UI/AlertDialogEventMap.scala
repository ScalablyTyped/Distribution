package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlertDialogEventMap extends ProxyEventMap {
  
  var click: AlertDialogClickEvent = js.native
  
  var dblclick: AlertDialogDblclickEvent = js.native
  
  var doubletap: AlertDialogDoubletapEvent = js.native
  
  var focus: AlertDialogFocusEvent = js.native
  
  var keypressed: AlertDialogKeypressedEvent = js.native
  
  var longclick: AlertDialogLongclickEvent = js.native
  
  var longpress: AlertDialogLongpressEvent = js.native
  
  var pinch: AlertDialogPinchEvent = js.native
  
  var postlayout: AlertDialogPostlayoutEvent = js.native
  
  var singletap: AlertDialogSingletapEvent = js.native
  
  var swipe: AlertDialogSwipeEvent = js.native
  
  var touchcancel: AlertDialogTouchcancelEvent = js.native
  
  var touchend: AlertDialogTouchendEvent = js.native
  
  var touchmove: AlertDialogTouchmoveEvent = js.native
  
  var touchstart: AlertDialogTouchstartEvent = js.native
  
  var twofingertap: AlertDialogTwofingertapEvent = js.native
}
object AlertDialogEventMap {
  
  @scala.inline
  def apply(
    click: AlertDialogClickEvent,
    dblclick: AlertDialogDblclickEvent,
    doubletap: AlertDialogDoubletapEvent,
    focus: AlertDialogFocusEvent,
    keypressed: AlertDialogKeypressedEvent,
    longclick: AlertDialogLongclickEvent,
    longpress: AlertDialogLongpressEvent,
    pinch: AlertDialogPinchEvent,
    postlayout: AlertDialogPostlayoutEvent,
    singletap: AlertDialogSingletapEvent,
    swipe: AlertDialogSwipeEvent,
    touchcancel: AlertDialogTouchcancelEvent,
    touchend: AlertDialogTouchendEvent,
    touchmove: AlertDialogTouchmoveEvent,
    touchstart: AlertDialogTouchstartEvent,
    twofingertap: AlertDialogTwofingertapEvent
  ): AlertDialogEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertDialogEventMap]
  }
  
  @scala.inline
  implicit class AlertDialogEventMapOps[Self <: AlertDialogEventMap] (val x: Self) extends AnyVal {
    
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
    def setClick(value: AlertDialogClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: AlertDialogDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: AlertDialogDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: AlertDialogFocusEvent): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: AlertDialogKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: AlertDialogLongclickEvent): Self = this.set("longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: AlertDialogLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: AlertDialogPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: AlertDialogPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: AlertDialogSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: AlertDialogSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: AlertDialogTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: AlertDialogTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: AlertDialogTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: AlertDialogTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: AlertDialogTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
}
