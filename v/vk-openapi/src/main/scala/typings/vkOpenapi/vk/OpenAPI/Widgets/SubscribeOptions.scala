package typings.vkOpenapi.vk.OpenAPI.Widgets

import typings.vkOpenapi.vk.OpenAPI.NumericBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeOptions extends js.Object {
  var mode: js.UndefOr[NumericBoolean] = js.undefined
  var soft: js.UndefOr[NumericBoolean] = js.undefined
}

object SubscribeOptions {
  @scala.inline
  def apply(mode: NumericBoolean = null, soft: NumericBoolean = null): SubscribeOptions = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (soft != null) __obj.updateDynamic("soft")(soft.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeOptions]
  }
}

