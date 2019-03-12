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
    getErrorCustomText: (java.lang.String, SurveyError) => java.lang.String,
    getLocale: () => java.lang.String,
    getMarkdownHtml: java.lang.String => java.lang.String,
    getProcessedText: java.lang.String => java.lang.String
  ): ISurveyErrorOwner = {
    val __obj = js.Dynamic.literal(getErrorCustomText = js.Any.fromFunction2(getErrorCustomText), getLocale = js.Any.fromFunction0(getLocale), getMarkdownHtml = js.Any.fromFunction1(getMarkdownHtml), getProcessedText = js.Any.fromFunction1(getProcessedText))
  
    __obj.asInstanceOf[ISurveyErrorOwner]
  }
}

