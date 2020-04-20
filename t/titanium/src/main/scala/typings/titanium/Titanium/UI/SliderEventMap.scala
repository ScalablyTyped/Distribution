package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderEventMap extends ProxyEventMap {
  var change: SliderChangeEvent
  var click: SliderClickEvent
  var dblclick: SliderDblclickEvent
  var doubletap: SliderDoubletapEvent
  var focus: SliderFocusEvent
  var keypressed: SliderKeypressedEvent
  var longclick: SliderLongclickEvent
  var longpress: SliderLongpressEvent
  var pinch: SliderPinchEvent
  var postlayout: SliderPostlayoutEvent
  var singletap: SliderSingletapEvent
  var start: SliderStartEvent
  var stop: SliderStopEvent
  var swipe: SliderSwipeEvent
  var touchcancel: SliderTouchcancelEvent
  var touchend: SliderTouchendEvent
  var touchmove: SliderTouchmoveEvent
  var touchstart: SliderTouchstartEvent
  var twofingertap: SliderTwofingertapEvent
}

object SliderEventMap {
  @scala.inline
  def apply(
    change: SliderChangeEvent,
    click: SliderClickEvent,
    dblclick: SliderDblclickEvent,
    doubletap: SliderDoubletapEvent,
    focus: SliderFocusEvent,
    keypressed: SliderKeypressedEvent,
    longclick: SliderLongclickEvent,
    longpress: SliderLongpressEvent,
    pinch: SliderPinchEvent,
    postlayout: SliderPostlayoutEvent,
    singletap: SliderSingletapEvent,
    start: SliderStartEvent,
    stop: SliderStopEvent,
    swipe: SliderSwipeEvent,
    touchcancel: SliderTouchcancelEvent,
    touchend: SliderTouchendEvent,
    touchmove: SliderTouchmoveEvent,
    touchstart: SliderTouchstartEvent,
    twofingertap: SliderTwofingertapEvent
  ): SliderEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderEventMap]
  }
}

