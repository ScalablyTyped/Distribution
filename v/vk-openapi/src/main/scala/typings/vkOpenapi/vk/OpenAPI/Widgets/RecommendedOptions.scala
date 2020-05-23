package typings.vkOpenapi.vk.OpenAPI.Widgets

import typings.vkOpenapi.vkOpenapiStrings.day
import typings.vkOpenapi.vkOpenapiStrings.month
import typings.vkOpenapi.vkOpenapiStrings.week
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecommendedOptions extends js.Object {
  var limit: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var period: js.UndefOr[day | week | month] = js.undefined
}

object RecommendedOptions {
  @scala.inline
  def apply(
    limit: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    period: day | week | month = null
  ): RecommendedOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecommendedOptions]
  }
}

