package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
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
object QuestionPanelDynamicItem {
  
  @JSImport("survey-knockout", "QuestionPanelDynamicItem")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "QuestionPanelDynamicItem.IndexVariableName")
  @js.native
  def IndexVariableName: String = js.native
  @scala.inline
  def IndexVariableName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IndexVariableName")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "QuestionPanelDynamicItem.ItemVariableName")
  @js.native
  def ItemVariableName: String = js.native
  @scala.inline
  def ItemVariableName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ItemVariableName")(x.asInstanceOf[js.Any])
}
