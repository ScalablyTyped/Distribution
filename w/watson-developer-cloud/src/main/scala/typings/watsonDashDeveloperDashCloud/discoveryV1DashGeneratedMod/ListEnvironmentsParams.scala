package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `listEnvironments` operation. */
trait ListEnvironmentsParams extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
  /** Show only the environment with the given name. */
  var name: js.UndefOr[String] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object ListEnvironmentsParams {
  @scala.inline
  def apply(
    headers: js.Object = null,
    name: String = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): ListEnvironmentsParams = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEnvironmentsParams]
  }
}

