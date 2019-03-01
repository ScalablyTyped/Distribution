package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextProcessor extends js.Object {
  def processText(text: java.lang.String, returnDisplayValue: scala.Boolean): java.lang.String
  def processTextEx(text: java.lang.String, returnDisplayValue: scala.Boolean, doEncoding: scala.Boolean): js.Any
}

object ITextProcessor {
  @scala.inline
  def apply(
    processText: js.Function2[java.lang.String, scala.Boolean, java.lang.String],
    processTextEx: js.Function3[java.lang.String, scala.Boolean, scala.Boolean, js.Any]
  ): ITextProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("processText")(processText)
    __obj.updateDynamic("processTextEx")(processTextEx)
    __obj.asInstanceOf[ITextProcessor]
  }
}

