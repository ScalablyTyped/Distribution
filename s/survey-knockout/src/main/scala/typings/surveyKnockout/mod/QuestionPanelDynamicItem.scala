package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionPanelDynamicItem")
@js.native
class QuestionPanelDynamicItem protected ()
  extends ISurveyData
     with ISurveyImpl
     with ITextProcessor {
  def this(data: IQuestionPanelDynamicData, panel: PanelModel) = this()
  val panel: PanelModel = js.native
  /* CompleteClass */
  override def geSurveyData(): ISurveyData = js.native
  /* CompleteClass */
  override def getAllValues(): js.Any = js.native
  /* CompleteClass */
  override def getComment(name: String): String = js.native
  /* CompleteClass */
  override def getFilteredProperties(): js.Any = js.native
  /* CompleteClass */
  override def getFilteredValues(): js.Any = js.native
  /* CompleteClass */
  override def getSurvey(): ISurvey = js.native
  /* CompleteClass */
  override def getTextProcessor(): ITextProcessor = js.native
  /* CompleteClass */
  override def getValue(name: String): js.Any = js.native
  /* CompleteClass */
  override def getVariable(name: String): js.Any = js.native
  /* CompleteClass */
  override def processText(text: String, returnDisplayValue: Boolean): String = js.native
  def processTextEx(text: String, returnDisplayValue: Boolean): js.Any = js.native
  /* CompleteClass */
  override def processTextEx(text: String, returnDisplayValue: Boolean, doEncoding: Boolean): js.Any = js.native
  /* CompleteClass */
  override def setComment(name: String, newValue: String, locNotification: js.Any): js.Any = js.native
  def setSurveyImpl(): Unit = js.native
  def setValue(name: String, newValue: js.Any): Unit = js.native
  /* CompleteClass */
  override def setValue(name: String, newValue: js.Any, locNotification: js.Any): js.Any = js.native
  /* CompleteClass */
  override def setVariable(name: String, newValue: js.Any): Unit = js.native
}

/* static members */
@JSImport("survey-knockout", "QuestionPanelDynamicItem")
@js.native
object QuestionPanelDynamicItem extends js.Object {
  var IndexVariableName: String = js.native
  var ItemVariableName: String = js.native
}

