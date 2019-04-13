package typings
package vueDashI18nLib.vueDashI18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object VueI18nNs {
  type Choice = scala.Double
  type DateTimeFormat = org.scalablytyped.runtime.StringDictionary[DateTimeFormatOptions]
  type DateTimeFormatOptions = stdLib.IntlNs.DateTimeFormatOptions | SpecificDateTimeFormatOptions
  type DateTimeFormatResult = java.lang.String
  type DateTimeFormats = org.scalablytyped.runtime.StringDictionary[DateTimeFormat]
  type Locale = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - LocaleMessageObject
    - LocaleMessageArray
  */
  type LocaleMessage = _LocaleMessage | java.lang.String
  type LocaleMessages = org.scalablytyped.runtime.StringDictionary[LocaleMessageObject]
  type MissingHandler = js.Function3[
    /* locale */ Locale, 
    /* key */ Path, 
    /* vm */ js.UndefOr[vueLib.typesVueMod.Vue], 
    java.lang.String | scala.Unit
  ]
  type NumberFormat = org.scalablytyped.runtime.StringDictionary[NumberFormatOptions]
  /* Rewritten from type alias, can be one of: 
    - stdLib.IntlNs.NumberFormatOptions
    - SpecificNumberFormatOptions
    - CurrencyNumberFormatOptions
  */
  type NumberFormatOptions = _NumberFormatOptions | stdLib.IntlNs.NumberFormatOptions
  type NumberFormatResult = java.lang.String
  type NumberFormatToPartsResult = org.scalablytyped.runtime.NumberDictionary[FormattedNumberPart]
  type NumberFormats = org.scalablytyped.runtime.StringDictionary[NumberFormat]
  type Path = java.lang.String
  type PluralizationRulesMap = /**
    * @param choice {number} a choice index given by the input to $tc: `$tc('path.to.rule', choiceIndex)`
    * @param choicesLength {number} an overall amount of available choices
    * @returns a final choice index
    */
  org.scalablytyped.runtime.StringDictionary[
    js.Function2[/* choice */ scala.Double, /* choicesLength */ scala.Double, scala.Double]
  ]
  type TranslateResult = java.lang.String | LocaleMessages
  type Values = js.Array[js.Any] | org.scalablytyped.runtime.StringDictionary[js.Any]
}
