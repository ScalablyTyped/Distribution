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
  def apply(limit: Int | Double = null, max: Int | Double = null, period: day | week | month = null): RecommendedOptions = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecommendedOptions]
  }
}

