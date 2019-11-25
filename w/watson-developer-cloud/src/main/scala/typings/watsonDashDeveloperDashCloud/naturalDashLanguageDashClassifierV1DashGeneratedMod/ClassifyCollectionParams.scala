package typings.watsonDashDeveloperDashCloud.naturalDashLanguageDashClassifierV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `classifyCollection` operation. */
trait ClassifyCollectionParams extends js.Object {
  /** Classifier ID to use. */
  var classifier_id: String
  /** The submitted phrases. */
  var collection: js.Array[ClassifyInput]
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object ClassifyCollectionParams {
  @scala.inline
  def apply(
    classifier_id: String,
    collection: js.Array[ClassifyInput],
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): ClassifyCollectionParams = {
    val __obj = js.Dynamic.literal(classifier_id = classifier_id.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifyCollectionParams]
  }
}

