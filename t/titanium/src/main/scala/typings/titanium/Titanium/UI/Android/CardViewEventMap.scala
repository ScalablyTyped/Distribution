package typings.titanium.Titanium.UI.Android

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardViewEventMap extends ProxyEventMap {
  
  var click: CardViewClickEvent = js.native
  
  var dblclick: CardViewDblclickEvent = js.native
  
  var doubletap: CardViewDoubletapEvent = js.native
  
  var focus: CardViewFocusEvent = js.native
  
  var keypressed: CardViewKeypressedEvent = js.native
  
  var longclick: CardViewLongclickEvent = js.native
  
  var longpress: CardViewLongpressEvent = js.native
  
  var pinch: CardViewPinchEvent = js.native
  
  var postlayout: CardViewPostlayoutEvent = js.native
  
  var singletap: CardViewSingletapEvent = js.native
  
  var swipe: CardViewSwipeEvent = js.native
  
  var touchcancel: CardViewTouchcancelEvent = js.native
  
  var touchend: CardViewTouchendEvent = js.native
  
  var touchmove: CardViewTouchmoveEvent = js.native
  
  var touchstart: CardViewTouchstartEvent = js.native
  
  var twofingertap: CardViewTwofingertapEvent = js.native
}
object CardViewEventMap {
  
  @scala.inline
  def apply(
    click: CardViewClickEvent,
    dblclick: CardViewDblclickEvent,
    doubletap: CardViewDoubletapEvent,
    focus: CardViewFocusEvent,
    keypressed: CardViewKeypressedEvent,
    longclick: CardViewLongclickEvent,
    longpress: CardViewLongpressEvent,
    pinch: CardViewPinchEvent,
    postlayout: CardViewPostlayoutEvent,
    singletap: CardViewSingletapEvent,
    swipe: CardViewSwipeEvent,
    touchcancel: CardViewTouchcancelEvent,
    touchend: CardViewTouchendEvent,
    touchmove: CardViewTouchmoveEvent,
    touchstart: CardViewTouchstartEvent,
    twofingertap: CardViewTwofingertapEvent
  ): CardViewEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardViewEventMap]
  }
  
  @scala.inline
  implicit class CardViewEventMapMutableBuilder[Self <: CardViewEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: CardViewClickEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: CardViewDblclickEvent): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: CardViewDoubletapEvent): Self = StObject.set(x, "doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: CardViewFocusEvent): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: CardViewKeypressedEvent): Self = StObject.set(x, "keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: CardViewLongclickEvent): Self = StObject.set(x, "longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: CardViewLongpressEvent): Self = StObject.set(x, "longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: CardViewPinchEvent): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: CardViewPostlayoutEvent): Self = StObject.set(x, "postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: CardViewSingletapEvent): Self = StObject.set(x, "singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: CardViewSwipeEvent): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: CardViewTouchcancelEvent): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: CardViewTouchendEvent): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: CardViewTouchmoveEvent): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: CardViewTouchstartEvent): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: CardViewTwofingertapEvent): Self = StObject.set(x, "twofingertap", value.asInstanceOf[js.Any])
  }
}
