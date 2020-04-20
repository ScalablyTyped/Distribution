package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonBarEventMap extends ProxyEventMap {
  var click: ButtonBarClickEvent
  var dblclick: ButtonBarDblclickEvent
  var doubletap: ButtonBarDoubletapEvent
  var keypressed: ButtonBarKeypressedEvent
  var longpress: ButtonBarLongpressEvent
  var pinch: ButtonBarPinchEvent
  var postlayout: ButtonBarPostlayoutEvent
  var singletap: ButtonBarSingletapEvent
  var swipe: ButtonBarSwipeEvent
  var touchcancel: ButtonBarTouchcancelEvent
  var touchend: ButtonBarTouchendEvent
  var touchmove: ButtonBarTouchmoveEvent
  var touchstart: ButtonBarTouchstartEvent
  var twofingertap: ButtonBarTwofingertapEvent
}

object ButtonBarEventMap {
  @scala.inline
  def apply(
    click: ButtonBarClickEvent,
    dblclick: ButtonBarDblclickEvent,
    doubletap: ButtonBarDoubletapEvent,
    keypressed: ButtonBarKeypressedEvent,
    longpress: ButtonBarLongpressEvent,
    pinch: ButtonBarPinchEvent,
    postlayout: ButtonBarPostlayoutEvent,
    singletap: ButtonBarSingletapEvent,
    swipe: ButtonBarSwipeEvent,
    touchcancel: ButtonBarTouchcancelEvent,
    touchend: ButtonBarTouchendEvent,
    touchmove: ButtonBarTouchmoveEvent,
    touchstart: ButtonBarTouchstartEvent,
    twofingertap: ButtonBarTwofingertapEvent
  ): ButtonBarEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonBarEventMap]
  }
}

