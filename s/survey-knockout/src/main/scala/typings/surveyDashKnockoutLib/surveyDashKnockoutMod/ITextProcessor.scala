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
    processText: (java.lang.String, scala.Boolean) => java.lang.String,
    processTextEx: (java.lang.String, scala.Boolean, scala.Boolean) => js.Any
  ): ITextProcessor = {
    val __obj = js.Dynamic.literal(processText = js.Any.fromFunction2(processText), processTextEx = js.Any.fromFunction3(processTextEx))
  
    __obj.asInstanceOf[ITextProcessor]
  }
}

