package typings.titanium.Titanium.UI.Android

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchViewEventMap extends ProxyEventMap {
  
  var blur: SearchViewBlurEvent = js.native
  
  var cancel: SearchViewCancelEvent = js.native
  
  var change: SearchViewChangeEvent = js.native
  
  var click: SearchViewClickEvent = js.native
  
  var dblclick: SearchViewDblclickEvent = js.native
  
  var doubletap: SearchViewDoubletapEvent = js.native
  
  var focus: SearchViewFocusEvent = js.native
  
  var keypressed: SearchViewKeypressedEvent = js.native
  
  var longclick: SearchViewLongclickEvent = js.native
  
  var longpress: SearchViewLongpressEvent = js.native
  
  var pinch: SearchViewPinchEvent = js.native
  
  var postlayout: SearchViewPostlayoutEvent = js.native
  
  var singletap: SearchViewSingletapEvent = js.native
  
  var submit: SearchViewSubmitEvent = js.native
  
  var swipe: SearchViewSwipeEvent = js.native
  
  var touchcancel: SearchViewTouchcancelEvent = js.native
  
  var touchend: SearchViewTouchendEvent = js.native
  
  var touchmove: SearchViewTouchmoveEvent = js.native
  
  var touchstart: SearchViewTouchstartEvent = js.native
  
  var twofingertap: SearchViewTwofingertapEvent = js.native
}
object SearchViewEventMap {
  
  @scala.inline
  def apply(
    blur: SearchViewBlurEvent,
    cancel: SearchViewCancelEvent,
    change: SearchViewChangeEvent,
    click: SearchViewClickEvent,
    dblclick: SearchViewDblclickEvent,
    doubletap: SearchViewDoubletapEvent,
    focus: SearchViewFocusEvent,
    keypressed: SearchViewKeypressedEvent,
    longclick: SearchViewLongclickEvent,
    longpress: SearchViewLongpressEvent,
    pinch: SearchViewPinchEvent,
    postlayout: SearchViewPostlayoutEvent,
    singletap: SearchViewSingletapEvent,
    submit: SearchViewSubmitEvent,
    swipe: SearchViewSwipeEvent,
    touchcancel: SearchViewTouchcancelEvent,
    touchend: SearchViewTouchendEvent,
    touchmove: SearchViewTouchmoveEvent,
    touchstart: SearchViewTouchstartEvent,
    twofingertap: SearchViewTwofingertapEvent
  ): SearchViewEventMap = {
    val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchViewEventMap]
  }
  
  @scala.inline
  implicit class SearchViewEventMapOps[Self <: SearchViewEventMap] (val x: Self) extends AnyVal {
    
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
    def setBlur(value: SearchViewBlurEvent): Self = this.set("blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancel(value: SearchViewCancelEvent): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChange(value: SearchViewChangeEvent): Self = this.set("change", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClick(value: SearchViewClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: SearchViewDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: SearchViewDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: SearchViewFocusEvent): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: SearchViewKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: SearchViewLongclickEvent): Self = this.set("longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: SearchViewLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: SearchViewPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: SearchViewPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: SearchViewSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmit(value: SearchViewSubmitEvent): Self = this.set("submit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: SearchViewSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: SearchViewTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: SearchViewTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: SearchViewTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: SearchViewTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: SearchViewTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
}
