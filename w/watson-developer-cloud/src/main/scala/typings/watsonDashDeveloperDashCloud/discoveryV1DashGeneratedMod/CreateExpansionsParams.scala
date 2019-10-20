package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `createExpansions` operation. */
trait CreateExpansionsParams extends js.Object {
  /** The ID of the collection. */
  var collection_id: String
  /** The ID of the environment. */
  var environment_id: String
  /** An array of query expansion definitions. Each object in the **expansions** array represents a term or set of terms that will be expanded into other terms. Each expansion object can be configured as bidirectional or unidirectional. Bidirectional means that all terms are expanded to all other terms in the object. Unidirectional means that a set list of terms can be expanded into a second list of terms. To create a bi-directional expansion specify an **expanded_terms** array. When found in a query, all items in the **expanded_terms** array are then expanded to the other items in the same array. To create a uni-directional expansion, specify both an array of **input_terms** and an array of **expanded_terms**. When items in the **input_terms** array are present in a query, they are expanded using the items listed in the **expanded_terms** array. */
  var expansions: js.Array[Expansion]
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object CreateExpansionsParams {
  @scala.inline
  def apply(
    collection_id: String,
    environment_id: String,
    expansions: js.Array[Expansion],
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): CreateExpansionsParams = {
    val __obj = js.Dynamic.literal(collection_id = collection_id, environment_id = environment_id, expansions = expansions)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    __obj.asInstanceOf[CreateExpansionsParams]
  }
}

