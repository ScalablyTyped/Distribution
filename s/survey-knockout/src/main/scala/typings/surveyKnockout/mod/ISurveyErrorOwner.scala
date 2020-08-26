package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISurveyErrorOwner extends ILocalizableOwner {
  def getErrorCustomText(text: String, error: SurveyError): String = js.native
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
  @scala.inline
  implicit class ISurveyErrorOwnerOps[Self <: ISurveyErrorOwner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetErrorCustomText(value: (String, SurveyError) => String): Self = this.set("getErrorCustomText", js.Any.fromFunction2(value))
  }
  
}

