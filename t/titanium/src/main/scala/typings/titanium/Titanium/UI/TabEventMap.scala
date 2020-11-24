package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabEventMap extends ProxyEventMap {
  
  var click: TabClickEvent = js.native
  
  var dblclick: TabDblclickEvent = js.native
  
  var doubletap: TabDoubletapEvent = js.native
  
  var keypressed: TabKeypressedEvent = js.native
  
  var longclick: TabLongclickEvent = js.native
  
  var longpress: TabLongpressEvent = js.native
  
  var pinch: TabPinchEvent = js.native
  
  var postlayout: TabPostlayoutEvent = js.native
  
  var selected: TabSelectedEvent = js.native
  
  var singletap: TabSingletapEvent = js.native
  
  var swipe: TabSwipeEvent = js.native
  
  var touchcancel: TabTouchcancelEvent = js.native
  
  var touchend: TabTouchendEvent = js.native
  
  var touchmove: TabTouchmoveEvent = js.native
  
  var touchstart: TabTouchstartEvent = js.native
  
  var twofingertap: TabTwofingertapEvent = js.native
  
  var unselected: TabUnselectedEvent = js.native
}
object TabEventMap {
  
  @scala.inline
  def apply(
    click: TabClickEvent,
    dblclick: TabDblclickEvent,
    doubletap: TabDoubletapEvent,
    keypressed: TabKeypressedEvent,
    longclick: TabLongclickEvent,
    longpress: TabLongpressEvent,
    pinch: TabPinchEvent,
    postlayout: TabPostlayoutEvent,
    selected: TabSelectedEvent,
    singletap: TabSingletapEvent,
    swipe: TabSwipeEvent,
    touchcancel: TabTouchcancelEvent,
    touchend: TabTouchendEvent,
    touchmove: TabTouchmoveEvent,
    touchstart: TabTouchstartEvent,
    twofingertap: TabTwofingertapEvent,
    unselected: TabUnselectedEvent
  ): TabEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any], unselected = unselected.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabEventMap]
  }
  
  @scala.inline
  implicit class TabEventMapOps[Self <: TabEventMap] (val x: Self) extends AnyVal {
    
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
    def setClick(value: TabClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: TabDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: TabDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: TabKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: TabLongclickEvent): Self = this.set("longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: TabLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: TabPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: TabPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: TabSelectedEvent): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: TabSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: TabSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: TabTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: TabTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: TabTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: TabTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: TabTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnselected(value: TabUnselectedEvent): Self = this.set("unselected", value.asInstanceOf[js.Any])
  }
}
