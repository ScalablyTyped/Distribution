package typings.titanium.Titanium.UI.iOS

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlurViewEventMap extends ProxyEventMap {
  var click: BlurViewClickEvent
  var dblclick: BlurViewDblclickEvent
  var doubletap: BlurViewDoubletapEvent
  var keypressed: BlurViewKeypressedEvent
  var longpress: BlurViewLongpressEvent
  var pinch: BlurViewPinchEvent
  var postlayout: BlurViewPostlayoutEvent
  var singletap: BlurViewSingletapEvent
  var swipe: BlurViewSwipeEvent
  var touchcancel: BlurViewTouchcancelEvent
  var touchend: BlurViewTouchendEvent
  var touchmove: BlurViewTouchmoveEvent
  var touchstart: BlurViewTouchstartEvent
  var twofingertap: BlurViewTwofingertapEvent
}

object BlurViewEventMap {
  @scala.inline
  def apply(
    click: BlurViewClickEvent,
    dblclick: BlurViewDblclickEvent,
    doubletap: BlurViewDoubletapEvent,
    keypressed: BlurViewKeypressedEvent,
    longpress: BlurViewLongpressEvent,
    pinch: BlurViewPinchEvent,
    postlayout: BlurViewPostlayoutEvent,
    singletap: BlurViewSingletapEvent,
    swipe: BlurViewSwipeEvent,
    touchcancel: BlurViewTouchcancelEvent,
    touchend: BlurViewTouchendEvent,
    touchmove: BlurViewTouchmoveEvent,
    touchstart: BlurViewTouchstartEvent,
    twofingertap: BlurViewTwofingertapEvent
  ): BlurViewEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlurViewEventMap]
  }
}

