package typings.winrt.WindowsNs.GlobalizationNs.FontsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanguageFontGroupFactory extends js.Object {
  def createLanguageFontGroup(languageTag: String): LanguageFontGroup
}

object ILanguageFontGroupFactory {
  @scala.inline
  def apply(createLanguageFontGroup: String => LanguageFontGroup): ILanguageFontGroupFactory = {
    val __obj = js.Dynamic.literal(createLanguageFontGroup = js.Any.fromFunction1(createLanguageFontGroup))
  
    __obj.asInstanceOf[ILanguageFontGroupFactory]
  }
}

