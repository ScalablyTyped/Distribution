package typings.stylefire.cssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var enableHardwareAcceleration: js.UndefOr[Boolean] = js.undefined
  var preparseOutput: js.UndefOr[Boolean] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    enableHardwareAcceleration: js.UndefOr[Boolean] = js.undefined,
    preparseOutput: js.UndefOr[Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableHardwareAcceleration)) __obj.updateDynamic("enableHardwareAcceleration")(enableHardwareAcceleration.asInstanceOf[js.Any])
    if (!js.isUndefined(preparseOutput)) __obj.updateDynamic("preparseOutput")(preparseOutput.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

