package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILocalizableOwner extends js.Object {
  def getLocale(): String
  def getMarkdownHtml(text: String): String
  def getProcessedText(text: String): String
}

object ILocalizableOwner {
  @scala.inline
  def apply(getLocale: () => String, getMarkdownHtml: String => String, getProcessedText: String => String): ILocalizableOwner = {
    val __obj = js.Dynamic.literal(getLocale = js.Any.fromFunction0(getLocale), getMarkdownHtml = js.Any.fromFunction1(getMarkdownHtml), getProcessedText = js.Any.fromFunction1(getProcessedText))
  
    __obj.asInstanceOf[ILocalizableOwner]
  }
}

