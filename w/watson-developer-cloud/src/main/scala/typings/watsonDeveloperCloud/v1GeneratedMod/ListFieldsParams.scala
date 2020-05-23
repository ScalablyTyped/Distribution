package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `listFields` operation. */
trait ListFieldsParams extends js.Object {
  /** A comma-separated list of collection IDs to be queried against. */
  var collection_ids: js.Array[String]
  /** The ID of the environment. */
  var environment_id: String
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object ListFieldsParams {
  @scala.inline
  def apply(
    collection_ids: js.Array[String],
    environment_id: String,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): ListFieldsParams = {
    val __obj = js.Dynamic.literal(collection_ids = collection_ids.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFieldsParams]
  }
}

