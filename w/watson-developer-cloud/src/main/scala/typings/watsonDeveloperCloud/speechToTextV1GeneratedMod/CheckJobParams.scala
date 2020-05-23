package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `checkJob` operation. */
trait CheckJobParams extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
  /** The identifier of the asynchronous job that is to be used for the request. You must make the request with credentials for the instance of the service that owns the job. */
  var id: String
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object CheckJobParams {
  @scala.inline
  def apply(id: String, headers: js.Object = null, return_response: js.UndefOr[Boolean] = js.undefined): CheckJobParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckJobParams]
  }
}

