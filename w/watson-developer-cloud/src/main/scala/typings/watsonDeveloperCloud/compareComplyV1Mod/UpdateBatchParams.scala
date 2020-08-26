package typings.watsonDeveloperCloud.compareComplyV1Mod

import typings.watsonDeveloperCloud.compareComplyV1Mod.UpdateBatchConstants.Action
import typings.watsonDeveloperCloud.compareComplyV1Mod.UpdateBatchConstants.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `updateBatch` operation. */
@js.native
trait UpdateBatchParams extends js.Object {
  /** The action you want to perform on the specified batch-processing job. */
  var action: Action | String = js.native
  /** The ID of the batch-processing job you want to update. */
  var batch_id: String = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  var model: js.UndefOr[Model | String] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
}

object UpdateBatchParams {
  @scala.inline
  def apply(action: Action | String, batch_id: String): UpdateBatchParams = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], batch_id = batch_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBatchParams]
  }
  @scala.inline
  implicit class UpdateBatchParamsOps[Self <: UpdateBatchParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAction(value: Action | String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setBatch_id(value: String): Self = this.set("batch_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setModel(value: Model | String): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
  }
  
}

