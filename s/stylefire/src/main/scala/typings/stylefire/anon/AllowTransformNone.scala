package typings.stylefire.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowTransformNone extends js.Object {
  var allowTransformNone: js.UndefOr[Boolean] = js.undefined
  var enableHardwareAcceleration: js.UndefOr[Boolean] = js.undefined
  var isDashCase: js.UndefOr[Boolean] = js.undefined
}

object AllowTransformNone {
  @scala.inline
  def apply(
    allowTransformNone: js.UndefOr[Boolean] = js.undefined,
    enableHardwareAcceleration: js.UndefOr[Boolean] = js.undefined,
    isDashCase: js.UndefOr[Boolean] = js.undefined
  ): AllowTransformNone = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowTransformNone)) __obj.updateDynamic("allowTransformNone")(allowTransformNone.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableHardwareAcceleration)) __obj.updateDynamic("enableHardwareAcceleration")(enableHardwareAcceleration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isDashCase)) __obj.updateDynamic("isDashCase")(isDashCase.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowTransformNone]
  }
}

