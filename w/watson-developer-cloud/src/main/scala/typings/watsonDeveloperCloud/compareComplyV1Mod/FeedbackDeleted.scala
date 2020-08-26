package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The status and message of the deletion request. */
@js.native
trait FeedbackDeleted extends js.Object {
  /** Status message returned from the service. */
  var message: js.UndefOr[String] = js.native
  /** HTTP return code. */
  var status: js.UndefOr[Double] = js.native
}

object FeedbackDeleted {
  @scala.inline
  def apply(): FeedbackDeleted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeedbackDeleted]
  }
  @scala.inline
  implicit class FeedbackDeletedOps[Self <: FeedbackDeleted] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

