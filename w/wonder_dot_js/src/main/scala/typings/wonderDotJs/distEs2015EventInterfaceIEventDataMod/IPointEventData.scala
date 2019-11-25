package typings.wonderDotJs.distEs2015EventInterfaceIEventDataMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPointEventData extends IEventData {
  var button: js.UndefOr[Double] = js.undefined
  var clientX: Double
  var clientY: Double
  var currentTarget: HTMLElement | Null
  var detail: js.UndefOr[Double] = js.undefined
  var movementX: js.UndefOr[Double] = js.undefined
  var movementY: js.UndefOr[Double] = js.undefined
  var mozMovementX: js.UndefOr[Double] = js.undefined
  var mozMovementY: js.UndefOr[Double] = js.undefined
  var pageX: Double
  var pageY: Double
  var target: HTMLElement
  var webkitMovementX: js.UndefOr[Double] = js.undefined
  var webkitMovementY: js.UndefOr[Double] = js.undefined
  var wheelDelta: js.UndefOr[Double] = js.undefined
}

object IPointEventData {
  @scala.inline
  def apply(
    clientX: Double,
    clientY: Double,
    pageX: Double,
    pageY: Double,
    preventDefault: () => Unit,
    returnValue: Boolean,
    target: HTMLElement,
    button: Int | Double = null,
    currentTarget: HTMLElement = null,
    detail: Int | Double = null,
    movementX: Int | Double = null,
    movementY: Int | Double = null,
    mozMovementX: Int | Double = null,
    mozMovementY: Int | Double = null,
    webkitMovementX: Int | Double = null,
    webkitMovementY: Int | Double = null,
    wheelDelta: Int | Double = null
  ): IPointEventData = {
    val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (currentTarget != null) __obj.updateDynamic("currentTarget")(currentTarget.asInstanceOf[js.Any])
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

