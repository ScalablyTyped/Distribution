package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

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
  def clearCachedValue(): scala.Unit = js.native
  /* CompleteClass */
  override def geSurveyData(): ISurveyData = js.native
  /* CompleteClass */
  override def getAllValues(): js.Any = js.native
  /* CompleteClass */
  override def getComment(name: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def getFilteredProperties(): js.Any = js.native
  /* CompleteClass */
  override def getFilteredValues(): js.Any = js.native
  /* CompleteClass */
  override def getSurvey(): ISurvey = js.native
  /* CompleteClass */
  override def getTextProcessor(): ITextProcessor = js.native
  /* CompleteClass */
  override def getValue(name: java.lang.String): js.Any = js.native
  /* CompleteClass */
  override def processText(text: java.lang.String, returnDisplayValue: scala.Boolean): java.lang.String = js.native
  def processTextEx(text: java.lang.String, returnDisplayValue: scala.Boolean): js.Any = js.native
  /* CompleteClass */
  override def processTextEx(text: java.lang.String, returnDisplayValue: scala.Boolean, doEncoding: scala.Boolean): js.Any = js.native
  def setCachedValue(values: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def setComment(name: java.lang.String, newValue: java.lang.String): js.Any = js.native
  def setSurveyImpl(): scala.Unit = js.native
  /* CompleteClass */
  override def setValue(name: java.lang.String, newValue: js.Any): js.Any = js.native
}

@JSImport("survey-knockout", "QuestionPanelDynamicItem")
@js.native
object QuestionPanelDynamicItem extends js.Object {
  var IndexVariableName: java.lang.String = js.native
  var ItemVariableName: java.lang.String = js.native
}

