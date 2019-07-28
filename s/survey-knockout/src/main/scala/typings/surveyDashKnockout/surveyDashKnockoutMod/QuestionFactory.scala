package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionFactory")
@js.native
class QuestionFactory () extends js.Object {
  def clear(): Unit = js.native
  def createQuestion(questionType: String, name: String): Question = js.native
  def getAllTypes(): js.Array[String] = js.native
  def registerQuestion(questionType: String, questionCreator: js.Function1[/* name */ String, Question]): Unit = js.native
  def unregisterElement(elementType: String): Unit = js.native
}

/* static members */
@JSImport("survey-knockout", "QuestionFactory")
@js.native
object QuestionFactory extends js.Object {
  val DefaultChoices: js.Array[String] = js.native
  val DefaultColums: js.Array[String] = js.native
  val DefaultRows: js.Array[String] = js.native
  var Instance: QuestionFactory = js.native
}

