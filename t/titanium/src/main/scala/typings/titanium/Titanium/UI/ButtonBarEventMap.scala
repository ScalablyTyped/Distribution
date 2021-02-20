package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
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
  implicit class ButtonBarEventMapMutableBuilder[Self <: ButtonBarEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: ButtonBarClickEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: ButtonBarDblclickEvent): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: ButtonBarDoubletapEvent): Self = StObject.set(x, "doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: ButtonBarKeypressedEvent): Self = StObject.set(x, "keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: ButtonBarLongpressEvent): Self = StObject.set(x, "longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: ButtonBarPinchEvent): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: ButtonBarPostlayoutEvent): Self = StObject.set(x, "postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: ButtonBarSingletapEvent): Self = StObject.set(x, "singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: ButtonBarSwipeEvent): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: ButtonBarTouchcancelEvent): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: ButtonBarTouchendEvent): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: ButtonBarTouchmoveEvent): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: ButtonBarTouchstartEvent): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: ButtonBarTwofingertapEvent): Self = StObject.set(x, "twofingertap", value.asInstanceOf[js.Any])
  }
}
