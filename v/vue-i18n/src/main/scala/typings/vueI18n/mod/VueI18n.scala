package typings.vueI18n.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.std.RegExp
import typings.vue.vueMod.Vue
import typings.vueI18n.mod.VueI18n.PluralizationRulesMap
import typings.vueI18n.vueI18nBooleans.`false`
import typings.vueI18n.vueI18nStrings.currency
import typings.vueI18n.vueI18nStrings.decimal
import typings.vueI18n.vueI18nStrings.long
import typings.vueI18n.vueI18nStrings.percent
import typings.vueI18n.vueI18nStrings.short
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VueI18n extends StObject {
  
  val availableLocales: js.Array[typings.vueI18n.mod.VueI18n.Locale] = js.native
  
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
  
  val dateTimeFormats: typings.vueI18n.mod.VueI18n.DateTimeFormats = js.native
  
  var fallbackLocale: typings.vueI18n.mod.VueI18n.FallbackLocale = js.native
  
  var formatFallbackMessages: Boolean = js.native
  
  var formatter: typings.vueI18n.mod.VueI18n.Formatter = js.native
  
  /**
    * @param choice {number} a choice index given by the input to $tc: `$tc('path.to.rule', choiceIndex)`
    * @param choicesLength {number} an overall amount of available choices
    * @returns a final choice index
    */
  def getChoiceIndex(choice: Double, choicesLength: Double): Double = js.native
  
  def getDateTimeFormat(locale: typings.vueI18n.mod.VueI18n.Locale): typings.vueI18n.mod.VueI18n.DateTimeFormat = js.native
  
  def getLocaleMessage(locale: typings.vueI18n.mod.VueI18n.Locale): typings.vueI18n.mod.VueI18n.LocaleMessageObject = js.native
  
  def getNumberFormat(locale: typings.vueI18n.mod.VueI18n.Locale): typings.vueI18n.mod.VueI18n.NumberFormat = js.native
  
  var locale: typings.vueI18n.mod.VueI18n.Locale = js.native
  
  def mergeDateTimeFormat(locale: typings.vueI18n.mod.VueI18n.Locale, format: typings.vueI18n.mod.VueI18n.DateTimeFormat): Unit = js.native
  
  def mergeLocaleMessage(
    locale: typings.vueI18n.mod.VueI18n.Locale,
    message: typings.vueI18n.mod.VueI18n.LocaleMessageObject
  ): Unit = js.native
  
  def mergeNumberFormat(locale: typings.vueI18n.mod.VueI18n.Locale, format: typings.vueI18n.mod.VueI18n.NumberFormat): Unit = js.native
  
  val messages: typings.vueI18n.mod.VueI18n.LocaleMessages = js.native
  
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
  @JSName("missing")
  var missing_Original: typings.vueI18n.mod.VueI18n.MissingHandler = js.native
  
  def n(value: Double): typings.vueI18n.mod.VueI18n.NumberFormatResult = js.native
  def n(value: Double, args: StringDictionary[String]): typings.vueI18n.mod.VueI18n.NumberFormatResult = js.native
  def n(value: Double, key: js.UndefOr[scala.Nothing], locale: typings.vueI18n.mod.VueI18n.Locale): typings.vueI18n.mod.VueI18n.NumberFormatResult = js.native
  def n(value: Double, key: typings.vueI18n.mod.VueI18n.Path): typings.vueI18n.mod.VueI18n.NumberFormatResult = js.native
  def n(value: Double, key: typings.vueI18n.mod.VueI18n.Path, locale: typings.vueI18n.mod.VueI18n.Locale): typings.vueI18n.mod.VueI18n.NumberFormatResult = js.native
  
  val numberFormats: typings.vueI18n.mod.VueI18n.NumberFormats = js.native
  
  var pluralizationRules: PluralizationRulesMap = js.native
  
  def postTranslation(str: String): String = js.native
  def postTranslation(str: String, key: String): String = js.native
  @JSName("postTranslation")
  var postTranslation_Original: typings.vueI18n.mod.VueI18n.PostTranslationHandler = js.native
  
  var preserveDirectiveContent: Boolean = js.native
  
  def setDateTimeFormat(locale: typings.vueI18n.mod.VueI18n.Locale, format: typings.vueI18n.mod.VueI18n.DateTimeFormat): Unit = js.native
  
  def setLocaleMessage(
    locale: typings.vueI18n.mod.VueI18n.Locale,
    message: typings.vueI18n.mod.VueI18n.LocaleMessageObject
  ): Unit = js.native
  
  def setNumberFormat(locale: typings.vueI18n.mod.VueI18n.Locale, format: typings.vueI18n.mod.VueI18n.NumberFormat): Unit = js.native
  
  var silentFallbackWarn: Boolean | RegExp = js.native
  
  var silentTranslationWarn: Boolean | RegExp = js.native
  
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
  
  var warnHtmlInMessage: typings.vueI18n.mod.VueI18n.WarnHtmlInMessageLevel = js.native
}
object VueI18n {
  
