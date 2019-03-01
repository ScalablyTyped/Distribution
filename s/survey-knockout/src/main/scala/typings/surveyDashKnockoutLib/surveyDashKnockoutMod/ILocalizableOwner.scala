package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILocalizableOwner extends js.Object {
  def getLocale(): java.lang.String
  def getMarkdownHtml(text: java.lang.String): java.lang.String
  def getProcessedText(text: java.lang.String): java.lang.String
}

object ILocalizableOwner {
  @scala.inline
  def apply(
    getLocale: js.Function0[java.lang.String],
    getMarkdownHtml: js.Function1[java.lang.String, java.lang.String],
    getProcessedText: js.Function1[java.lang.String, java.lang.String]
  ): ILocalizableOwner = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getLocale")(getLocale)
    __obj.updateDynamic("getMarkdownHtml")(getMarkdownHtml)
    __obj.updateDynamic("getProcessedText")(getProcessedText)
    __obj.asInstanceOf[ILocalizableOwner]
  }
}

