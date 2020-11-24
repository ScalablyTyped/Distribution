package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextFieldEventMap extends ProxyEventMap {
  
  var blur: TextFieldBlurEvent = js.native
  
  var change: TextFieldChangeEvent = js.native
  
  var click: TextFieldClickEvent = js.native
  
  var dblclick: TextFieldDblclickEvent = js.native
  
  var doubletap: TextFieldDoubletapEvent = js.native
  
  var focus: TextFieldFocusEvent = js.native
  
  var keypressed: TextFieldKeypressedEvent = js.native
  
  var longclick: TextFieldLongclickEvent = js.native
  
  var longpress: TextFieldLongpressEvent = js.native
  
  var pinch: TextFieldPinchEvent = js.native
  
  var postlayout: TextFieldPostlayoutEvent = js.native
  
  var `return`: TextFieldReturnEvent = js.native
  
  var singletap: TextFieldSingletapEvent = js.native
  
  var swipe: TextFieldSwipeEvent = js.native
  
  var touchcancel: TextFieldTouchcancelEvent = js.native
  
  var touchend: TextFieldTouchendEvent = js.native
  
  var touchmove: TextFieldTouchmoveEvent = js.native
  
  var touchstart: TextFieldTouchstartEvent = js.native
  
  var twofingertap: TextFieldTwofingertapEvent = js.native
}
object TextFieldEventMap {
  
  @scala.inline
  def apply(
    blur: TextFieldBlurEvent,
    change: TextFieldChangeEvent,
    click: TextFieldClickEvent,
    dblclick: TextFieldDblclickEvent,
    doubletap: TextFieldDoubletapEvent,
    focus: TextFieldFocusEvent,
    keypressed: TextFieldKeypressedEvent,
    longclick: TextFieldLongclickEvent,
    longpress: TextFieldLongpressEvent,
    pinch: TextFieldPinchEvent,
    postlayout: TextFieldPostlayoutEvent,
    `return`: TextFieldReturnEvent,
    singletap: TextFieldSingletapEvent,
    swipe: TextFieldSwipeEvent,
    touchcancel: TextFieldTouchcancelEvent,
    touchend: TextFieldTouchendEvent,
    touchmove: TextFieldTouchmoveEvent,
    touchstart: TextFieldTouchstartEvent,
    twofingertap: TextFieldTwofingertapEvent
  ): TextFieldEventMap = {
    val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFieldEventMap]
  }
  
  @scala.inline
  implicit class TextFieldEventMapOps[Self <: TextFieldEventMap] (val x: Self) extends AnyVal {
    
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
    def setBlur(value: TextFieldBlurEvent): Self = this.set("blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChange(value: TextFieldChangeEvent): Self = this.set("change", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClick(value: TextFieldClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: TextFieldDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: TextFieldDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: TextFieldFocusEvent): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: TextFieldKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: TextFieldLongclickEvent): Self = this.set("longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: TextFieldLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: TextFieldPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: TextFieldPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn(value: TextFieldReturnEvent): Self = this.set("return", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: TextFieldSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: TextFieldSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: TextFieldTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: TextFieldTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: TextFieldTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: TextFieldTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: TextFieldTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
}
