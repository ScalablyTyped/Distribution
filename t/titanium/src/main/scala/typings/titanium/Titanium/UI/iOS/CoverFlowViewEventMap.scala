package typings.titanium.Titanium.UI.iOS

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverFlowViewEventMap extends ProxyEventMap {
  var change: CoverFlowViewChangeEvent
  var click: CoverFlowViewClickEvent
  var dblclick: CoverFlowViewDblclickEvent
  var doubletap: CoverFlowViewDoubletapEvent
  var keypressed: CoverFlowViewKeypressedEvent
  var longpress: CoverFlowViewLongpressEvent
  var pinch: CoverFlowViewPinchEvent
  var postlayout: CoverFlowViewPostlayoutEvent
  var singletap: CoverFlowViewSingletapEvent
  var swipe: CoverFlowViewSwipeEvent
  var touchcancel: CoverFlowViewTouchcancelEvent
  var touchend: CoverFlowViewTouchendEvent
  var touchmove: CoverFlowViewTouchmoveEvent
  var touchstart: CoverFlowViewTouchstartEvent
  var twofingertap: CoverFlowViewTwofingertapEvent
}

object CoverFlowViewEventMap {
  @scala.inline
  def apply(
    change: CoverFlowViewChangeEvent,
    click: CoverFlowViewClickEvent,
    dblclick: CoverFlowViewDblclickEvent,
    doubletap: CoverFlowViewDoubletapEvent,
    keypressed: CoverFlowViewKeypressedEvent,
    longpress: CoverFlowViewLongpressEvent,
    pinch: CoverFlowViewPinchEvent,
    postlayout: CoverFlowViewPostlayoutEvent,
    singletap: CoverFlowViewSingletapEvent,
    swipe: CoverFlowViewSwipeEvent,
    touchcancel: CoverFlowViewTouchcancelEvent,
    touchend: CoverFlowViewTouchendEvent,
    touchmove: CoverFlowViewTouchmoveEvent,
    touchstart: CoverFlowViewTouchstartEvent,
    twofingertap: CoverFlowViewTwofingertapEvent
  ): CoverFlowViewEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverFlowViewEventMap]
  }
}

