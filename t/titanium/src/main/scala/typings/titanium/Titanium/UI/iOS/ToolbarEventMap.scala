package typings.titanium.Titanium.UI.iOS

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarEventMap extends ProxyEventMap {
  var click: ToolbarClickEvent
  var dblclick: ToolbarDblclickEvent
  var doubletap: ToolbarDoubletapEvent
  var keypressed: ToolbarKeypressedEvent
  var longpress: ToolbarLongpressEvent
  var pinch: ToolbarPinchEvent
  var postlayout: ToolbarPostlayoutEvent
  var singletap: ToolbarSingletapEvent
  var swipe: ToolbarSwipeEvent
  var touchcancel: ToolbarTouchcancelEvent
  var touchend: ToolbarTouchendEvent
  var touchmove: ToolbarTouchmoveEvent
  var touchstart: ToolbarTouchstartEvent
  var twofingertap: ToolbarTwofingertapEvent
}

object ToolbarEventMap {
  @scala.inline
  def apply(
    click: ToolbarClickEvent,
    dblclick: ToolbarDblclickEvent,
    doubletap: ToolbarDoubletapEvent,
    keypressed: ToolbarKeypressedEvent,
    longpress: ToolbarLongpressEvent,
    pinch: ToolbarPinchEvent,
    postlayout: ToolbarPostlayoutEvent,
    singletap: ToolbarSingletapEvent,
    swipe: ToolbarSwipeEvent,
    touchcancel: ToolbarTouchcancelEvent,
    touchend: ToolbarTouchendEvent,
    touchmove: ToolbarTouchmoveEvent,
    touchstart: ToolbarTouchstartEvent,
    twofingertap: ToolbarTwofingertapEvent
  ): ToolbarEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarEventMap]
  }
}

