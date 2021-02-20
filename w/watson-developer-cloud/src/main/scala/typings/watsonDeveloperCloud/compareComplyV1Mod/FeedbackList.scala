package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The results of a successful `GET /v1/feedback` request. */
@js.native
trait FeedbackList extends StObject {
  
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
  implicit class FeedbackListMutableBuilder[Self <: FeedbackList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeedback(value: js.Array[GetFeedback]): Self = StObject.set(x, "feedback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedbackUndefined: Self = StObject.set(x, "feedback", js.undefined)
    
    @scala.inline
    def setFeedbackVarargs(value: GetFeedback*): Self = StObject.set(x, "feedback", js.Array(value :_*))
  }
}
