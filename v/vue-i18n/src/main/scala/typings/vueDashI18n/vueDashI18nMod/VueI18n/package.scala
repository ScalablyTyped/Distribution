package typings.vueDashI18n.vueDashI18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object VueI18n {
  import org.scalablytyped.runtime.NumberDictionary
  import org.scalablytyped.runtime.StringDictionary
  import typings.vue.typesVueMod.Vue

  type Choice = Double
  type DateTimeFormat = StringDictionary[DateTimeFormatOptions]
  type DateTimeFormatOptions = typings.std.Intl.DateTimeFormatOptions | SpecificDateTimeFormatOptions
  type DateTimeFormatResult = String
  type DateTimeFormats = StringDictionary[DateTimeFormat]
  type Locale = String
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.vueDashI18n.vueDashI18nMod.VueI18n.LocaleMessageObject
    - typings.vueDashI18n.vueDashI18nMod.VueI18n.LocaleMessageArray
  */
  type LocaleMessage = _LocaleMessage | String
  type LocaleMessages = StringDictionary[LocaleMessageObject]
  type MissingHandler = js.Function4[
    /* locale */ Locale, 
    /* key */ Path, 
    /* vm */ Vue | Null, 
    /* values */ js.Any, 
    String | Unit
  ]
  type Modifiers = StringDictionary[js.Function1[/* str */ String, String]]
  type NumberFormat = StringDictionary[NumberFormatOptions]
  /* Rewritten from type alias, can be one of: 
    - typings.std.Intl.NumberFormatOptions
    - typings.vueDashI18n.vueDashI18nMod.VueI18n.SpecificNumberFormatOptions
    - typings.vueDashI18n.vueDashI18nMod.VueI18n.CurrencyNumberFormatOptions
  */
  type NumberFormatOptions = _NumberFormatOptions | typings.std.Intl.NumberFormatOptions
  type NumberFormatResult = String
  type NumberFormatToPartsResult = NumberDictionary[FormattedNumberPart]
  type NumberFormats = StringDictionary[NumberFormat]
  type Path = String
  type PluralizationRulesMap = /**
    * @param choice {number} a choice index given by the input to $tc: `$tc('path.to.rule', choiceIndex)`
    * @param choicesLength {number} an overall amount of available choices
    * @returns a final choice index
    */
  StringDictionary[js.Function2[/* choice */ Double, /* choicesLength */ Double, Double]]
  type TranslateResult = String | LocaleMessages
  type Values = js.Array[js.Any] | StringDictionary[js.Any]
}
