package typings.vkOpenapi.vk.OpenAPI.Widgets

import typings.vkOpenapi.vk.OpenAPI.NumericBoolean
import typings.vkOpenapi.vkOpenapiNumbers.`1`
import typings.vkOpenapi.vkOpenapiNumbers.`3`
import typings.vkOpenapi.vkOpenapiNumbers.`4`
import typings.vkOpenapi.vkOpenapiStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupOptions extends js.Object {
  var color1: js.UndefOr[String] = js.undefined
  var color2: js.UndefOr[String] = js.undefined
  var color3: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[`1` | `3` | `4`] = js.undefined
  var no_cover: js.UndefOr[NumericBoolean] = js.undefined
  var wide: js.UndefOr[NumericBoolean] = js.undefined
  var width: js.UndefOr[Double | auto] = js.undefined
}

object GroupOptions {
  @scala.inline
  def apply(
    color1: String = null,
    color2: String = null,
    color3: String = null,
    height: js.UndefOr[Double] = js.undefined,
    mode: `1` | `3` | `4` = null,
    no_cover: NumericBoolean = null,
    wide: NumericBoolean = null,
    width: Double | auto = null
  ): GroupOptions = {
    val __obj = js.Dynamic.literal()
    if (color1 != null) __obj.updateDynamic("color1")(color1.asInstanceOf[js.Any])
    if (color2 != null) __obj.updateDynamic("color2")(color2.asInstanceOf[js.Any])
    if (color3 != null) __obj.updateDynamic("color3")(color3.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (no_cover != null) __obj.updateDynamic("no_cover")(no_cover.asInstanceOf[js.Any])
    if (wide != null) __obj.updateDynamic("wide")(wide.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupOptions]
  }
}

