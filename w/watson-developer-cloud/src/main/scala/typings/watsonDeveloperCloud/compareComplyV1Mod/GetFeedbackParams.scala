package typings.watsonDeveloperCloud.compareComplyV1Mod

import typings.watsonDeveloperCloud.compareComplyV1Mod.GetFeedbackConstants.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `getFeedback` operation. */
trait GetFeedbackParams extends js.Object {
  /** A string that specifies the feedback entry to be included in the output. */
  var feedback_id: String
  var headers: js.UndefOr[js.Object] = js.undefined
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  var model: js.UndefOr[Model | String] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object GetFeedbackParams {
  @scala.inline
  def apply(
    feedback_id: String,
    headers: js.Object = null,
    model: Model | String = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): GetFeedbackParams = {
    val __obj = js.Dynamic.literal(feedback_id = feedback_id.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFeedbackParams]
  }
}

