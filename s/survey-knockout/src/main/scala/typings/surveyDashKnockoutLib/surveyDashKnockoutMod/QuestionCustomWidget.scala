package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionCustomWidget")
@js.native
class QuestionCustomWidget protected () extends js.Object {
  def this(name: java.lang.String, widgetJson: js.Any) = this()
  var htmlTemplate: java.lang.String = js.native
  val isDefaultRender: scala.Boolean = js.native
  var name: java.lang.String = js.native
  var widgetJson: js.Any = js.native
  def activatedByChanged(activatedBy: java.lang.String): scala.Unit = js.native
  def afterRender(question: IQuestion, el: js.Any): scala.Unit = js.native
  def getDisplayValue(question: IQuestion): java.lang.String = js.native
  def isFit(question: IQuestion): scala.Boolean = js.native
  def willUnmount(question: IQuestion, el: js.Any): scala.Unit = js.native
}

