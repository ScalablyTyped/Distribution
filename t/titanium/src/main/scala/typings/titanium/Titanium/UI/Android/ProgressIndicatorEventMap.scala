package typings.titanium.Titanium.UI.Android

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressIndicatorEventMap extends ProxyEventMap {
  
  var cancel: ProgressIndicatorCancelEvent = js.native
  
  var click: ProgressIndicatorClickEvent = js.native
  
  var dblclick: ProgressIndicatorDblclickEvent = js.native
  
  var doubletap: ProgressIndicatorDoubletapEvent = js.native
  
  var focus: ProgressIndicatorFocusEvent = js.native
  
  var keypressed: ProgressIndicatorKeypressedEvent = js.native
  
  var longclick: ProgressIndicatorLongclickEvent = js.native
  
  var longpress: ProgressIndicatorLongpressEvent = js.native
  
  var pinch: ProgressIndicatorPinchEvent = js.native
  
  var postlayout: ProgressIndicatorPostlayoutEvent = js.native
  
  var singletap: ProgressIndicatorSingletapEvent = js.native
  
  var swipe: ProgressIndicatorSwipeEvent = js.native
  
  var touchcancel: ProgressIndicatorTouchcancelEvent = js.native
  
  var touchend: ProgressIndicatorTouchendEvent = js.native
  
  var touchmove: ProgressIndicatorTouchmoveEvent = js.native
  
  var touchstart: ProgressIndicatorTouchstartEvent = js.native
  
  var twofingertap: ProgressIndicatorTwofingertapEvent = js.native
}
object ProgressIndicatorEventMap {
  
  @scala.inline
  def apply(
    cancel: ProgressIndicatorCancelEvent,
    click: ProgressIndicatorClickEvent,
    dblclick: ProgressIndicatorDblclickEvent,
    doubletap: ProgressIndicatorDoubletapEvent,
    focus: ProgressIndicatorFocusEvent,
    keypressed: ProgressIndicatorKeypressedEvent,
    longclick: ProgressIndicatorLongclickEvent,
    longpress: ProgressIndicatorLongpressEvent,
    pinch: ProgressIndicatorPinchEvent,
    postlayout: ProgressIndicatorPostlayoutEvent,
    singletap: ProgressIndicatorSingletapEvent,
    swipe: ProgressIndicatorSwipeEvent,
    touchcancel: ProgressIndicatorTouchcancelEvent,
    touchend: ProgressIndicatorTouchendEvent,
    touchmove: ProgressIndicatorTouchmoveEvent,
    touchstart: ProgressIndicatorTouchstartEvent,
    twofingertap: ProgressIndicatorTwofingertapEvent
  ): ProgressIndicatorEventMap = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressIndicatorEventMap]
  }
  
  @scala.inline
  implicit class ProgressIndicatorEventMapOps[Self <: ProgressIndicatorEventMap] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: ProgressIndicatorCancelEvent): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClick(value: ProgressIndicatorClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: ProgressIndicatorDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: ProgressIndicatorDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: ProgressIndicatorFocusEvent): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: ProgressIndicatorKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: ProgressIndicatorLongclickEvent): Self = this.set("longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: ProgressIndicatorLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: ProgressIndicatorPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: ProgressIndicatorPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: ProgressIndicatorSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: ProgressIndicatorSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: ProgressIndicatorTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: ProgressIndicatorTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: ProgressIndicatorTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: ProgressIndicatorTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: ProgressIndicatorTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
}
