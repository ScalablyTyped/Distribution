package typings.vkOpenapi.vk.OpenAPI.Auth

import typings.vkOpenapi.vkOpenapiStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmptyLoginStatus extends js.Object {
  var session: Null
  var settings: js.UndefOr[scala.Nothing] = js.undefined
  var status: unknown
}

object EmptyLoginStatus {
  @scala.inline
  def apply(session: Null, status: unknown, settings: js.UndefOr[scala.Nothing] = js.undefined): EmptyLoginStatus = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (!js.isUndefined(settings)) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyLoginStatus]
  }
}

