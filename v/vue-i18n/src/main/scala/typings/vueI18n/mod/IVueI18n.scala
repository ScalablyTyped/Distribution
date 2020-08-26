package typings.vueI18n.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.std.RegExp
import typings.vue.vueMod.Vue
import typings.vueI18n.mod.VueI18n.PluralizationRulesMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVueI18n extends js.Object {
  val dateTimeFormats: typings.vueI18n.mod.VueI18n.DateTimeFormats = js.native
  var fallbackLocale: typings.vueI18n.mod.VueI18n.FallbackLocale = js.native
  var formatFallbackMessages: Boolean = js.native
  var formatter: typings.vueI18n.mod.VueI18n.Formatter = js.native
  var locale: typings.vueI18n.mod.VueI18n.Locale = js.native
  val messages: typings.vueI18n.mod.VueI18n.LocaleMessages = js.native
  @JSName("missing")
  var missing_Original: typings.vueI18n.mod.VueI18n.MissingHandler = js.native
  val numberFormats: typings.vueI18n.mod.VueI18n.NumberFormats = js.native
  var pluralizationRules: PluralizationRulesMap = js.native
  @JSName("postTranslation")
  var postTranslation_Original: typings.vueI18n.mod.VueI18n.PostTranslationHandler = js.native
  var preserveDirectiveContent: Boolean = js.native
  var silentFallbackWarn: Boolean | RegExp = js.native
  var silentTranslationWarn: Boolean | RegExp = js.native
  var warnHtmlInMessage: typings.vueI18n.mod.VueI18n.WarnHtmlInMessageLevel = js.native
  def d(value: Double): typings.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Double, args: StringDictionary[String]): typings.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Double, key: js.UndefOr[scala.Nothing], locale: typings.vueI18n.mod.VueI18n.Locale): typings.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Double, key: typings.vueI18n.mod.VueI18n.Path): typings.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Double, key: typings.vueI18n.mod.VueI18n.Path, locale: typings.vueI18n.mod.VueI18n.Locale): typings.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Date): typings.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Date, args: StringDictionary[String]): typings.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Date, key: js.UndefOr[scala.Nothing], locale: typings.vueI18n.mod.VueI18n.Locale): typings.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Date, key: typings.vueI18n.mod.VueI18n.Path): typings.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Date, key: typings.vueI18n.mod.VueI18n.Path, locale: typings.vueI18n.mod.VueI18n.Locale): typings.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def getChoiceIndex(choice: Double, choicesLength: Double): Double = js.native
  def getDateTimeFormat(locale: typings.vueI18n.mod.VueI18n.Locale): typings.vueI18n.mod.VueI18n.DateTimeFormat = js.native
  def getLocaleMessage(locale: typings.vueI18n.mod.VueI18n.Locale): typings.vueI18n.mod.VueI18n.LocaleMessageObject = js.native
  def getNumberFormat(locale: typings.vueI18n.mod.VueI18n.Locale): typings.vueI18n.mod.VueI18n.NumberFormat = js.native
  def mergeDateTimeFormat(locale: typings.vueI18n.mod.VueI18n.Locale, format: typings.vueI18n.mod.VueI18n.DateTimeFormat): Unit = js.native
  def mergeLocaleMessage(
    locale: typings.vueI18n.mod.VueI18n.Locale,
    message: typings.vueI18n.mod.VueI18n.LocaleMessageObject
  ): Unit = js.native
  def mergeNumberFormat(locale: typings.vueI18n.mod.VueI18n.Locale, format: typings.vueI18n.mod.VueI18n.NumberFormat): Unit = js.native
  def missing(
    locale: typings.vueI18n.mod.VueI18n.Locale,
    key: typings.vueI18n.mod.VueI18n.Path,
    vm: Null,
    values: js.Any
  ): String | Unit = js.native
  def missing(
    locale: typings.vueI18n.mod.VueI18n.Locale,
    key: typings.vueI18n.mod.VueI18n.Path,
    vm: Vue,
    values: js.Any
  ): String | Unit = js.native
  def n(value: Double): typings.vueI18n.mod.VueI18n.NumberFormatResult = js.native
  def n(value: Double, args: StringDictionary[String]): typings.vueI18n.mod.VueI18n.NumberFormatResult = js.native
  def n(value: Double, key: js.UndefOr[scala.Nothing], locale: typings.vueI18n.mod.VueI18n.Locale): typings.vueI18n.mod.VueI18n.NumberFormatResult = js.native
  def n(value: Double, key: typings.vueI18n.mod.VueI18n.Path): typings.vueI18n.mod.VueI18n.NumberFormatResult = js.native
  def n(value: Double, key: typings.vueI18n.mod.VueI18n.Path, locale: typings.vueI18n.mod.VueI18n.Locale): typings.vueI18n.mod.VueI18n.NumberFormatResult = js.native
  def postTranslation(str: String): String = js.native
  def postTranslation(str: String, key: String): String = js.native
  def setDateTimeFormat(locale: typings.vueI18n.mod.VueI18n.Locale, format: typings.vueI18n.mod.VueI18n.DateTimeFormat): Unit = js.native
  def setLocaleMessage(
    locale: typings.vueI18n.mod.VueI18n.Locale,
    message: typings.vueI18n.mod.VueI18n.LocaleMessageObject
  ): Unit = js.native
  def setNumberFormat(locale: typings.vueI18n.mod.VueI18n.Locale, format: typings.vueI18n.mod.VueI18n.NumberFormat): Unit = js.native
  def t(key: typings.vueI18n.mod.VueI18n.Path): typings.vueI18n.mod.VueI18n.TranslateResult = js.native
  def t(key: typings.vueI18n.mod.VueI18n.Path, locale: typings.vueI18n.mod.VueI18n.Locale): typings.vueI18n.mod.VueI18n.TranslateResult = js.native
  def t(
    key: typings.vueI18n.mod.VueI18n.Path,
    locale: typings.vueI18n.mod.VueI18n.Locale,
    values: typings.vueI18n.mod.VueI18n.Values
  ): typings.vueI18n.mod.VueI18n.TranslateResult = js.native
  def t(key: typings.vueI18n.mod.VueI18n.Path, values: typings.vueI18n.mod.VueI18n.Values): typings.vueI18n.mod.VueI18n.TranslateResult = js.native
  def tc(key: typings.vueI18n.mod.VueI18n.Path): String = js.native
  def tc(
    key: typings.vueI18n.mod.VueI18n.Path,
    choice: js.UndefOr[scala.Nothing],
    values: typings.vueI18n.mod.VueI18n.Values
  ): String = js.native
  def tc(key: typings.vueI18n.mod.VueI18n.Path, choice: typings.vueI18n.mod.VueI18n.Choice): String = js.native
  def tc(
    key: typings.vueI18n.mod.VueI18n.Path,
    choice: typings.vueI18n.mod.VueI18n.Choice,
    locale: typings.vueI18n.mod.VueI18n.Locale
  ): String = js.native
  def tc(
    key: typings.vueI18n.mod.VueI18n.Path,
    choice: typings.vueI18n.mod.VueI18n.Choice,
    locale: typings.vueI18n.mod.VueI18n.Locale,
    values: typings.vueI18n.mod.VueI18n.Values
  ): String = js.native
  def tc(
    key: typings.vueI18n.mod.VueI18n.Path,
    choice: typings.vueI18n.mod.VueI18n.Choice,
    values: typings.vueI18n.mod.VueI18n.Values
  ): String = js.native
  def te(key: typings.vueI18n.mod.VueI18n.Path): Boolean = js.native
  def te(key: typings.vueI18n.mod.VueI18n.Path, locale: typings.vueI18n.mod.VueI18n.Locale): Boolean = js.native
}