  type Choice = Double
  
  type ComponentInstanceCreatedListener = js.Function2[/* newVm */ VueI18n with IVueI18n, /* rootVm */ VueI18n with IVueI18n, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vueI18n.vueI18nStrings.symbol
    - typings.vueI18n.vueI18nStrings.code
    - typings.vueI18n.vueI18nStrings.name
  */
  trait CurrencyDisplay extends StObject
  object CurrencyDisplay {
    
    @scala.inline
    def code: typings.vueI18n.vueI18nStrings.code = "code".asInstanceOf[typings.vueI18n.vueI18nStrings.code]
    
    @scala.inline
    def name: typings.vueI18n.vueI18nStrings.name = "name".asInstanceOf[typings.vueI18n.vueI18nStrings.name]
    
    @scala.inline
    def symbol: typings.vueI18n.vueI18nStrings.symbol = "symbol".asInstanceOf[typings.vueI18n.vueI18nStrings.symbol]
  }
  
  @js.native
  trait CurrencyNumberFormatOptions
    extends typings.std.Intl.NumberFormatOptions
       with _NumberFormatOptions {
    
    // Obligatory if style is 'currency'
    @JSName("currencyDisplay")
    var currencyDisplay_CurrencyNumberFormatOptions: js.UndefOr[CurrencyDisplay] = js.native
    
    @JSName("currency")
    var currency_CurrencyNumberFormatOptions: String = js.native
    
    var formatMatcher: js.UndefOr[FormatMatcher] = js.native
    
    @JSName("localeMatcher")
    var localeMatcher_CurrencyNumberFormatOptions: js.UndefOr[LocaleMatcher] = js.native
    
    @JSName("style")
    var style_CurrencyNumberFormatOptions: currency = js.native
  }
  object CurrencyNumberFormatOptions {
    
    @scala.inline
    def apply(currency: String, style: currency): CurrencyNumberFormatOptions = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrencyNumberFormatOptions]
    }
    
