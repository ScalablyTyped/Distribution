package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQuestionPanelDynamicData extends js.Object {
  def getItemIndex(item: ISurveyData): Double
  def getPanelItemData(item: ISurveyData): js.Any
  def getRootData(): ISurveyData
  def getSharedQuestionFromArray(name: String, panelIndex: Double): Question
  def getSurvey(): ISurvey
  def setPanelItemData(item: ISurveyData, name: String, `val`: js.Any): js.Any
}

object IQuestionPanelDynamicData {
  @scala.inline
  def apply(
    getItemIndex: ISurveyData => Double,
    getPanelItemData: ISurveyData => js.Any,
    getRootData: () => ISurveyData,
    getSharedQuestionFromArray: (String, Double) => Question,
    getSurvey: () => ISurvey,
    setPanelItemData: (ISurveyData, String, js.Any) => js.Any
  ): IQuestionPanelDynamicData = {
    val __obj = js.Dynamic.literal(getItemIndex = js.Any.fromFunction1(getItemIndex), getPanelItemData = js.Any.fromFunction1(getPanelItemData), getRootData = js.Any.fromFunction0(getRootData), getSharedQuestionFromArray = js.Any.fromFunction2(getSharedQuestionFromArray), getSurvey = js.Any.fromFunction0(getSurvey), setPanelItemData = js.Any.fromFunction3(setPanelItemData))
  
    __obj.asInstanceOf[IQuestionPanelDynamicData]
  }
}

