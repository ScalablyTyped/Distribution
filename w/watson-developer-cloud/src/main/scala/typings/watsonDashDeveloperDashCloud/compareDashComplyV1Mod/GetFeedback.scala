package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The results of a single feedback query. */
trait GetFeedback extends js.Object {
  /** A string containing the user's comment about the feedback entry. */
  var comment: js.UndefOr[String] = js.undefined
  /** A timestamp identifying the creation time of the feedback entry. */
  var created: js.UndefOr[String] = js.undefined
  /** Information returned from the `POST /v1/feedback` method. */
  var feedback_data: js.UndefOr[FeedbackDataOutput] = js.undefined
  /** A string uniquely identifying the feedback entry. */
  var feedback_id: js.UndefOr[String] = js.undefined
}

object GetFeedback {
  @scala.inline
  def apply(
    comment: String = null,
    created: String = null,
    feedback_data: FeedbackDataOutput = null,
    feedback_id: String = null
  ): GetFeedback = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (feedback_data != null) __obj.updateDynamic("feedback_data")(feedback_data.asInstanceOf[js.Any])
    if (feedback_id != null) __obj.updateDynamic("feedback_id")(feedback_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFeedback]
  }
}

