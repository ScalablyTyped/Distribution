package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextProcessor extends js.Object {
  def processText(text: String, returnDisplayValue: Boolean): String
  def processTextEx(text: String, returnDisplayValue: Boolean, doEncoding: Boolean): js.Any
}

object ITextProcessor {
  @scala.inline
  def apply(processText: (String, Boolean) => String, processTextEx: (String, Boolean, Boolean) => js.Any): ITextProcessor = {
    val __obj = js.Dynamic.literal(processText = js.Any.fromFunction2(processText), processTextEx = js.Any.fromFunction3(processTextEx))
  
    __obj.asInstanceOf[ITextProcessor]
  }
}

