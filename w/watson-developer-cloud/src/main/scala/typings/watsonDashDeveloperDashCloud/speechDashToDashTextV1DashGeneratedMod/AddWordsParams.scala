package typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `addWords` operation. */
trait AddWordsParams extends js.Object {
  /** The customization ID (GUID) of the custom language model that is to be used for the request. You must make the request with credentials for the instance of the service that owns the custom model. */
  var customization_id: String
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** An array of `CustomWord` objects that provides information about each custom word that is to be added to or updated in the custom language model. */
  var words: js.Array[CustomWord]
}

object AddWordsParams {
  @scala.inline
  def apply(
    customization_id: String,
    words: js.Array[CustomWord],
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): AddWordsParams = {
    val __obj = js.Dynamic.literal(customization_id = customization_id, words = words)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    __obj.asInstanceOf[AddWordsParams]
  }
}

