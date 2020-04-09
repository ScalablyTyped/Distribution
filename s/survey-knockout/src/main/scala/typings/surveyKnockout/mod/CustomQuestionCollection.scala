package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "CustomQuestionCollection")
@js.native
class CustomQuestionCollection () extends js.Object {
  def add(json: js.Any): Unit = js.native
  def clear(): Unit = js.native
  /* protected */ def createCompositeModel(name: String, questionJSON: CustomQuestionJSON): QuestionCompositeModel = js.native
  /* protected */ def createCustomModel(name: String, questionJSON: CustomQuestionJSON): QuestionCustomModel = js.native
  def createQuestion(name: String, questionJSON: CustomQuestionJSON): Question = js.native
  def getCustomQuestionByName(name: String): CustomQuestionJSON = js.native
  def onAddingJson(name: String, isComposite: Boolean): Unit = js.native
  def onCreateComposite(name: String, questionJSON: CustomQuestionJSON): QuestionCompositeModel = js.native
  def onCreateCustom(name: String, questionJSON: CustomQuestionJSON): QuestionCustomModel = js.native
}

/* static members */
@JSImport("survey-knockout", "CustomQuestionCollection")
@js.native
object CustomQuestionCollection extends js.Object {
  var Instance: CustomQuestionCollection = js.native
}

