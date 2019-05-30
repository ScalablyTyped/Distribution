package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionFactory")
@js.native
class QuestionFactory () extends js.Object {
  def clear(): scala.Unit = js.native
  def createQuestion(questionType: java.lang.String, name: java.lang.String): Question = js.native
  def getAllTypes(): js.Array[java.lang.String] = js.native
  def registerQuestion(
    questionType: java.lang.String,
    questionCreator: js.Function1[/* name */ java.lang.String, Question]
  ): scala.Unit = js.native
  def unregisterElement(elementType: java.lang.String): scala.Unit = js.native
}

/* static members */
@JSImport("survey-knockout", "QuestionFactory")
@js.native
object QuestionFactory extends js.Object {
  val DefaultChoices: js.Array[java.lang.String] = js.native
  val DefaultColums: js.Array[java.lang.String] = js.native
  val DefaultRows: js.Array[java.lang.String] = js.native
  var Instance: surveyDashKnockoutLib.surveyDashKnockoutMod.QuestionFactory = js.native
}

