package typings
package winrtLib.WindowsNs.GlobalizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanguageFactory extends js.Object {
  def createLanguage(languageTag: java.lang.String): Language
}

object ILanguageFactory {
  @scala.inline
  def apply(createLanguage: java.lang.String => Language): ILanguageFactory = {
    val __obj = js.Dynamic.literal(createLanguage = js.Any.fromFunction1(createLanguage))
  
    __obj.asInstanceOf[ILanguageFactory]
  }
}

