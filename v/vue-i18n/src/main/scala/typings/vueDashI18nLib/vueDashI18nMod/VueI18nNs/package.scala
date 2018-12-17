package typings
package vueDashI18nLib.vueDashI18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object VueI18nNs {
  type Choice = scala.Double
  type CurrencyDisplay = vueDashI18nLib.vueDashI18nLibStrings.symbol | vueDashI18nLib.vueDashI18nLibStrings.code | vueDashI18nLib.vueDashI18nLibStrings.name
  type DateTimeDigital = vueDashI18nLib.vueDashI18nLibStrings.numeric | vueDashI18nLib.vueDashI18nLibStrings.`2-digit`
  type DateTimeFormatOptions = stdLib.IntlNs.DateTimeFormatOptions | SpecificDateTimeFormatOptions
  type DateTimeFormatResult = java.lang.String
  type DateTimeHumanReadable = vueDashI18nLib.vueDashI18nLibStrings.long | vueDashI18nLib.vueDashI18nLibStrings.short | vueDashI18nLib.vueDashI18nLibStrings.narrow
  type FormatMatcher = vueDashI18nLib.vueDashI18nLibStrings.basic | vueDashI18nLib.vueDashI18nLibStrings.`best-fit`
  type Locale = java.lang.String
  type LocaleMatcher = vueDashI18nLib.vueDashI18nLibStrings.lookup | vueDashI18nLib.vueDashI18nLibStrings.`best-fit`
  type LocaleMessage = java.lang.String | LocaleMessageObject | LocaleMessageArray
  type MissingHandler = js.Function3[
    /* locale */ Locale, 
    /* key */ Path, 
    /* vm */ js.UndefOr[vueLib.typesVueMod.Vue], 
    java.lang.String | scala.Unit
  ]
  type NumberFormatOptions = stdLib.IntlNs.NumberFormatOptions | SpecificNumberFormatOptions | CurrencyNumberFormatOptions
  type NumberFormatResult = java.lang.String
  type Path = java.lang.String
  type TranslateResult = java.lang.String | LocaleMessages
  type Values = js.Array[js.Any] | org.scalablytyped.runtime.StringDictionary[js.Any]
}
