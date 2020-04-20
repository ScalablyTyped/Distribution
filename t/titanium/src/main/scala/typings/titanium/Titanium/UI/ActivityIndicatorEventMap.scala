package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityIndicatorEventMap extends ProxyEventMap {
  var click: ActivityIndicatorClickEvent
  var dblclick: ActivityIndicatorDblclickEvent
  var doubletap: ActivityIndicatorDoubletapEvent
  var focus: ActivityIndicatorFocusEvent
  var keypressed: ActivityIndicatorKeypressedEvent
  var longclick: ActivityIndicatorLongclickEvent
  var longpress: ActivityIndicatorLongpressEvent
  var pinch: ActivityIndicatorPinchEvent
  var postlayout: ActivityIndicatorPostlayoutEvent
  var singletap: ActivityIndicatorSingletapEvent
  var swipe: ActivityIndicatorSwipeEvent
  var touchcancel: ActivityIndicatorTouchcancelEvent
  var touchend: ActivityIndicatorTouchendEvent
  var touchmove: ActivityIndicatorTouchmoveEvent
  var touchstart: ActivityIndicatorTouchstartEvent
  var twofingertap: ActivityIndicatorTwofingertapEvent
}

object ActivityIndicatorEventMap {
  @scala.inline
  def apply(
    click: ActivityIndicatorClickEvent,
    dblclick: ActivityIndicatorDblclickEvent,
    doubletap: ActivityIndicatorDoubletapEvent,
    focus: ActivityIndicatorFocusEvent,
    keypressed: ActivityIndicatorKeypressedEvent,
    longclick: ActivityIndicatorLongclickEvent,
    longpress: ActivityIndicatorLongpressEvent,
    pinch: ActivityIndicatorPinchEvent,
    postlayout: ActivityIndicatorPostlayoutEvent,
    singletap: ActivityIndicatorSingletapEvent,
    swipe: ActivityIndicatorSwipeEvent,
    touchcancel: ActivityIndicatorTouchcancelEvent,
    touchend: ActivityIndicatorTouchendEvent,
    touchmove: ActivityIndicatorTouchmoveEvent,
    touchstart: ActivityIndicatorTouchstartEvent,
    twofingertap: ActivityIndicatorTwofingertapEvent
  ): ActivityIndicatorEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityIndicatorEventMap]
  }
}

