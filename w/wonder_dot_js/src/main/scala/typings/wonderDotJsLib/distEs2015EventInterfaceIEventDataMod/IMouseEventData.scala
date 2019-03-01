package typings
package wonderDotJsLib.distEs2015EventInterfaceIEventDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMouseEventData extends IEventData {
  var button: scala.Double
  var clientX: scala.Double
  var clientY: scala.Double
  var currentTarget: stdLib.HTMLElement
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

object IMouseEventData {
  @scala.inline
  def apply(
    button: scala.Double,
    clientX: scala.Double,
    clientY: scala.Double,
    currentTarget: stdLib.HTMLElement,
    pageX: scala.Double,
    pageY: scala.Double,
    preventDefault: js.Function0[scala.Unit],
    returnValue: scala.Boolean,
    target: stdLib.HTMLElement,
    detail: scala.Int | scala.Double = null,
    movementX: scala.Int | scala.Double = null,
    movementY: scala.Int | scala.Double = null,
    mozMovementX: scala.Int | scala.Double = null,
    mozMovementY: scala.Int | scala.Double = null,
    webkitMovementX: scala.Int | scala.Double = null,
    webkitMovementY: scala.Int | scala.Double = null,
    wheelDelta: scala.Int | scala.Double = null
  ): IMouseEventData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("button")(button)
    __obj.updateDynamic("clientX")(clientX)
    __obj.updateDynamic("clientY")(clientY)
    __obj.updateDynamic("currentTarget")(currentTarget)
    __obj.updateDynamic("pageX")(pageX)
    __obj.updateDynamic("pageY")(pageY)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.updateDynamic("target")(target)
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (movementX != null) __obj.updateDynamic("movementX")(movementX.asInstanceOf[js.Any])
    if (movementY != null) __obj.updateDynamic("movementY")(movementY.asInstanceOf[js.Any])
    if (mozMovementX != null) __obj.updateDynamic("mozMovementX")(mozMovementX.asInstanceOf[js.Any])
    if (mozMovementY != null) __obj.updateDynamic("mozMovementY")(mozMovementY.asInstanceOf[js.Any])
    if (webkitMovementX != null) __obj.updateDynamic("webkitMovementX")(webkitMovementX.asInstanceOf[js.Any])
    if (webkitMovementY != null) __obj.updateDynamic("webkitMovementY")(webkitMovementY.asInstanceOf[js.Any])
    if (wheelDelta != null) __obj.updateDynamic("wheelDelta")(wheelDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseEventData]
  }
}

