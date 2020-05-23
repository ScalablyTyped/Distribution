package typings.stylefire.cssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var allowTransformNone: js.UndefOr[Boolean] = js.undefined
  var enableHardwareAcceleration: js.UndefOr[Boolean] = js.undefined
  var preparseOutput: js.UndefOr[Boolean] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    allowTransformNone: js.UndefOr[Boolean] = js.undefined,
    enableHardwareAcceleration: js.UndefOr[Boolean] = js.undefined,
    preparseOutput: js.UndefOr[Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowTransformNone)) __obj.updateDynamic("allowTransformNone")(allowTransformNone.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableHardwareAcceleration)) __obj.updateDynamic("enableHardwareAcceleration")(enableHardwareAcceleration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preparseOutput)) __obj.updateDynamic("preparseOutput")(preparseOutput.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

