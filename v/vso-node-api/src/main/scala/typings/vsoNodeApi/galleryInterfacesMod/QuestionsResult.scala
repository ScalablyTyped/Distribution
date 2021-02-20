package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuestionsResult extends StObject {
  
  /**
    * Flag indicating if there are more QnA threads to be shown (for paging)
    */
  var hasMoreQuestions: Boolean = js.native
  
  /**
    * List of the QnA threads
    */
  var questions: js.Array[Question] = js.native
}
object QuestionsResult {
  
  @scala.inline
  def apply(hasMoreQuestions: Boolean, questions: js.Array[Question]): QuestionsResult = {
    val __obj = js.Dynamic.literal(hasMoreQuestions = hasMoreQuestions.asInstanceOf[js.Any], questions = questions.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuestionsResult]
  }
  
  @scala.inline
  implicit class QuestionsResultMutableBuilder[Self <: QuestionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasMoreQuestions(value: Boolean): Self = StObject.set(x, "hasMoreQuestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestions(value: js.Array[Question]): Self = StObject.set(x, "questions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestionsVarargs(value: Question*): Self = StObject.set(x, "questions", js.Array(value :_*))
  }
}
