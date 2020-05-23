package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `getBatch` operation. */
trait GetBatchParams extends js.Object {
  /** The ID of the batch-processing job whose information you want to retrieve. */
  var batch_id: String
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object GetBatchParams {
  @scala.inline
  def apply(batch_id: String, headers: js.Object = null, return_response: js.UndefOr[Boolean] = js.undefined): GetBatchParams = {
    val __obj = js.Dynamic.literal(batch_id = batch_id.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBatchParams]
  }
}

