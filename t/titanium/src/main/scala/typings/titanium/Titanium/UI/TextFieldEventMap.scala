package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextFieldEventMap extends ProxyEventMap {
  var blur: TextFieldBlurEvent
  var change: TextFieldChangeEvent
  var click: TextFieldClickEvent
  var dblclick: TextFieldDblclickEvent
  var doubletap: TextFieldDoubletapEvent
  var focus: TextFieldFocusEvent
  var keypressed: TextFieldKeypressedEvent
  var longclick: TextFieldLongclickEvent
  var longpress: TextFieldLongpressEvent
  var pinch: TextFieldPinchEvent
  var postlayout: TextFieldPostlayoutEvent
  var `return`: TextFieldReturnEvent
  var singletap: TextFieldSingletapEvent
  var swipe: TextFieldSwipeEvent
  var touchcancel: TextFieldTouchcancelEvent
  var touchend: TextFieldTouchendEvent
  var touchmove: TextFieldTouchmoveEvent
  var touchstart: TextFieldTouchstartEvent
  var twofingertap: TextFieldTwofingertapEvent
}

object TextFieldEventMap {
  @scala.inline
  def apply(
    blur: TextFieldBlurEvent,
    change: TextFieldChangeEvent,
    click: TextFieldClickEvent,
    dblclick: TextFieldDblclickEvent,
    doubletap: TextFieldDoubletapEvent,
    focus: TextFieldFocusEvent,
    keypressed: TextFieldKeypressedEvent,
    longclick: TextFieldLongclickEvent,
    longpress: TextFieldLongpressEvent,
    pinch: TextFieldPinchEvent,
    postlayout: TextFieldPostlayoutEvent,
    `return`: TextFieldReturnEvent,
    singletap: TextFieldSingletapEvent,
    swipe: TextFieldSwipeEvent,
    touchcancel: TextFieldTouchcancelEvent,
    touchend: TextFieldTouchendEvent,
    touchmove: TextFieldTouchmoveEvent,
    touchstart: TextFieldTouchstartEvent,
    twofingertap: TextFieldTwofingertapEvent
  ): TextFieldEventMap = {
    val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFieldEventMap]
  }
}

