package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabEventMap extends ProxyEventMap {
  var click: TabClickEvent
  var dblclick: TabDblclickEvent
  var doubletap: TabDoubletapEvent
  var keypressed: TabKeypressedEvent
  var longclick: TabLongclickEvent
  var longpress: TabLongpressEvent
  var pinch: TabPinchEvent
  var postlayout: TabPostlayoutEvent
  var selected: TabSelectedEvent
  var singletap: TabSingletapEvent
  var swipe: TabSwipeEvent
  var touchcancel: TabTouchcancelEvent
  var touchend: TabTouchendEvent
  var touchmove: TabTouchmoveEvent
  var touchstart: TabTouchstartEvent
  var twofingertap: TabTwofingertapEvent
  var unselected: TabUnselectedEvent
}

object TabEventMap {
  @scala.inline
  def apply(
    click: TabClickEvent,
    dblclick: TabDblclickEvent,
    doubletap: TabDoubletapEvent,
    keypressed: TabKeypressedEvent,
    longclick: TabLongclickEvent,
    longpress: TabLongpressEvent,
    pinch: TabPinchEvent,
    postlayout: TabPostlayoutEvent,
    selected: TabSelectedEvent,
    singletap: TabSingletapEvent,
    swipe: TabSwipeEvent,
    touchcancel: TabTouchcancelEvent,
    touchend: TabTouchendEvent,
    touchmove: TabTouchmoveEvent,
    touchstart: TabTouchstartEvent,
    twofingertap: TabTwofingertapEvent,
    unselected: TabUnselectedEvent
  ): TabEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any], unselected = unselected.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabEventMap]
  }
}

