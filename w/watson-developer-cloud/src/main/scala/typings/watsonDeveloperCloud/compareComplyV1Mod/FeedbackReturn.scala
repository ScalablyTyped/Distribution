package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information about the document and the submitted feedback. */
@js.native
trait FeedbackReturn extends js.Object {
  
  /** An optional comment from the person submitting the feedback. */
  var comment: js.UndefOr[String] = js.native
  
  /** Timestamp listing the creation time of the feedback submission. */
  var created: js.UndefOr[String] = js.native
  
  /** Information returned from the `POST /v1/feedback` method. */
  var feedback_data: js.UndefOr[FeedbackDataOutput] = js.native
  
  /** The unique ID of the feedback object. */
  var feedback_id: js.UndefOr[String] = js.native
  
  /** An optional string identifying the person submitting feedback. */
  var user_id: js.UndefOr[String] = js.native
}
object FeedbackReturn {
  
  @scala.inline
  def apply(): FeedbackReturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeedbackReturn]
  }
  
  @scala.inline
  implicit class FeedbackReturnOps[Self <: FeedbackReturn] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setUser_id(value: String): Self = this.set("user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser_id: Self = this.set("user_id", js.undefined)
  }
}
