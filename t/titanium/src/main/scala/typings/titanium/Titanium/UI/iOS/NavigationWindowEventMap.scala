package typings.titanium.Titanium.UI.iOS

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationWindowEventMap extends ProxyEventMap {
  var blur: NavigationWindowBlurEvent
  var click: NavigationWindowClickEvent
  var close: NavigationWindowCloseEvent
  var dblclick: NavigationWindowDblclickEvent
  var doubletap: NavigationWindowDoubletapEvent
  var focus: NavigationWindowFocusEvent
  var keypressed: NavigationWindowKeypressedEvent
  var longpress: NavigationWindowLongpressEvent
  var open: NavigationWindowOpenEvent
  var pinch: NavigationWindowPinchEvent
  var postlayout: NavigationWindowPostlayoutEvent
  var singletap: NavigationWindowSingletapEvent
  var swipe: NavigationWindowSwipeEvent
  var touchcancel: NavigationWindowTouchcancelEvent
  var touchend: NavigationWindowTouchendEvent
  var touchmove: NavigationWindowTouchmoveEvent
  var touchstart: NavigationWindowTouchstartEvent
  var twofingertap: NavigationWindowTwofingertapEvent
}

object NavigationWindowEventMap {
  @scala.inline
  def apply(
    blur: NavigationWindowBlurEvent,
    click: NavigationWindowClickEvent,
    close: NavigationWindowCloseEvent,
    dblclick: NavigationWindowDblclickEvent,
    doubletap: NavigationWindowDoubletapEvent,
    focus: NavigationWindowFocusEvent,
    keypressed: NavigationWindowKeypressedEvent,
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
    val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationWindowEventMap]
  }
}

