package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerRowEventMap extends ProxyEventMap {
  var click: PickerRowClickEvent
  var dblclick: PickerRowDblclickEvent
  var doubletap: PickerRowDoubletapEvent
  var focus: PickerRowFocusEvent
  var keypressed: PickerRowKeypressedEvent
  var longclick: PickerRowLongclickEvent
  var longpress: PickerRowLongpressEvent
  var pinch: PickerRowPinchEvent
  var postlayout: PickerRowPostlayoutEvent
  var singletap: PickerRowSingletapEvent
  var swipe: PickerRowSwipeEvent
  var touchcancel: PickerRowTouchcancelEvent
  var touchend: PickerRowTouchendEvent
  var touchmove: PickerRowTouchmoveEvent
  var touchstart: PickerRowTouchstartEvent
  var twofingertap: PickerRowTwofingertapEvent
}

object PickerRowEventMap {
  @scala.inline
  def apply(
    click: PickerRowClickEvent,
    dblclick: PickerRowDblclickEvent,
    doubletap: PickerRowDoubletapEvent,
    focus: PickerRowFocusEvent,
    keypressed: PickerRowKeypressedEvent,
    longclick: PickerRowLongclickEvent,
    longpress: PickerRowLongpressEvent,
    pinch: PickerRowPinchEvent,
    postlayout: PickerRowPostlayoutEvent,
    singletap: PickerRowSingletapEvent,
    swipe: PickerRowSwipeEvent,
    touchcancel: PickerRowTouchcancelEvent,
    touchend: PickerRowTouchendEvent,
    touchmove: PickerRowTouchmoveEvent,
    touchstart: PickerRowTouchstartEvent,
    twofingertap: PickerRowTwofingertapEvent
  ): PickerRowEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerRowEventMap]
  }
}

