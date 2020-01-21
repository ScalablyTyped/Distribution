package typings.watsonDeveloperCloud.v3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `listModels` operation. */
trait ListModelsParams extends js.Object {
  /** If the default parameter isn't specified, the service will return all models (default and non-default) for each language pair. To return only default models, set this to `true`. To return only non-default models, set this to `false`. There is exactly one default model per language pair, the IBM provided base model. */
  var default_models: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** Specify a language code to filter results by source language. */
  var source: js.UndefOr[String] = js.undefined
  /** Specify a language code to filter results by target language. */
  var target: js.UndefOr[String] = js.undefined
}

object ListModelsParams {
  @scala.inline
  def apply(
    default_models: js.UndefOr[Boolean] = js.undefined,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    target: String = null
  ): ListModelsParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(default_models)) __obj.updateDynamic("default_models")(default_models.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListModelsParams]
  }
}

