package typings.titanium.Titanium.UI.iOS

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
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
  implicit class BlurViewEventMapMutableBuilder[Self <: BlurViewEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: BlurViewClickEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: BlurViewDblclickEvent): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: BlurViewDoubletapEvent): Self = StObject.set(x, "doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: BlurViewKeypressedEvent): Self = StObject.set(x, "keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: BlurViewLongpressEvent): Self = StObject.set(x, "longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: BlurViewPinchEvent): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: BlurViewPostlayoutEvent): Self = StObject.set(x, "postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: BlurViewSingletapEvent): Self = StObject.set(x, "singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: BlurViewSwipeEvent): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: BlurViewTouchcancelEvent): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: BlurViewTouchendEvent): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: BlurViewTouchmoveEvent): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: BlurViewTouchstartEvent): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: BlurViewTwofingertapEvent): Self = StObject.set(x, "twofingertap", value.asInstanceOf[js.Any])
  }
}
