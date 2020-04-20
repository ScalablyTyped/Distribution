package typings.winrt.Windows.Globalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanguageStatics extends js.Object {
  var currentInputMethodLanguageTag: String
  def isWellFormed(languageTag: String): Boolean
}

object ILanguageStatics {
  @scala.inline
  def apply(currentInputMethodLanguageTag: String, isWellFormed: String => Boolean): ILanguageStatics = {
    val __obj = js.Dynamic.literal(currentInputMethodLanguageTag = currentInputMethodLanguageTag.asInstanceOf[js.Any], isWellFormed = js.Any.fromFunction1(isWellFormed))
    __obj.asInstanceOf[ILanguageStatics]
  }
}

