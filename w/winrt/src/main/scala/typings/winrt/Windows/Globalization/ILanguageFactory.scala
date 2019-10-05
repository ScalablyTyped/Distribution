package typings.winrt.Windows.Globalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanguageFactory extends js.Object {
  def createLanguage(languageTag: String): Language
}

object ILanguageFactory {
  @scala.inline
  def apply(createLanguage: String => Language): ILanguageFactory = {
    val __obj = js.Dynamic.literal(createLanguage = js.Any.fromFunction1(createLanguage))
  
    __obj.asInstanceOf[ILanguageFactory]
  }
}

