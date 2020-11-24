package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonBarEventMap extends ProxyEventMap {
  
  var click: ButtonBarClickEvent = js.native
  
  var dblclick: ButtonBarDblclickEvent = js.native
  
  var doubletap: ButtonBarDoubletapEvent = js.native
  
  var keypressed: ButtonBarKeypressedEvent = js.native
  
  var longpress: ButtonBarLongpressEvent = js.native
  
  var pinch: ButtonBarPinchEvent = js.native
  
  var postlayout: ButtonBarPostlayoutEvent = js.native
  
  var singletap: ButtonBarSingletapEvent = js.native
  
  var swipe: ButtonBarSwipeEvent = js.native
  
  var touchcancel: ButtonBarTouchcancelEvent = js.native
  
  var touchend: ButtonBarTouchendEvent = js.native
  
  var touchmove: ButtonBarTouchmoveEvent = js.native
  
  var touchstart: ButtonBarTouchstartEvent = js.native
  
  var twofingertap: ButtonBarTwofingertapEvent = js.native
}
object ButtonBarEventMap {
  
  @scala.inline
  def apply(
    click: ButtonBarClickEvent,
    dblclick: ButtonBarDblclickEvent,
    doubletap: ButtonBarDoubletapEvent,
    keypressed: ButtonBarKeypressedEvent,
    longpress: ButtonBarLongpressEvent,
    pinch: ButtonBarPinchEvent,
    postlayout: ButtonBarPostlayoutEvent,
    singletap: ButtonBarSingletapEvent,
    swipe: ButtonBarSwipeEvent,
    touchcancel: ButtonBarTouchcancelEvent,
    touchend: ButtonBarTouchendEvent,
    touchmove: ButtonBarTouchmoveEvent,
    touchstart: ButtonBarTouchstartEvent,
    twofingertap: ButtonBarTwofingertapEvent
  ): ButtonBarEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonBarEventMap]
  }
  
  @scala.inline
  implicit class ButtonBarEventMapOps[Self <: ButtonBarEventMap] (val x: Self) extends AnyVal {
    
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
    def setClick(value: ButtonBarClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: ButtonBarDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: ButtonBarDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: ButtonBarKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: ButtonBarLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: ButtonBarPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: ButtonBarPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: ButtonBarSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: ButtonBarSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: ButtonBarTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: ButtonBarTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: ButtonBarTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: ButtonBarTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: ButtonBarTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
}
