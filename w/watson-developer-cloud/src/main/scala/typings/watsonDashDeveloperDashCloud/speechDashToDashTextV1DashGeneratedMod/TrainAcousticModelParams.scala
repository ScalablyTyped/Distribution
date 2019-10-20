package typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `trainAcousticModel` operation. */
trait TrainAcousticModelParams extends js.Object {
  /** The customization ID (GUID) of a custom language model that is to be used during training of the custom acoustic model. Specify a custom language model that has been trained with verbatim transcriptions of the audio resources or that contains words that are relevant to the contents of the audio resources. The custom language model must be based on the same version of the same base model as the custom acoustic model. The credentials specified with the request must own both custom models. */
  var custom_language_model_id: js.UndefOr[String] = js.undefined
  /** The customization ID (GUID) of the custom acoustic model that is to be used for the request. You must make the request with credentials for the instance of the service that owns the custom model. */
  var customization_id: String
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object TrainAcousticModelParams {
  @scala.inline
  def apply(
    customization_id: String,
    custom_language_model_id: String = null,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): TrainAcousticModelParams = {
    val __obj = js.Dynamic.literal(customization_id = customization_id)
    if (custom_language_model_id != null) __obj.updateDynamic("custom_language_model_id")(custom_language_model_id)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    __obj.asInstanceOf[TrainAcousticModelParams]
  }
}

