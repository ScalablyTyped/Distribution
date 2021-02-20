package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information about the document and the submitted feedback. */
@js.native
trait FeedbackReturn extends StObject {
  
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
  implicit class FeedbackReturnMutableBuilder[Self <: FeedbackReturn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setFeedback_data(value: FeedbackDataOutput): Self = StObject.set(x, "feedback_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedback_dataUndefined: Self = StObject.set(x, "feedback_data", js.undefined)
    
    @scala.inline
    def setFeedback_id(value: String): Self = StObject.set(x, "feedback_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedback_idUndefined: Self = StObject.set(x, "feedback_id", js.undefined)
    
    @scala.inline
    def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
  }
}
