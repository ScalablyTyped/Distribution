package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionDialogEventMap extends ProxyEventMap {
  
  var click: OptionDialogClickEvent = js.native
  
  var dblclick: OptionDialogDblclickEvent = js.native
  
  var doubletap: OptionDialogDoubletapEvent = js.native
  
  var focus: OptionDialogFocusEvent = js.native
  
  var keypressed: OptionDialogKeypressedEvent = js.native
  
  var longclick: OptionDialogLongclickEvent = js.native
  
  var longpress: OptionDialogLongpressEvent = js.native
  
  var pinch: OptionDialogPinchEvent = js.native
  
  var postlayout: OptionDialogPostlayoutEvent = js.native
  
  var singletap: OptionDialogSingletapEvent = js.native
  
  var swipe: OptionDialogSwipeEvent = js.native
  
  var touchcancel: OptionDialogTouchcancelEvent = js.native
  
  var touchend: OptionDialogTouchendEvent = js.native
  
  var touchmove: OptionDialogTouchmoveEvent = js.native
  
  var touchstart: OptionDialogTouchstartEvent = js.native
  
  var twofingertap: OptionDialogTwofingertapEvent = js.native
}
object OptionDialogEventMap {
  
  @scala.inline
  def apply(
    click: OptionDialogClickEvent,
    dblclick: OptionDialogDblclickEvent,
    doubletap: OptionDialogDoubletapEvent,
    focus: OptionDialogFocusEvent,
    keypressed: OptionDialogKeypressedEvent,
    longclick: OptionDialogLongclickEvent,
    longpress: OptionDialogLongpressEvent,
    pinch: OptionDialogPinchEvent,
    postlayout: OptionDialogPostlayoutEvent,
    singletap: OptionDialogSingletapEvent,
    swipe: OptionDialogSwipeEvent,
    touchcancel: OptionDialogTouchcancelEvent,
    touchend: OptionDialogTouchendEvent,
    touchmove: OptionDialogTouchmoveEvent,
    touchstart: OptionDialogTouchstartEvent,
    twofingertap: OptionDialogTwofingertapEvent
  ): OptionDialogEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionDialogEventMap]
  }
  
  @scala.inline
  implicit class OptionDialogEventMapMutableBuilder[Self <: OptionDialogEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: OptionDialogClickEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: OptionDialogDblclickEvent): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: OptionDialogDoubletapEvent): Self = StObject.set(x, "doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: OptionDialogFocusEvent): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: OptionDialogKeypressedEvent): Self = StObject.set(x, "keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: OptionDialogLongclickEvent): Self = StObject.set(x, "longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: OptionDialogLongpressEvent): Self = StObject.set(x, "longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: OptionDialogPinchEvent): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: OptionDialogPostlayoutEvent): Self = StObject.set(x, "postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: OptionDialogSingletapEvent): Self = StObject.set(x, "singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: OptionDialogSwipeEvent): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: OptionDialogTouchcancelEvent): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: OptionDialogTouchendEvent): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: OptionDialogTouchmoveEvent): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: OptionDialogTouchstartEvent): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: OptionDialogTwofingertapEvent): Self = StObject.set(x, "twofingertap", value.asInstanceOf[js.Any])
  }
}
