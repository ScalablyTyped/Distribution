package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertDialogEventMap extends ProxyEventMap {
  var click: AlertDialogClickEvent
  var dblclick: AlertDialogDblclickEvent
  var doubletap: AlertDialogDoubletapEvent
  var focus: AlertDialogFocusEvent
  var keypressed: AlertDialogKeypressedEvent
  var longclick: AlertDialogLongclickEvent
  var longpress: AlertDialogLongpressEvent
  var pinch: AlertDialogPinchEvent
  var postlayout: AlertDialogPostlayoutEvent
  var singletap: AlertDialogSingletapEvent
  var swipe: AlertDialogSwipeEvent
  var touchcancel: AlertDialogTouchcancelEvent
  var touchend: AlertDialogTouchendEvent
  var touchmove: AlertDialogTouchmoveEvent
  var touchstart: AlertDialogTouchstartEvent
  var twofingertap: AlertDialogTwofingertapEvent
}

object AlertDialogEventMap {
  @scala.inline
  def apply(
    click: AlertDialogClickEvent,
    dblclick: AlertDialogDblclickEvent,
    doubletap: AlertDialogDoubletapEvent,
    focus: AlertDialogFocusEvent,
    keypressed: AlertDialogKeypressedEvent,
    longclick: AlertDialogLongclickEvent,
    longpress: AlertDialogLongpressEvent,
    pinch: AlertDialogPinchEvent,
    postlayout: AlertDialogPostlayoutEvent,
    singletap: AlertDialogSingletapEvent,
    swipe: AlertDialogSwipeEvent,
    touchcancel: AlertDialogTouchcancelEvent,
    touchend: AlertDialogTouchendEvent,
    touchmove: AlertDialogTouchmoveEvent,
    touchstart: AlertDialogTouchstartEvent,
    twofingertap: AlertDialogTwofingertapEvent
  ): AlertDialogEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertDialogEventMap]
  }
}

