package typings.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuestionsResult extends js.Object {
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
  implicit class QuestionsResultOps[Self <: QuestionsResult] (val x: Self) extends AnyVal {
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
    def setHasMoreQuestions(value: Boolean): Self = this.set("hasMoreQuestions", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuestionsVarargs(value: Question*): Self = this.set("questions", js.Array(value :_*))
    @scala.inline
    def setQuestions(value: js.Array[Question]): Self = this.set("questions", value.asInstanceOf[js.Any])
  }
  
}

