package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextAreaEventMap extends ProxyEventMap {
  var blur: TextAreaBlurEvent
  var change: TextAreaChangeEvent
  var click: TextAreaClickEvent
  var dblclick: TextAreaDblclickEvent
  var doubletap: TextAreaDoubletapEvent
  var focus: TextAreaFocusEvent
  var keypressed: TextAreaKeypressedEvent
  var link: TextAreaLinkEvent
  var longclick: TextAreaLongclickEvent
  var longpress: TextAreaLongpressEvent
  var pinch: TextAreaPinchEvent
  var postlayout: TextAreaPostlayoutEvent
  var `return`: TextAreaReturnEvent
  var selected: TextAreaSelectedEvent
  var singletap: TextAreaSingletapEvent
  var swipe: TextAreaSwipeEvent
  var touchcancel: TextAreaTouchcancelEvent
  var touchend: TextAreaTouchendEvent
  var touchmove: TextAreaTouchmoveEvent
  var touchstart: TextAreaTouchstartEvent
  var twofingertap: TextAreaTwofingertapEvent
}

object TextAreaEventMap {
  @scala.inline
  def apply(
    blur: TextAreaBlurEvent,
    change: TextAreaChangeEvent,
    click: TextAreaClickEvent,
    dblclick: TextAreaDblclickEvent,
    doubletap: TextAreaDoubletapEvent,
    focus: TextAreaFocusEvent,
    keypressed: TextAreaKeypressedEvent,
    link: TextAreaLinkEvent,
    longclick: TextAreaLongclickEvent,
    longpress: TextAreaLongpressEvent,
    pinch: TextAreaPinchEvent,
    postlayout: TextAreaPostlayoutEvent,
    `return`: TextAreaReturnEvent,
    selected: TextAreaSelectedEvent,
    singletap: TextAreaSingletapEvent,
    swipe: TextAreaSwipeEvent,
    touchcancel: TextAreaTouchcancelEvent,
    touchend: TextAreaTouchendEvent,
    touchmove: TextAreaTouchmoveEvent,
    touchstart: TextAreaTouchstartEvent,
    twofingertap: TextAreaTwofingertapEvent
  ): TextAreaEventMap = {
    val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAreaEventMap]
  }
}

