package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabbedBarEventMap extends ProxyEventMap {
  
  var click: TabbedBarClickEvent = js.native
  
  var dblclick: TabbedBarDblclickEvent = js.native
  
  var doubletap: TabbedBarDoubletapEvent = js.native
  
  var focus: TabbedBarFocusEvent = js.native
  
  var keypressed: TabbedBarKeypressedEvent = js.native
  
  var longclick: TabbedBarLongclickEvent = js.native
  
  var longpress: TabbedBarLongpressEvent = js.native
  
  var pinch: TabbedBarPinchEvent = js.native
  
  var postlayout: TabbedBarPostlayoutEvent = js.native
  
  var singletap: TabbedBarSingletapEvent = js.native
  
  var swipe: TabbedBarSwipeEvent = js.native
  
  var touchcancel: TabbedBarTouchcancelEvent = js.native
  
  var touchend: TabbedBarTouchendEvent = js.native
  
  var touchmove: TabbedBarTouchmoveEvent = js.native
  
  var touchstart: TabbedBarTouchstartEvent = js.native
  
  var twofingertap: TabbedBarTwofingertapEvent = js.native
}
object TabbedBarEventMap {
  
  @scala.inline
  def apply(
    click: TabbedBarClickEvent,
    dblclick: TabbedBarDblclickEvent,
    doubletap: TabbedBarDoubletapEvent,
    focus: TabbedBarFocusEvent,
    keypressed: TabbedBarKeypressedEvent,
    longclick: TabbedBarLongclickEvent,
    longpress: TabbedBarLongpressEvent,
    pinch: TabbedBarPinchEvent,
    postlayout: TabbedBarPostlayoutEvent,
    singletap: TabbedBarSingletapEvent,
    swipe: TabbedBarSwipeEvent,
    touchcancel: TabbedBarTouchcancelEvent,
    touchend: TabbedBarTouchendEvent,
    touchmove: TabbedBarTouchmoveEvent,
    touchstart: TabbedBarTouchstartEvent,
    twofingertap: TabbedBarTwofingertapEvent
  ): TabbedBarEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabbedBarEventMap]
  }
  
  @scala.inline
  implicit class TabbedBarEventMapOps[Self <: TabbedBarEventMap] (val x: Self) extends AnyVal {
    
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
    def setClick(value: TabbedBarClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: TabbedBarDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: TabbedBarDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: TabbedBarFocusEvent): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: TabbedBarKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: TabbedBarLongclickEvent): Self = this.set("longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: TabbedBarLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: TabbedBarPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: TabbedBarPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: TabbedBarSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: TabbedBarSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: TabbedBarTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: TabbedBarTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: TabbedBarTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: TabbedBarTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: TabbedBarTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
}
