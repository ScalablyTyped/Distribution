package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailDialogEventMap extends ProxyEventMap {
  var click: EmailDialogClickEvent
  var complete: EmailDialogCompleteEvent
  var dblclick: EmailDialogDblclickEvent
  var doubletap: EmailDialogDoubletapEvent
  var focus: EmailDialogFocusEvent
  var keypressed: EmailDialogKeypressedEvent
  var longclick: EmailDialogLongclickEvent
  var longpress: EmailDialogLongpressEvent
  var pinch: EmailDialogPinchEvent
  var postlayout: EmailDialogPostlayoutEvent
  var singletap: EmailDialogSingletapEvent
  var swipe: EmailDialogSwipeEvent
  var touchcancel: EmailDialogTouchcancelEvent
  var touchend: EmailDialogTouchendEvent
  var touchmove: EmailDialogTouchmoveEvent
  var touchstart: EmailDialogTouchstartEvent
  var twofingertap: EmailDialogTwofingertapEvent
}

object EmailDialogEventMap {
  @scala.inline
  def apply(
    click: EmailDialogClickEvent,
    complete: EmailDialogCompleteEvent,
    dblclick: EmailDialogDblclickEvent,
    doubletap: EmailDialogDoubletapEvent,
    focus: EmailDialogFocusEvent,
    keypressed: EmailDialogKeypressedEvent,
    longclick: EmailDialogLongclickEvent,
    longpress: EmailDialogLongpressEvent,
    pinch: EmailDialogPinchEvent,
    postlayout: EmailDialogPostlayoutEvent,
    singletap: EmailDialogSingletapEvent,
    swipe: EmailDialogSwipeEvent,
    touchcancel: EmailDialogTouchcancelEvent,
    touchend: EmailDialogTouchendEvent,
    touchmove: EmailDialogTouchmoveEvent,
    touchstart: EmailDialogTouchstartEvent,
    twofingertap: EmailDialogTwofingertapEvent
  ): EmailDialogEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailDialogEventMap]
  }
}

