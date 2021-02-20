package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelEventMap extends ProxyEventMap {
  
  var click: LabelClickEvent = js.native
  
  var dblclick: LabelDblclickEvent = js.native
  
  var doubletap: LabelDoubletapEvent = js.native
  
  var focus: LabelFocusEvent = js.native
  
  var keypressed: LabelKeypressedEvent = js.native
  
  var link: LabelLinkEvent = js.native
  
  var longclick: LabelLongclickEvent = js.native
  
  var longpress: LabelLongpressEvent = js.native
  
  var pinch: LabelPinchEvent = js.native
  
  var postlayout: LabelPostlayoutEvent = js.native
  
  var singletap: LabelSingletapEvent = js.native
  
  var swipe: LabelSwipeEvent = js.native
  
  var touchcancel: LabelTouchcancelEvent = js.native
  
  var touchend: LabelTouchendEvent = js.native
  
  var touchmove: LabelTouchmoveEvent = js.native
  
  var touchstart: LabelTouchstartEvent = js.native
  
  var twofingertap: LabelTwofingertapEvent = js.native
}
object LabelEventMap {
  
  @scala.inline
  def apply(
    click: LabelClickEvent,
    dblclick: LabelDblclickEvent,
    doubletap: LabelDoubletapEvent,
    focus: LabelFocusEvent,
    keypressed: LabelKeypressedEvent,
    link: LabelLinkEvent,
    longclick: LabelLongclickEvent,
    longpress: LabelLongpressEvent,
    pinch: LabelPinchEvent,
    postlayout: LabelPostlayoutEvent,
    singletap: LabelSingletapEvent,
    swipe: LabelSwipeEvent,
    touchcancel: LabelTouchcancelEvent,
    touchend: LabelTouchendEvent,
    touchmove: LabelTouchmoveEvent,
    touchstart: LabelTouchstartEvent,
    twofingertap: LabelTwofingertapEvent
  ): LabelEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelEventMap]
  }
  
  @scala.inline
  implicit class LabelEventMapMutableBuilder[Self <: LabelEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: LabelClickEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: LabelDblclickEvent): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: LabelDoubletapEvent): Self = StObject.set(x, "doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: LabelFocusEvent): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: LabelKeypressedEvent): Self = StObject.set(x, "keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: LabelLinkEvent): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: LabelLongclickEvent): Self = StObject.set(x, "longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: LabelLongpressEvent): Self = StObject.set(x, "longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: LabelPinchEvent): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: LabelPostlayoutEvent): Self = StObject.set(x, "postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: LabelSingletapEvent): Self = StObject.set(x, "singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: LabelSwipeEvent): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: LabelTouchcancelEvent): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: LabelTouchendEvent): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: LabelTouchmoveEvent): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: LabelTouchstartEvent): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: LabelTwofingertapEvent): Self = StObject.set(x, "twofingertap", value.asInstanceOf[js.Any])
  }
}
