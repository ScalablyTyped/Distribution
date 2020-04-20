package typings.surveyKnockout.mod

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
  def apply(geSurveyData: () => ISurveyData, getSurvey: () => ISurvey, getTextProcessor: () => ITextProcessor): ISurveyImpl = {
    val __obj = js.Dynamic.literal(geSurveyData = js.Any.fromFunction0(geSurveyData), getSurvey = js.Any.fromFunction0(getSurvey), getTextProcessor = js.Any.fromFunction0(getTextProcessor))
    __obj.asInstanceOf[ISurveyImpl]
  }
}

