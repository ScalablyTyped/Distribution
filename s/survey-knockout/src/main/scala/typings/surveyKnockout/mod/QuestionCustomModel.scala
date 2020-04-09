package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionCustomModel")
@js.native
class QuestionCustomModel protected () extends QuestionCustomModelBase {
  def this(name: String, customQuestion: CustomQuestionJSON) = this()
  val contentQuestion: Question = js.native
  /* protected */ def createQuestion(): Question = js.native
}

