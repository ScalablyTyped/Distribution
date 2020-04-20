package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerColumnEventMap extends ProxyEventMap {
  var click: PickerColumnClickEvent
  var dblclick: PickerColumnDblclickEvent
  var doubletap: PickerColumnDoubletapEvent
  var focus: PickerColumnFocusEvent
  var keypressed: PickerColumnKeypressedEvent
  var longclick: PickerColumnLongclickEvent
  var longpress: PickerColumnLongpressEvent
  var pinch: PickerColumnPinchEvent
  var postlayout: PickerColumnPostlayoutEvent
  var singletap: PickerColumnSingletapEvent
  var swipe: PickerColumnSwipeEvent
  var touchcancel: PickerColumnTouchcancelEvent
  var touchend: PickerColumnTouchendEvent
  var touchmove: PickerColumnTouchmoveEvent
  var touchstart: PickerColumnTouchstartEvent
  var twofingertap: PickerColumnTwofingertapEvent
}

object PickerColumnEventMap {
  @scala.inline
  def apply(
    click: PickerColumnClickEvent,
    dblclick: PickerColumnDblclickEvent,
    doubletap: PickerColumnDoubletapEvent,
    focus: PickerColumnFocusEvent,
    keypressed: PickerColumnKeypressedEvent,
    longclick: PickerColumnLongclickEvent,
    longpress: PickerColumnLongpressEvent,
    pinch: PickerColumnPinchEvent,
    postlayout: PickerColumnPostlayoutEvent,
    singletap: PickerColumnSingletapEvent,
    swipe: PickerColumnSwipeEvent,
    touchcancel: PickerColumnTouchcancelEvent,
    touchend: PickerColumnTouchendEvent,
    touchmove: PickerColumnTouchmoveEvent,
    touchstart: PickerColumnTouchstartEvent,
    twofingertap: PickerColumnTwofingertapEvent
  ): PickerColumnEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerColumnEventMap]
  }
}

