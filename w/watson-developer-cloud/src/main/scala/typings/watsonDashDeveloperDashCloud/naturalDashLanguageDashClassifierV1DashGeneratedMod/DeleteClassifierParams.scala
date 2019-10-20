package typings.watsonDashDeveloperDashCloud.naturalDashLanguageDashClassifierV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `deleteClassifier` operation. */
trait DeleteClassifierParams extends js.Object {
  /** Classifier ID to delete. */
  var classifier_id: String
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object DeleteClassifierParams {
  @scala.inline
  def apply(
    classifier_id: String,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): DeleteClassifierParams = {
    val __obj = js.Dynamic.literal(classifier_id = classifier_id)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    __obj.asInstanceOf[DeleteClassifierParams]
  }
}

