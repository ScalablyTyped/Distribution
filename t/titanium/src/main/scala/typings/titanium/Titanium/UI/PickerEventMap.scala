package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerEventMap extends ProxyEventMap {
  var change: PickerChangeEvent
  var click: PickerClickEvent
  var dblclick: PickerDblclickEvent
  var doubletap: PickerDoubletapEvent
  var focus: PickerFocusEvent
  var keypressed: PickerKeypressedEvent
  var longclick: PickerLongclickEvent
  var longpress: PickerLongpressEvent
  var pinch: PickerPinchEvent
  var postlayout: PickerPostlayoutEvent
  var singletap: PickerSingletapEvent
  var swipe: PickerSwipeEvent
  var touchcancel: PickerTouchcancelEvent
  var touchend: PickerTouchendEvent
  var touchmove: PickerTouchmoveEvent
  var touchstart: PickerTouchstartEvent
  var twofingertap: PickerTwofingertapEvent
}

object PickerEventMap {
  @scala.inline
  def apply(
    change: PickerChangeEvent,
    click: PickerClickEvent,
    dblclick: PickerDblclickEvent,
    doubletap: PickerDoubletapEvent,
    focus: PickerFocusEvent,
    keypressed: PickerKeypressedEvent,
    longclick: PickerLongclickEvent,
    longpress: PickerLongpressEvent,
    pinch: PickerPinchEvent,
    postlayout: PickerPostlayoutEvent,
    singletap: PickerSingletapEvent,
    swipe: PickerSwipeEvent,
    touchcancel: PickerTouchcancelEvent,
    touchend: PickerTouchendEvent,
    touchmove: PickerTouchmoveEvent,
    touchstart: PickerTouchstartEvent,
    twofingertap: PickerTwofingertapEvent
  ): PickerEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerEventMap]
  }
}

