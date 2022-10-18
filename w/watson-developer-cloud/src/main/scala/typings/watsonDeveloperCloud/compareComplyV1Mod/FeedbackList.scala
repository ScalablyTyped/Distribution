package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The results of a successful `GET /v1/feedback` request. */
trait FeedbackList extends StObject {
  
  /** A list of all feedback for the document. */
  var feedback: js.UndefOr[js.Array[GetFeedback]] = js.undefined
}
object FeedbackList {
  
  inline def apply(): FeedbackList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeedbackList]
  }
  
  extension [Self <: FeedbackList](x: Self) {
    
    inline def setFeedback(value: js.Array[GetFeedback]): Self = StObject.set(x, "feedback", value.asInstanceOf[js.Any])
    
    inline def setFeedbackUndefined: Self = StObject.set(x, "feedback", js.undefined)
    
    inline def setFeedbackVarargs(value: GetFeedback*): Self = StObject.set(x, "feedback", js.Array(value*))
  }
}
