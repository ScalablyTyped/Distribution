package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchEventMap extends ProxyEventMap {
  var change: SwitchChangeEvent
  var click: SwitchClickEvent
  var dblclick: SwitchDblclickEvent
  var doubletap: SwitchDoubletapEvent
  var focus: SwitchFocusEvent
  var keypressed: SwitchKeypressedEvent
  var longclick: SwitchLongclickEvent
  var longpress: SwitchLongpressEvent
  var pinch: SwitchPinchEvent
  var postlayout: SwitchPostlayoutEvent
  var singletap: SwitchSingletapEvent
  var swipe: SwitchSwipeEvent
  var touchcancel: SwitchTouchcancelEvent
  var touchend: SwitchTouchendEvent
  var touchmove: SwitchTouchmoveEvent
  var touchstart: SwitchTouchstartEvent
  var twofingertap: SwitchTwofingertapEvent
}

object SwitchEventMap {
  @scala.inline
  def apply(
    change: SwitchChangeEvent,
    click: SwitchClickEvent,
    dblclick: SwitchDblclickEvent,
    doubletap: SwitchDoubletapEvent,
    focus: SwitchFocusEvent,
    keypressed: SwitchKeypressedEvent,
    longclick: SwitchLongclickEvent,
    longpress: SwitchLongpressEvent,
    pinch: SwitchPinchEvent,
    postlayout: SwitchPostlayoutEvent,
    singletap: SwitchSingletapEvent,
    swipe: SwitchSwipeEvent,
    touchcancel: SwitchTouchcancelEvent,
    touchend: SwitchTouchendEvent,
    touchmove: SwitchTouchmoveEvent,
    touchstart: SwitchTouchstartEvent,
    twofingertap: SwitchTwofingertapEvent
  ): SwitchEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchEventMap]
  }
}

