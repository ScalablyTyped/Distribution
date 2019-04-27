package typings
package vueDashI18nLib.vueDashI18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueI18n extends js.Object {
  val availableLocales: js.Array[vueDashI18nLib.vueDashI18nMod.VueI18nNs.Locale] = js.native
  val dateTimeFormats: vueDashI18nLib.vueDashI18nMod.VueI18nNs.DateTimeFormats = js.native
  var fallbackLocale: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Locale = js.native
  var formatter: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Formatter = js.native
  var locale: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Locale = js.native
  val messages: vueDashI18nLib.vueDashI18nMod.VueI18nNs.LocaleMessages = js.native
  @JSName("missing")
  var missing_Original: vueDashI18nLib.vueDashI18nMod.VueI18nNs.MissingHandler = js.native
  val numberFormats: vueDashI18nLib.vueDashI18nMod.VueI18nNs.NumberFormats = js.native
  var pluralizationRules: vueDashI18nLib.vueDashI18nMod.VueI18nNs.PluralizationRulesMap = js.native
  var preserveDirectiveContent: scala.Boolean = js.native
  var silentFallbackWarn: scala.Boolean = js.native
  var silentTranslationWarn: scala.Boolean = js.native
  var warnHtmlInMessage: vueDashI18nLib.vueDashI18nMod.VueI18nNs.WarnHtmlInMessageLevel = js.native
  def d(value: scala.Double): vueDashI18nLib.vueDashI18nMod.VueI18nNs.DateTimeFormatResult = js.native
  def d(value: scala.Double, args: org.scalablytyped.runtime.StringDictionary[java.lang.String]): vueDashI18nLib.vueDashI18nMod.VueI18nNs.DateTimeFormatResult = js.native
  def d(value: scala.Double, key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path): vueDashI18nLib.vueDashI18nMod.VueI18nNs.DateTimeFormatResult = js.native
  def d(
    value: scala.Double,
    key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path,
    locale: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Locale
  ): vueDashI18nLib.vueDashI18nMod.VueI18nNs.DateTimeFormatResult = js.native
  def d(value: stdLib.Date): vueDashI18nLib.vueDashI18nMod.VueI18nNs.DateTimeFormatResult = js.native
  def d(value: stdLib.Date, args: org.scalablytyped.runtime.StringDictionary[java.lang.String]): vueDashI18nLib.vueDashI18nMod.VueI18nNs.DateTimeFormatResult = js.native
  def d(value: stdLib.Date, key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path): vueDashI18nLib.vueDashI18nMod.VueI18nNs.DateTimeFormatResult = js.native
  def d(
    value: stdLib.Date,
    key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path,
    locale: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Locale
  ): vueDashI18nLib.vueDashI18nMod.VueI18nNs.DateTimeFormatResult = js.native
  /**
    * @param choice {number} a choice index given by the input to $tc: `$tc('path.to.rule', choiceIndex)`
    * @param choicesLength {number} an overall amount of available choices
    * @returns a final choice index
    */
  def getChoiceIndex(choice: scala.Double, choicesLength: scala.Double): scala.Double = js.native
  def getDateTimeFormat(locale: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Locale): vueDashI18nLib.vueDashI18nMod.VueI18nNs.DateTimeFormat = js.native
  def getLocaleMessage(locale: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Locale): vueDashI18nLib.vueDashI18nMod.VueI18nNs.LocaleMessageObject = js.native
  def getNumberFormat(locale: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Locale): vueDashI18nLib.vueDashI18nMod.VueI18nNs.NumberFormat = js.native
  def mergeDateTimeFormat(
    locale: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Locale,
    format: vueDashI18nLib.vueDashI18nMod.VueI18nNs.DateTimeFormat
  ): scala.Unit = js.native
  def mergeLocaleMessage(
    locale: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Locale,
    message: vueDashI18nLib.vueDashI18nMod.VueI18nNs.LocaleMessageObject
  ): scala.Unit = js.native
  def mergeNumberFormat(
    locale: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Locale,
    format: vueDashI18nLib.vueDashI18nMod.VueI18nNs.NumberFormat
  ): scala.Unit = js.native
  def missing(
    locale: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Locale,
    key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path
  ): java.lang.String | scala.Unit = js.native
  def missing(
    locale: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Locale,
    key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path,
    vm: vueLib.typesVueMod.Vue
  ): java.lang.String | scala.Unit = js.native
  def n(value: scala.Double): vueDashI18nLib.vueDashI18nMod.VueI18nNs.NumberFormatResult = js.native
  def n(value: scala.Double, args: org.scalablytyped.runtime.StringDictionary[java.lang.String]): vueDashI18nLib.vueDashI18nMod.VueI18nNs.NumberFormatResult = js.native
  def n(value: scala.Double, key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path): vueDashI18nLib.vueDashI18nMod.VueI18nNs.NumberFormatResult = js.native
  def n(
    value: scala.Double,
    key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path,
    locale: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Locale
  ): vueDashI18nLib.vueDashI18nMod.VueI18nNs.NumberFormatResult = js.native
  def setDateTimeFormat(
    locale: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Locale,
    format: vueDashI18nLib.vueDashI18nMod.VueI18nNs.DateTimeFormat
  ): scala.Unit = js.native
  def setLocaleMessage(
    locale: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Locale,
    message: vueDashI18nLib.vueDashI18nMod.VueI18nNs.LocaleMessageObject
  ): scala.Unit = js.native
  def setNumberFormat(
    locale: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Locale,
    format: vueDashI18nLib.vueDashI18nMod.VueI18nNs.NumberFormat
  ): scala.Unit = js.native
  def t(key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path): vueDashI18nLib.vueDashI18nMod.VueI18nNs.TranslateResult = js.native
  def t(
    key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path,
    locale: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Locale
  ): vueDashI18nLib.vueDashI18nMod.VueI18nNs.TranslateResult = js.native
  def t(
    key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path,
    locale: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Locale,
    values: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Values
  ): vueDashI18nLib.vueDashI18nMod.VueI18nNs.TranslateResult = js.native
  def t(
    key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path,
    values: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Values
  ): vueDashI18nLib.vueDashI18nMod.VueI18nNs.TranslateResult = js.native
  def tc(key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path): java.lang.String = js.native
  def tc(
    key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path,
    choice: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Choice
  ): java.lang.String = js.native
  def tc(
    key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path,
    choice: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Choice,
    locale: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Locale
  ): java.lang.String = js.native
  def tc(
    key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path,
    choice: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Choice,
    locale: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Locale,
    values: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Values
  ): java.lang.String = js.native
  def tc(
    key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path,
    choice: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Choice,
    values: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Values
  ): java.lang.String = js.native
  def te(key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path): scala.Boolean = js.native
  def te(
    key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path,
    locale: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Locale
  ): scala.Boolean = js.native
}

