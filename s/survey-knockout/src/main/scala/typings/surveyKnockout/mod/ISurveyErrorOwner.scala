package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISurveyErrorOwner extends ILocalizableOwner {
  def getErrorCustomText(text: String, error: SurveyError): String
}

object ISurveyErrorOwner {
  @scala.inline
  def apply(
    getErrorCustomText: (String, SurveyError) => String,
    getLocale: () => String,
    getMarkdownHtml: String => String,
    getProcessedText: String => String
  ): ISurveyErrorOwner = {
    val __obj = js.Dynamic.literal(getErrorCustomText = js.Any.fromFunction2(getErrorCustomText), getLocale = js.Any.fromFunction0(getLocale), getMarkdownHtml = js.Any.fromFunction1(getMarkdownHtml), getProcessedText = js.Any.fromFunction1(getProcessedText))
  
    __obj.asInstanceOf[ISurveyErrorOwner]
  }
}

