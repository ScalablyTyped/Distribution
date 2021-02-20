package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressBarEventMap extends ProxyEventMap {
  
  var click: ProgressBarClickEvent = js.native
  
  var dblclick: ProgressBarDblclickEvent = js.native
  
  var doubletap: ProgressBarDoubletapEvent = js.native
  
  var focus: ProgressBarFocusEvent = js.native
  
  var keypressed: ProgressBarKeypressedEvent = js.native
  
  var longclick: ProgressBarLongclickEvent = js.native
  
  var longpress: ProgressBarLongpressEvent = js.native
  
  var pinch: ProgressBarPinchEvent = js.native
  
  var postlayout: ProgressBarPostlayoutEvent = js.native
  
  var singletap: ProgressBarSingletapEvent = js.native
  
  var swipe: ProgressBarSwipeEvent = js.native
  
  var touchcancel: ProgressBarTouchcancelEvent = js.native
  
  var touchend: ProgressBarTouchendEvent = js.native
  
  var touchmove: ProgressBarTouchmoveEvent = js.native
  
  var touchstart: ProgressBarTouchstartEvent = js.native
  
  var twofingertap: ProgressBarTwofingertapEvent = js.native
}
object ProgressBarEventMap {
  
  @scala.inline
  def apply(
    click: ProgressBarClickEvent,
    dblclick: ProgressBarDblclickEvent,
    doubletap: ProgressBarDoubletapEvent,
    focus: ProgressBarFocusEvent,
    keypressed: ProgressBarKeypressedEvent,
    longclick: ProgressBarLongclickEvent,
    longpress: ProgressBarLongpressEvent,
    pinch: ProgressBarPinchEvent,
    postlayout: ProgressBarPostlayoutEvent,
    singletap: ProgressBarSingletapEvent,
    swipe: ProgressBarSwipeEvent,
    touchcancel: ProgressBarTouchcancelEvent,
    touchend: ProgressBarTouchendEvent,
    touchmove: ProgressBarTouchmoveEvent,
    touchstart: ProgressBarTouchstartEvent,
    twofingertap: ProgressBarTwofingertapEvent
  ): ProgressBarEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarEventMap]
  }
  
  @scala.inline
  implicit class ProgressBarEventMapMutableBuilder[Self <: ProgressBarEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: ProgressBarClickEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: ProgressBarDblclickEvent): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: ProgressBarDoubletapEvent): Self = StObject.set(x, "doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: ProgressBarFocusEvent): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: ProgressBarKeypressedEvent): Self = StObject.set(x, "keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: ProgressBarLongclickEvent): Self = StObject.set(x, "longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: ProgressBarLongpressEvent): Self = StObject.set(x, "longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: ProgressBarPinchEvent): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: ProgressBarPostlayoutEvent): Self = StObject.set(x, "postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: ProgressBarSingletapEvent): Self = StObject.set(x, "singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: ProgressBarSwipeEvent): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: ProgressBarTouchcancelEvent): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: ProgressBarTouchendEvent): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: ProgressBarTouchmoveEvent): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: ProgressBarTouchstartEvent): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: ProgressBarTwofingertapEvent): Self = StObject.set(x, "twofingertap", value.asInstanceOf[js.Any])
  }
}
