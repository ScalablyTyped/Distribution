package typings.titanium.Titanium.UI.iOS

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LivePhotoViewEventMap extends ProxyEventMap {
  
  var click: LivePhotoViewClickEvent = js.native
  
  var dblclick: LivePhotoViewDblclickEvent = js.native
  
  var doubletap: LivePhotoViewDoubletapEvent = js.native
  
  var keypressed: LivePhotoViewKeypressedEvent = js.native
  
  var longpress: LivePhotoViewLongpressEvent = js.native
  
  var pinch: LivePhotoViewPinchEvent = js.native
  
  var postlayout: LivePhotoViewPostlayoutEvent = js.native
  
  var singletap: LivePhotoViewSingletapEvent = js.native
  
  var start: LivePhotoViewStartEvent = js.native
  
  var stop: LivePhotoViewStopEvent = js.native
  
  var swipe: LivePhotoViewSwipeEvent = js.native
  
  var touchcancel: LivePhotoViewTouchcancelEvent = js.native
  
  var touchend: LivePhotoViewTouchendEvent = js.native
  
  var touchmove: LivePhotoViewTouchmoveEvent = js.native
  
  var touchstart: LivePhotoViewTouchstartEvent = js.native
  
  var twofingertap: LivePhotoViewTwofingertapEvent = js.native
}
object LivePhotoViewEventMap {
  
  @scala.inline
  def apply(
    click: LivePhotoViewClickEvent,
    dblclick: LivePhotoViewDblclickEvent,
    doubletap: LivePhotoViewDoubletapEvent,
    keypressed: LivePhotoViewKeypressedEvent,
    longpress: LivePhotoViewLongpressEvent,
    pinch: LivePhotoViewPinchEvent,
    postlayout: LivePhotoViewPostlayoutEvent,
    singletap: LivePhotoViewSingletapEvent,
    start: LivePhotoViewStartEvent,
    stop: LivePhotoViewStopEvent,
    swipe: LivePhotoViewSwipeEvent,
    touchcancel: LivePhotoViewTouchcancelEvent,
    touchend: LivePhotoViewTouchendEvent,
    touchmove: LivePhotoViewTouchmoveEvent,
    touchstart: LivePhotoViewTouchstartEvent,
    twofingertap: LivePhotoViewTwofingertapEvent
  ): LivePhotoViewEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[LivePhotoViewEventMap]
  }
  
  @scala.inline
  implicit class LivePhotoViewEventMapMutableBuilder[Self <: LivePhotoViewEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: LivePhotoViewClickEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: LivePhotoViewDblclickEvent): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: LivePhotoViewDoubletapEvent): Self = StObject.set(x, "doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: LivePhotoViewKeypressedEvent): Self = StObject.set(x, "keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: LivePhotoViewLongpressEvent): Self = StObject.set(x, "longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: LivePhotoViewPinchEvent): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: LivePhotoViewPostlayoutEvent): Self = StObject.set(x, "postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: LivePhotoViewSingletapEvent): Self = StObject.set(x, "singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: LivePhotoViewStartEvent): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStop(value: LivePhotoViewStopEvent): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: LivePhotoViewSwipeEvent): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: LivePhotoViewTouchcancelEvent): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: LivePhotoViewTouchendEvent): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: LivePhotoViewTouchmoveEvent): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: LivePhotoViewTouchstartEvent): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: LivePhotoViewTwofingertapEvent): Self = StObject.set(x, "twofingertap", value.asInstanceOf[js.Any])
  }
}
