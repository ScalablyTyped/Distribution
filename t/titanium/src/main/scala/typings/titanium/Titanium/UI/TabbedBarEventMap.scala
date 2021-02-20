package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
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
  implicit class TabbedBarEventMapMutableBuilder[Self <: TabbedBarEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: TabbedBarClickEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: TabbedBarDblclickEvent): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: TabbedBarDoubletapEvent): Self = StObject.set(x, "doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: TabbedBarFocusEvent): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: TabbedBarKeypressedEvent): Self = StObject.set(x, "keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: TabbedBarLongclickEvent): Self = StObject.set(x, "longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: TabbedBarLongpressEvent): Self = StObject.set(x, "longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: TabbedBarPinchEvent): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: TabbedBarPostlayoutEvent): Self = StObject.set(x, "postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: TabbedBarSingletapEvent): Self = StObject.set(x, "singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: TabbedBarSwipeEvent): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: TabbedBarTouchcancelEvent): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: TabbedBarTouchendEvent): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: TabbedBarTouchmoveEvent): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: TabbedBarTouchstartEvent): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: TabbedBarTwofingertapEvent): Self = StObject.set(x, "twofingertap", value.asInstanceOf[js.Any])
  }
}
