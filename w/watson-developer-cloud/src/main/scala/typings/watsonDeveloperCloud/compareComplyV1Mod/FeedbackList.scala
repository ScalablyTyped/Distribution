package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The results of a successful `GET /v1/feedback` request. */
@js.native
trait FeedbackList extends js.Object {
  /** A list of all feedback for the document. */
  var feedback: js.UndefOr[js.Array[GetFeedback]] = js.native
}

object FeedbackList {
  @scala.inline
  def apply(): FeedbackList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeedbackList]
  }
  @scala.inline
  implicit class FeedbackListOps[Self <: FeedbackList] (val x: Self) extends AnyVal {
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
    def setFeedbackVarargs(value: GetFeedback*): Self = this.set("feedback", js.Array(value :_*))
    @scala.inline
    def setFeedback(value: js.Array[GetFeedback]): Self = this.set("feedback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeedback: Self = this.set("feedback", js.undefined)
  }
  
}

