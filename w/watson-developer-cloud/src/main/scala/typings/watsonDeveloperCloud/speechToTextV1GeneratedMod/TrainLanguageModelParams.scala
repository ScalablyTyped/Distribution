package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.TrainLanguageModelConstants.WordTypeToAdd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `trainLanguageModel` operation. */
trait TrainLanguageModelParams extends js.Object {
  /** The customization ID (GUID) of the custom language model that is to be used for the request. You must make the request with credentials for the instance of the service that owns the custom model. */
  var customization_id: String
  /** Specifies a customization weight for the custom language model. The customization weight tells the service how much weight to give to words from the custom language model compared to those from the base model for speech recognition. Specify a value between 0.0 and 1.0; the default is 0.3. The default value yields the best performance in general. Assign a higher value if your audio makes frequent use of OOV words from the custom model. Use caution when setting the weight: a higher value can improve the accuracy of phrases from the custom model's domain, but it can negatively affect performance on non-domain phrases. The value that you assign is used for all recognition requests that use the model. You can override it for any recognition request by specifying a customization weight for that request. */
  var customization_weight: js.UndefOr[Double] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** The type of words from the custom language model's words resource on which to train the model: * `all` (the default) trains the model on all new words, regardless of whether they were extracted from corpora or grammars or were added or modified by the user. * `user` trains the model only on new words that were added or modified by the user directly. The model is not trained on new words extracted from corpora or grammars. */
  var word_type_to_add: js.UndefOr[WordTypeToAdd | String] = js.undefined
}

object TrainLanguageModelParams {
  @scala.inline
  def apply(
    customization_id: String,
    customization_weight: Int | Double = null,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined,
    word_type_to_add: WordTypeToAdd | String = null
  ): TrainLanguageModelParams = {
    val __obj = js.Dynamic.literal(customization_id = customization_id.asInstanceOf[js.Any])
    if (customization_weight != null) __obj.updateDynamic("customization_weight")(customization_weight.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    if (word_type_to_add != null) __obj.updateDynamic("word_type_to_add")(word_type_to_add.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainLanguageModelParams]
  }
}

