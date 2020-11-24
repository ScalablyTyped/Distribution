package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionPanelDynamicItem")
@js.native
class QuestionPanelDynamicItem protected ()
  extends ISurveyData
     with ISurveyImpl
     with ITextProcessor {
  def this(data: IQuestionPanelDynamicData, panel: PanelModel) = this()
  
  val panel: PanelModel = js.native
  
  def processTextEx(text: String, returnDisplayValue: Boolean): js.Any = js.native
  
  def setSurveyImpl(): Unit = js.native
  
  def setValue(name: String, newValue: js.Any): Unit = js.native
}
/* static members */
@JSImport("survey-knockout", "QuestionPanelDynamicItem")
@js.native
object QuestionPanelDynamicItem extends js.Object {
  
  var IndexVariableName: String = js.native
  
  var ItemVariableName: String = js.native
}
