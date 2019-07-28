package typings.w3cDashGenericDashSensor

import typings.std.Error
import typings.std.EventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SensorErrorEventInit extends EventInit {
  var error: Error
}

object SensorErrorEventInit {
  @scala.inline
  def apply(
    error: Error,
    bubbles: js.UndefOr[Boolean] = js.undefined,
    cancelable: js.UndefOr[Boolean] = js.undefined,
    composed: js.UndefOr[Boolean] = js.undefined
  ): SensorErrorEventInit = {
    val __obj = js.Dynamic.literal(error = error)
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    __obj.asInstanceOf[SensorErrorEventInit]
  }
}

