package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod

import typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.UpdateBatchConstants.Action
import typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.UpdateBatchConstants.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `updateBatch` operation. */
trait UpdateBatchParams extends js.Object {
  /** The action you want to perform on the specified batch-processing job. */
  var action: Action | String
  /** The ID of the batch-processing job you want to update. */
  var batch_id: String
  var headers: js.UndefOr[js.Object] = js.undefined
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  var model: js.UndefOr[Model | String] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object UpdateBatchParams {
  @scala.inline
  def apply(
    action: Action | String,
    batch_id: String,
    headers: js.Object = null,
    model: Model | String = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): UpdateBatchParams = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], batch_id = batch_id.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBatchParams]
  }
}

