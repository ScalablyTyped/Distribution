package typings
package winrtLib.WindowsNs.GlobalizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanguageStatics extends js.Object {
  var currentInputMethodLanguageTag: java.lang.String
  def isWellFormed(languageTag: java.lang.String): scala.Boolean
}

object ILanguageStatics {
  @scala.inline
  def apply(
    currentInputMethodLanguageTag: java.lang.String,
    isWellFormed: js.Function1[java.lang.String, scala.Boolean]
  ): ILanguageStatics = {
    val __obj = js.Dynamic.literal(currentInputMethodLanguageTag = currentInputMethodLanguageTag, isWellFormed = isWellFormed)
  
    __obj.asInstanceOf[ILanguageStatics]
  }
}