    @scala.inline
    implicit class CurrencyNumberFormatOptionsMutableBuilder[Self <: CurrencyNumberFormatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyDisplay(value: CurrencyDisplay): Self = StObject.set(x, "currencyDisplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyDisplayUndefined: Self = StObject.set(x, "currencyDisplay", js.undefined)
      
      @scala.inline
      def setFormatMatcher(value: FormatMatcher): Self = StObject.set(x, "formatMatcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatMatcherUndefined: Self = StObject.set(x, "formatMatcher", js.undefined)
      
      @scala.inline
      def setLocaleMatcher(value: LocaleMatcher): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
      
      @scala.inline
      def setStyle(value: currency): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vueI18n.vueI18nStrings.numeric
    - typings.vueI18n.vueI18nStrings.`2-digit`
  */
  trait DateTimeDigital extends StObject
  object DateTimeDigital {
    
    @scala.inline
    def `2-digit`: typings.vueI18n.vueI18nStrings.`2-digit` = "2-digit".asInstanceOf[typings.vueI18n.vueI18nStrings.`2-digit`]
    
    @scala.inline
    def numeric: typings.vueI18n.vueI18nStrings.numeric = "numeric".asInstanceOf[typings.vueI18n.vueI18nStrings.numeric]
  }
  
  type DateTimeFormat = StringDictionary[typings.vueI18n.mod.VueI18n.DateTimeFormatOptions]
  
  type DateTimeFormatOptions = typings.std.Intl.DateTimeFormatOptions | SpecificDateTimeFormatOptions
  
  type DateTimeFormatResult = String
  
  type DateTimeFormats = StringDictionary[typings.vueI18n.mod.VueI18n.DateTimeFormat]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vueI18n.vueI18nStrings.long
    - typings.vueI18n.vueI18nStrings.short
    - typings.vueI18n.vueI18nStrings.narrow
  */
  trait DateTimeHumanReadable extends StObject
  object DateTimeHumanReadable {
    
    @scala.inline
    def long: typings.vueI18n.vueI18nStrings.long = "long".asInstanceOf[typings.vueI18n.vueI18nStrings.long]
    
    @scala.inline
    def narrow: typings.vueI18n.vueI18nStrings.narrow = "narrow".asInstanceOf[typings.vueI18n.vueI18nStrings.narrow]
    
    @scala.inline
    def short: typings.vueI18n.vueI18nStrings.short = "short".asInstanceOf[typings.vueI18n.vueI18nStrings.short]
  }
  
  type FallbackLocale = String | js.Array[String] | `false` | StringDictionary[js.Array[String]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vueI18n.vueI18nStrings.basic
    - typings.vueI18n.vueI18nStrings.`best-fit`
  */
  trait FormatMatcher extends StObject
  object FormatMatcher {
    
    @scala.inline
    def basic: typings.vueI18n.vueI18nStrings.basic = "basic".asInstanceOf[typings.vueI18n.vueI18nStrings.basic]
    
    @scala.inline
    def `best-fit`: typings.vueI18n.vueI18nStrings.`best-fit` = "best-fit".asInstanceOf[typings.vueI18n.vueI18nStrings.`best-fit`]
  }
  
  @js.native
  trait FormattedNumberPart extends StObject {
    
    var `type`: FormattedNumberPartType = js.native
    
    var value: String = js.native
  }
  object FormattedNumberPart {
    
    @scala.inline
    def apply(`type`: FormattedNumberPartType, value: String): FormattedNumberPart = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormattedNumberPart]
    }
    
    @scala.inline
    implicit class FormattedNumberPartMutableBuilder[Self <: FormattedNumberPart] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: FormattedNumberPartType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vueI18n.vueI18nStrings.currency
    - typings.vueI18n.vueI18nStrings.decimal
    - typings.vueI18n.vueI18nStrings.fraction
    - typings.vueI18n.vueI18nStrings.group
    - typings.vueI18n.vueI18nStrings.infinity
    - typings.vueI18n.vueI18nStrings.integer
    - typings.vueI18n.vueI18nStrings.literal
    - typings.vueI18n.vueI18nStrings.minusSign
    - typings.vueI18n.vueI18nStrings.nan
    - typings.vueI18n.vueI18nStrings.plusSign
    - typings.vueI18n.vueI18nStrings.percentSign
  */
  trait FormattedNumberPartType extends StObject
  object FormattedNumberPartType {
    
    @scala.inline
    def currency: typings.vueI18n.vueI18nStrings.currency = "currency".asInstanceOf[typings.vueI18n.vueI18nStrings.currency]
    
    @scala.inline
    def decimal: typings.vueI18n.vueI18nStrings.decimal = "decimal".asInstanceOf[typings.vueI18n.vueI18nStrings.decimal]
    
    @scala.inline
    def fraction: typings.vueI18n.vueI18nStrings.fraction = "fraction".asInstanceOf[typings.vueI18n.vueI18nStrings.fraction]
    
    @scala.inline
    def group: typings.vueI18n.vueI18nStrings.group = "group".asInstanceOf[typings.vueI18n.vueI18nStrings.group]
    
    @scala.inline
    def infinity: typings.vueI18n.vueI18nStrings.infinity = "infinity".asInstanceOf[typings.vueI18n.vueI18nStrings.infinity]
    
    @scala.inline
    def integer: typings.vueI18n.vueI18nStrings.integer = "integer".asInstanceOf[typings.vueI18n.vueI18nStrings.integer]
    
    @scala.inline
    def literal: typings.vueI18n.vueI18nStrings.literal = "literal".asInstanceOf[typings.vueI18n.vueI18nStrings.literal]
    
    @scala.inline
    def minusSign: typings.vueI18n.vueI18nStrings.minusSign = "minusSign".asInstanceOf[typings.vueI18n.vueI18nStrings.minusSign]
    
    @scala.inline
    def nan: typings.vueI18n.vueI18nStrings.nan = "nan".asInstanceOf[typings.vueI18n.vueI18nStrings.nan]
    
    @scala.inline
    def percentSign: typings.vueI18n.vueI18nStrings.percentSign = "percentSign".asInstanceOf[typings.vueI18n.vueI18nStrings.percentSign]
    
    @scala.inline
    def plusSign: typings.vueI18n.vueI18nStrings.plusSign = "plusSign".asInstanceOf[typings.vueI18n.vueI18nStrings.plusSign]
  }
  
  @js.native
  trait Formatter extends StObject {
    
    def interpolate(message: String, values: js.UndefOr[typings.vueI18n.mod.VueI18n.Values], path: String): js.Array[_] | Null = js.native
  }
  
  // tslint:disable-next-line:interface-name
  @js.native
  trait I18nOptions extends StObject {
    
    var componentInstanceCreatedListener: js.UndefOr[ComponentInstanceCreatedListener] = js.native
    
    var dateTimeFormats: js.UndefOr[typings.vueI18n.mod.VueI18n.DateTimeFormats] = js.native
    
    var escapeParameterHtml: js.UndefOr[Boolean] = js.native
    
    var fallbackLocale: js.UndefOr[typings.vueI18n.mod.VueI18n.FallbackLocale] = js.native
    
    var fallbackRoot: js.UndefOr[Boolean] = js.native
    
    var formatFallbackMessages: js.UndefOr[Boolean] = js.native
    
    var formatter: js.UndefOr[typings.vueI18n.mod.VueI18n.Formatter] = js.native
    
    var locale: js.UndefOr[typings.vueI18n.mod.VueI18n.Locale] = js.native
    
    var messages: js.UndefOr[typings.vueI18n.mod.VueI18n.LocaleMessages] = js.native
    
    var missing: js.UndefOr[typings.vueI18n.mod.VueI18n.MissingHandler] = js.native
    
    var modifiers: js.UndefOr[Modifiers] = js.native
    
    var numberFormats: js.UndefOr[typings.vueI18n.mod.VueI18n.NumberFormats] = js.native
    
    var pluralizationRules: js.UndefOr[PluralizationRulesMap] = js.native
    
    var postTranslation: js.UndefOr[typings.vueI18n.mod.VueI18n.PostTranslationHandler] = js.native
    
    var preserveDirectiveContent: js.UndefOr[Boolean] = js.native
    
    var sharedMessages: js.UndefOr[typings.vueI18n.mod.VueI18n.LocaleMessages] = js.native
    
    var silentFallbackWarn: js.UndefOr[Boolean | RegExp] = js.native
    
    var silentTranslationWarn: js.UndefOr[Boolean | RegExp] = js.native
    
    var sync: js.UndefOr[Boolean] = js.native
    
    var warnHtmlInMessage: js.UndefOr[typings.vueI18n.mod.VueI18n.WarnHtmlInMessageLevel] = js.native
  }
  object I18nOptions {
    
    @scala.inline
    def apply(): typings.vueI18n.mod.VueI18n.I18nOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.vueI18n.mod.VueI18n.I18nOptions]
    }
    
    @scala.inline
    implicit class I18nOptionsMutableBuilder[Self <: typings.vueI18n.mod.VueI18n.I18nOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentInstanceCreatedListener(value: (/* newVm */ VueI18n with IVueI18n, /* rootVm */ VueI18n with IVueI18n) => Unit): Self = StObject.set(x, "componentInstanceCreatedListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setComponentInstanceCreatedListenerUndefined: Self = StObject.set(x, "componentInstanceCreatedListener", js.undefined)
      
      @scala.inline
      def setDateTimeFormats(value: typings.vueI18n.mod.VueI18n.DateTimeFormats): Self = StObject.set(x, "dateTimeFormats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateTimeFormatsUndefined: Self = StObject.set(x, "dateTimeFormats", js.undefined)
      
      @scala.inline
      def setEscapeParameterHtml(value: Boolean): Self = StObject.set(x, "escapeParameterHtml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeParameterHtmlUndefined: Self = StObject.set(x, "escapeParameterHtml", js.undefined)
      
      @scala.inline
      def setFallbackLocale(value: typings.vueI18n.mod.VueI18n.FallbackLocale): Self = StObject.set(x, "fallbackLocale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackLocaleUndefined: Self = StObject.set(x, "fallbackLocale", js.undefined)
      
      @scala.inline
      def setFallbackLocaleVarargs(value: String*): Self = StObject.set(x, "fallbackLocale", js.Array(value :_*))
      
      @scala.inline
      def setFallbackRoot(value: Boolean): Self = StObject.set(x, "fallbackRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackRootUndefined: Self = StObject.set(x, "fallbackRoot", js.undefined)
      
      @scala.inline
      def setFormatFallbackMessages(value: Boolean): Self = StObject.set(x, "formatFallbackMessages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatFallbackMessagesUndefined: Self = StObject.set(x, "formatFallbackMessages", js.undefined)
      
      @scala.inline
      def setFormatter(value: typings.vueI18n.mod.VueI18n.Formatter): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      @scala.inline
      def setLocale(value: typings.vueI18n.mod.VueI18n.Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMessages(value: typings.vueI18n.mod.VueI18n.LocaleMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      @scala.inline
      def setMissing(
        value: (/* locale */ typings.vueI18n.mod.VueI18n.Locale, /* key */ typings.vueI18n.mod.VueI18n.Path, /* vm */ Vue | Null, /* values */ js.Any) => String | Unit
      ): Self = StObject.set(x, "missing", js.Any.fromFunction4(value))
      
      @scala.inline
      def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
      
      @scala.inline
      def setModifiers(value: Modifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      @scala.inline
      def setNumberFormats(value: typings.vueI18n.mod.VueI18n.NumberFormats): Self = StObject.set(x, "numberFormats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberFormatsUndefined: Self = StObject.set(x, "numberFormats", js.undefined)
      
      @scala.inline
      def setPluralizationRules(value: PluralizationRulesMap): Self = StObject.set(x, "pluralizationRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluralizationRulesUndefined: Self = StObject.set(x, "pluralizationRules", js.undefined)
      
      @scala.inline
      def setPostTranslation(value: (/* str */ String, /* key */ js.UndefOr[String]) => String): Self = StObject.set(x, "postTranslation", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPostTranslationUndefined: Self = StObject.set(x, "postTranslation", js.undefined)
      
      @scala.inline
      def setPreserveDirectiveContent(value: Boolean): Self = StObject.set(x, "preserveDirectiveContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveDirectiveContentUndefined: Self = StObject.set(x, "preserveDirectiveContent", js.undefined)
      
      @scala.inline
      def setSharedMessages(value: typings.vueI18n.mod.VueI18n.LocaleMessages): Self = StObject.set(x, "sharedMessages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharedMessagesUndefined: Self = StObject.set(x, "sharedMessages", js.undefined)
      
      @scala.inline
      def setSilentFallbackWarn(value: Boolean | RegExp): Self = StObject.set(x, "silentFallbackWarn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentFallbackWarnUndefined: Self = StObject.set(x, "silentFallbackWarn", js.undefined)
      
      @scala.inline
      def setSilentTranslationWarn(value: Boolean | RegExp): Self = StObject.set(x, "silentTranslationWarn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentTranslationWarnUndefined: Self = StObject.set(x, "silentTranslationWarn", js.undefined)
      
      @scala.inline
      def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
      
      @scala.inline
      def setWarnHtmlInMessage(value: typings.vueI18n.mod.VueI18n.WarnHtmlInMessageLevel): Self = StObject.set(x, "warnHtmlInMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarnHtmlInMessageUndefined: Self = StObject.set(x, "warnHtmlInMessage", js.undefined)
    }
  }
  
  @js.native
  trait IntlAvailability extends StObject {
    
    var dateTimeFormat: Boolean = js.native
    
    var numberFormat: Boolean = js.native
  }
  object IntlAvailability {
    
    @scala.inline
    def apply(dateTimeFormat: Boolean, numberFormat: Boolean): typings.vueI18n.mod.VueI18n.IntlAvailability = {
      val __obj = js.Dynamic.literal(dateTimeFormat = dateTimeFormat.asInstanceOf[js.Any], numberFormat = numberFormat.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vueI18n.mod.VueI18n.IntlAvailability]
    }
    
    @scala.inline
    implicit class IntlAvailabilityMutableBuilder[Self <: typings.vueI18n.mod.VueI18n.IntlAvailability] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDateTimeFormat(value: Boolean): Self = StObject.set(x, "dateTimeFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberFormat(value: Boolean): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    }
  }
  
  type Locale = String
  
  /* Rewritten from type alias, can be one of: 
    - typings.vueI18n.vueI18nStrings.lookup
    - typings.vueI18n.vueI18nStrings.`best-fit`
  */
  trait LocaleMatcher extends StObject
  object LocaleMatcher {
    
    @scala.inline
    def `best-fit`: typings.vueI18n.vueI18nStrings.`best-fit` = "best-fit".asInstanceOf[typings.vueI18n.vueI18nStrings.`best-fit`]
    
    @scala.inline
    def lookup: typings.vueI18n.vueI18nStrings.lookup = "lookup".asInstanceOf[typings.vueI18n.vueI18nStrings.lookup]
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.vueI18n.mod.VueI18n.MessageFunction
    - typings.vueI18n.mod.VueI18n.LocaleMessageObject
    - typings.vueI18n.mod.VueI18n.LocaleMessageArray
  */
  type LocaleMessage = _LocaleMessage | String | typings.vueI18n.mod.VueI18n.MessageFunction
  
  @js.native
  trait LocaleMessageArray
    extends /* index */ NumberDictionary[typings.vueI18n.mod.VueI18n.LocaleMessage]
       with _LocaleMessage
  object LocaleMessageArray {
    
    @scala.inline
    def apply(): typings.vueI18n.mod.VueI18n.LocaleMessageArray = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.vueI18n.mod.VueI18n.LocaleMessageArray]
    }
  }
  
  @js.native
  trait LocaleMessageObject
    extends /* key */ StringDictionary[typings.vueI18n.mod.VueI18n.LocaleMessage]
       with _LocaleMessage
  object LocaleMessageObject {
    
    @scala.inline
    def apply(): typings.vueI18n.mod.VueI18n.LocaleMessageObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.vueI18n.mod.VueI18n.LocaleMessageObject]
    }
  }
  
  type LocaleMessages = StringDictionary[typings.vueI18n.mod.VueI18n.LocaleMessageObject]
  
  @js.native
  trait MessageContext extends StObject {
    
    def list(index: Double): js.Any = js.native
    
    def named(key: String): js.Any = js.native
  }
  object MessageContext {
    
    @scala.inline
    def apply(list: Double => js.Any, named: String => js.Any): typings.vueI18n.mod.VueI18n.MessageContext = {
      val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), named = js.Any.fromFunction1(named))
      __obj.asInstanceOf[typings.vueI18n.mod.VueI18n.MessageContext]
    }
    
    @scala.inline
    implicit class MessageContextMutableBuilder[Self <: typings.vueI18n.mod.VueI18n.MessageContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setList(value: Double => js.Any): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNamed(value: String => js.Any): Self = StObject.set(x, "named", js.Any.fromFunction1(value))
    }
  }
  
  type MessageFunction = js.Function1[/* ctx */ typings.vueI18n.mod.VueI18n.MessageContext, String]
  
  type MissingHandler = js.Function4[
    /* locale */ typings.vueI18n.mod.VueI18n.Locale, 
    /* key */ typings.vueI18n.mod.VueI18n.Path, 
    /* vm */ Vue | Null, 
    /* values */ js.Any, 
    String | Unit
  ]
  
  type Modifiers = StringDictionary[js.Function1[/* str */ String, String]]
  
  type NumberFormat = StringDictionary[typings.vueI18n.mod.VueI18n.NumberFormatOptions]
  
  /* Rewritten from type alias, can be one of: 
    - typings.std.Intl.NumberFormatOptions
    - typings.vueI18n.mod.VueI18n.SpecificNumberFormatOptions
    - typings.vueI18n.mod.VueI18n.CurrencyNumberFormatOptions
  */
  type NumberFormatOptions = _NumberFormatOptions | typings.std.Intl.NumberFormatOptions
  
  type NumberFormatResult = String
  
  type NumberFormatToPartsResult = NumberDictionary[FormattedNumberPart]
  
  type NumberFormats = StringDictionary[typings.vueI18n.mod.VueI18n.NumberFormat]
  
  type Path = String
  
  type PluralizationRulesMap = /**
    * @param choice {number} a choice index given by the input to $tc: `$tc('path.to.rule', choiceIndex)`
    * @param choicesLength {number} an overall amount of available choices
    * @returns a final choice index
    */
  StringDictionary[js.Function2[/* choice */ Double, /* choicesLength */ Double, Double]]
  
  type PostTranslationHandler = js.Function2[/* str */ String, /* key */ js.UndefOr[String], String]
  
  @js.native
  trait SpecificDateTimeFormatOptions
    extends typings.std.Intl.DateTimeFormatOptions {
    
    @JSName("day")
    var day_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital] = js.native
    
    @JSName("era")
    var era_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeHumanReadable] = js.native
    
    @JSName("formatMatcher")
    var formatMatcher_SpecificDateTimeFormatOptions: js.UndefOr[FormatMatcher] = js.native
    
    @JSName("hour")
    var hour_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital] = js.native
    
    @JSName("localeMatcher")
    var localeMatcher_SpecificDateTimeFormatOptions: js.UndefOr[LocaleMatcher] = js.native
    
    @JSName("minute")
    var minute_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital] = js.native
    
    @JSName("month")
    var month_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital | DateTimeHumanReadable] = js.native
    
    @JSName("second")
    var second_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital] = js.native
    
    @JSName("timeZoneName")
    var timeZoneName_SpecificDateTimeFormatOptions: js.UndefOr[long | short] = js.native
    
    @JSName("weekday")
    var weekday_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeHumanReadable] = js.native
    
    @JSName("year")
    var year_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital] = js.native
  }
  object SpecificDateTimeFormatOptions {
    
    @scala.inline
    def apply(): SpecificDateTimeFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpecificDateTimeFormatOptions]
    }
    
    @scala.inline
    implicit class SpecificDateTimeFormatOptionsMutableBuilder[Self <: SpecificDateTimeFormatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDay(value: DateTimeDigital): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      @scala.inline
      def setEra(value: DateTimeHumanReadable): Self = StObject.set(x, "era", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEraUndefined: Self = StObject.set(x, "era", js.undefined)
      
      @scala.inline
      def setFormatMatcher(value: FormatMatcher): Self = StObject.set(x, "formatMatcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatMatcherUndefined: Self = StObject.set(x, "formatMatcher", js.undefined)
      
      @scala.inline
      def setHour(value: DateTimeDigital): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
      
      @scala.inline
      def setLocaleMatcher(value: LocaleMatcher): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
      
      @scala.inline
      def setMinute(value: DateTimeDigital): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
      
      @scala.inline
      def setMonth(value: DateTimeDigital | DateTimeHumanReadable): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      @scala.inline
      def setSecond(value: DateTimeDigital): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
      
      @scala.inline
      def setTimeZoneName(value: long | short): Self = StObject.set(x, "timeZoneName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeZoneNameUndefined: Self = StObject.set(x, "timeZoneName", js.undefined)
      
      @scala.inline
      def setWeekday(value: DateTimeHumanReadable): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekdayUndefined: Self = StObject.set(x, "weekday", js.undefined)
      
      @scala.inline
      def setYear(value: DateTimeDigital): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
  
  @js.native
  trait SpecificNumberFormatOptions
    extends typings.std.Intl.NumberFormatOptions
       with _NumberFormatOptions {
    
    @JSName("currencyDisplay")
    var currencyDisplay_SpecificNumberFormatOptions: js.UndefOr[CurrencyDisplay] = js.native
    
    var formatMatcher: js.UndefOr[FormatMatcher] = js.native
    
    @JSName("localeMatcher")
    var localeMatcher_SpecificNumberFormatOptions: js.UndefOr[LocaleMatcher] = js.native
    
    @JSName("style")
    var style_SpecificNumberFormatOptions: js.UndefOr[decimal | percent] = js.native
  }
  object SpecificNumberFormatOptions {
    
    @scala.inline
    def apply(): SpecificNumberFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpecificNumberFormatOptions]
    }
    
    @scala.inline
    implicit class SpecificNumberFormatOptionsMutableBuilder[Self <: SpecificNumberFormatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrencyDisplay(value: CurrencyDisplay): Self = StObject.set(x, "currencyDisplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyDisplayUndefined: Self = StObject.set(x, "currencyDisplay", js.undefined)
      
      @scala.inline
      def setFormatMatcher(value: FormatMatcher): Self = StObject.set(x, "formatMatcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatMatcherUndefined: Self = StObject.set(x, "formatMatcher", js.undefined)
      
      @scala.inline
      def setLocaleMatcher(value: LocaleMatcher): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
      
      @scala.inline
      def setStyle(value: decimal | percent): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type TranslateResult = String | typings.vueI18n.mod.VueI18n.LocaleMessages
  
  type Values = js.Array[js.Any] | StringDictionary[js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vueI18n.vueI18nStrings.off
    - typings.vueI18n.vueI18nStrings.warn
    - typings.vueI18n.vueI18nStrings.error
  */
  trait WarnHtmlInMessageLevel extends StObject
  object WarnHtmlInMessageLevel {
    
    @scala.inline
    def error: typings.vueI18n.vueI18nStrings.error = "error".asInstanceOf[typings.vueI18n.vueI18nStrings.error]
    
    @scala.inline
    def off: typings.vueI18n.vueI18nStrings.off = "off".asInstanceOf[typings.vueI18n.vueI18nStrings.off]
    
    @scala.inline
    def warn: typings.vueI18n.vueI18nStrings.warn = "warn".asInstanceOf[typings.vueI18n.vueI18nStrings.warn]
  }
  
  trait _LocaleMessage extends StObject
  object _LocaleMessage {
    
    @scala.inline
    def LocaleMessageArray(): typings.vueI18n.mod.VueI18n.LocaleMessageArray = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.vueI18n.mod.VueI18n.LocaleMessageArray]
    }
    
    @scala.inline
    def LocaleMessageObject(): typings.vueI18n.mod.VueI18n.LocaleMessageObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.vueI18n.mod.VueI18n.LocaleMessageObject]
    }
  }
  
  trait _NumberFormatOptions extends StObject
  object _NumberFormatOptions {
    
    @scala.inline
    def CurrencyNumberFormatOptions(currency: String, style: currency): typings.vueI18n.mod.VueI18n.CurrencyNumberFormatOptions = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vueI18n.mod.VueI18n.CurrencyNumberFormatOptions]
    }
    
    @scala.inline
    def SpecificNumberFormatOptions(): typings.vueI18n.mod.VueI18n.SpecificNumberFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.vueI18n.mod.VueI18n.SpecificNumberFormatOptions]
    }
  }
}
