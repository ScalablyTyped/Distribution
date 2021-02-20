package typings.titanium.Titanium.UI.Android

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressIndicatorEventMap extends ProxyEventMap {
  
  var cancel: ProgressIndicatorCancelEvent = js.native
  
  var click: ProgressIndicatorClickEvent = js.native
  
  var dblclick: ProgressIndicatorDblclickEvent = js.native
  
  var doubletap: ProgressIndicatorDoubletapEvent = js.native
  
  var focus: ProgressIndicatorFocusEvent = js.native
  
  var keypressed: ProgressIndicatorKeypressedEvent = js.native
  
  var longclick: ProgressIndicatorLongclickEvent = js.native
  
  var longpress: ProgressIndicatorLongpressEvent = js.native
  
  var pinch: ProgressIndicatorPinchEvent = js.native
  
  var postlayout: ProgressIndicatorPostlayoutEvent = js.native
  
  var singletap: ProgressIndicatorSingletapEvent = js.native
  
  var swipe: ProgressIndicatorSwipeEvent = js.native
  
  var touchcancel: ProgressIndicatorTouchcancelEvent = js.native
  
  var touchend: ProgressIndicatorTouchendEvent = js.native
  
  var touchmove: ProgressIndicatorTouchmoveEvent = js.native
  
  var touchstart: ProgressIndicatorTouchstartEvent = js.native
  
  var twofingertap: ProgressIndicatorTwofingertapEvent = js.native
}
object ProgressIndicatorEventMap {
  
  @scala.inline
  def apply(
    cancel: ProgressIndicatorCancelEvent,
    click: ProgressIndicatorClickEvent,
    dblclick: ProgressIndicatorDblclickEvent,
    doubletap: ProgressIndicatorDoubletapEvent,
    focus: ProgressIndicatorFocusEvent,
    keypressed: ProgressIndicatorKeypressedEvent,
    longclick: ProgressIndicatorLongclickEvent,
    longpress: ProgressIndicatorLongpressEvent,
    pinch: ProgressIndicatorPinchEvent,
    postlayout: ProgressIndicatorPostlayoutEvent,
    singletap: ProgressIndicatorSingletapEvent,
    swipe: ProgressIndicatorSwipeEvent,
    touchcancel: ProgressIndicatorTouchcancelEvent,
    touchend: ProgressIndicatorTouchendEvent,
    touchmove: ProgressIndicatorTouchmoveEvent,
    touchstart: ProgressIndicatorTouchstartEvent,
    twofingertap: ProgressIndicatorTwofingertapEvent
  ): ProgressIndicatorEventMap = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressIndicatorEventMap]
  }
  
  @scala.inline
  implicit class ProgressIndicatorEventMapMutableBuilder[Self <: ProgressIndicatorEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: ProgressIndicatorCancelEvent): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClick(value: ProgressIndicatorClickEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: ProgressIndicatorDblclickEvent): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: ProgressIndicatorDoubletapEvent): Self = StObject.set(x, "doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: ProgressIndicatorFocusEvent): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: ProgressIndicatorKeypressedEvent): Self = StObject.set(x, "keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: ProgressIndicatorLongclickEvent): Self = StObject.set(x, "longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: ProgressIndicatorLongpressEvent): Self = StObject.set(x, "longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: ProgressIndicatorPinchEvent): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: ProgressIndicatorPostlayoutEvent): Self = StObject.set(x, "postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: ProgressIndicatorSingletapEvent): Self = StObject.set(x, "singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: ProgressIndicatorSwipeEvent): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: ProgressIndicatorTouchcancelEvent): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: ProgressIndicatorTouchendEvent): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: ProgressIndicatorTouchmoveEvent): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: ProgressIndicatorTouchstartEvent): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: ProgressIndicatorTwofingertapEvent): Self = StObject.set(x, "twofingertap", value.asInstanceOf[js.Any])
  }
}
