package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebViewEventMap extends ProxyEventMap {
  
  var beforeload: WebViewBeforeloadEvent = js.native
  
  var blacklisturl: WebViewBlacklisturlEvent = js.native
  
  var blockedurl: WebViewBlockedurlEvent = js.native
  
  var click: WebViewClickEvent = js.native
  
  var dblclick: WebViewDblclickEvent = js.native
  
  var doubletap: WebViewDoubletapEvent = js.native
  
  var error: WebViewErrorEvent = js.native
  
  var focus: WebViewFocusEvent = js.native
  
  var handleurl: WebViewHandleurlEvent = js.native
  
  var keypressed: WebViewKeypressedEvent = js.native
  
  var load: WebViewLoadEvent = js.native
  
  var longclick: WebViewLongclickEvent = js.native
  
  var longpress: WebViewLongpressEvent = js.native
  
  var message: WebViewMessageEvent = js.native
  
  var onLoadResource: WebViewOnLoadResourceEvent = js.native
  
  var pinch: WebViewPinchEvent = js.native
  
  var postlayout: WebViewPostlayoutEvent = js.native
  
  var progress: WebViewProgressEvent = js.native
  
  var redirect: WebViewRedirectEvent = js.native
  
  var singletap: WebViewSingletapEvent = js.native
  
  var sslerror: WebViewSslerrorEvent = js.native
  
  var swipe: WebViewSwipeEvent = js.native
  
  var touchcancel: WebViewTouchcancelEvent = js.native
  
  var touchend: WebViewTouchendEvent = js.native
  
  var touchmove: WebViewTouchmoveEvent = js.native
  
  var touchstart: WebViewTouchstartEvent = js.native
  
  var twofingertap: WebViewTwofingertapEvent = js.native
}
object WebViewEventMap {
  
  @scala.inline
  def apply(
    beforeload: WebViewBeforeloadEvent,
    blacklisturl: WebViewBlacklisturlEvent,
    blockedurl: WebViewBlockedurlEvent,
    click: WebViewClickEvent,
    dblclick: WebViewDblclickEvent,
    doubletap: WebViewDoubletapEvent,
    error: WebViewErrorEvent,
    focus: WebViewFocusEvent,
    handleurl: WebViewHandleurlEvent,
    keypressed: WebViewKeypressedEvent,
    load: WebViewLoadEvent,
    longclick: WebViewLongclickEvent,
    longpress: WebViewLongpressEvent,
    message: WebViewMessageEvent,
    onLoadResource: WebViewOnLoadResourceEvent,
    pinch: WebViewPinchEvent,
    postlayout: WebViewPostlayoutEvent,
    progress: WebViewProgressEvent,
    redirect: WebViewRedirectEvent,
    singletap: WebViewSingletapEvent,
    sslerror: WebViewSslerrorEvent,
    swipe: WebViewSwipeEvent,
    touchcancel: WebViewTouchcancelEvent,
    touchend: WebViewTouchendEvent,
    touchmove: WebViewTouchmoveEvent,
    touchstart: WebViewTouchstartEvent,
    twofingertap: WebViewTwofingertapEvent
  ): WebViewEventMap = {
    val __obj = js.Dynamic.literal(beforeload = beforeload.asInstanceOf[js.Any], blacklisturl = blacklisturl.asInstanceOf[js.Any], blockedurl = blockedurl.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], handleurl = handleurl.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], onLoadResource = onLoadResource.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], redirect = redirect.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], sslerror = sslerror.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewEventMap]
  }
  
  @scala.inline
  implicit class WebViewEventMapOps[Self <: WebViewEventMap] (val x: Self) extends AnyVal {
    
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
    def setBeforeload(value: WebViewBeforeloadEvent): Self = this.set("beforeload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlacklisturl(value: WebViewBlacklisturlEvent): Self = this.set("blacklisturl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockedurl(value: WebViewBlockedurlEvent): Self = this.set("blockedurl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClick(value: WebViewClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: WebViewDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: WebViewDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: WebViewErrorEvent): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: WebViewFocusEvent): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleurl(value: WebViewHandleurlEvent): Self = this.set("handleurl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: WebViewKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoad(value: WebViewLoadEvent): Self = this.set("load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongclick(value: WebViewLongclickEvent): Self = this.set("longclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: WebViewLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: WebViewMessageEvent): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLoadResource(value: WebViewOnLoadResourceEvent): Self = this.set("onLoadResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: WebViewPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: WebViewPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: WebViewProgressEvent): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirect(value: WebViewRedirectEvent): Self = this.set("redirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: WebViewSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslerror(value: WebViewSslerrorEvent): Self = this.set("sslerror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: WebViewSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: WebViewTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: WebViewTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: WebViewTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: WebViewTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: WebViewTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
}
