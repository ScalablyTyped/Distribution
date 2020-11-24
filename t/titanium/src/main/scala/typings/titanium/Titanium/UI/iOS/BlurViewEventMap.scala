package typings.titanium.Titanium.UI.iOS

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlurViewEventMap extends ProxyEventMap {
  
  var click: BlurViewClickEvent = js.native
  
  var dblclick: BlurViewDblclickEvent = js.native
  
  var doubletap: BlurViewDoubletapEvent = js.native
  
  var keypressed: BlurViewKeypressedEvent = js.native
  
  var longpress: BlurViewLongpressEvent = js.native
  
  var pinch: BlurViewPinchEvent = js.native
  
  var postlayout: BlurViewPostlayoutEvent = js.native
  
  var singletap: BlurViewSingletapEvent = js.native
  
  var swipe: BlurViewSwipeEvent = js.native
  
  var touchcancel: BlurViewTouchcancelEvent = js.native
  
  var touchend: BlurViewTouchendEvent = js.native
  
  var touchmove: BlurViewTouchmoveEvent = js.native
  
  var touchstart: BlurViewTouchstartEvent = js.native
  
  var twofingertap: BlurViewTwofingertapEvent = js.native
}
object BlurViewEventMap {
  
  @scala.inline
  def apply(
    click: BlurViewClickEvent,
    dblclick: BlurViewDblclickEvent,
    doubletap: BlurViewDoubletapEvent,
    keypressed: BlurViewKeypressedEvent,
    longpress: BlurViewLongpressEvent,
    pinch: BlurViewPinchEvent,
    postlayout: BlurViewPostlayoutEvent,
    singletap: BlurViewSingletapEvent,
    swipe: BlurViewSwipeEvent,
    touchcancel: BlurViewTouchcancelEvent,
    touchend: BlurViewTouchendEvent,
    touchmove: BlurViewTouchmoveEvent,
    touchstart: BlurViewTouchstartEvent,
    twofingertap: BlurViewTwofingertapEvent
  ): BlurViewEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlurViewEventMap]
  }
  
  @scala.inline
  implicit class BlurViewEventMapOps[Self <: BlurViewEventMap] (val x: Self) extends AnyVal {
    
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
    def setClick(value: BlurViewClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: BlurViewDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: BlurViewDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: BlurViewKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: BlurViewLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: BlurViewPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: BlurViewPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: BlurViewSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: BlurViewSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: BlurViewTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: BlurViewTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: BlurViewTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: BlurViewTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: BlurViewTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
}
