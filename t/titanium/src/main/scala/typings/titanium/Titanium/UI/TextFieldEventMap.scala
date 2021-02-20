package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
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
  implicit class TextFieldEventMapMutableBuilder[Self <: TextFieldEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlur(value: TextFieldBlurEvent): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChange(value: TextFieldChangeEvent): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClick(value: TextFieldClickEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: TextFieldDblclickEvent): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: TextFieldDoubletapEvent): Self = StObject.set(x, "doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: TextFieldFocusEvent): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: TextFieldKeypressedEvent): Self = StObject.set(x, "keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: TextFieldLongclickEvent): Self = StObject.set(x, "longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: TextFieldLongpressEvent): Self = StObject.set(x, "longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: TextFieldPinchEvent): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: TextFieldPostlayoutEvent): Self = StObject.set(x, "postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn(value: TextFieldReturnEvent): Self = StObject.set(x, "return", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: TextFieldSingletapEvent): Self = StObject.set(x, "singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: TextFieldSwipeEvent): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: TextFieldTouchcancelEvent): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: TextFieldTouchendEvent): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: TextFieldTouchmoveEvent): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: TextFieldTouchstartEvent): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: TextFieldTwofingertapEvent): Self = StObject.set(x, "twofingertap", value.asInstanceOf[js.Any])
  }
}
