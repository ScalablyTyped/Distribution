package typings.titanium.Titanium.UI.Android

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawerLayoutEventMap extends ProxyEventMap {
  
  var change: DrawerLayoutChangeEvent = js.native
  
  var click: DrawerLayoutClickEvent = js.native
  
  var close: DrawerLayoutCloseEvent = js.native
  
  var dblclick: DrawerLayoutDblclickEvent = js.native
  
  var doubletap: DrawerLayoutDoubletapEvent = js.native
  
  var focus: DrawerLayoutFocusEvent = js.native
  
  var keypressed: DrawerLayoutKeypressedEvent = js.native
  
  var longclick: DrawerLayoutLongclickEvent = js.native
  
  var longpress: DrawerLayoutLongpressEvent = js.native
  
  var open: DrawerLayoutOpenEvent = js.native
  
  var pinch: DrawerLayoutPinchEvent = js.native
  
  var postlayout: DrawerLayoutPostlayoutEvent = js.native
  
  var singletap: DrawerLayoutSingletapEvent = js.native
  
  var slide: DrawerLayoutSlideEvent = js.native
  
  var swipe: DrawerLayoutSwipeEvent = js.native
  
  var touchcancel: DrawerLayoutTouchcancelEvent = js.native
  
  var touchend: DrawerLayoutTouchendEvent = js.native
  
  var touchmove: DrawerLayoutTouchmoveEvent = js.native
  
  var touchstart: DrawerLayoutTouchstartEvent = js.native
  
  var twofingertap: DrawerLayoutTwofingertapEvent = js.native
}
object DrawerLayoutEventMap {
  
  @scala.inline
  def apply(
    change: DrawerLayoutChangeEvent,
    click: DrawerLayoutClickEvent,
    close: DrawerLayoutCloseEvent,
    dblclick: DrawerLayoutDblclickEvent,
    doubletap: DrawerLayoutDoubletapEvent,
    focus: DrawerLayoutFocusEvent,
    keypressed: DrawerLayoutKeypressedEvent,
    longclick: DrawerLayoutLongclickEvent,
    longpress: DrawerLayoutLongpressEvent,
    open: DrawerLayoutOpenEvent,
    pinch: DrawerLayoutPinchEvent,
    postlayout: DrawerLayoutPostlayoutEvent,
    singletap: DrawerLayoutSingletapEvent,
    slide: DrawerLayoutSlideEvent,
    swipe: DrawerLayoutSwipeEvent,
    touchcancel: DrawerLayoutTouchcancelEvent,
    touchend: DrawerLayoutTouchendEvent,
    touchmove: DrawerLayoutTouchmoveEvent,
    touchstart: DrawerLayoutTouchstartEvent,
    twofingertap: DrawerLayoutTwofingertapEvent
  ): DrawerLayoutEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], slide = slide.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerLayoutEventMap]
  }
  
  @scala.inline
  implicit class DrawerLayoutEventMapOps[Self <: DrawerLayoutEventMap] (val x: Self) extends AnyVal {
    
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
    def setChange(value: DrawerLayoutChangeEvent): Self = this.set("change", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClick(value: DrawerLayoutClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: DrawerLayoutCloseEvent): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: DrawerLayoutDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: DrawerLayoutDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: DrawerLayoutFocusEvent): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: DrawerLayoutKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: DrawerLayoutLongclickEvent): Self = this.set("longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: DrawerLayoutLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: DrawerLayoutOpenEvent): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: DrawerLayoutPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: DrawerLayoutPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: DrawerLayoutSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlide(value: DrawerLayoutSlideEvent): Self = this.set("slide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: DrawerLayoutSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: DrawerLayoutTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: DrawerLayoutTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: DrawerLayoutTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: DrawerLayoutTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: DrawerLayoutTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
}
