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
  def apply(createLanguage: js.Function1[java.lang.String, Language]): ILanguageFactory = {
    val __obj = js.Dynamic.literal(createLanguage = createLanguage)
  
    __obj.asInstanceOf[ILanguageFactory]
  }
}

