package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationWindowEventMap extends ProxyEventMap {
  
  var androidback: NavigationWindowAndroidbackEvent = js.native
  
  var androidcamera: NavigationWindowAndroidcameraEvent = js.native
  
  var androidfocus: NavigationWindowAndroidfocusEvent = js.native
  
  var androidsearch: NavigationWindowAndroidsearchEvent = js.native
  
  var androidvoldown: NavigationWindowAndroidvoldownEvent = js.native
  
  var androidvolup: NavigationWindowAndroidvolupEvent = js.native
  
  var blur: NavigationWindowBlurEvent = js.native
  
  var click: NavigationWindowClickEvent = js.native
  
  var close: NavigationWindowCloseEvent = js.native
  
  var dblclick: NavigationWindowDblclickEvent = js.native
  
  var doubletap: NavigationWindowDoubletapEvent = js.native
  
  var focus: NavigationWindowFocusEvent = js.native
  
  var keypressed: NavigationWindowKeypressedEvent = js.native
  
  var longclick: NavigationWindowLongclickEvent = js.native
  
  var longpress: NavigationWindowLongpressEvent = js.native
  
  var open: NavigationWindowOpenEvent = js.native
  
  var pinch: NavigationWindowPinchEvent = js.native
  
  var postlayout: NavigationWindowPostlayoutEvent = js.native
  
  var singletap: NavigationWindowSingletapEvent = js.native
  
  var swipe: NavigationWindowSwipeEvent = js.native
  
  var touchcancel: NavigationWindowTouchcancelEvent = js.native
  
  var touchend: NavigationWindowTouchendEvent = js.native
  
  var touchmove: NavigationWindowTouchmoveEvent = js.native
  
  var touchstart: NavigationWindowTouchstartEvent = js.native
  
  var twofingertap: NavigationWindowTwofingertapEvent = js.native
}
object NavigationWindowEventMap {
  
  @scala.inline
  def apply(
    androidback: NavigationWindowAndroidbackEvent,
    androidcamera: NavigationWindowAndroidcameraEvent,
    androidfocus: NavigationWindowAndroidfocusEvent,
    androidsearch: NavigationWindowAndroidsearchEvent,
    androidvoldown: NavigationWindowAndroidvoldownEvent,
    androidvolup: NavigationWindowAndroidvolupEvent,
    blur: NavigationWindowBlurEvent,
    click: NavigationWindowClickEvent,
    close: NavigationWindowCloseEvent,
    dblclick: NavigationWindowDblclickEvent,
    doubletap: NavigationWindowDoubletapEvent,
    focus: NavigationWindowFocusEvent,
    keypressed: NavigationWindowKeypressedEvent,
    longclick: NavigationWindowLongclickEvent,
    longpress: NavigationWindowLongpressEvent,
    open: NavigationWindowOpenEvent,
    pinch: NavigationWindowPinchEvent,
    postlayout: NavigationWindowPostlayoutEvent,
    singletap: NavigationWindowSingletapEvent,
    swipe: NavigationWindowSwipeEvent,
    touchcancel: NavigationWindowTouchcancelEvent,
    touchend: NavigationWindowTouchendEvent,
    touchmove: NavigationWindowTouchmoveEvent,
    touchstart: NavigationWindowTouchstartEvent,
    twofingertap: NavigationWindowTwofingertapEvent
  ): NavigationWindowEventMap = {
    val __obj = js.Dynamic.literal(androidback = androidback.asInstanceOf[js.Any], androidcamera = androidcamera.asInstanceOf[js.Any], androidfocus = androidfocus.asInstanceOf[js.Any], androidsearch = androidsearch.asInstanceOf[js.Any], androidvoldown = androidvoldown.asInstanceOf[js.Any], androidvolup = androidvolup.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationWindowEventMap]
  }
  
  @scala.inline
  implicit class NavigationWindowEventMapOps[Self <: NavigationWindowEventMap] (val x: Self) extends AnyVal {
    
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
    def setAndroidback(value: NavigationWindowAndroidbackEvent): Self = this.set("androidback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidcamera(value: NavigationWindowAndroidcameraEvent): Self = this.set("androidcamera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidfocus(value: NavigationWindowAndroidfocusEvent): Self = this.set("androidfocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidsearch(value: NavigationWindowAndroidsearchEvent): Self = this.set("androidsearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidvoldown(value: NavigationWindowAndroidvoldownEvent): Self = this.set("androidvoldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidvolup(value: NavigationWindowAndroidvolupEvent): Self = this.set("androidvolup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlur(value: NavigationWindowBlurEvent): Self = this.set("blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClick(value: NavigationWindowClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: NavigationWindowCloseEvent): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: NavigationWindowDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: NavigationWindowDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: NavigationWindowFocusEvent): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: NavigationWindowKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: NavigationWindowLongclickEvent): Self = this.set("longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: NavigationWindowLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: NavigationWindowOpenEvent): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: NavigationWindowPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: NavigationWindowPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: NavigationWindowSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: NavigationWindowSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: NavigationWindowTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: NavigationWindowTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: NavigationWindowTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: NavigationWindowTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: NavigationWindowTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
}
