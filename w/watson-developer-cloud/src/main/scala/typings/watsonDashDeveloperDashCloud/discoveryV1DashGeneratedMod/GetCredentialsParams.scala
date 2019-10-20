package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `getCredentials` operation. */
trait GetCredentialsParams extends js.Object {
  /** The unique identifier for a set of source credentials. */
  var credential_id: String
  /** The ID of the environment. */
  var environment_id: String
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object GetCredentialsParams {
  @scala.inline
  def apply(
    credential_id: String,
    environment_id: String,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): GetCredentialsParams = {
    val __obj = js.Dynamic.literal(credential_id = credential_id, environment_id = environment_id)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    __obj.asInstanceOf[GetCredentialsParams]
  }
}

