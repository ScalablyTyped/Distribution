package typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod

import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateLanguageModelConstants.BaseModelName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `createLanguageModel` operation. */
trait CreateLanguageModelParams extends js.Object {
  /** The name of the base language model that is to be customized by the new custom language model. The new custom model can be used only with the base model that it customizes. To determine whether a base model supports language model customization, use the **Get a model** method and check that the attribute `custom_language_model` is set to `true`. You can also refer to [Language support for customization](https://cloud.ibm.com/docs/services/speech-to-text/custom.html#languageSupport). */
  var base_model_name: BaseModelName | String
  /** A description of the new custom language model. Use a localized description that matches the language of the custom model. */
  var description: js.UndefOr[String] = js.undefined
  /** The dialect of the specified language that is to be used with the custom language model. The parameter is meaningful only for Spanish models, for which the service creates a custom language model that is suited for speech in one of the following dialects: * `es-ES` for Castilian Spanish (the default) * `es-LA` for Latin American Spanish * `es-US` for North American (Mexican) Spanish A specified dialect must be valid for the base model. By default, the dialect matches the language of the base model; for example, `en-US` for either of the US English language models. */
  var dialect: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  /** A user-defined name for the new custom language model. Use a name that is unique among all custom language models that you own. Use a localized name that matches the language of the custom model. Use a name that describes the domain of the custom model, such as `Medical custom model` or `Legal custom model`. */
  var name: String
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object CreateLanguageModelParams {
  @scala.inline
  def apply(
    base_model_name: BaseModelName | String,
    name: String,
    description: String = null,
    dialect: String = null,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): CreateLanguageModelParams = {
    val __obj = js.Dynamic.literal(base_model_name = base_model_name.asInstanceOf[js.Any], name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    if (dialect != null) __obj.updateDynamic("dialect")(dialect)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    __obj.asInstanceOf[CreateLanguageModelParams]
  }
}

