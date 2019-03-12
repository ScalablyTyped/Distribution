package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQuestionPanelDynamicData extends js.Object {
  def getItemIndex(item: ISurveyData): scala.Double
  def getPanelItemData(item: ISurveyData): js.Any
  def getSurvey(): ISurvey
  def setPanelItemData(item: ISurveyData, name: java.lang.String, `val`: js.Any): js.Any
}

object IQuestionPanelDynamicData {
  @scala.inline
  def apply(
    getItemIndex: ISurveyData => scala.Double,
    getPanelItemData: ISurveyData => js.Any,
    getSurvey: () => ISurvey,
    setPanelItemData: (ISurveyData, java.lang.String, js.Any) => js.Any
  ): IQuestionPanelDynamicData = {
    val __obj = js.Dynamic.literal(getItemIndex = js.Any.fromFunction1(getItemIndex), getPanelItemData = js.Any.fromFunction1(getPanelItemData), getSurvey = js.Any.fromFunction0(getSurvey), setPanelItemData = js.Any.fromFunction3(setPanelItemData))
  
    __obj.asInstanceOf[IQuestionPanelDynamicData]
  }
}

