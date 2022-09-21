package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionPanelDynamicItem")
@js.native
open class QuestionPanelDynamicItem protected ()
  extends StObject
     with ISurveyData
     with ISurveyImpl {
  def this(data: IQuestionPanelDynamicData, panel: PanelModel) = this()
  
  var data: IQuestionPanelDynamicData = js.native
  
  /* CompleteClass */
  override def getSurvey(): ISurvey = js.native
  
  /* CompleteClass */
  override def getSurveyData(): ISurveyData = js.native
  
  /* CompleteClass */
  override def getTextProcessor(): ITextProcessor = js.native
  
  def panel: PanelModel = js.native
  
  var panelValue: PanelModel = js.native
  
  def setSurveyImpl(): Unit = js.native
  
  def setValue(name: String, newValue: Any): Unit = js.native
  
  var textPreProcessor: QuestionPanelDynamicItemTextProcessor = js.native
}
/* static members */
object QuestionPanelDynamicItem {
  
  @JSImport("survey-knockout", "QuestionPanelDynamicItem")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "QuestionPanelDynamicItem.IndexVariableName")
  @js.native
  def IndexVariableName: String = js.native
  inline def IndexVariableName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IndexVariableName")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "QuestionPanelDynamicItem.ItemVariableName")
  @js.native
  def ItemVariableName: String = js.native
  inline def ItemVariableName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ItemVariableName")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "QuestionPanelDynamicItem.ParentItemVariableName")
  @js.native
  def ParentItemVariableName: String = js.native
  inline def ParentItemVariableName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ParentItemVariableName")(x.asInstanceOf[js.Any])
}
