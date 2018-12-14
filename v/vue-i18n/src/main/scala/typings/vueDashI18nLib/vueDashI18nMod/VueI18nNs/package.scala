package typings
package vueDashI18nLib.vueDashI18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object VueI18nNs {
  type Choice = scala.Double
  type DateTimeFormatResult = java.lang.String
  type Locale = java.lang.String
  type LocaleMessage = java.lang.String | LocaleMessageObject | LocaleMessageArray
  type MissingHandler = js.Function3[
    /* locale */ Locale, 
    /* key */ Path, 
    /* vm */ js.UndefOr[vueLib.typesVueMod.Vue], 
    java.lang.String | scala.Unit
  ]
  type NumberFormatResult = java.lang.String
  type Path = java.lang.String
  type TranslateResult = java.lang.String | LocaleMessages
  type Values = js.Array[js.Any] | org.scalablytyped.runtime.StringDictionary[js.Any]
}
