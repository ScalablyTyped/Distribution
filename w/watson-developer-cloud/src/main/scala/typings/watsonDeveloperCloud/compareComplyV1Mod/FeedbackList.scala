package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The results of a successful `GET /v1/feedback` request. */
trait FeedbackList extends js.Object {
  /** A list of all feedback for the document. */
  var feedback: js.UndefOr[js.Array[GetFeedback]] = js.undefined
}

object FeedbackList {
  @scala.inline
  def apply(feedback: js.Array[GetFeedback] = null): FeedbackList = {
    val __obj = js.Dynamic.literal()
    if (feedback != null) __obj.updateDynamic("feedback")(feedback.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedbackList]
  }
}

