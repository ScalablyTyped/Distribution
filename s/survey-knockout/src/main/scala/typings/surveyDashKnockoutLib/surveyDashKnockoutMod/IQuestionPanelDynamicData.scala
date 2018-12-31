package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQuestionPanelDynamicData extends js.Object {
  def getItemIndex(item: QuestionPanelDynamicItem): scala.Double
  def getPanelItemData(item: QuestionPanelDynamicItem): js.Any
  def getSurvey(): ISurvey
  def setPanelItemData(item: QuestionPanelDynamicItem, name: java.lang.String, `val`: js.Any): js.Any
}

