package typings.wonderJs.ieventdataMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMouseEventData extends IEventData {
  var button: Double
  var clientX: Double
  var clientY: Double
  var currentTarget: HTMLElement
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

object IMouseEventData {
  @scala.inline
  def apply(
    button: Double,
    clientX: Double,
    clientY: Double,
    currentTarget: HTMLElement,
    pageX: Double,
    pageY: Double,
    preventDefault: () => Unit,
    returnValue: Boolean,
    target: HTMLElement,
    detail: js.UndefOr[Double] = js.undefined,
    movementX: js.UndefOr[Double] = js.undefined,
    movementY: js.UndefOr[Double] = js.undefined,
    mozMovementX: js.UndefOr[Double] = js.undefined,
    mozMovementY: js.UndefOr[Double] = js.undefined,
    webkitMovementX: js.UndefOr[Double] = js.undefined,
    webkitMovementY: js.UndefOr[Double] = js.undefined,
    wheelDelta: js.UndefOr[Double] = js.undefined
  ): IMouseEventData = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (!js.isUndefined(detail)) __obj.updateDynamic("detail")(detail.get.asInstanceOf[js.Any])
    if (!js.isUndefined(movementX)) __obj.updateDynamic("movementX")(movementX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(movementY)) __obj.updateDynamic("movementY")(movementY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mozMovementX)) __obj.updateDynamic("mozMovementX")(mozMovementX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mozMovementY)) __obj.updateDynamic("mozMovementY")(mozMovementY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(webkitMovementX)) __obj.updateDynamic("webkitMovementX")(webkitMovementX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(webkitMovementY)) __obj.updateDynamic("webkitMovementY")(webkitMovementY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wheelDelta)) __obj.updateDynamic("wheelDelta")(wheelDelta.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseEventData]
  }
}

