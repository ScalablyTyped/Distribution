package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaskedImageEventMap extends ProxyEventMap {
  var click: MaskedImageClickEvent
  var dblclick: MaskedImageDblclickEvent
  var doubletap: MaskedImageDoubletapEvent
  var focus: MaskedImageFocusEvent
  var keypressed: MaskedImageKeypressedEvent
  var longclick: MaskedImageLongclickEvent
  var longpress: MaskedImageLongpressEvent
  var pinch: MaskedImagePinchEvent
  var postlayout: MaskedImagePostlayoutEvent
  var singletap: MaskedImageSingletapEvent
  var swipe: MaskedImageSwipeEvent
  var touchcancel: MaskedImageTouchcancelEvent
  var touchend: MaskedImageTouchendEvent
  var touchmove: MaskedImageTouchmoveEvent
  var touchstart: MaskedImageTouchstartEvent
  var twofingertap: MaskedImageTwofingertapEvent
}

object MaskedImageEventMap {
  @scala.inline
  def apply(
    click: MaskedImageClickEvent,
    dblclick: MaskedImageDblclickEvent,
    doubletap: MaskedImageDoubletapEvent,
    focus: MaskedImageFocusEvent,
    keypressed: MaskedImageKeypressedEvent,
    longclick: MaskedImageLongclickEvent,
    longpress: MaskedImageLongpressEvent,
    pinch: MaskedImagePinchEvent,
    postlayout: MaskedImagePostlayoutEvent,
    singletap: MaskedImageSingletapEvent,
    swipe: MaskedImageSwipeEvent,
    touchcancel: MaskedImageTouchcancelEvent,
    touchend: MaskedImageTouchendEvent,
    touchmove: MaskedImageTouchmoveEvent,
    touchstart: MaskedImageTouchstartEvent,
    twofingertap: MaskedImageTwofingertapEvent
  ): MaskedImageEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskedImageEventMap]
  }
}

