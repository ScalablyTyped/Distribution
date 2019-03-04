package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISurveyErrorOwner extends ILocalizableOwner {
  def getErrorCustomText(text: java.lang.String, error: SurveyError): java.lang.String
}

object ISurveyErrorOwner {
  @scala.inline
  def apply(
    getErrorCustomText: js.Function2[java.lang.String, SurveyError, java.lang.String],
    getLocale: js.Function0[java.lang.String],
    getMarkdownHtml: js.Function1[java.lang.String, java.lang.String],
    getProcessedText: js.Function1[java.lang.String, java.lang.String]
  ): ISurveyErrorOwner = {
    val __obj = js.Dynamic.literal(getErrorCustomText = getErrorCustomText, getLocale = getLocale, getMarkdownHtml = getMarkdownHtml, getProcessedText = getProcessedText)
  
    __obj.asInstanceOf[ISurveyErrorOwner]
  }
}

