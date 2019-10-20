package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `getTrainingData` operation. */
trait GetTrainingDataParams extends js.Object {
  /** The ID of the collection. */
  var collection_id: String
  /** The ID of the environment. */
  var environment_id: String
  var headers: js.UndefOr[js.Object] = js.undefined
  /** The ID of the query used for training. */
  var query_id: String
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object GetTrainingDataParams {
  @scala.inline
  def apply(
    collection_id: String,
    environment_id: String,
    query_id: String,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): GetTrainingDataParams = {
    val __obj = js.Dynamic.literal(collection_id = collection_id, environment_id = environment_id, query_id = query_id)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    __obj.asInstanceOf[GetTrainingDataParams]
  }
}

