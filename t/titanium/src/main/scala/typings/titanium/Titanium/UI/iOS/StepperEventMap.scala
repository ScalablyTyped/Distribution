package typings.titanium.Titanium.UI.iOS

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepperEventMap extends ProxyEventMap {
  var change: StepperChangeEvent
  var click: StepperClickEvent
  var dblclick: StepperDblclickEvent
  var doubletap: StepperDoubletapEvent
  var keypressed: StepperKeypressedEvent
  var longpress: StepperLongpressEvent
  var pinch: StepperPinchEvent
  var postlayout: StepperPostlayoutEvent
  var singletap: StepperSingletapEvent
  var swipe: StepperSwipeEvent
  var touchcancel: StepperTouchcancelEvent
  var touchend: StepperTouchendEvent
  var touchmove: StepperTouchmoveEvent
  var touchstart: StepperTouchstartEvent
  var twofingertap: StepperTwofingertapEvent
}

object StepperEventMap {
  @scala.inline
  def apply(
    change: StepperChangeEvent,
    click: StepperClickEvent,
    dblclick: StepperDblclickEvent,
    doubletap: StepperDoubletapEvent,
    keypressed: StepperKeypressedEvent,
    longpress: StepperLongpressEvent,
    pinch: StepperPinchEvent,
    postlayout: StepperPostlayoutEvent,
    singletap: StepperSingletapEvent,
    swipe: StepperSwipeEvent,
    touchcancel: StepperTouchcancelEvent,
    touchend: StepperTouchendEvent,
    touchmove: StepperTouchmoveEvent,
    touchstart: StepperTouchstartEvent,
    twofingertap: StepperTwofingertapEvent
  ): StepperEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepperEventMap]
  }
}

