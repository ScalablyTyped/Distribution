package typings.watsonDashDeveloperDashCloud.languageDashTranslatorV3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `getModel` operation. */
trait GetModelParams extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
  /** Model ID of the model to get. */
  var model_id: String
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object GetModelParams {
  @scala.inline
  def apply(model_id: String, headers: js.Object = null, return_response: js.UndefOr[Boolean] = js.undefined): GetModelParams = {
    val __obj = js.Dynamic.literal(model_id = model_id.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetModelParams]
  }
}

