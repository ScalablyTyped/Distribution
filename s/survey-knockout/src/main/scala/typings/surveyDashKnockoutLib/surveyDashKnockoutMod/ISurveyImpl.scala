package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISurveyImpl extends js.Object {
  def geSurveyData(): ISurveyData
  def getSurvey(): ISurvey
  def getTextProcessor(): ITextProcessor
}

object ISurveyImpl {
  @scala.inline
  def apply(
    geSurveyData: js.Function0[ISurveyData],
    getSurvey: js.Function0[ISurvey],
    getTextProcessor: js.Function0[ITextProcessor]
  ): ISurveyImpl = {
    val __obj = js.Dynamic.literal(geSurveyData = geSurveyData, getSurvey = getSurvey, getTextProcessor = getTextProcessor)
  
    __obj.asInstanceOf[ISurveyImpl]
  }
}

