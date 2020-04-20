package typings.vkOpenapi.vk.OpenAPI.Widgets

import typings.vkOpenapi.vkOpenapiNumbers.`1`
import typings.vkOpenapi.vkOpenapiNumbers.`2`
import typings.vkOpenapi.vkOpenapiNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppOptions extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[`1` | `2` | `3`] = js.undefined
}

object AppOptions {
  @scala.inline
  def apply(height: Int | Double = null, mode: `1` | `2` | `3` = null): AppOptions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppOptions]
  }
}

