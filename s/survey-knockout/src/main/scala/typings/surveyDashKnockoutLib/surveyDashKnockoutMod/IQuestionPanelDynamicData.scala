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

