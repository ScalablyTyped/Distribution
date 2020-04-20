package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabbedBarEventMap extends ProxyEventMap {
  var click: TabbedBarClickEvent
  var dblclick: TabbedBarDblclickEvent
  var doubletap: TabbedBarDoubletapEvent
  var focus: TabbedBarFocusEvent
  var keypressed: TabbedBarKeypressedEvent
  var longclick: TabbedBarLongclickEvent
  var longpress: TabbedBarLongpressEvent
  var pinch: TabbedBarPinchEvent
  var postlayout: TabbedBarPostlayoutEvent
  var singletap: TabbedBarSingletapEvent
  var swipe: TabbedBarSwipeEvent
  var touchcancel: TabbedBarTouchcancelEvent
  var touchend: TabbedBarTouchendEvent
  var touchmove: TabbedBarTouchmoveEvent
  var touchstart: TabbedBarTouchstartEvent
  var twofingertap: TabbedBarTwofingertapEvent
}

object TabbedBarEventMap {
  @scala.inline
  def apply(
    click: TabbedBarClickEvent,
    dblclick: TabbedBarDblclickEvent,
    doubletap: TabbedBarDoubletapEvent,
    focus: TabbedBarFocusEvent,
    keypressed: TabbedBarKeypressedEvent,
    longclick: TabbedBarLongclickEvent,
    longpress: TabbedBarLongpressEvent,
    pinch: TabbedBarPinchEvent,
    postlayout: TabbedBarPostlayoutEvent,
    singletap: TabbedBarSingletapEvent,
    swipe: TabbedBarSwipeEvent,
    touchcancel: TabbedBarTouchcancelEvent,
    touchend: TabbedBarTouchendEvent,
    touchmove: TabbedBarTouchmoveEvent,
    touchstart: TabbedBarTouchstartEvent,
    twofingertap: TabbedBarTwofingertapEvent
  ): TabbedBarEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabbedBarEventMap]
  }
}

