package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `updateCollection` operation. */
trait UpdateCollectionParams extends js.Object {
  /** The ID of the collection. */
  var collection_id: String
  /** The ID of the configuration in which the collection is to be updated. */
  var configuration_id: js.UndefOr[String] = js.undefined
  /** A description of the collection. */
  var description: js.UndefOr[String] = js.undefined
  /** The ID of the environment. */
  var environment_id: String
  var headers: js.UndefOr[js.Object] = js.undefined
  /** The name of the collection. */
  var name: String
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object UpdateCollectionParams {
  @scala.inline
  def apply(
    collection_id: String,
    environment_id: String,
    name: String,
    configuration_id: String = null,
    description: String = null,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): UpdateCollectionParams = {
    val __obj = js.Dynamic.literal(collection_id = collection_id, environment_id = environment_id, name = name)
    if (configuration_id != null) __obj.updateDynamic("configuration_id")(configuration_id)
    if (description != null) __obj.updateDynamic("description")(description)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    __obj.asInstanceOf[UpdateCollectionParams]
  }
}

