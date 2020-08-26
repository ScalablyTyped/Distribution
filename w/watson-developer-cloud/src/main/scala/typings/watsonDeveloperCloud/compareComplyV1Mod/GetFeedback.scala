package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The results of a single feedback query. */
@js.native
trait GetFeedback extends js.Object {
  /** A string containing the user's comment about the feedback entry. */
  var comment: js.UndefOr[String] = js.native
  /** A timestamp identifying the creation time of the feedback entry. */
  var created: js.UndefOr[String] = js.native
  /** Information returned from the `POST /v1/feedback` method. */
  var feedback_data: js.UndefOr[FeedbackDataOutput] = js.native
  /** A string uniquely identifying the feedback entry. */
  var feedback_id: js.UndefOr[String] = js.native
}

object GetFeedback {
  @scala.inline
  def apply(): GetFeedback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFeedback]
  }
  @scala.inline
  implicit class GetFeedbackOps[Self <: GetFeedback] (val x: Self) extends AnyVal {
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
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setFeedback_data(value: FeedbackDataOutput): Self = this.set("feedback_data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeedback_data: Self = this.set("feedback_data", js.undefined)
    @scala.inline
    def setFeedback_id(value: String): Self = this.set("feedback_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeedback_id: Self = this.set("feedback_id", js.undefined)
  }
  
}

