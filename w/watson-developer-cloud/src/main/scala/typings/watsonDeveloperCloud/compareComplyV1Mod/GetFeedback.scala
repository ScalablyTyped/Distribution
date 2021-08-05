package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The results of a single feedback query. */
trait GetFeedback extends StObject {
  
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
  
  inline def apply(): GetFeedback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFeedback]
  }
  
  extension [Self <: GetFeedback](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setFeedback_data(value: FeedbackDataOutput): Self = StObject.set(x, "feedback_data", value.asInstanceOf[js.Any])
    
    inline def setFeedback_dataUndefined: Self = StObject.set(x, "feedback_data", js.undefined)
    
    inline def setFeedback_id(value: String): Self = StObject.set(x, "feedback_id", value.asInstanceOf[js.Any])
    
    inline def setFeedback_idUndefined: Self = StObject.set(x, "feedback_id", js.undefined)
  }
}
