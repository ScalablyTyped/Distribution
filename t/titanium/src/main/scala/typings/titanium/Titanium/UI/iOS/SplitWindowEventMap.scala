package typings.titanium.Titanium.UI.iOS

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitWindowEventMap extends ProxyEventMap {
  var blur: SplitWindowBlurEvent
  var click: SplitWindowClickEvent
  var close: SplitWindowCloseEvent
  var dblclick: SplitWindowDblclickEvent
  var doubletap: SplitWindowDoubletapEvent
  var focus: SplitWindowFocusEvent
  var keypressed: SplitWindowKeypressedEvent
  var longpress: SplitWindowLongpressEvent
  var open: SplitWindowOpenEvent
  var pinch: SplitWindowPinchEvent
  var postlayout: SplitWindowPostlayoutEvent
  var singletap: SplitWindowSingletapEvent
  var swipe: SplitWindowSwipeEvent
  var touchcancel: SplitWindowTouchcancelEvent
  var touchend: SplitWindowTouchendEvent
  var touchmove: SplitWindowTouchmoveEvent
  var touchstart: SplitWindowTouchstartEvent
  var twofingertap: SplitWindowTwofingertapEvent
}

object SplitWindowEventMap {
  @scala.inline
  def apply(
    blur: SplitWindowBlurEvent,
    click: SplitWindowClickEvent,
    close: SplitWindowCloseEvent,
    dblclick: SplitWindowDblclickEvent,
    doubletap: SplitWindowDoubletapEvent,
    focus: SplitWindowFocusEvent,
    keypressed: SplitWindowKeypressedEvent,
    longpress: SplitWindowLongpressEvent,
    open: SplitWindowOpenEvent,
    pinch: SplitWindowPinchEvent,
    postlayout: SplitWindowPostlayoutEvent,
    singletap: SplitWindowSingletapEvent,
    swipe: SplitWindowSwipeEvent,
    touchcancel: SplitWindowTouchcancelEvent,
    touchend: SplitWindowTouchendEvent,
    touchmove: SplitWindowTouchmoveEvent,
    touchstart: SplitWindowTouchstartEvent,
    twofingertap: SplitWindowTwofingertapEvent
  ): SplitWindowEventMap = {
    val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitWindowEventMap]
  }
}

