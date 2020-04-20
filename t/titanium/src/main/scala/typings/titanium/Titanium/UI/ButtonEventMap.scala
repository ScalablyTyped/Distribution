package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonEventMap extends ProxyEventMap {
  var click: ButtonClickEvent
  var dblclick: ButtonDblclickEvent
  var doubletap: ButtonDoubletapEvent
  var focus: ButtonFocusEvent
  var keypressed: ButtonKeypressedEvent
  var longclick: ButtonLongclickEvent
  var longpress: ButtonLongpressEvent
  var pinch: ButtonPinchEvent
  var postlayout: ButtonPostlayoutEvent
  var singletap: ButtonSingletapEvent
  var swipe: ButtonSwipeEvent
  var touchcancel: ButtonTouchcancelEvent
  var touchend: ButtonTouchendEvent
  var touchmove: ButtonTouchmoveEvent
  var touchstart: ButtonTouchstartEvent
  var twofingertap: ButtonTwofingertapEvent
}

object ButtonEventMap {
  @scala.inline
  def apply(
    click: ButtonClickEvent,
    dblclick: ButtonDblclickEvent,
    doubletap: ButtonDoubletapEvent,
    focus: ButtonFocusEvent,
    keypressed: ButtonKeypressedEvent,
    longclick: ButtonLongclickEvent,
    longpress: ButtonLongpressEvent,
    pinch: ButtonPinchEvent,
    postlayout: ButtonPostlayoutEvent,
    singletap: ButtonSingletapEvent,
    swipe: ButtonSwipeEvent,
    touchcancel: ButtonTouchcancelEvent,
    touchend: ButtonTouchendEvent,
    touchmove: ButtonTouchmoveEvent,
    touchstart: ButtonTouchstartEvent,
    twofingertap: ButtonTwofingertapEvent
  ): ButtonEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonEventMap]
  }
}

