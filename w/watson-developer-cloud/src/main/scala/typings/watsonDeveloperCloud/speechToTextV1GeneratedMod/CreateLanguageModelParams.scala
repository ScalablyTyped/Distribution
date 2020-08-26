package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateLanguageModelConstants.BaseModelName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `createLanguageModel` operation. */
@js.native
trait CreateLanguageModelParams extends js.Object {
  /** The name of the base language model that is to be customized by the new custom language model. The new custom model can be used only with the base model that it customizes. To determine whether a base model supports language model customization, use the **Get a model** method and check that the attribute `custom_language_model` is set to `true`. You can also refer to [Language support for customization](https://cloud.ibm.com/docs/services/speech-to-text/custom.html#languageSupport). */
  var base_model_name: BaseModelName | String = js.native
  /** A description of the new custom language model. Use a localized description that matches the language of the custom model. */
  var description: js.UndefOr[String] = js.native
  /** The dialect of the specified language that is to be used with the custom language model. The parameter is meaningful only for Spanish models, for which the service creates a custom language model that is suited for speech in one of the following dialects: * `es-ES` for Castilian Spanish (the default) * `es-LA` for Latin American Spanish * `es-US` for North American (Mexican) Spanish A specified dialect must be valid for the base model. By default, the dialect matches the language of the base model; for example, `en-US` for either of the US English language models. */
  var dialect: js.UndefOr[String] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** A user-defined name for the new custom language model. Use a name that is unique among all custom language models that you own. Use a localized name that matches the language of the custom model. Use a name that describes the domain of the custom model, such as `Medical custom model` or `Legal custom model`. */
  var name: String = js.native
  var return_response: js.UndefOr[Boolean] = js.native
}

object CreateLanguageModelParams {
  @scala.inline
  def apply(base_model_name: BaseModelName | String, name: String): CreateLanguageModelParams = {
    val __obj = js.Dynamic.literal(base_model_name = base_model_name.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLanguageModelParams]
  }
  @scala.inline
  implicit class CreateLanguageModelParamsOps[Self <: CreateLanguageModelParams] (val x: Self) extends AnyVal {
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
    def setBase_model_name(value: BaseModelName | String): Self = this.set("base_model_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDialect(value: String): Self = this.set("dialect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialect: Self = this.set("dialect", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
  }
  
}

