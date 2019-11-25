package typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `listAcousticModels` operation. */
trait ListAcousticModelsParams extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
  /** The identifier of the language for which custom language or custom acoustic models are to be returned (for example, `en-US`). Omit the parameter to see all custom language or custom acoustic models that are owned by the requesting credentials. */
  var language: js.UndefOr[String] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object ListAcousticModelsParams {
  @scala.inline
  def apply(
    headers: js.Object = null,
    language: String = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): ListAcousticModelsParams = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAcousticModelsParams]
  }
}

