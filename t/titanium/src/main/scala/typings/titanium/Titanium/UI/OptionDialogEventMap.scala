package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionDialogEventMap extends ProxyEventMap {
  var click: OptionDialogClickEvent
  var dblclick: OptionDialogDblclickEvent
  var doubletap: OptionDialogDoubletapEvent
  var focus: OptionDialogFocusEvent
  var keypressed: OptionDialogKeypressedEvent
  var longclick: OptionDialogLongclickEvent
  var longpress: OptionDialogLongpressEvent
  var pinch: OptionDialogPinchEvent
  var postlayout: OptionDialogPostlayoutEvent
  var singletap: OptionDialogSingletapEvent
  var swipe: OptionDialogSwipeEvent
  var touchcancel: OptionDialogTouchcancelEvent
  var touchend: OptionDialogTouchendEvent
  var touchmove: OptionDialogTouchmoveEvent
  var touchstart: OptionDialogTouchstartEvent
  var twofingertap: OptionDialogTwofingertapEvent
}

object OptionDialogEventMap {
  @scala.inline
  def apply(
    click: OptionDialogClickEvent,
    dblclick: OptionDialogDblclickEvent,
    doubletap: OptionDialogDoubletapEvent,
    focus: OptionDialogFocusEvent,
    keypressed: OptionDialogKeypressedEvent,
    longclick: OptionDialogLongclickEvent,
    longpress: OptionDialogLongpressEvent,
    pinch: OptionDialogPinchEvent,
    postlayout: OptionDialogPostlayoutEvent,
    singletap: OptionDialogSingletapEvent,
    swipe: OptionDialogSwipeEvent,
    touchcancel: OptionDialogTouchcancelEvent,
    touchend: OptionDialogTouchendEvent,
    touchmove: OptionDialogTouchmoveEvent,
    touchstart: OptionDialogTouchstartEvent,
    twofingertap: OptionDialogTwofingertapEvent
  ): OptionDialogEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionDialogEventMap]
  }
}

