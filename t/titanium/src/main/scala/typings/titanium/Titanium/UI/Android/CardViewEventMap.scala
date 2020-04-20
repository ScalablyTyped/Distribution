package typings.titanium.Titanium.UI.Android

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardViewEventMap extends ProxyEventMap {
  var click: CardViewClickEvent
  var dblclick: CardViewDblclickEvent
  var doubletap: CardViewDoubletapEvent
  var focus: CardViewFocusEvent
  var keypressed: CardViewKeypressedEvent
  var longclick: CardViewLongclickEvent
  var longpress: CardViewLongpressEvent
  var pinch: CardViewPinchEvent
  var postlayout: CardViewPostlayoutEvent
  var singletap: CardViewSingletapEvent
  var swipe: CardViewSwipeEvent
  var touchcancel: CardViewTouchcancelEvent
  var touchend: CardViewTouchendEvent
  var touchmove: CardViewTouchmoveEvent
  var touchstart: CardViewTouchstartEvent
  var twofingertap: CardViewTwofingertapEvent
}

object CardViewEventMap {
  @scala.inline
  def apply(
    click: CardViewClickEvent,
    dblclick: CardViewDblclickEvent,
    doubletap: CardViewDoubletapEvent,
    focus: CardViewFocusEvent,
    keypressed: CardViewKeypressedEvent,
    longclick: CardViewLongclickEvent,
    longpress: CardViewLongpressEvent,
    pinch: CardViewPinchEvent,
    postlayout: CardViewPostlayoutEvent,
    singletap: CardViewSingletapEvent,
    swipe: CardViewSwipeEvent,
    touchcancel: CardViewTouchcancelEvent,
    touchend: CardViewTouchendEvent,
    touchmove: CardViewTouchmoveEvent,
    touchstart: CardViewTouchstartEvent,
    twofingertap: CardViewTwofingertapEvent
  ): CardViewEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardViewEventMap]
  }
}

