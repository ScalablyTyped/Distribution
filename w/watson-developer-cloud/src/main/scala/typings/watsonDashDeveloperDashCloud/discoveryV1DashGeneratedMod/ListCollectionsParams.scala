package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `listCollections` operation. */
trait ListCollectionsParams extends js.Object {
  /** The ID of the environment. */
  var environment_id: String
  var headers: js.UndefOr[js.Object] = js.undefined
  /** Find collections with the given name. */
  var name: js.UndefOr[String] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object ListCollectionsParams {
  @scala.inline
  def apply(
    environment_id: String,
    headers: js.Object = null,
    name: String = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): ListCollectionsParams = {
    val __obj = js.Dynamic.literal(environment_id = environment_id)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    __obj.asInstanceOf[ListCollectionsParams]
  }
}

