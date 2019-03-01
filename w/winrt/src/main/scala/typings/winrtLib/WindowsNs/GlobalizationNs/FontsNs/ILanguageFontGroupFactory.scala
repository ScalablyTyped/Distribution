package typings
package winrtLib.WindowsNs.GlobalizationNs.FontsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanguageFontGroupFactory extends js.Object {
  def createLanguageFontGroup(languageTag: java.lang.String): LanguageFontGroup
}

object ILanguageFontGroupFactory {
  @scala.inline
  def apply(createLanguageFontGroup: js.Function1[java.lang.String, LanguageFontGroup]): ILanguageFontGroupFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createLanguageFontGroup")(createLanguageFontGroup)
    __obj.asInstanceOf[ILanguageFontGroupFactory]
  }
}

