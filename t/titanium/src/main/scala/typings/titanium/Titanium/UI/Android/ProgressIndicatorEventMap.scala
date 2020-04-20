package typings.titanium.Titanium.UI.Android

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressIndicatorEventMap extends ProxyEventMap {
  var cancel: ProgressIndicatorCancelEvent
  var click: ProgressIndicatorClickEvent
  var dblclick: ProgressIndicatorDblclickEvent
  var doubletap: ProgressIndicatorDoubletapEvent
  var focus: ProgressIndicatorFocusEvent
  var keypressed: ProgressIndicatorKeypressedEvent
  var longclick: ProgressIndicatorLongclickEvent
  var longpress: ProgressIndicatorLongpressEvent
  var pinch: ProgressIndicatorPinchEvent
  var postlayout: ProgressIndicatorPostlayoutEvent
  var singletap: ProgressIndicatorSingletapEvent
  var swipe: ProgressIndicatorSwipeEvent
  var touchcancel: ProgressIndicatorTouchcancelEvent
  var touchend: ProgressIndicatorTouchendEvent
  var touchmove: ProgressIndicatorTouchmoveEvent
  var touchstart: ProgressIndicatorTouchstartEvent
  var twofingertap: ProgressIndicatorTwofingertapEvent
}

object ProgressIndicatorEventMap {
  @scala.inline
  def apply(
    cancel: ProgressIndicatorCancelEvent,
    click: ProgressIndicatorClickEvent,
    dblclick: ProgressIndicatorDblclickEvent,
    doubletap: ProgressIndicatorDoubletapEvent,
    focus: ProgressIndicatorFocusEvent,
    keypressed: ProgressIndicatorKeypressedEvent,
    longclick: ProgressIndicatorLongclickEvent,
    longpress: ProgressIndicatorLongpressEvent,
    pinch: ProgressIndicatorPinchEvent,
    postlayout: ProgressIndicatorPostlayoutEvent,
    singletap: ProgressIndicatorSingletapEvent,
    swipe: ProgressIndicatorSwipeEvent,
    touchcancel: ProgressIndicatorTouchcancelEvent,
    touchend: ProgressIndicatorTouchendEvent,
    touchmove: ProgressIndicatorTouchmoveEvent,
    touchstart: ProgressIndicatorTouchstartEvent,
    twofingertap: ProgressIndicatorTwofingertapEvent
  ): ProgressIndicatorEventMap = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressIndicatorEventMap]
  }
}

