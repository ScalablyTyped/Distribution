package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.TrainLanguageModelConstants.WordTypeToAdd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `trainLanguageModel` operation. */
@js.native
trait TrainLanguageModelParams extends js.Object {
  /** The customization ID (GUID) of the custom language model that is to be used for the request. You must make the request with credentials for the instance of the service that owns the custom model. */
  var customization_id: String = js.native
  /** Specifies a customization weight for the custom language model. The customization weight tells the service how much weight to give to words from the custom language model compared to those from the base model for speech recognition. Specify a value between 0.0 and 1.0; the default is 0.3. The default value yields the best performance in general. Assign a higher value if your audio makes frequent use of OOV words from the custom model. Use caution when setting the weight: a higher value can improve the accuracy of phrases from the custom model's domain, but it can negatively affect performance on non-domain phrases. The value that you assign is used for all recognition requests that use the model. You can override it for any recognition request by specifying a customization weight for that request. */
  var customization_weight: js.UndefOr[Double] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** The type of words from the custom language model's words resource on which to train the model: * `all` (the default) trains the model on all new words, regardless of whether they were extracted from corpora or grammars or were added or modified by the user. * `user` trains the model only on new words that were added or modified by the user directly. The model is not trained on new words extracted from corpora or grammars. */
  var word_type_to_add: js.UndefOr[WordTypeToAdd | String] = js.native
}

object TrainLanguageModelParams {
  @scala.inline
  def apply(customization_id: String): TrainLanguageModelParams = {
    val __obj = js.Dynamic.literal(customization_id = customization_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainLanguageModelParams]
  }
  @scala.inline
  implicit class TrainLanguageModelParamsOps[Self <: TrainLanguageModelParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCustomization_id(value: String): Self = this.set("customization_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomization_weight(value: Double): Self = this.set("customization_weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomization_weight: Self = this.set("customization_weight", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
    @scala.inline
    def setWord_type_to_add(value: WordTypeToAdd | String): Self = this.set("word_type_to_add", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWord_type_to_add: Self = this.set("word_type_to_add", js.undefined)
  }
  
}

