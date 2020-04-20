package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressBarEventMap extends ProxyEventMap {
  var click: ProgressBarClickEvent
  var dblclick: ProgressBarDblclickEvent
  var doubletap: ProgressBarDoubletapEvent
  var focus: ProgressBarFocusEvent
  var keypressed: ProgressBarKeypressedEvent
  var longclick: ProgressBarLongclickEvent
  var longpress: ProgressBarLongpressEvent
  var pinch: ProgressBarPinchEvent
  var postlayout: ProgressBarPostlayoutEvent
  var singletap: ProgressBarSingletapEvent
  var swipe: ProgressBarSwipeEvent
  var touchcancel: ProgressBarTouchcancelEvent
  var touchend: ProgressBarTouchendEvent
  var touchmove: ProgressBarTouchmoveEvent
  var touchstart: ProgressBarTouchstartEvent
  var twofingertap: ProgressBarTwofingertapEvent
}

object ProgressBarEventMap {
  @scala.inline
  def apply(
    click: ProgressBarClickEvent,
    dblclick: ProgressBarDblclickEvent,
    doubletap: ProgressBarDoubletapEvent,
    focus: ProgressBarFocusEvent,
    keypressed: ProgressBarKeypressedEvent,
    longclick: ProgressBarLongclickEvent,
    longpress: ProgressBarLongpressEvent,
    pinch: ProgressBarPinchEvent,
    postlayout: ProgressBarPostlayoutEvent,
    singletap: ProgressBarSingletapEvent,
    swipe: ProgressBarSwipeEvent,
    touchcancel: ProgressBarTouchcancelEvent,
    touchend: ProgressBarTouchendEvent,
    touchmove: ProgressBarTouchmoveEvent,
    touchstart: ProgressBarTouchstartEvent,
    twofingertap: ProgressBarTwofingertapEvent
  ): ProgressBarEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarEventMap]
  }
}

