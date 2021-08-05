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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VueI18n extends StObject {
  
  val availableLocales: js.Array[typings.vueI18n.mod.VueI18n.Locale] = js.native
  
  def d(value: Double): typings.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Double, args: StringDictionary[String]): typings.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Double, key: Unit, locale: typings.vueI18n.mod.VueI18n.Locale): typings.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Double, key: typings.vueI18n.mod.VueI18n.Path): typings.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Double, key: typings.vueI18n.mod.VueI18n.Path, locale: typings.vueI18n.mod.VueI18n.Locale): typings.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Date): typings.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Date, args: StringDictionary[String]): typings.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Date, key: Unit, locale: typings.vueI18n.mod.VueI18n.Locale): typings.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
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
  def n(value: Double, key: Unit, locale: typings.vueI18n.mod.VueI18n.Locale): typings.vueI18n.mod.VueI18n.NumberFormatResult = js.native
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
  def tc(key: typings.vueI18n.mod.VueI18n.Path, choice: Unit, values: typings.vueI18n.mod.VueI18n.Values): String = js.native
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
  
  type ComponentInstanceCreatedListener = js.Function2[/* newVm */ VueI18n & IVueI18n, /* rootVm */ VueI18n & IVueI18n, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vueI18n.vueI18nStrings.symbol
    - typings.vueI18n.vueI18nStrings.code
    - typings.vueI18n.vueI18nStrings.name
  */
  trait CurrencyDisplay extends StObject
  object CurrencyDisplay {
    
    inline def code: typings.vueI18n.vueI18nStrings.code = "code".asInstanceOf[typings.vueI18n.vueI18nStrings.code]
    
    inline def name: typings.vueI18n.vueI18nStrings.name = "name".asInstanceOf[typings.vueI18n.vueI18nStrings.name]
    
    inline def symbol: typings.vueI18n.vueI18nStrings.symbol = "symbol".asInstanceOf[typings.vueI18n.vueI18nStrings.symbol]
  }
  
  trait CurrencyNumberFormatOptions
    extends StObject
       with typings.std.Intl.NumberFormatOptions
       with _NumberFormatOptions {
    
    // Obligatory if style is 'currency'
    @JSName("currencyDisplay")
    var currencyDisplay_CurrencyNumberFormatOptions: js.UndefOr[CurrencyDisplay] = js.undefined
    
    @JSName("currency")
    var currency_CurrencyNumberFormatOptions: String
    
    var formatMatcher: js.UndefOr[FormatMatcher] = js.undefined
    
    @JSName("localeMatcher")
    var localeMatcher_CurrencyNumberFormatOptions: js.UndefOr[LocaleMatcher] = js.undefined
    
    @JSName("style")
    var style_CurrencyNumberFormatOptions: currency
  }
  object CurrencyNumberFormatOptions {
    
    inline def apply(currency: String): CurrencyNumberFormatOptions = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], style = "currency")
      __obj.asInstanceOf[CurrencyNumberFormatOptions]
    }
    
    extension [Self <: CurrencyNumberFormatOptions](x: Self) {
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyDisplay(value: CurrencyDisplay): Self = StObject.set(x, "currencyDisplay", value.asInstanceOf[js.Any])
      
      inline def setCurrencyDisplayUndefined: Self = StObject.set(x, "currencyDisplay", js.undefined)
      
      inline def setFormatMatcher(value: FormatMatcher): Self = StObject.set(x, "formatMatcher", value.asInstanceOf[js.Any])
      
      inline def setFormatMatcherUndefined: Self = StObject.set(x, "formatMatcher", js.undefined)
      
      inline def setLocaleMatcher(value: LocaleMatcher): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
      
      inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
      
      inline def setStyle(value: currency): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vueI18n.vueI18nStrings.numeric
    - typings.vueI18n.vueI18nStrings.`2-digit`
  */
  trait DateTimeDigital extends StObject
  object DateTimeDigital {
    
    inline def `2-digit`: typings.vueI18n.vueI18nStrings.`2-digit` = "2-digit".asInstanceOf[typings.vueI18n.vueI18nStrings.`2-digit`]
    
    inline def numeric: typings.vueI18n.vueI18nStrings.numeric = "numeric".asInstanceOf[typings.vueI18n.vueI18nStrings.numeric]
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
    
    inline def long: typings.vueI18n.vueI18nStrings.long = "long".asInstanceOf[typings.vueI18n.vueI18nStrings.long]
    
    inline def narrow: typings.vueI18n.vueI18nStrings.narrow = "narrow".asInstanceOf[typings.vueI18n.vueI18nStrings.narrow]
    
    inline def short: typings.vueI18n.vueI18nStrings.short = "short".asInstanceOf[typings.vueI18n.vueI18nStrings.short]
  }
  
  type FallbackLocale = String | js.Array[String] | `false` | StringDictionary[js.Array[String]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vueI18n.vueI18nStrings.basic
    - typings.vueI18n.vueI18nStrings.`best-fit`
  */
  trait FormatMatcher extends StObject
  object FormatMatcher {
    
    inline def basic: typings.vueI18n.vueI18nStrings.basic = "basic".asInstanceOf[typings.vueI18n.vueI18nStrings.basic]
    
    inline def `best-fit`: typings.vueI18n.vueI18nStrings.`best-fit` = "best-fit".asInstanceOf[typings.vueI18n.vueI18nStrings.`best-fit`]
  }
  
  trait FormattedNumberPart extends StObject {
    
    var `type`: FormattedNumberPartType
    
    var value: String
  }
  object FormattedNumberPart {
    
    inline def apply(`type`: FormattedNumberPartType, value: String): FormattedNumberPart = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormattedNumberPart]
    }
    
    extension [Self <: FormattedNumberPart](x: Self) {
      
      inline def setType(value: FormattedNumberPartType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
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
    
    inline def currency: typings.vueI18n.vueI18nStrings.currency = "currency".asInstanceOf[typings.vueI18n.vueI18nStrings.currency]
    
    inline def decimal: typings.vueI18n.vueI18nStrings.decimal = "decimal".asInstanceOf[typings.vueI18n.vueI18nStrings.decimal]
    
    inline def fraction: typings.vueI18n.vueI18nStrings.fraction = "fraction".asInstanceOf[typings.vueI18n.vueI18nStrings.fraction]
    
    inline def group: typings.vueI18n.vueI18nStrings.group = "group".asInstanceOf[typings.vueI18n.vueI18nStrings.group]
    
    inline def infinity: typings.vueI18n.vueI18nStrings.infinity = "infinity".asInstanceOf[typings.vueI18n.vueI18nStrings.infinity]
    
    inline def integer: typings.vueI18n.vueI18nStrings.integer = "integer".asInstanceOf[typings.vueI18n.vueI18nStrings.integer]
    
    inline def literal: typings.vueI18n.vueI18nStrings.literal = "literal".asInstanceOf[typings.vueI18n.vueI18nStrings.literal]
    
    inline def minusSign: typings.vueI18n.vueI18nStrings.minusSign = "minusSign".asInstanceOf[typings.vueI18n.vueI18nStrings.minusSign]
    
    inline def nan: typings.vueI18n.vueI18nStrings.nan = "nan".asInstanceOf[typings.vueI18n.vueI18nStrings.nan]
    
    inline def percentSign: typings.vueI18n.vueI18nStrings.percentSign = "percentSign".asInstanceOf[typings.vueI18n.vueI18nStrings.percentSign]
    
    inline def plusSign: typings.vueI18n.vueI18nStrings.plusSign = "plusSign".asInstanceOf[typings.vueI18n.vueI18nStrings.plusSign]
  }
  
  @js.native
  trait Formatter extends StObject {
    
    def interpolate(message: String, values: Unit, path: String): js.Array[js.Any] | Null = js.native
    def interpolate(message: String, values: typings.vueI18n.mod.VueI18n.Values, path: String): js.Array[js.Any] | Null = js.native
  }
  
  // tslint:disable-next-line:interface-name
  trait I18nOptions extends StObject {
    
    var componentInstanceCreatedListener: js.UndefOr[ComponentInstanceCreatedListener] = js.undefined
    
    var dateTimeFormats: js.UndefOr[typings.vueI18n.mod.VueI18n.DateTimeFormats] = js.undefined
    
    var escapeParameterHtml: js.UndefOr[Boolean] = js.undefined
    
    var fallbackLocale: js.UndefOr[typings.vueI18n.mod.VueI18n.FallbackLocale] = js.undefined
    
    var fallbackRoot: js.UndefOr[Boolean] = js.undefined
    
    var formatFallbackMessages: js.UndefOr[Boolean] = js.undefined
    
    var formatter: js.UndefOr[typings.vueI18n.mod.VueI18n.Formatter] = js.undefined
    
    var locale: js.UndefOr[typings.vueI18n.mod.VueI18n.Locale] = js.undefined
    
    var messages: js.UndefOr[typings.vueI18n.mod.VueI18n.LocaleMessages] = js.undefined
    
    var missing: js.UndefOr[typings.vueI18n.mod.VueI18n.MissingHandler] = js.undefined
    
    var modifiers: js.UndefOr[Modifiers] = js.undefined
    
    var numberFormats: js.UndefOr[typings.vueI18n.mod.VueI18n.NumberFormats] = js.undefined
    
    var pluralizationRules: js.UndefOr[PluralizationRulesMap] = js.undefined
    
    var postTranslation: js.UndefOr[typings.vueI18n.mod.VueI18n.PostTranslationHandler] = js.undefined
    
    var preserveDirectiveContent: js.UndefOr[Boolean] = js.undefined
    
    var sharedMessages: js.UndefOr[typings.vueI18n.mod.VueI18n.LocaleMessages] = js.undefined
    
    var silentFallbackWarn: js.UndefOr[Boolean | RegExp] = js.undefined
    
    var silentTranslationWarn: js.UndefOr[Boolean | RegExp] = js.undefined
    
    var sync: js.UndefOr[Boolean] = js.undefined
    
    var warnHtmlInMessage: js.UndefOr[typings.vueI18n.mod.VueI18n.WarnHtmlInMessageLevel] = js.undefined
  }
  object I18nOptions {
    
    inline def apply(): typings.vueI18n.mod.VueI18n.I18nOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.vueI18n.mod.VueI18n.I18nOptions]
    }
    
    extension [Self <: typings.vueI18n.mod.VueI18n.I18nOptions](x: Self) {
      
      inline def setComponentInstanceCreatedListener(value: (/* newVm */ VueI18n & IVueI18n, /* rootVm */ VueI18n & IVueI18n) => Unit): Self = StObject.set(x, "componentInstanceCreatedListener", js.Any.fromFunction2(value))
      
      inline def setComponentInstanceCreatedListenerUndefined: Self = StObject.set(x, "componentInstanceCreatedListener", js.undefined)
      
      inline def setDateTimeFormats(value: typings.vueI18n.mod.VueI18n.DateTimeFormats): Self = StObject.set(x, "dateTimeFormats", value.asInstanceOf[js.Any])
      
      inline def setDateTimeFormatsUndefined: Self = StObject.set(x, "dateTimeFormats", js.undefined)
      
      inline def setEscapeParameterHtml(value: Boolean): Self = StObject.set(x, "escapeParameterHtml", value.asInstanceOf[js.Any])
      
      inline def setEscapeParameterHtmlUndefined: Self = StObject.set(x, "escapeParameterHtml", js.undefined)
      
      inline def setFallbackLocale(value: typings.vueI18n.mod.VueI18n.FallbackLocale): Self = StObject.set(x, "fallbackLocale", value.asInstanceOf[js.Any])
      
      inline def setFallbackLocaleUndefined: Self = StObject.set(x, "fallbackLocale", js.undefined)
      
      inline def setFallbackLocaleVarargs(value: String*): Self = StObject.set(x, "fallbackLocale", js.Array(value :_*))
      
      inline def setFallbackRoot(value: Boolean): Self = StObject.set(x, "fallbackRoot", value.asInstanceOf[js.Any])
      
      inline def setFallbackRootUndefined: Self = StObject.set(x, "fallbackRoot", js.undefined)
      
      inline def setFormatFallbackMessages(value: Boolean): Self = StObject.set(x, "formatFallbackMessages", value.asInstanceOf[js.Any])
      
      inline def setFormatFallbackMessagesUndefined: Self = StObject.set(x, "formatFallbackMessages", js.undefined)
      
      inline def setFormatter(value: typings.vueI18n.mod.VueI18n.Formatter): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setLocale(value: typings.vueI18n.mod.VueI18n.Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMessages(value: typings.vueI18n.mod.VueI18n.LocaleMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setMissing(
        value: (/* locale */ typings.vueI18n.mod.VueI18n.Locale, /* key */ typings.vueI18n.mod.VueI18n.Path, /* vm */ Vue | Null, /* values */ js.Any) => String | Unit
      ): Self = StObject.set(x, "missing", js.Any.fromFunction4(value))
      
      inline def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
      
      inline def setModifiers(value: Modifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      inline def setNumberFormats(value: typings.vueI18n.mod.VueI18n.NumberFormats): Self = StObject.set(x, "numberFormats", value.asInstanceOf[js.Any])
      
      inline def setNumberFormatsUndefined: Self = StObject.set(x, "numberFormats", js.undefined)
      
      inline def setPluralizationRules(value: PluralizationRulesMap): Self = StObject.set(x, "pluralizationRules", value.asInstanceOf[js.Any])
      
      inline def setPluralizationRulesUndefined: Self = StObject.set(x, "pluralizationRules", js.undefined)
      
      inline def setPostTranslation(value: (/* str */ String, /* key */ js.UndefOr[String]) => String): Self = StObject.set(x, "postTranslation", js.Any.fromFunction2(value))
      
      inline def setPostTranslationUndefined: Self = StObject.set(x, "postTranslation", js.undefined)
      
      inline def setPreserveDirectiveContent(value: Boolean): Self = StObject.set(x, "preserveDirectiveContent", value.asInstanceOf[js.Any])
      
      inline def setPreserveDirectiveContentUndefined: Self = StObject.set(x, "preserveDirectiveContent", js.undefined)
      
      inline def setSharedMessages(value: typings.vueI18n.mod.VueI18n.LocaleMessages): Self = StObject.set(x, "sharedMessages", value.asInstanceOf[js.Any])
      
      inline def setSharedMessagesUndefined: Self = StObject.set(x, "sharedMessages", js.undefined)
      
      inline def setSilentFallbackWarn(value: Boolean | RegExp): Self = StObject.set(x, "silentFallbackWarn", value.asInstanceOf[js.Any])
      
      inline def setSilentFallbackWarnUndefined: Self = StObject.set(x, "silentFallbackWarn", js.undefined)
      
      inline def setSilentTranslationWarn(value: Boolean | RegExp): Self = StObject.set(x, "silentTranslationWarn", value.asInstanceOf[js.Any])
      
      inline def setSilentTranslationWarnUndefined: Self = StObject.set(x, "silentTranslationWarn", js.undefined)
      
      inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
      
      inline def setWarnHtmlInMessage(value: typings.vueI18n.mod.VueI18n.WarnHtmlInMessageLevel): Self = StObject.set(x, "warnHtmlInMessage", value.asInstanceOf[js.Any])
      
      inline def setWarnHtmlInMessageUndefined: Self = StObject.set(x, "warnHtmlInMessage", js.undefined)
    }
  }
  
  trait IntlAvailability extends StObject {
    
    var dateTimeFormat: Boolean
    
    var numberFormat: Boolean
  }
  object IntlAvailability {
    
    inline def apply(dateTimeFormat: Boolean, numberFormat: Boolean): typings.vueI18n.mod.VueI18n.IntlAvailability = {
      val __obj = js.Dynamic.literal(dateTimeFormat = dateTimeFormat.asInstanceOf[js.Any], numberFormat = numberFormat.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vueI18n.mod.VueI18n.IntlAvailability]
    }
    
    extension [Self <: typings.vueI18n.mod.VueI18n.IntlAvailability](x: Self) {
      
      inline def setDateTimeFormat(value: Boolean): Self = StObject.set(x, "dateTimeFormat", value.asInstanceOf[js.Any])
      
      inline def setNumberFormat(value: Boolean): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    }
  }
  
  type Locale = String
  
  /* Rewritten from type alias, can be one of: 
    - typings.vueI18n.vueI18nStrings.lookup
    - typings.vueI18n.vueI18nStrings.`best-fit`
  */
  trait LocaleMatcher extends StObject
  object LocaleMatcher {
    
    inline def `best-fit`: typings.vueI18n.vueI18nStrings.`best-fit` = "best-fit".asInstanceOf[typings.vueI18n.vueI18nStrings.`best-fit`]
    
    inline def lookup: typings.vueI18n.vueI18nStrings.lookup = "lookup".asInstanceOf[typings.vueI18n.vueI18nStrings.lookup]
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.vueI18n.mod.VueI18n.MessageFunction
    - typings.vueI18n.mod.VueI18n.LocaleMessageObject
    - typings.vueI18n.mod.VueI18n.LocaleMessageArray
  */
  type LocaleMessage = _LocaleMessage | String | typings.vueI18n.mod.VueI18n.MessageFunction
  
  trait LocaleMessageArray
    extends StObject
       with /* index */ NumberDictionary[typings.vueI18n.mod.VueI18n.LocaleMessage]
       with _LocaleMessage
  object LocaleMessageArray {
    
    inline def apply(): typings.vueI18n.mod.VueI18n.LocaleMessageArray = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.vueI18n.mod.VueI18n.LocaleMessageArray]
    }
  }
  
  trait LocaleMessageObject
    extends StObject
       with /* key */ StringDictionary[typings.vueI18n.mod.VueI18n.LocaleMessage]
       with _LocaleMessage
  object LocaleMessageObject {
    
    inline def apply(): typings.vueI18n.mod.VueI18n.LocaleMessageObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.vueI18n.mod.VueI18n.LocaleMessageObject]
    }
  }
  
  type LocaleMessages = StringDictionary[typings.vueI18n.mod.VueI18n.LocaleMessageObject]
  
  trait MessageContext extends StObject {
    
    def list(index: Double): js.Any
    
    def named(key: String): js.Any
  }
  object MessageContext {
    
    inline def apply(list: Double => js.Any, named: String => js.Any): typings.vueI18n.mod.VueI18n.MessageContext = {
      val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), named = js.Any.fromFunction1(named))
      __obj.asInstanceOf[typings.vueI18n.mod.VueI18n.MessageContext]
    }
    
    extension [Self <: typings.vueI18n.mod.VueI18n.MessageContext](x: Self) {
      
      inline def setList(value: Double => js.Any): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
      
      inline def setNamed(value: String => js.Any): Self = StObject.set(x, "named", js.Any.fromFunction1(value))
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
  
  trait SpecificDateTimeFormatOptions
    extends StObject
       with typings.std.Intl.DateTimeFormatOptions {
    
    @JSName("day")
    var day_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital] = js.undefined
    
    @JSName("era")
    var era_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeHumanReadable] = js.undefined
    
    @JSName("formatMatcher")
    var formatMatcher_SpecificDateTimeFormatOptions: js.UndefOr[FormatMatcher] = js.undefined
    
    @JSName("hour")
    var hour_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital] = js.undefined
    
    @JSName("localeMatcher")
    var localeMatcher_SpecificDateTimeFormatOptions: js.UndefOr[LocaleMatcher] = js.undefined
    
    @JSName("minute")
    var minute_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital] = js.undefined
    
    @JSName("month")
    var month_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital | DateTimeHumanReadable] = js.undefined
    
    @JSName("second")
    var second_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital] = js.undefined
    
    @JSName("timeZoneName")
    var timeZoneName_SpecificDateTimeFormatOptions: js.UndefOr[long | short] = js.undefined
    
    @JSName("weekday")
    var weekday_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeHumanReadable] = js.undefined
    
    @JSName("year")
    var year_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital] = js.undefined
  }
  object SpecificDateTimeFormatOptions {
    
    inline def apply(): SpecificDateTimeFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpecificDateTimeFormatOptions]
    }
    
    extension [Self <: SpecificDateTimeFormatOptions](x: Self) {
      
      inline def setDay(value: DateTimeDigital): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      inline def setEra(value: DateTimeHumanReadable): Self = StObject.set(x, "era", value.asInstanceOf[js.Any])
      
      inline def setEraUndefined: Self = StObject.set(x, "era", js.undefined)
      
      inline def setFormatMatcher(value: FormatMatcher): Self = StObject.set(x, "formatMatcher", value.asInstanceOf[js.Any])
      
      inline def setFormatMatcherUndefined: Self = StObject.set(x, "formatMatcher", js.undefined)
      
      inline def setHour(value: DateTimeDigital): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
      
      inline def setLocaleMatcher(value: LocaleMatcher): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
      
      inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
      
      inline def setMinute(value: DateTimeDigital): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
      
      inline def setMonth(value: DateTimeDigital | DateTimeHumanReadable): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      inline def setSecond(value: DateTimeDigital): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      inline def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
      
      inline def setTimeZoneName(value: long | short): Self = StObject.set(x, "timeZoneName", value.asInstanceOf[js.Any])
      
      inline def setTimeZoneNameUndefined: Self = StObject.set(x, "timeZoneName", js.undefined)
      
      inline def setWeekday(value: DateTimeHumanReadable): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
      
      inline def setWeekdayUndefined: Self = StObject.set(x, "weekday", js.undefined)
      
      inline def setYear(value: DateTimeDigital): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
  
  trait SpecificNumberFormatOptions
    extends StObject
       with typings.std.Intl.NumberFormatOptions
       with _NumberFormatOptions {
    
    @JSName("currencyDisplay")
    var currencyDisplay_SpecificNumberFormatOptions: js.UndefOr[CurrencyDisplay] = js.undefined
    
    var formatMatcher: js.UndefOr[FormatMatcher] = js.undefined
    
    @JSName("localeMatcher")
    var localeMatcher_SpecificNumberFormatOptions: js.UndefOr[LocaleMatcher] = js.undefined
    
    @JSName("style")
    var style_SpecificNumberFormatOptions: js.UndefOr[decimal | percent] = js.undefined
  }
  object SpecificNumberFormatOptions {
    
    inline def apply(): SpecificNumberFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpecificNumberFormatOptions]
    }
    
    extension [Self <: SpecificNumberFormatOptions](x: Self) {
      
      inline def setCurrencyDisplay(value: CurrencyDisplay): Self = StObject.set(x, "currencyDisplay", value.asInstanceOf[js.Any])
      
      inline def setCurrencyDisplayUndefined: Self = StObject.set(x, "currencyDisplay", js.undefined)
      
      inline def setFormatMatcher(value: FormatMatcher): Self = StObject.set(x, "formatMatcher", value.asInstanceOf[js.Any])
      
      inline def setFormatMatcherUndefined: Self = StObject.set(x, "formatMatcher", js.undefined)
      
      inline def setLocaleMatcher(value: LocaleMatcher): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
      
      inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
      
      inline def setStyle(value: decimal | percent): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
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
    
    inline def error: typings.vueI18n.vueI18nStrings.error = "error".asInstanceOf[typings.vueI18n.vueI18nStrings.error]
    
    inline def off: typings.vueI18n.vueI18nStrings.off = "off".asInstanceOf[typings.vueI18n.vueI18nStrings.off]
    
    inline def warn: typings.vueI18n.vueI18nStrings.warn = "warn".asInstanceOf[typings.vueI18n.vueI18nStrings.warn]
  }
  
  trait _LocaleMessage extends StObject
  object _LocaleMessage {
    
    inline def LocaleMessageArray(): typings.vueI18n.mod.VueI18n.LocaleMessageArray = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.vueI18n.mod.VueI18n.LocaleMessageArray]
    }
    
    inline def LocaleMessageObject(): typings.vueI18n.mod.VueI18n.LocaleMessageObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.vueI18n.mod.VueI18n.LocaleMessageObject]
    }
  }
  
  trait _NumberFormatOptions extends StObject
  object _NumberFormatOptions {
    
    inline def CurrencyNumberFormatOptions(currency: String): typings.vueI18n.mod.VueI18n.CurrencyNumberFormatOptions = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], style = "currency")
      __obj.asInstanceOf[typings.vueI18n.mod.VueI18n.CurrencyNumberFormatOptions]
    }
    
    inline def SpecificNumberFormatOptions(): typings.vueI18n.mod.VueI18n.SpecificNumberFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.vueI18n.mod.VueI18n.SpecificNumberFormatOptions]
    }
  }
}
