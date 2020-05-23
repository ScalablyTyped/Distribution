package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `addFeedback` operation. */
trait AddFeedbackParams extends js.Object {
  /** An optional comment on or description of the feedback. */
  var comment: js.UndefOr[String] = js.undefined
  /** Feedback data for submission. */
  var feedback_data: FeedbackDataInput
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** An optional string identifying the user. */
  var user_id: js.UndefOr[String] = js.undefined
}

object AddFeedbackParams {
  @scala.inline
  def apply(
    feedback_data: FeedbackDataInput,
    comment: String = null,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined,
    user_id: String = null
  ): AddFeedbackParams = {
    val __obj = js.Dynamic.literal(feedback_data = feedback_data.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.get.asInstanceOf[js.Any])
    if (user_id != null) __obj.updateDynamic("user_id")(user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddFeedbackParams]
  }
}

