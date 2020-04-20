package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebViewEventMap extends ProxyEventMap {
  var beforeload: WebViewBeforeloadEvent
  var blacklisturl: WebViewBlacklisturlEvent
  var click: WebViewClickEvent
  var dblclick: WebViewDblclickEvent
  var doubletap: WebViewDoubletapEvent
  var error: WebViewErrorEvent
  var focus: WebViewFocusEvent
  var handleurl: WebViewHandleurlEvent
  var keypressed: WebViewKeypressedEvent
  var load: WebViewLoadEvent
  var longclick: WebViewLongclickEvent
  var longpress: WebViewLongpressEvent
  var message: WebViewMessageEvent
  var onLoadResource: WebViewOnLoadResourceEvent
  var pinch: WebViewPinchEvent
  var postlayout: WebViewPostlayoutEvent
  var progress: WebViewProgressEvent
  var redirect: WebViewRedirectEvent
  var singletap: WebViewSingletapEvent
  var sslerror: WebViewSslerrorEvent
  var swipe: WebViewSwipeEvent
  var touchcancel: WebViewTouchcancelEvent
  var touchend: WebViewTouchendEvent
  var touchmove: WebViewTouchmoveEvent
  var touchstart: WebViewTouchstartEvent
  var twofingertap: WebViewTwofingertapEvent
}

object WebViewEventMap {
  @scala.inline
  def apply(
    beforeload: WebViewBeforeloadEvent,
    blacklisturl: WebViewBlacklisturlEvent,
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
    val __obj = js.Dynamic.literal(beforeload = beforeload.asInstanceOf[js.Any], blacklisturl = blacklisturl.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], handleurl = handleurl.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], onLoadResource = onLoadResource.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], redirect = redirect.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], sslerror = sslerror.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewEventMap]
  }
}

