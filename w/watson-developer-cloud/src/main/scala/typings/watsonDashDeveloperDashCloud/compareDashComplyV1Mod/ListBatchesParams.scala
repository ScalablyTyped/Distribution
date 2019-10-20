package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `listBatches` operation. */
trait ListBatchesParams extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object ListBatchesParams {
  @scala.inline
  def apply(headers: js.Object = null, return_response: js.UndefOr[Boolean] = js.undefined): ListBatchesParams = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    __obj.asInstanceOf[ListBatchesParams]
  }
}

