package typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `listAudio` operation. */
trait ListAudioParams extends js.Object {
  /** The customization ID (GUID) of the custom acoustic model that is to be used for the request. You must make the request with credentials for the instance of the service that owns the custom model. */
  var customization_id: String
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object ListAudioParams {
  @scala.inline
  def apply(
    customization_id: String,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): ListAudioParams = {
    val __obj = js.Dynamic.literal(customization_id = customization_id)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    __obj.asInstanceOf[ListAudioParams]
  }
}

