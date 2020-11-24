package typings.titanium.Titanium.UI.Android

import typings.titanium.ProxyEventMap
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
  implicit class CardViewEventMapOps[Self <: CardViewEventMap] (val x: Self) extends AnyVal {
    
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
    def setClick(value: CardViewClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: CardViewDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: CardViewDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: CardViewFocusEvent): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: CardViewKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: CardViewLongclickEvent): Self = this.set("longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: CardViewLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: CardViewPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: CardViewPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: CardViewSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: CardViewSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: CardViewTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: CardViewTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: CardViewTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: CardViewTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: CardViewTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
}
