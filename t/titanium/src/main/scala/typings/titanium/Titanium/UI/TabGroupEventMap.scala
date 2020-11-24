package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabGroupEventMap extends ProxyEventMap {
  
  var androidback: TabGroupAndroidbackEvent = js.native
  
  var androidcamera: TabGroupAndroidcameraEvent = js.native
  
  var androidfocus: TabGroupAndroidfocusEvent = js.native
  
  var androidsearch: TabGroupAndroidsearchEvent = js.native
  
  var androidvoldown: TabGroupAndroidvoldownEvent = js.native
  
  var androidvolup: TabGroupAndroidvolupEvent = js.native
  
  var blur: TabGroupBlurEvent = js.native
  
  var click: TabGroupClickEvent = js.native
  
  var close: TabGroupCloseEvent = js.native
  
  var dblclick: TabGroupDblclickEvent = js.native
  
  var doubletap: TabGroupDoubletapEvent = js.native
  
  var focus: TabGroupFocusEvent = js.native
  
  var keypressed: TabGroupKeypressedEvent = js.native
  
  var longclick: TabGroupLongclickEvent = js.native
  
  var longpress: TabGroupLongpressEvent = js.native
  
  var open: TabGroupOpenEvent = js.native
  
  var pinch: TabGroupPinchEvent = js.native
  
  var postlayout: TabGroupPostlayoutEvent = js.native
  
  var singletap: TabGroupSingletapEvent = js.native
  
  var swipe: TabGroupSwipeEvent = js.native
  
  var touchcancel: TabGroupTouchcancelEvent = js.native
  
  var touchend: TabGroupTouchendEvent = js.native
  
  var touchmove: TabGroupTouchmoveEvent = js.native
  
  var touchstart: TabGroupTouchstartEvent = js.native
  
  var twofingertap: TabGroupTwofingertapEvent = js.native
}
object TabGroupEventMap {
  
  @scala.inline
  def apply(
    androidback: TabGroupAndroidbackEvent,
    androidcamera: TabGroupAndroidcameraEvent,
    androidfocus: TabGroupAndroidfocusEvent,
    androidsearch: TabGroupAndroidsearchEvent,
    androidvoldown: TabGroupAndroidvoldownEvent,
    androidvolup: TabGroupAndroidvolupEvent,
    blur: TabGroupBlurEvent,
    click: TabGroupClickEvent,
    close: TabGroupCloseEvent,
    dblclick: TabGroupDblclickEvent,
    doubletap: TabGroupDoubletapEvent,
    focus: TabGroupFocusEvent,
    keypressed: TabGroupKeypressedEvent,
    longclick: TabGroupLongclickEvent,
    longpress: TabGroupLongpressEvent,
    open: TabGroupOpenEvent,
    pinch: TabGroupPinchEvent,
    postlayout: TabGroupPostlayoutEvent,
    singletap: TabGroupSingletapEvent,
    swipe: TabGroupSwipeEvent,
    touchcancel: TabGroupTouchcancelEvent,
    touchend: TabGroupTouchendEvent,
    touchmove: TabGroupTouchmoveEvent,
    touchstart: TabGroupTouchstartEvent,
    twofingertap: TabGroupTwofingertapEvent
  ): TabGroupEventMap = {
    val __obj = js.Dynamic.literal(androidback = androidback.asInstanceOf[js.Any], androidcamera = androidcamera.asInstanceOf[js.Any], androidfocus = androidfocus.asInstanceOf[js.Any], androidsearch = androidsearch.asInstanceOf[js.Any], androidvoldown = androidvoldown.asInstanceOf[js.Any], androidvolup = androidvolup.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabGroupEventMap]
  }
  
  @scala.inline
  implicit class TabGroupEventMapOps[Self <: TabGroupEventMap] (val x: Self) extends AnyVal {
    
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
    def setAndroidback(value: TabGroupAndroidbackEvent): Self = this.set("androidback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidcamera(value: TabGroupAndroidcameraEvent): Self = this.set("androidcamera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidfocus(value: TabGroupAndroidfocusEvent): Self = this.set("androidfocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidsearch(value: TabGroupAndroidsearchEvent): Self = this.set("androidsearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidvoldown(value: TabGroupAndroidvoldownEvent): Self = this.set("androidvoldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidvolup(value: TabGroupAndroidvolupEvent): Self = this.set("androidvolup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlur(value: TabGroupBlurEvent): Self = this.set("blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClick(value: TabGroupClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: TabGroupCloseEvent): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: TabGroupDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: TabGroupDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: TabGroupFocusEvent): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: TabGroupKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: TabGroupLongclickEvent): Self = this.set("longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: TabGroupLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: TabGroupOpenEvent): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: TabGroupPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: TabGroupPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: TabGroupSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: TabGroupSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: TabGroupTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: TabGroupTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: TabGroupTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: TabGroupTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: TabGroupTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
}
