package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchBarEventMap extends ProxyEventMap {
  var blur: SearchBarBlurEvent
  var bookmark: SearchBarBookmarkEvent
  var cancel: SearchBarCancelEvent
  var change: SearchBarChangeEvent
  var click: SearchBarClickEvent
  var dblclick: SearchBarDblclickEvent
  var doubletap: SearchBarDoubletapEvent
  var focus: SearchBarFocusEvent
  var keypressed: SearchBarKeypressedEvent
  var longclick: SearchBarLongclickEvent
  var longpress: SearchBarLongpressEvent
  var pinch: SearchBarPinchEvent
  var postlayout: SearchBarPostlayoutEvent
  var `return`: SearchBarReturnEvent
  var singletap: SearchBarSingletapEvent
  var swipe: SearchBarSwipeEvent
  var touchcancel: SearchBarTouchcancelEvent
  var touchend: SearchBarTouchendEvent
  var touchmove: SearchBarTouchmoveEvent
  var touchstart: SearchBarTouchstartEvent
  var twofingertap: SearchBarTwofingertapEvent
}

object SearchBarEventMap {
  @scala.inline
  def apply(
    blur: SearchBarBlurEvent,
    bookmark: SearchBarBookmarkEvent,
    cancel: SearchBarCancelEvent,
    change: SearchBarChangeEvent,
    click: SearchBarClickEvent,
    dblclick: SearchBarDblclickEvent,
    doubletap: SearchBarDoubletapEvent,
    focus: SearchBarFocusEvent,
    keypressed: SearchBarKeypressedEvent,
    longclick: SearchBarLongclickEvent,
    longpress: SearchBarLongpressEvent,
    pinch: SearchBarPinchEvent,
    postlayout: SearchBarPostlayoutEvent,
    `return`: SearchBarReturnEvent,
    singletap: SearchBarSingletapEvent,
    swipe: SearchBarSwipeEvent,
    touchcancel: SearchBarTouchcancelEvent,
    touchend: SearchBarTouchendEvent,
    touchmove: SearchBarTouchmoveEvent,
    touchstart: SearchBarTouchstartEvent,
    twofingertap: SearchBarTwofingertapEvent
  ): SearchBarEventMap = {
    val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any], bookmark = bookmark.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBarEventMap]
  }
}

