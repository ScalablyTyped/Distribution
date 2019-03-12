package typings
package wonderDotJsLib.distEs2015EventInterfaceIEventDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPointEventData extends IEventData {
  var button: js.UndefOr[scala.Double] = js.undefined
  var clientX: scala.Double
  var clientY: scala.Double
  var currentTarget: stdLib.HTMLElement | scala.Null
  var detail: js.UndefOr[scala.Double] = js.undefined
  var movementX: js.UndefOr[scala.Double] = js.undefined
  var movementY: js.UndefOr[scala.Double] = js.undefined
  var mozMovementX: js.UndefOr[scala.Double] = js.undefined
  var mozMovementY: js.UndefOr[scala.Double] = js.undefined
  var pageX: scala.Double
  var pageY: scala.Double
  var target: stdLib.HTMLElement
  var webkitMovementX: js.UndefOr[scala.Double] = js.undefined
  var webkitMovementY: js.UndefOr[scala.Double] = js.undefined
  var wheelDelta: js.UndefOr[scala.Double] = js.undefined
}

object IPointEventData {
  @scala.inline
  def apply(
    clientX: scala.Double,
    clientY: scala.Double,
    pageX: scala.Double,
    pageY: scala.Double,
    preventDefault: () => scala.Unit,
    returnValue: scala.Boolean,
    target: stdLib.HTMLElement,
    button: scala.Int | scala.Double = null,
    currentTarget: stdLib.HTMLElement = null,
    detail: scala.Int | scala.Double = null,
    movementX: scala.Int | scala.Double = null,
    movementY: scala.Int | scala.Double = null,
    mozMovementX: scala.Int | scala.Double = null,
    mozMovementY: scala.Int | scala.Double = null,
    webkitMovementX: scala.Int | scala.Double = null,
    webkitMovementY: scala.Int | scala.Double = null,
    wheelDelta: scala.Int | scala.Double = null
  ): IPointEventData = {
    val __obj = js.Dynamic.literal(clientX = clientX, clientY = clientY, pageX = pageX, pageY = pageY, preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue, target = target)
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (currentTarget != null) __obj.updateDynamic("currentTarget")(currentTarget)
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (movementX != null) __obj.updateDynamic("movementX")(movementX.asInstanceOf[js.Any])
    if (movementY != null) __obj.updateDynamic("movementY")(movementY.asInstanceOf[js.Any])
    if (mozMovementX != null) __obj.updateDynamic("mozMovementX")(mozMovementX.asInstanceOf[js.Any])
    if (mozMovementY != null) __obj.updateDynamic("mozMovementY")(mozMovementY.asInstanceOf[js.Any])
    if (webkitMovementX != null) __obj.updateDynamic("webkitMovementX")(webkitMovementX.asInstanceOf[js.Any])
    if (webkitMovementY != null) __obj.updateDynamic("webkitMovementY")(webkitMovementY.asInstanceOf[js.Any])
    if (wheelDelta != null) __obj.updateDynamic("wheelDelta")(wheelDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPointEventData]
  }
}

