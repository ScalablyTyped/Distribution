package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `deleteAllTrainingData` operation. */
trait DeleteAllTrainingDataParams extends js.Object {
  /** The ID of the collection. */
  var collection_id: String
  /** The ID of the environment. */
  var environment_id: String
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object DeleteAllTrainingDataParams {
  @scala.inline
  def apply(
    collection_id: String,
    environment_id: String,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): DeleteAllTrainingDataParams = {
    val __obj = js.Dynamic.literal(collection_id = collection_id, environment_id = environment_id)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    __obj.asInstanceOf[DeleteAllTrainingDataParams]
  }
}

