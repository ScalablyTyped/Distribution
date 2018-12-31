package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionRow")
@js.native
class QuestionRow protected () extends QuestionRowModel {
  def this(panel: PanelModelBase) = this()
  var koElementAfterRender: js.Any = js.native
  var koGetType: js.Any = js.native
  def getElementType(el: js.Any): surveyDashKnockoutLib.surveyDashKnockoutLibStrings.`survey-panel` | surveyDashKnockoutLib.surveyDashKnockoutLibStrings.`survey-question` = js.native
  def koAfterRender(el: js.Any, con: js.Any): scala.Unit = js.native
}

