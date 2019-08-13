package typings.vueDashI18n.vueDashI18nMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.std.RegExp
import typings.vue.typesVueMod.Vue
import typings.vueDashI18n.vueDashI18nMod.VueI18nNs.PluralizationRulesMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueI18n extends js.Object {
  val availableLocales: js.Array[typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale] = js.native
  val dateTimeFormats: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.DateTimeFormats = js.native
  var fallbackLocale: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale = js.native
  var formatFallbackMessages: Boolean = js.native
  var formatter: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Formatter = js.native
  var locale: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale = js.native
  val messages: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.LocaleMessages = js.native
  @JSName("missing")
  var missing_Original: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.MissingHandler = js.native
  val numberFormats: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.NumberFormats = js.native
  var pluralizationRules: PluralizationRulesMap = js.native
  var preserveDirectiveContent: Boolean = js.native
  var silentFallbackWarn: Boolean | RegExp = js.native
  var silentTranslationWarn: Boolean | RegExp = js.native
  var warnHtmlInMessage: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.WarnHtmlInMessageLevel = js.native
  def d(value: Double): typings.vueDashI18n.vueDashI18nMod.VueI18nNs.DateTimeFormatResult = js.native
  def d(value: Double, args: StringDictionary[String]): typings.vueDashI18n.vueDashI18nMod.VueI18nNs.DateTimeFormatResult = js.native
  def d(value: Double, key: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path): typings.vueDashI18n.vueDashI18nMod.VueI18nNs.DateTimeFormatResult = js.native
  def d(
    value: Double,
    key: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path,
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale
  ): typings.vueDashI18n.vueDashI18nMod.VueI18nNs.DateTimeFormatResult = js.native
  def d(value: Date): typings.vueDashI18n.vueDashI18nMod.VueI18nNs.DateTimeFormatResult = js.native
  def d(value: Date, args: StringDictionary[String]): typings.vueDashI18n.vueDashI18nMod.VueI18nNs.DateTimeFormatResult = js.native
  def d(value: Date, key: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path): typings.vueDashI18n.vueDashI18nMod.VueI18nNs.DateTimeFormatResult = js.native
  def d(
    value: Date,
    key: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path,
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale
  ): typings.vueDashI18n.vueDashI18nMod.VueI18nNs.DateTimeFormatResult = js.native
  /**
    * @param choice {number} a choice index given by the input to $tc: `$tc('path.to.rule', choiceIndex)`
    * @param choicesLength {number} an overall amount of available choices
    * @returns a final choice index
    */
  def getChoiceIndex(choice: Double, choicesLength: Double): Double = js.native
  def getDateTimeFormat(locale: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale): typings.vueDashI18n.vueDashI18nMod.VueI18nNs.DateTimeFormat = js.native
  def getLocaleMessage(locale: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale): typings.vueDashI18n.vueDashI18nMod.VueI18nNs.LocaleMessageObject = js.native
  def getNumberFormat(locale: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale): typings.vueDashI18n.vueDashI18nMod.VueI18nNs.NumberFormat = js.native
  def mergeDateTimeFormat(
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale,
    format: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.DateTimeFormat
  ): Unit = js.native
  def mergeLocaleMessage(
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale,
    message: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.LocaleMessageObject
  ): Unit = js.native
  def mergeNumberFormat(
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale,
    format: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.NumberFormat
  ): Unit = js.native
  def missing(
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale,
    key: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path
  ): String | Unit = js.native
  def missing(
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale,
    key: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path,
    vm: Vue
  ): String | Unit = js.native
  def n(value: Double): typings.vueDashI18n.vueDashI18nMod.VueI18nNs.NumberFormatResult = js.native
  def n(value: Double, args: StringDictionary[String]): typings.vueDashI18n.vueDashI18nMod.VueI18nNs.NumberFormatResult = js.native
  def n(value: Double, key: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path): typings.vueDashI18n.vueDashI18nMod.VueI18nNs.NumberFormatResult = js.native
  def n(
    value: Double,
    key: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path,
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale
  ): typings.vueDashI18n.vueDashI18nMod.VueI18nNs.NumberFormatResult = js.native
  def setDateTimeFormat(
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale,
    format: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.DateTimeFormat
  ): Unit = js.native
  def setLocaleMessage(
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale,
    message: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.LocaleMessageObject
  ): Unit = js.native
  def setNumberFormat(
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale,
    format: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.NumberFormat
  ): Unit = js.native
  def t(key: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path): typings.vueDashI18n.vueDashI18nMod.VueI18nNs.TranslateResult = js.native
  def t(
    key: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path,
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale
  ): typings.vueDashI18n.vueDashI18nMod.VueI18nNs.TranslateResult = js.native
  def t(
    key: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path,
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale,
    values: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Values
  ): typings.vueDashI18n.vueDashI18nMod.VueI18nNs.TranslateResult = js.native
  def t(
    key: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path,
    values: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Values
  ): typings.vueDashI18n.vueDashI18nMod.VueI18nNs.TranslateResult = js.native
  def tc(key: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path): String = js.native
  def tc(
    key: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path,
    choice: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Choice
  ): String = js.native
  def tc(
    key: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path,
    choice: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Choice,
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale
  ): String = js.native
  def tc(
    key: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path,
    choice: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Choice,
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale,
    values: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Values
  ): String = js.native
  def tc(
    key: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path,
    choice: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Choice,
    values: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Values
  ): String = js.native
  def te(key: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path): Boolean = js.native
  def te(
    key: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path,
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale
  ): Boolean = js.native
}

