package typings.vkOpenapi.vk.OpenAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitParams extends js.Object {
  var apiId: Double
  var onlyWidgets: js.UndefOr[Boolean] = js.undefined
  var status: js.UndefOr[Boolean] = js.undefined
}

object InitParams {
  @scala.inline
  def apply(
    apiId: Double,
    onlyWidgets: js.UndefOr[Boolean] = js.undefined,
    status: js.UndefOr[Boolean] = js.undefined
  ): InitParams = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyWidgets)) __obj.updateDynamic("onlyWidgets")(onlyWidgets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitParams]
  }
}

