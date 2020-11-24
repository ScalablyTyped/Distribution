package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
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
  implicit class ScrollViewEventMapOps[Self <: ScrollViewEventMap] (val x: Self) extends AnyVal {
    
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
    def setClick(value: ScrollViewClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: ScrollViewDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: ScrollViewDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragEnd(value: ScrollView_DragEndEvent): Self = this.set("dragEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragStart(value: ScrollView_DragStartEvent): Self = this.set("dragStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: ScrollViewFocusEvent): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: ScrollViewKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: ScrollViewLongclickEvent): Self = this.set("longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: ScrollViewLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: ScrollViewPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: ScrollViewPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: ScrollViewScaleEvent): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScroll(value: ScrollViewScrollEvent): Self = this.set("scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: ScrollViewSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: ScrollViewSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: ScrollViewTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: ScrollViewTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: ScrollViewTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: ScrollViewTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: ScrollViewTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
}
