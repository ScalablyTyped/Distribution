package typings.vueI18n.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object VueI18n {
  type Choice = scala.Double
  type ComponentInstanceCreatedListener = js.Function2[
    /* newVm */ typings.vueI18n.mod.VueI18n with typings.vueI18n.mod.IVueI18n, 
    /* rootVm */ typings.vueI18n.mod.VueI18n with typings.vueI18n.mod.IVueI18n, 
    scala.Unit
  ]
  type DateTimeFormat = org.scalablytyped.runtime.StringDictionary[typings.vueI18n.mod.VueI18n.DateTimeFormatOptions]
  type DateTimeFormatOptions = typings.std.Intl.DateTimeFormatOptions | typings.vueI18n.mod.VueI18n.SpecificDateTimeFormatOptions
  type DateTimeFormatResult = java.lang.String
  type DateTimeFormats = org.scalablytyped.runtime.StringDictionary[typings.vueI18n.mod.VueI18n.DateTimeFormat]
  type FallbackLocale = java.lang.String | js.Array[java.lang.String] | typings.vueI18n.vueI18nBooleans.`false` | org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  type Locale = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.vueI18n.mod.VueI18n.LocaleMessageObject
    - typings.vueI18n.mod.VueI18n.LocaleMessageArray
  */
  type LocaleMessage = typings.vueI18n.mod.VueI18n._LocaleMessage | java.lang.String
  type LocaleMessages = org.scalablytyped.runtime.StringDictionary[typings.vueI18n.mod.VueI18n.LocaleMessageObject]
  type MissingHandler = js.Function4[
    /* locale */ typings.vueI18n.mod.VueI18n.Locale, 
    /* key */ typings.vueI18n.mod.VueI18n.Path, 
    /* vm */ typings.vue.vueMod.Vue | scala.Null, 
    /* values */ js.Any, 
    java.lang.String | scala.Unit
  ]
  type Modifiers = org.scalablytyped.runtime.StringDictionary[js.Function1[/* str */ java.lang.String, java.lang.String]]
  type NumberFormat = org.scalablytyped.runtime.StringDictionary[typings.vueI18n.mod.VueI18n.NumberFormatOptions]
  /* Rewritten from type alias, can be one of: 
    - typings.std.Intl.NumberFormatOptions
    - typings.vueI18n.mod.VueI18n.SpecificNumberFormatOptions
    - typings.vueI18n.mod.VueI18n.CurrencyNumberFormatOptions
  */
  type NumberFormatOptions = typings.vueI18n.mod.VueI18n._NumberFormatOptions | typings.std.Intl.NumberFormatOptions
  type NumberFormatResult = java.lang.String
  type NumberFormatToPartsResult = org.scalablytyped.runtime.NumberDictionary[typings.vueI18n.mod.VueI18n.FormattedNumberPart]
  type NumberFormats = org.scalablytyped.runtime.StringDictionary[typings.vueI18n.mod.VueI18n.NumberFormat]
  type Path = java.lang.String
  type PluralizationRulesMap = /**
    * @param choice {number} a choice index given by the input to $tc: `$tc('path.to.rule', choiceIndex)`
    * @param choicesLength {number} an overall amount of available choices
    * @returns a final choice index
    */
  org.scalablytyped.runtime.StringDictionary[
    js.Function2[/* choice */ scala.Double, /* choicesLength */ scala.Double, scala.Double]
  ]
  type PostTranslationHandler = js.Function2[/* str */ java.lang.String, /* key */ js.UndefOr[java.lang.String], java.lang.String]
  type TranslateResult = java.lang.String | typings.vueI18n.mod.VueI18n.LocaleMessages
  type Values = js.Array[js.Any] | org.scalablytyped.runtime.StringDictionary[js.Any]
}
