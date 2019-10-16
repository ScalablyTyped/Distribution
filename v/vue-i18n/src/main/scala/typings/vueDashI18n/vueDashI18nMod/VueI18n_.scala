package typings.vueDashI18n.vueDashI18nMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.std.RegExp
import typings.vue.typesVueMod.Vue
import typings.vueDashI18n.vueDashI18nMod.VueI18n.PluralizationRulesMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("VueI18n")
@js.native
trait VueI18n_ extends js.Object {
  val availableLocales: js.Array[typings.vueDashI18n.vueDashI18nMod.VueI18n.Locale] = js.native
  val dateTimeFormats: typings.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormats = js.native
  var fallbackLocale: typings.vueDashI18n.vueDashI18nMod.VueI18n.Locale = js.native
  var formatFallbackMessages: Boolean = js.native
  var formatter: typings.vueDashI18n.vueDashI18nMod.VueI18n.Formatter = js.native
  var locale: typings.vueDashI18n.vueDashI18nMod.VueI18n.Locale = js.native
  val messages: typings.vueDashI18n.vueDashI18nMod.VueI18n.LocaleMessages = js.native
  @JSName("missing")
  var missing_Original: typings.vueDashI18n.vueDashI18nMod.VueI18n.MissingHandler = js.native
  val numberFormats: typings.vueDashI18n.vueDashI18nMod.VueI18n.NumberFormats = js.native
  var pluralizationRules: PluralizationRulesMap = js.native
  var preserveDirectiveContent: Boolean = js.native
  var silentFallbackWarn: Boolean | RegExp = js.native
  var silentTranslationWarn: Boolean | RegExp = js.native
  var warnHtmlInMessage: typings.vueDashI18n.vueDashI18nMod.VueI18n.WarnHtmlInMessageLevel = js.native
  def d(value: Double): typings.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Double, args: StringDictionary[String]): typings.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Double, key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path): typings.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormatResult = js.native
  def d(
    value: Double,
    key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path,
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18n.Locale
  ): typings.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Date): typings.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Date, args: StringDictionary[String]): typings.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Date, key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path): typings.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormatResult = js.native
  def d(
    value: Date,
    key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path,
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18n.Locale
  ): typings.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormatResult = js.native
  /**
    * @param choice {number} a choice index given by the input to $tc: `$tc('path.to.rule', choiceIndex)`
    * @param choicesLength {number} an overall amount of available choices
    * @returns a final choice index
    */
  def getChoiceIndex(choice: Double, choicesLength: Double): Double = js.native
  def getDateTimeFormat(locale: typings.vueDashI18n.vueDashI18nMod.VueI18n.Locale): typings.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormat = js.native
  def getLocaleMessage(locale: typings.vueDashI18n.vueDashI18nMod.VueI18n.Locale): typings.vueDashI18n.vueDashI18nMod.VueI18n.LocaleMessageObject = js.native
  def getNumberFormat(locale: typings.vueDashI18n.vueDashI18nMod.VueI18n.Locale): typings.vueDashI18n.vueDashI18nMod.VueI18n.NumberFormat = js.native
  def mergeDateTimeFormat(
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18n.Locale,
    format: typings.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormat
  ): Unit = js.native
  def mergeLocaleMessage(
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18n.Locale,
    message: typings.vueDashI18n.vueDashI18nMod.VueI18n.LocaleMessageObject
  ): Unit = js.native
  def mergeNumberFormat(
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18n.Locale,
    format: typings.vueDashI18n.vueDashI18nMod.VueI18n.NumberFormat
  ): Unit = js.native
  def missing(
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18n.Locale,
    key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path,
    vm: Null,
    values: js.Any
  ): String | Unit = js.native
  def missing(
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18n.Locale,
    key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path,
    vm: Vue,
    values: js.Any
  ): String | Unit = js.native
  def n(value: Double): typings.vueDashI18n.vueDashI18nMod.VueI18n.NumberFormatResult = js.native
  def n(value: Double, args: StringDictionary[String]): typings.vueDashI18n.vueDashI18nMod.VueI18n.NumberFormatResult = js.native
  def n(value: Double, key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path): typings.vueDashI18n.vueDashI18nMod.VueI18n.NumberFormatResult = js.native
  def n(
    value: Double,
    key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path,
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18n.Locale
  ): typings.vueDashI18n.vueDashI18nMod.VueI18n.NumberFormatResult = js.native
  def setDateTimeFormat(
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18n.Locale,
    format: typings.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormat
  ): Unit = js.native
  def setLocaleMessage(
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18n.Locale,
    message: typings.vueDashI18n.vueDashI18nMod.VueI18n.LocaleMessageObject
  ): Unit = js.native
  def setNumberFormat(
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18n.Locale,
    format: typings.vueDashI18n.vueDashI18nMod.VueI18n.NumberFormat
  ): Unit = js.native
  def t(key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path): typings.vueDashI18n.vueDashI18nMod.VueI18n.TranslateResult = js.native
  def t(
    key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path,
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18n.Locale
  ): typings.vueDashI18n.vueDashI18nMod.VueI18n.TranslateResult = js.native
  def t(
    key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path,
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18n.Locale,
    values: typings.vueDashI18n.vueDashI18nMod.VueI18n.Values
  ): typings.vueDashI18n.vueDashI18nMod.VueI18n.TranslateResult = js.native
  def t(
    key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path,
    values: typings.vueDashI18n.vueDashI18nMod.VueI18n.Values
  ): typings.vueDashI18n.vueDashI18nMod.VueI18n.TranslateResult = js.native
  def tc(key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path): String = js.native
  def tc(
    key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path,
    choice: typings.vueDashI18n.vueDashI18nMod.VueI18n.Choice
  ): String = js.native
  def tc(
    key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path,
    choice: typings.vueDashI18n.vueDashI18nMod.VueI18n.Choice,
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18n.Locale
  ): String = js.native
  def tc(
    key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path,
    choice: typings.vueDashI18n.vueDashI18nMod.VueI18n.Choice,
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18n.Locale,
    values: typings.vueDashI18n.vueDashI18nMod.VueI18n.Values
  ): String = js.native
  def tc(
    key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path,
    choice: typings.vueDashI18n.vueDashI18nMod.VueI18n.Choice,
    values: typings.vueDashI18n.vueDashI18nMod.VueI18n.Values
  ): String = js.native
  def te(key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path): Boolean = js.native
  def te(
    key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path,
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18n.Locale
  ): Boolean = js.native
}

