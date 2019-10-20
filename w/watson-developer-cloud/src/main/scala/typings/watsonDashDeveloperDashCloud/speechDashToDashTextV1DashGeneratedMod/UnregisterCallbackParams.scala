package typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `unregisterCallback` operation. */
trait UnregisterCallbackParams extends js.Object {
  /** The callback URL that is to be unregistered. */
  var callback_url: String
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object UnregisterCallbackParams {
  @scala.inline
  def apply(
    callback_url: String,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): UnregisterCallbackParams = {
    val __obj = js.Dynamic.literal(callback_url = callback_url)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    __obj.asInstanceOf[UnregisterCallbackParams]
  }
}

