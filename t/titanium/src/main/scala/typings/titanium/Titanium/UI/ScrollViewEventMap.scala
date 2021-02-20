package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollViewEventMap extends ProxyEventMap {
  
  var click: ScrollViewClickEvent = js.native
  
  var dblclick: ScrollViewDblclickEvent = js.native
  
  var doubletap: ScrollViewDoubletapEvent = js.native
  
  var dragEnd: ScrollView_DragEndEvent = js.native
  
  var dragStart: ScrollView_DragStartEvent = js.native
  
  var dragend: ScrollViewDragendEvent = js.native
  
  var dragstart: ScrollViewDragstartEvent = js.native
  
  var focus: ScrollViewFocusEvent = js.native
  
  var keypressed: ScrollViewKeypressedEvent = js.native
  
  var longclick: ScrollViewLongclickEvent = js.native
  
  var longpress: ScrollViewLongpressEvent = js.native
  
  var pinch: ScrollViewPinchEvent = js.native
  
  var postlayout: ScrollViewPostlayoutEvent = js.native
  
  var scale: ScrollViewScaleEvent = js.native
  
  var scroll: ScrollViewScrollEvent = js.native
  
  var singletap: ScrollViewSingletapEvent = js.native
  
  var swipe: ScrollViewSwipeEvent = js.native
  
  var touchcancel: ScrollViewTouchcancelEvent = js.native
  
  var touchend: ScrollViewTouchendEvent = js.native
  
  var touchmove: ScrollViewTouchmoveEvent = js.native
  
  var touchstart: ScrollViewTouchstartEvent = js.native
  
  var twofingertap: ScrollViewTwofingertapEvent = js.native
}
object ScrollViewEventMap {
  
  @scala.inline
  def apply(
    click: ScrollViewClickEvent,
    dblclick: ScrollViewDblclickEvent,
    doubletap: ScrollViewDoubletapEvent,
    dragEnd: ScrollView_DragEndEvent,
    dragStart: ScrollView_DragStartEvent,
    dragend: ScrollViewDragendEvent,
    dragstart: ScrollViewDragstartEvent,
    focus: ScrollViewFocusEvent,
    keypressed: ScrollViewKeypressedEvent,
    longclick: ScrollViewLongclickEvent,
    longpress: ScrollViewLongpressEvent,
    pinch: ScrollViewPinchEvent,
    postlayout: ScrollViewPostlayoutEvent,
    scale: ScrollViewScaleEvent,
    scroll: ScrollViewScrollEvent,
    singletap: ScrollViewSingletapEvent,
    swipe: ScrollViewSwipeEvent,
    touchcancel: ScrollViewTouchcancelEvent,
    touchend: ScrollViewTouchendEvent,
    touchmove: ScrollViewTouchmoveEvent,
    touchstart: ScrollViewTouchstartEvent,
    twofingertap: ScrollViewTwofingertapEvent
  ): ScrollViewEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], dragEnd = dragEnd.asInstanceOf[js.Any], dragStart = dragStart.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollViewEventMap]
  }
  
  @scala.inline
  implicit class ScrollViewEventMapMutableBuilder[Self <: ScrollViewEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: ScrollViewClickEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: ScrollViewDblclickEvent): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: ScrollViewDoubletapEvent): Self = StObject.set(x, "doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragEnd(value: ScrollView_DragEndEvent): Self = StObject.set(x, "dragEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragStart(value: ScrollView_DragStartEvent): Self = StObject.set(x, "dragStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: ScrollViewFocusEvent): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: ScrollViewKeypressedEvent): Self = StObject.set(x, "keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: ScrollViewLongclickEvent): Self = StObject.set(x, "longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: ScrollViewLongpressEvent): Self = StObject.set(x, "longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: ScrollViewPinchEvent): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: ScrollViewPostlayoutEvent): Self = StObject.set(x, "postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: ScrollViewScaleEvent): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScroll(value: ScrollViewScrollEvent): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: ScrollViewSingletapEvent): Self = StObject.set(x, "singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: ScrollViewSwipeEvent): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: ScrollViewTouchcancelEvent): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: ScrollViewTouchendEvent): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: ScrollViewTouchmoveEvent): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: ScrollViewTouchstartEvent): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: ScrollViewTwofingertapEvent): Self = StObject.set(x, "twofingertap", value.asInstanceOf[js.Any])
  }
}
