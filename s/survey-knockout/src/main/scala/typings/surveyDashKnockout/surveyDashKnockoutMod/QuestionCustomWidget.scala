package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionCustomWidget")
@js.native
class QuestionCustomWidget protected () extends js.Object {
  def this(name: String, widgetJson: js.Any) = this()
  var htmlTemplate: String = js.native
  val isDefaultRender: Boolean = js.native
  var name: String = js.native
  val pdfQuestionType: String = js.native
  val pdfRender: js.Any = js.native
  var widgetJson: js.Any = js.native
  def activatedByChanged(activatedBy: String): Unit = js.native
  def afterRender(question: IQuestion, el: js.Any): Unit = js.native
  def getDisplayValue(question: IQuestion): String = js.native
  def isFit(question: IQuestion): Boolean = js.native
  def willUnmount(question: IQuestion, el: js.Any): Unit = js.native
}

