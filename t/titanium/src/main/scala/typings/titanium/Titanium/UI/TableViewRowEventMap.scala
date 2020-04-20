package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableViewRowEventMap extends ProxyEventMap {
  var click: TableViewRowClickEvent
  var dblclick: TableViewRowDblclickEvent
  var doubletap: TableViewRowDoubletapEvent
  var focus: TableViewRowFocusEvent
  var keypressed: TableViewRowKeypressedEvent
  var longclick: TableViewRowLongclickEvent
  var longpress: TableViewRowLongpressEvent
  var pinch: TableViewRowPinchEvent
  var postlayout: TableViewRowPostlayoutEvent
  var singletap: TableViewRowSingletapEvent
  var swipe: TableViewRowSwipeEvent
  var touchcancel: TableViewRowTouchcancelEvent
  var touchend: TableViewRowTouchendEvent
  var touchmove: TableViewRowTouchmoveEvent
  var touchstart: TableViewRowTouchstartEvent
  var twofingertap: TableViewRowTwofingertapEvent
}

object TableViewRowEventMap {
  @scala.inline
  def apply(
    click: TableViewRowClickEvent,
    dblclick: TableViewRowDblclickEvent,
    doubletap: TableViewRowDoubletapEvent,
    focus: TableViewRowFocusEvent,
    keypressed: TableViewRowKeypressedEvent,
    longclick: TableViewRowLongclickEvent,
    longpress: TableViewRowLongpressEvent,
    pinch: TableViewRowPinchEvent,
    postlayout: TableViewRowPostlayoutEvent,
    singletap: TableViewRowSingletapEvent,
    swipe: TableViewRowSwipeEvent,
    touchcancel: TableViewRowTouchcancelEvent,
    touchend: TableViewRowTouchendEvent,
    touchmove: TableViewRowTouchmoveEvent,
    touchstart: TableViewRowTouchstartEvent,
    twofingertap: TableViewRowTwofingertapEvent
  ): TableViewRowEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewRowEventMap]
  }
}

