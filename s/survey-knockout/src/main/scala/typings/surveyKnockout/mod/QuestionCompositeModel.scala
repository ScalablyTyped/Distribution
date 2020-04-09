package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionCompositeModel")
@js.native
class QuestionCompositeModel protected () extends QuestionCustomModelBase {
  def this(name: String, customQuestion: CustomQuestionJSON) = this()
  val contentPanel: PanelModel = js.native
  /* protected */ def createPanel(): PanelModel = js.native
}

