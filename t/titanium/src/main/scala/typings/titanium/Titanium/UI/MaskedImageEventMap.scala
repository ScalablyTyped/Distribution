package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaskedImageEventMap extends ProxyEventMap {
  
  var click: MaskedImageClickEvent = js.native
  
  var dblclick: MaskedImageDblclickEvent = js.native
  
  var doubletap: MaskedImageDoubletapEvent = js.native
  
  var focus: MaskedImageFocusEvent = js.native
  
  var keypressed: MaskedImageKeypressedEvent = js.native
  
  var longclick: MaskedImageLongclickEvent = js.native
  
  var longpress: MaskedImageLongpressEvent = js.native
  
  var pinch: MaskedImagePinchEvent = js.native
  
  var postlayout: MaskedImagePostlayoutEvent = js.native
  
  var singletap: MaskedImageSingletapEvent = js.native
  
  var swipe: MaskedImageSwipeEvent = js.native
  
  var touchcancel: MaskedImageTouchcancelEvent = js.native
  
  var touchend: MaskedImageTouchendEvent = js.native
  
  var touchmove: MaskedImageTouchmoveEvent = js.native
  
  var touchstart: MaskedImageTouchstartEvent = js.native
  
  var twofingertap: MaskedImageTwofingertapEvent = js.native
}
object MaskedImageEventMap {
  
  @scala.inline
  def apply(
    click: MaskedImageClickEvent,
    dblclick: MaskedImageDblclickEvent,
    doubletap: MaskedImageDoubletapEvent,
    focus: MaskedImageFocusEvent,
    keypressed: MaskedImageKeypressedEvent,
    longclick: MaskedImageLongclickEvent,
    longpress: MaskedImageLongpressEvent,
    pinch: MaskedImagePinchEvent,
    postlayout: MaskedImagePostlayoutEvent,
    singletap: MaskedImageSingletapEvent,
    swipe: MaskedImageSwipeEvent,
    touchcancel: MaskedImageTouchcancelEvent,
    touchend: MaskedImageTouchendEvent,
    touchmove: MaskedImageTouchmoveEvent,
    touchstart: MaskedImageTouchstartEvent,
    twofingertap: MaskedImageTwofingertapEvent
  ): MaskedImageEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskedImageEventMap]
  }
  
  @scala.inline
  implicit class MaskedImageEventMapOps[Self <: MaskedImageEventMap] (val x: Self) extends AnyVal {
    
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
    def setClick(value: MaskedImageClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: MaskedImageDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: MaskedImageDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: MaskedImageFocusEvent): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: MaskedImageKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: MaskedImageLongclickEvent): Self = this.set("longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: MaskedImageLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: MaskedImagePinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: MaskedImagePostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: MaskedImageSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: MaskedImageSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: MaskedImageTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: MaskedImageTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: MaskedImageTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: MaskedImageTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: MaskedImageTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
}
