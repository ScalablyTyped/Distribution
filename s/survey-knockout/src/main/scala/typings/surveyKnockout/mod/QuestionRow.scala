package typings.surveyKnockout.mod

import typings.surveyKnockout.surveyKnockoutStrings.`survey-panel`
import typings.surveyKnockout.surveyKnockoutStrings.`survey-question`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionRow")
@js.native
class QuestionRow protected () extends QuestionRowModel {
  def this(panel: PanelModelBase) = this()
  var koElementAfterRender: js.Any = js.native
  var koGetType: js.Any = js.native
  def getElementType(el: js.Any): `survey-panel` | `survey-question` = js.native
  def koAfterRender(el: js.Any, con: js.Any): Unit = js.native
}

