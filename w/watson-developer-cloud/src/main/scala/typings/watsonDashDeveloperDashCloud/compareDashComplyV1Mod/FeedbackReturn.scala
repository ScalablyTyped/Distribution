package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information about the document and the submitted feedback. */
trait FeedbackReturn extends js.Object {
  /** An optional comment from the person submitting the feedback. */
  var comment: js.UndefOr[String] = js.undefined
  /** Timestamp listing the creation time of the feedback submission. */
  var created: js.UndefOr[String] = js.undefined
  /** Information returned from the `POST /v1/feedback` method. */
  var feedback_data: js.UndefOr[FeedbackDataOutput] = js.undefined
  /** The unique ID of the feedback object. */
  var feedback_id: js.UndefOr[String] = js.undefined
  /** An optional string identifying the person submitting feedback. */
  var user_id: js.UndefOr[String] = js.undefined
}

object FeedbackReturn {
  @scala.inline
  def apply(
    comment: String = null,
    created: String = null,
    feedback_data: FeedbackDataOutput = null,
    feedback_id: String = null,
    user_id: String = null
  ): FeedbackReturn = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (created != null) __obj.updateDynamic("created")(created)
    if (feedback_data != null) __obj.updateDynamic("feedback_data")(feedback_data)
    if (feedback_id != null) __obj.updateDynamic("feedback_id")(feedback_id)
    if (user_id != null) __obj.updateDynamic("user_id")(user_id)
    __obj.asInstanceOf[FeedbackReturn]
  }
}

