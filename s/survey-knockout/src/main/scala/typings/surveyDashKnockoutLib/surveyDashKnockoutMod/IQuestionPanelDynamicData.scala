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
    getItemIndex: js.Function1[ISurveyData, scala.Double],
    getPanelItemData: js.Function1[ISurveyData, js.Any],
    getSurvey: js.Function0[ISurvey],
    setPanelItemData: js.Function3[ISurveyData, java.lang.String, js.Any, js.Any]
  ): IQuestionPanelDynamicData = {
    val __obj = js.Dynamic.literal(getItemIndex = getItemIndex, getPanelItemData = getPanelItemData, getSurvey = getSurvey, setPanelItemData = setPanelItemData)
  
    __obj.asInstanceOf[IQuestionPanelDynamicData]
  }
}

