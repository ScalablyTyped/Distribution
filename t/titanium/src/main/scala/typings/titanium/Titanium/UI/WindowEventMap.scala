package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowEventMap extends ProxyEventMap {
  
  var androidback: WindowAndroidbackEvent = js.native
  
  var androidcamera: WindowAndroidcameraEvent = js.native
  
  var androidfocus: WindowAndroidfocusEvent = js.native
  
  var androidsearch: WindowAndroidsearchEvent = js.native
  
  var androidvoldown: WindowAndroidvoldownEvent = js.native
  
  var androidvolup: WindowAndroidvolupEvent = js.native
  
  var blur: WindowBlurEvent = js.native
  
  var click: WindowClickEvent = js.native
  
  var close: WindowCloseEvent = js.native
  
  var dblclick: WindowDblclickEvent = js.native
  
  var doubletap: WindowDoubletapEvent = js.native
  
  var focus: WindowFocusEvent = js.native
  
  var keypressed: WindowKeypressedEvent = js.native
  
  var longclick: WindowLongclickEvent = js.native
  
  var longpress: WindowLongpressEvent = js.native
  
  var open: WindowOpenEvent = js.native
  
  var pinch: WindowPinchEvent = js.native
  
  var postlayout: WindowPostlayoutEvent = js.native
  
  var singletap: WindowSingletapEvent = js.native
  
  var swipe: WindowSwipeEvent = js.native
  
  var touchcancel: WindowTouchcancelEvent = js.native
  
  var touchend: WindowTouchendEvent = js.native
  
  var touchmove: WindowTouchmoveEvent = js.native
  
  var touchstart: WindowTouchstartEvent = js.native
  
  var twofingertap: WindowTwofingertapEvent = js.native
}
object WindowEventMap {
  
  @scala.inline
  def apply(
    androidback: WindowAndroidbackEvent,
    androidcamera: WindowAndroidcameraEvent,
    androidfocus: WindowAndroidfocusEvent,
    androidsearch: WindowAndroidsearchEvent,
    androidvoldown: WindowAndroidvoldownEvent,
    androidvolup: WindowAndroidvolupEvent,
    blur: WindowBlurEvent,
    click: WindowClickEvent,
    close: WindowCloseEvent,
    dblclick: WindowDblclickEvent,
    doubletap: WindowDoubletapEvent,
    focus: WindowFocusEvent,
    keypressed: WindowKeypressedEvent,
    longclick: WindowLongclickEvent,
    longpress: WindowLongpressEvent,
    open: WindowOpenEvent,
    pinch: WindowPinchEvent,
    postlayout: WindowPostlayoutEvent,
    singletap: WindowSingletapEvent,
    swipe: WindowSwipeEvent,
    touchcancel: WindowTouchcancelEvent,
    touchend: WindowTouchendEvent,
    touchmove: WindowTouchmoveEvent,
    touchstart: WindowTouchstartEvent,
    twofingertap: WindowTwofingertapEvent
  ): WindowEventMap = {
    val __obj = js.Dynamic.literal(androidback = androidback.asInstanceOf[js.Any], androidcamera = androidcamera.asInstanceOf[js.Any], androidfocus = androidfocus.asInstanceOf[js.Any], androidsearch = androidsearch.asInstanceOf[js.Any], androidvoldown = androidvoldown.asInstanceOf[js.Any], androidvolup = androidvolup.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEventMap]
  }
  
  @scala.inline
  implicit class WindowEventMapOps[Self <: WindowEventMap] (val x: Self) extends AnyVal {
    
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
    def setAndroidback(value: WindowAndroidbackEvent): Self = this.set("androidback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidcamera(value: WindowAndroidcameraEvent): Self = this.set("androidcamera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidfocus(value: WindowAndroidfocusEvent): Self = this.set("androidfocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidsearch(value: WindowAndroidsearchEvent): Self = this.set("androidsearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidvoldown(value: WindowAndroidvoldownEvent): Self = this.set("androidvoldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidvolup(value: WindowAndroidvolupEvent): Self = this.set("androidvolup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlur(value: WindowBlurEvent): Self = this.set("blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClick(value: WindowClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: WindowCloseEvent): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: WindowDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: WindowDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: WindowFocusEvent): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: WindowKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: WindowLongclickEvent): Self = this.set("longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: WindowLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: WindowOpenEvent): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: WindowPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: WindowPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: WindowSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: WindowSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: WindowTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: WindowTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: WindowTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: WindowTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: WindowTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
}
