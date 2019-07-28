package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuestionsResult extends js.Object {
  /**
    * Flag indicating if there are more QnA threads to be shown (for paging)
    */
  var hasMoreQuestions: Boolean
  /**
    * List of the QnA threads
    */
  var questions: js.Array[Question]
}

object QuestionsResult {
  @scala.inline
  def apply(hasMoreQuestions: Boolean, questions: js.Array[Question]): QuestionsResult = {
    val __obj = js.Dynamic.literal(hasMoreQuestions = hasMoreQuestions, questions = questions)
  
    __obj.asInstanceOf[QuestionsResult]
  }
}

