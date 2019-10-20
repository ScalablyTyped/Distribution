package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `addTrainingData` operation. */
trait AddTrainingDataParams extends js.Object {
  /** The ID of the collection. */
  var collection_id: String
  /** The ID of the environment. */
  var environment_id: String
  /** Array of training examples. */
  var examples: js.UndefOr[js.Array[TrainingExample]] = js.undefined
  /** The filter used on the collection before the **natural_language_query** is applied. */
  var filter: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  /** The natural text query for the new training query. */
  var natural_language_query: js.UndefOr[String] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object AddTrainingDataParams {
  @scala.inline
  def apply(
    collection_id: String,
    environment_id: String,
    examples: js.Array[TrainingExample] = null,
    filter: String = null,
    headers: js.Object = null,
    natural_language_query: String = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): AddTrainingDataParams = {
    val __obj = js.Dynamic.literal(collection_id = collection_id, environment_id = environment_id)
    if (examples != null) __obj.updateDynamic("examples")(examples)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (natural_language_query != null) __obj.updateDynamic("natural_language_query")(natural_language_query)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    __obj.asInstanceOf[AddTrainingDataParams]
  }
}

