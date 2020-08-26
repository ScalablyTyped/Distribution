package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `addFeedback` operation. */
@js.native
trait AddFeedbackParams extends js.Object {
  /** An optional comment on or description of the feedback. */
  var comment: js.UndefOr[String] = js.native
  /** Feedback data for submission. */
  var feedback_data: FeedbackDataInput = js.native
  var headers: js.UndefOr[js.Object] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** An optional string identifying the user. */
  var user_id: js.UndefOr[String] = js.native
}

object AddFeedbackParams {
  @scala.inline
  def apply(feedback_data: FeedbackDataInput): AddFeedbackParams = {
    val __obj = js.Dynamic.literal(feedback_data = feedback_data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddFeedbackParams]
  }
  @scala.inline
  implicit class AddFeedbackParamsOps[Self <: AddFeedbackParams] (val x: Self) extends AnyVal {
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
    def setFeedback_data(value: FeedbackDataInput): Self = this.set("feedback_data", value.asInstanceOf[js.Any])
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
    @scala.inline
    def setUser_id(value: String): Self = this.set("user_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser_id: Self = this.set("user_id", js.undefined)
  }
  
}

