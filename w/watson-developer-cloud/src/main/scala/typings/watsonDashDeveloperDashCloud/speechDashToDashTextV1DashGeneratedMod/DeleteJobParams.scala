package typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `deleteJob` operation. */
trait DeleteJobParams extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
  /** The identifier of the asynchronous job that is to be used for the request. You must make the request with credentials for the instance of the service that owns the job. */
  var id: String
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object DeleteJobParams {
  @scala.inline
  def apply(id: String, headers: js.Object = null, return_response: js.UndefOr[Boolean] = js.undefined): DeleteJobParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteJobParams]
  }
}

