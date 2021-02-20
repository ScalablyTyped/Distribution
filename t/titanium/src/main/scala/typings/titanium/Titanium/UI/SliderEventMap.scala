package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderEventMap extends ProxyEventMap {
  
  var change: SliderChangeEvent = js.native
  
  var click: SliderClickEvent = js.native
  
  var dblclick: SliderDblclickEvent = js.native
  
  var doubletap: SliderDoubletapEvent = js.native
  
  var focus: SliderFocusEvent = js.native
  
  var keypressed: SliderKeypressedEvent = js.native
  
  var longclick: SliderLongclickEvent = js.native
  
  var longpress: SliderLongpressEvent = js.native
  
  var pinch: SliderPinchEvent = js.native
  
  var postlayout: SliderPostlayoutEvent = js.native
  
  var singletap: SliderSingletapEvent = js.native
  
  var start: SliderStartEvent = js.native
  
  var stop: SliderStopEvent = js.native
  
  var swipe: SliderSwipeEvent = js.native
  
  var touchcancel: SliderTouchcancelEvent = js.native
  
  var touchend: SliderTouchendEvent = js.native
  
  var touchmove: SliderTouchmoveEvent = js.native
  
  var touchstart: SliderTouchstartEvent = js.native
  
  var twofingertap: SliderTwofingertapEvent = js.native
}
object SliderEventMap {
  
  @scala.inline
  def apply(
    change: SliderChangeEvent,
    click: SliderClickEvent,
    dblclick: SliderDblclickEvent,
    doubletap: SliderDoubletapEvent,
    focus: SliderFocusEvent,
    keypressed: SliderKeypressedEvent,
    longclick: SliderLongclickEvent,
    longpress: SliderLongpressEvent,
    pinch: SliderPinchEvent,
    postlayout: SliderPostlayoutEvent,
    singletap: SliderSingletapEvent,
    start: SliderStartEvent,
    stop: SliderStopEvent,
    swipe: SliderSwipeEvent,
    touchcancel: SliderTouchcancelEvent,
    touchend: SliderTouchendEvent,
    touchmove: SliderTouchmoveEvent,
    touchstart: SliderTouchstartEvent,
    twofingertap: SliderTwofingertapEvent
  ): SliderEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderEventMap]
  }
  
  @scala.inline
  implicit class SliderEventMapMutableBuilder[Self <: SliderEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: SliderChangeEvent): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClick(value: SliderClickEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: SliderDblclickEvent): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: SliderDoubletapEvent): Self = StObject.set(x, "doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: SliderFocusEvent): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: SliderKeypressedEvent): Self = StObject.set(x, "keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: SliderLongclickEvent): Self = StObject.set(x, "longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: SliderLongpressEvent): Self = StObject.set(x, "longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: SliderPinchEvent): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: SliderPostlayoutEvent): Self = StObject.set(x, "postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: SliderSingletapEvent): Self = StObject.set(x, "singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: SliderStartEvent): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStop(value: SliderStopEvent): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: SliderSwipeEvent): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: SliderTouchcancelEvent): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: SliderTouchendEvent): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: SliderTouchmoveEvent): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: SliderTouchstartEvent): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: SliderTwofingertapEvent): Self = StObject.set(x, "twofingertap", value.asInstanceOf[js.Any])
  }
}
