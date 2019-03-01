package typings
package w3cDashGenericDashSensorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SensorErrorEventInit
  extends stdLib.EventInit {
  var error: stdLib.Error
}

object SensorErrorEventInit {
  @scala.inline
  def apply(
    error: stdLib.Error,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined
  ): SensorErrorEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    __obj.asInstanceOf[SensorErrorEventInit]
  }
}

