package typings.titanium.Titanium.UI.iOS

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoverFlowViewEventMap extends ProxyEventMap {
  
  var change: CoverFlowViewChangeEvent = js.native
  
  var click: CoverFlowViewClickEvent = js.native
  
  var dblclick: CoverFlowViewDblclickEvent = js.native
  
  var doubletap: CoverFlowViewDoubletapEvent = js.native
  
  var keypressed: CoverFlowViewKeypressedEvent = js.native
  
  var longpress: CoverFlowViewLongpressEvent = js.native
  
  var pinch: CoverFlowViewPinchEvent = js.native
  
  var postlayout: CoverFlowViewPostlayoutEvent = js.native
  
  var singletap: CoverFlowViewSingletapEvent = js.native
  
  var swipe: CoverFlowViewSwipeEvent = js.native
  
  var touchcancel: CoverFlowViewTouchcancelEvent = js.native
  
  var touchend: CoverFlowViewTouchendEvent = js.native
  
  var touchmove: CoverFlowViewTouchmoveEvent = js.native
  
  var touchstart: CoverFlowViewTouchstartEvent = js.native
  
  var twofingertap: CoverFlowViewTwofingertapEvent = js.native
}
object CoverFlowViewEventMap {
  
  @scala.inline
  def apply(
    change: CoverFlowViewChangeEvent,
    click: CoverFlowViewClickEvent,
    dblclick: CoverFlowViewDblclickEvent,
    doubletap: CoverFlowViewDoubletapEvent,
    keypressed: CoverFlowViewKeypressedEvent,
    longpress: CoverFlowViewLongpressEvent,
    pinch: CoverFlowViewPinchEvent,
    postlayout: CoverFlowViewPostlayoutEvent,
    singletap: CoverFlowViewSingletapEvent,
    swipe: CoverFlowViewSwipeEvent,
    touchcancel: CoverFlowViewTouchcancelEvent,
    touchend: CoverFlowViewTouchendEvent,
    touchmove: CoverFlowViewTouchmoveEvent,
    touchstart: CoverFlowViewTouchstartEvent,
    twofingertap: CoverFlowViewTwofingertapEvent
  ): CoverFlowViewEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverFlowViewEventMap]
  }
  
  @scala.inline
  implicit class CoverFlowViewEventMapMutableBuilder[Self <: CoverFlowViewEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: CoverFlowViewChangeEvent): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClick(value: CoverFlowViewClickEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: CoverFlowViewDblclickEvent): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: CoverFlowViewDoubletapEvent): Self = StObject.set(x, "doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: CoverFlowViewKeypressedEvent): Self = StObject.set(x, "keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: CoverFlowViewLongpressEvent): Self = StObject.set(x, "longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: CoverFlowViewPinchEvent): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: CoverFlowViewPostlayoutEvent): Self = StObject.set(x, "postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: CoverFlowViewSingletapEvent): Self = StObject.set(x, "singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: CoverFlowViewSwipeEvent): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: CoverFlowViewTouchcancelEvent): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: CoverFlowViewTouchendEvent): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: CoverFlowViewTouchmoveEvent): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: CoverFlowViewTouchstartEvent): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: CoverFlowViewTwofingertapEvent): Self = StObject.set(x, "twofingertap", value.asInstanceOf[js.Any])
  }
}
