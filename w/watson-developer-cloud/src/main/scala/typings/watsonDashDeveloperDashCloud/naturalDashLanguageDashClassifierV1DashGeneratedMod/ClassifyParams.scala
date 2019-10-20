package typings.watsonDashDeveloperDashCloud.naturalDashLanguageDashClassifierV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*************************
  * request interfaces
  ************************/
/** Parameters for the `classify` operation. */
trait ClassifyParams extends js.Object {
  /** Classifier ID to use. */
  var classifier_id: String
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** The submitted phrase. The maximum length is 2048 characters. */
  var text: String
}

object ClassifyParams {
  @scala.inline
  def apply(
    classifier_id: String,
    text: String,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): ClassifyParams = {
    val __obj = js.Dynamic.literal(classifier_id = classifier_id, text = text)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    __obj.asInstanceOf[ClassifyParams]
  }
}

