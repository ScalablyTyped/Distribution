package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextAreaEventMap extends ProxyEventMap {
  
  var blur: TextAreaBlurEvent = js.native
  
  var change: TextAreaChangeEvent = js.native
  
  var click: TextAreaClickEvent = js.native
  
  var dblclick: TextAreaDblclickEvent = js.native
  
  var doubletap: TextAreaDoubletapEvent = js.native
  
  var focus: TextAreaFocusEvent = js.native
  
  var keypressed: TextAreaKeypressedEvent = js.native
  
  var link: TextAreaLinkEvent = js.native
  
  var longclick: TextAreaLongclickEvent = js.native
  
  var longpress: TextAreaLongpressEvent = js.native
  
  var pinch: TextAreaPinchEvent = js.native
  
  var postlayout: TextAreaPostlayoutEvent = js.native
  
  var `return`: TextAreaReturnEvent = js.native
  
  var selected: TextAreaSelectedEvent = js.native
  
  var singletap: TextAreaSingletapEvent = js.native
  
  var swipe: TextAreaSwipeEvent = js.native
  
  var touchcancel: TextAreaTouchcancelEvent = js.native
  
  var touchend: TextAreaTouchendEvent = js.native
  
  var touchmove: TextAreaTouchmoveEvent = js.native
  
  var touchstart: TextAreaTouchstartEvent = js.native
  
  var twofingertap: TextAreaTwofingertapEvent = js.native
}
object TextAreaEventMap {
  
  @scala.inline
  def apply(
    blur: TextAreaBlurEvent,
    change: TextAreaChangeEvent,
    click: TextAreaClickEvent,
    dblclick: TextAreaDblclickEvent,
    doubletap: TextAreaDoubletapEvent,
    focus: TextAreaFocusEvent,
    keypressed: TextAreaKeypressedEvent,
    link: TextAreaLinkEvent,
    longclick: TextAreaLongclickEvent,
    longpress: TextAreaLongpressEvent,
    pinch: TextAreaPinchEvent,
    postlayout: TextAreaPostlayoutEvent,
    `return`: TextAreaReturnEvent,
    selected: TextAreaSelectedEvent,
    singletap: TextAreaSingletapEvent,
    swipe: TextAreaSwipeEvent,
    touchcancel: TextAreaTouchcancelEvent,
    touchend: TextAreaTouchendEvent,
    touchmove: TextAreaTouchmoveEvent,
    touchstart: TextAreaTouchstartEvent,
    twofingertap: TextAreaTwofingertapEvent
  ): TextAreaEventMap = {
    val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAreaEventMap]
  }
  
  @scala.inline
  implicit class TextAreaEventMapOps[Self <: TextAreaEventMap] (val x: Self) extends AnyVal {
    
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
    def setBlur(value: TextAreaBlurEvent): Self = this.set("blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChange(value: TextAreaChangeEvent): Self = this.set("change", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClick(value: TextAreaClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: TextAreaDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: TextAreaDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: TextAreaFocusEvent): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: TextAreaKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: TextAreaLinkEvent): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: TextAreaLongclickEvent): Self = this.set("longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: TextAreaLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: TextAreaPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: TextAreaPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn(value: TextAreaReturnEvent): Self = this.set("return", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: TextAreaSelectedEvent): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: TextAreaSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: TextAreaSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: TextAreaTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: TextAreaTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: TextAreaTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: TextAreaTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: TextAreaTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
}
