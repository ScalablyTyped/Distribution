package typings.vueDashI18n.vueDashI18nMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.vue.typesVueMod.Vue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object VueI18nNs {
  type Choice = Double
  type DateTimeFormat = StringDictionary[typings.vueDashI18n.vueDashI18nMod.VueI18nNs.DateTimeFormatOptions]
  type DateTimeFormatOptions = typings.std.IntlNs.DateTimeFormatOptions | SpecificDateTimeFormatOptions
  type DateTimeFormatResult = String
  type DateTimeFormats = StringDictionary[typings.vueDashI18n.vueDashI18nMod.VueI18nNs.DateTimeFormat]
  type Locale = String
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.vueDashI18n.vueDashI18nMod.VueI18nNs.LocaleMessageObject
    - typings.vueDashI18n.vueDashI18nMod.VueI18nNs.LocaleMessageArray
  */
  type LocaleMessage = _LocaleMessage | String
  type LocaleMessages = StringDictionary[typings.vueDashI18n.vueDashI18nMod.VueI18nNs.LocaleMessageObject]
  type MissingHandler = js.Function3[
    /* locale */ typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale, 
    /* key */ typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path, 
    /* vm */ js.UndefOr[Vue], 
    String | Unit
  ]
  type NumberFormat = StringDictionary[typings.vueDashI18n.vueDashI18nMod.VueI18nNs.NumberFormatOptions]
  /* Rewritten from type alias, can be one of: 
    - typings.std.IntlNs.NumberFormatOptions
    - typings.vueDashI18n.vueDashI18nMod.VueI18nNs.SpecificNumberFormatOptions
    - typings.vueDashI18n.vueDashI18nMod.VueI18nNs.CurrencyNumberFormatOptions
  */
  type NumberFormatOptions = _NumberFormatOptions | typings.std.IntlNs.NumberFormatOptions
  type NumberFormatResult = String
  type NumberFormatToPartsResult = NumberDictionary[FormattedNumberPart]
  type NumberFormats = StringDictionary[typings.vueDashI18n.vueDashI18nMod.VueI18nNs.NumberFormat]
  type Path = String
  type PluralizationRulesMap = /**
    * @param choice {number} a choice index given by the input to $tc: `$tc('path.to.rule', choiceIndex)`
    * @param choicesLength {number} an overall amount of available choices
    * @returns a final choice index
    */
  StringDictionary[js.Function2[/* choice */ Double, /* choicesLength */ Double, Double]]
  type TranslateResult = String | typings.vueDashI18n.vueDashI18nMod.VueI18nNs.LocaleMessages
  type Values = js.Array[js.Any] | StringDictionary[js.Any]
}
