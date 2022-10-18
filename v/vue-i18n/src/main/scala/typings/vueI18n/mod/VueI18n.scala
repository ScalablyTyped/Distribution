package typings.vueI18n.mod

import org.scalablytyped.runtime.StringDictionary
import typings.intlifyCoreBase.mod.FallbackLocales
import typings.intlifyCoreBase.mod.Locale
import typings.intlifyCoreBase.mod.MessageFunction
import typings.intlifyCoreBase.mod.NamedValue
import typings.intlifyCoreBase.mod.PickupKeys
import typings.intlifyCoreBase.mod.PickupLocales
import typings.intlifyCoreBase.mod.PostTranslationHandler
import typings.intlifyCoreBase.mod.RemoveIndexSignature
import typings.intlifyCoreBase.mod.TranslateOptions
import typings.std.NonNullable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VueI18n[Messages, DateTimeFormats, NumberFormats, OptionLocale, ResourceLocales, Locales, Composition /* <: Composer[
Messages, 
DateTimeFormats, 
NumberFormats, 
OptionLocale, 
PickupLocales[
  NonNullable[DateTimeFormats | Messages | NumberFormats], 
  /* keyof std.NonNullable<Messages> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: OptionLocale extends @intlify/core-base.@intlify/core-base.Locale ? [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Messages>, keyof std.NonNullable<Messages>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<DateTimeFormats>, keyof std.NonNullable<DateTimeFormats>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<NumberFormats>, keyof std.NonNullable<NumberFormats>>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Messages>, keyof std.NonNullable<Messages>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<DateTimeFormats>, keyof std.NonNullable<DateTimeFormats>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<NumberFormats>, keyof std.NonNullable<NumberFormats>> : OptionLocale | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Messages>, keyof std.NonNullable<Messages>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<DateTimeFormats>, keyof std.NonNullable<DateTimeFormats>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<NumberFormats>, keyof std.NonNullable<NumberFormats>> */ js.Any] */] extends StObject {
  
  /**
    * @remarks
    * The list of available locales in `messages` in lexical order.
    */
  val availableLocales: /* import warning: importer.ImportType#apply Failed type conversion: Composition['availableLocales'] */ js.Any = js.native
  
  def d(value: js.Date): DateTimeFormatResult = js.native
  def d(value: js.Date, args: StringDictionary[String | Boolean | Double]): DateTimeFormatResult = js.native
  /**
    * Datetime formatting
    *
    * @remarks
    * If this is used in a reactive context, it will re-evaluate once the locale changes.
    *
    * If [i18n component options](injection#i18n) is specified, it’s formatted in preferentially local scope datetime formats than global scope locale messages.
    *
    * If [i18n component options](injection#i18n) isn't specified, it’s formatted with global scope datetime formats.
    *
    * @param value - A value, timestamp number or `Date` instance
    *
    * @returns Formatted value
    *
    * @VueI18nSee [Datetime formatting](../guide/essentials/datetime)
    */
  /**
    * Datetime formatting
    *
    * @remarks
    * About details functions, See the {@link VueI18nDateTimeFormatting}
    */
  def d(value: Double): DateTimeFormatResult = js.native
  /**
    * Datetime formatting
    *
    * @remarks
    * Overloaded `d`. About details, see the [call signature](legacy#value-number-date-datetimeformatresult) details.
    *
    * @param value - A value, timestamp number or `Date` instance
    * @param args - An argument values
    *
    * @returns Formatted value
    */
  /**
    * Datetime formatting
    *
    * @remarks
    * About details functions, See the {@link VueI18nDateTimeFormatting}
    */
  def d(value: Double, args: StringDictionary[String | Boolean | Double]): DateTimeFormatResult = js.native
  /**
    * Datetime formatting
    *
    * @remarks
    * About details functions, See the {@link VueI18nDateTimeFormatting}
    */
  def d[Key /* <: String */](value: js.Date, key: Key): DateTimeFormatResult = js.native
  /**
    * Datetime formatting
    *
    * @remarks
    * About details functions, See the {@link VueI18nDateTimeFormatting}
    */
  def d[Key /* <: String */](value: js.Date, key: Key, locale: Locales): DateTimeFormatResult = js.native
  /**
    * Datetime formatting
    *
    * @remarks
    * Overloaded `d`. About details, see the [call signature](legacy#value-number-date-datetimeformatresult) details.
    *
    * @param value - A value, timestamp number or `Date` instance
    * @param key - A key of datetime formats
    *
    * @returns Formatted value
    */
  /**
    * Datetime formatting
    *
    * @remarks
    * About details functions, See the {@link VueI18nDateTimeFormatting}
    */
  def d[Key /* <: String */](value: Double, key: Key): DateTimeFormatResult = js.native
  /**
    * Datetime formatting
    *
    * @remarks
    * Overloaded `d`. About details, see the [call signature](legacy#value-number-date-datetimeformatresult) details.
    *
    * @param value - A value, timestamp number or `Date` instance
    * @param key - A key of datetime formats
    * @param locale - A locale, it will be used over than global scope or local scope.
    *
    * @returns Formatted value
    */
  /**
    * Datetime formatting
    *
    * @remarks
    * About details functions, See the {@link VueI18nDateTimeFormatting}
    */
  def d[Key /* <: String */](value: Double, key: Key, locale: Locales): DateTimeFormatResult = js.native
  /**
    * Datetime formatting
    *
    * @remarks
    * About details functions, See the {@link VueI18nDateTimeFormatting}
    */
  @JSName("d")
  var d_Original: VueI18nDateTimeFormatting[
    DateTimeFormats, 
    Locales, 
    js.Object, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never : never */ js.Any
  ] = js.native
  @JSName("d")
  def d_false[Key /* <: String */](
    value: js.Date,
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never : never */ js.Any
  ): DateTimeFormatResult = js.native
  @JSName("d")
  def d_false[Key /* <: String */](
    value: js.Date,
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never : never */ js.Any,
    locale: Locales
  ): DateTimeFormatResult = js.native
  @JSName("d")
  def d_false[Key /* <: String */](
    value: Double,
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never : never */ js.Any
  ): DateTimeFormatResult = js.native
  @JSName("d")
  def d_false[Key /* <: String */](
    value: Double,
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never : never */ js.Any,
    locale: Locales
  ): DateTimeFormatResult = js.native
  
  /**
    * @remarks
    * The datetime formats of localization.
    *
    * @VueI18nSee [Datetime Formatting](../guide/essentials/datetime)
    */
  val datetimeFormats: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof DateTimeFormats ]: DateTimeFormats[K]} */ js.Any = js.native
  
  /**
    * @remarks
    * Whether interpolation parameters are escaped before the message is translated.
    *
    * @VueI18nSee [HTML Message](../guide/essentials/syntax#html-message)
    */
  var escapeParameterHtml: /* import warning: importer.ImportType#apply Failed type conversion: Composition['escapeParameter'] */ js.Any = js.native
  
  /**
    * @remarks
    * The current fallback locales this VueI18n instance is using.
    *
    * @VueI18nSee [Fallbacking](../guide/essentials/fallback)
    */
  var fallbackLocale: FallbackLocales[Locales] = js.native
  
  /**
    * @remarks
    * Whether suppress warnings when falling back to either `fallbackLocale` or root.
    *
    * @VueI18nSee [Fallbacking](../guide/essentials/fallback)
    */
  var formatFallbackMessages: /* import warning: importer.ImportType#apply Failed type conversion: Composition['fallbackFormat'] */ js.Any = js.native
  
  /**
    * @remarks
    * The formatter that implemented with Formatter interface.
    *
    * @deprecated See the [here](../guide/migration/breaking#remove-custom-formatter)
    */
  var formatter: Formatter = js.native
  
  /**
    * Get choice index
    *
    * @remarks
    * Get pluralization index for current pluralizing number and a given amount of choices.
    *
    * @deprecated Use `pluralizationRules` option instead of `getChoiceIndex`.
    */
  def getChoiceIndex(choice: Choice, choicesLength: Double): Double = js.native
  
  /**
    * Get datetime format
    *
    * @remarks
    * get datetime format from VueI18n instance [datetimeFormats](legacy#datetimeformats).
    *
    * @param locale - A target locale
    *
    * @returns Datetime format
    */
  var getDateTimeFormat: /* import warning: importer.ImportType#apply Failed type conversion: Composition['getDateTimeFormat'] */ js.Any = js.native
  
  /**
    * Get locale message
    *
    * @remarks
    * get locale message from VueI18n instance [messages](legacy#messages).
    *
    * @param locale - A target locale
    *
    * @returns Locale messages
    */
  var getLocaleMessage: /* import warning: importer.ImportType#apply Failed type conversion: Composition['getLocaleMessage'] */ js.Any = js.native
  
  /**
    * Get number format
    *
    * @remarks
    * get number format from VueI18n instance [numberFormats](legacy#numberFormats).
    *
    * @param locale - A target locale
    *
    * @returns Number format
    */
  var getNumberFormat: /* import warning: importer.ImportType#apply Failed type conversion: Composition['getNumberFormat'] */ js.Any = js.native
  
  /**
    * @remarks
    * Instance ID.
    */
  var id: Double = js.native
  
  /**
    * @remarks
    * The current locale this VueI18n instance is using.
    *
    * If the locale contains a territory and a dialect, this locale contains an implicit fallback.
    *
    * @VueI18nSee [Scope and Locale Changing](../guide/essentials/scope)
    */
  var locale: Locales = js.native
  
  /**
    * Merge datetime format
    *
    * @remarks
    * Merge datetime format to VueI18n instance [datetimeFormats](legacy#datetimeformats).
    *
    * @param locale - A target locale
    * @param format - A target datetime format
    */
  var mergeDateTimeFormat: /* import warning: importer.ImportType#apply Failed type conversion: Composition['mergeDateTimeFormat'] */ js.Any = js.native
  
  /**
    * Merge locale message
    *
    * @remarks
    * Merge locale message to VueI18n instance [messages](legacy#messages).
    *
    * @param locale - A target locale
    * @param message - A message
    */
  var mergeLocaleMessage: /* import warning: importer.ImportType#apply Failed type conversion: Composition['mergeLocaleMessage'] */ js.Any = js.native
  
  /**
    * Merge number format
    *
    * @remarks
    * Merge number format to VueI18n instance [numberFormats](legacy#numberFormats).
    *
    * @param locale - A target locale
    * @param format - A target number format
    */
  var mergeNumberFormat: /* import warning: importer.ImportType#apply Failed type conversion: Composition['mergeNumberFormat'] */ js.Any = js.native
  
  /**
    * @remarks
    * The locale messages of localization.
    *
    * @VueI18nSee [Getting Started](../guide/)
    */
  val messages: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Messages ]: Messages[K]} */ js.Any = js.native
  
  /**
    * @remarks
    * A handler for localization missing.
    */
  var missing: MissingHandler | Null = js.native
  
  /**
    * @remarks
    * Custom Modifiers for linked messages.
    *
    * @VueI18nSee [Custom Modifiers](../guide/essentials/syntax#custom-modifiers)
    */
  val modifiers: /* import warning: importer.ImportType#apply Failed type conversion: Composition['modifiers'] */ js.Any = js.native
  
  /**
    * Number formatting
    *
    * @remarks
    * If this is used in a reactive context, it will re-evaluate once the locale changes.
    *
    * If [i18n component options](injection#i18n) is specified, it’s formatted in preferentially local scope number formats than global scope locale messages.
    *
    * If [i18n component options](injection#i18n) isn't specified, it’s formatted with global scope number formats.
    *
    * @param value - A number value
    *
    * @returns Formatted value
    *
    * @VueI18nSee [Number formatting](../guide/essentials/number)
    */
  /**
    * Number Formatting
    *
    * @remarks
    * About details functions, See the {@link VueI18nNumberFormatting}
    */
  def n(value: Double): NumberFormatResult = js.native
  /**
    * Number formatting
    *
    * @remarks
    * Overloaded `n`. About details, see the [call signature](legacy#value-number-numberformatresult) details.
    *
    * @param value - A number value
    * @param args - An argument values
    *
    * @returns Formatted value
    */
  /**
    * Number Formatting
    *
    * @remarks
    * About details functions, See the {@link VueI18nNumberFormatting}
    */
  def n(value: Double, args: StringDictionary[String | Boolean | Double]): NumberFormatResult = js.native
  /**
    * Number formatting
    *
    * @remarks
    * Overloaded `n`. About details, see the [call signature](legacy#value-number-numberformatresult) details.
    *
    * @param value - A number value
    * @param key - A key of number formats
    *
    * @returns Formatted value
    */
  /**
    * Number Formatting
    *
    * @remarks
    * About details functions, See the {@link VueI18nNumberFormatting}
    */
  def n[Key /* <: String */](value: Double, key: Key): NumberFormatResult = js.native
  /**
    * Number formatting
    *
    * @remarks
    * Overloaded `n`. About details, see the [call signature](legacy#value-number-numberformatresult) details.
    *
    * @param value - A number value
    * @param key - A key of number formats
    * @param locale - A locale, it will be used over than global scope or local scope.
    *
    * @returns Formatted value
    */
  /**
    * Number Formatting
    *
    * @remarks
    * About details functions, See the {@link VueI18nNumberFormatting}
    */
  def n[Key /* <: String */](value: Double, key: Key, locale: Locales): NumberFormatResult = js.native
  /**
    * Number Formatting
    *
    * @remarks
    * About details functions, See the {@link VueI18nNumberFormatting}
    */
  @JSName("n")
  var n_Original: VueI18nNumberFormatting[
    NumberFormats, 
    Locales, 
    js.Object, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}>[K]} * /
  {}> : never */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsEmptyObject<NumberFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<NumberFormats, keyof NumberFormats> : never */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}>[K]} * /
  {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<NumberFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<NumberFormats, keyof NumberFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}>[K]} * /
  {}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<NumberFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<NumberFormats, keyof NumberFormats> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}>[K]} * /
  {}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<NumberFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<NumberFormats, keyof NumberFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<NumberFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<NumberFormats, keyof NumberFormats> : never : never */ js.Any
  ] = js.native
  @JSName("n")
  def n_false[Key /* <: String */](
    value: Double,
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}>[K]} * /
  {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<NumberFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<NumberFormats, keyof NumberFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}>[K]} * /
  {}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<NumberFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<NumberFormats, keyof NumberFormats> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}>[K]} * /
  {}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<NumberFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<NumberFormats, keyof NumberFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<NumberFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<NumberFormats, keyof NumberFormats> : never : never */ js.Any
  ): NumberFormatResult = js.native
  @JSName("n")
  def n_false[Key /* <: String */](
    value: Double,
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}>[K]} * /
  {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<NumberFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<NumberFormats, keyof NumberFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}>[K]} * /
  {}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<NumberFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<NumberFormats, keyof NumberFormats> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}>[K]} * /
  {}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<NumberFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<NumberFormats, keyof NumberFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<NumberFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<NumberFormats, keyof NumberFormats> : never : never */ js.Any,
    locale: Locales
  ): NumberFormatResult = js.native
  
  /**
    * @remarks
    * The number formats of localization.
    *
    * @VueI18nSee [Number Formatting](../guide/essentials/number)
    */
  val numberFormats: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof NumberFormats ]: NumberFormats[K]} */ js.Any = js.native
  
  /**
    * A set of rules for word pluralization
    *
    * @VueI18nSee [Custom Pluralization](../guide/essentials/pluralization#custom-pluralization)
    */
  var pluralizationRules: /* import warning: importer.ImportType#apply Failed type conversion: Composition['pluralRules'] */ js.Any = js.native
  
  /**
    * @remarks
    * A handler for post processing of translation.
    */
  var postTranslation: PostTranslationHandler[VueMessageType] | Null = js.native
  
  /**
    * @remarks
    * Whether `v-t` directive's element should preserve `textContent` after directive is unbinded.
    *
    * @VueI18nSee [Custom Directive](../guide/advanced/directive)
    * @VueI18nSee [Remove preserveDirectiveContent option](../guide/migration/breaking#remove-preservedirectivecontent-option)
    *
    * @deprecated The `v-t` directive for Vue 3 now preserves the default content. Therefore, this option and its properties have been removed from the VueI18n instance.
    */
  var preserveDirectiveContent: Boolean = js.native
  
  /**
    * Resolve locale message translation
    *
    * @remarks
    * If this is used in a reactive context, it will re-evaluate once the locale changes.
    *
    * If [UseI18nScope](general#usei18nscope) `'local'` or Some [UseI18nOptions](composition#usei18noptions) are specified at `useI18n`, it’s translated in preferentially local scope locale messages than global scope locale messages.
    *
    * If not, then it’s translated with global scope locale messages.
    *
    * @VueI18nTip
    * The use-case for `rt` is for programmatic locale messages translation with using `tm`, `v-for`, javascript `for` statement.
    *
    * @VueI18nWarning
    * `rt` differs from `t` in that it processes the locale message directly, not the key of the locale message. There is no internal fallback with `rt`. You need to understand and use the structure of the locale messge returned by `tm`.
    *
    * @param message - A target locale message to be resolved. You will need to specify the locale message returned by `tm`.
    *
    * @returns Translated message
    *
    * @VueI18nSee [Scope and Locale Changing](../guide/essentials/scope)
    */
  /**
    * Resolve locale message translation
    *
    * @remarks
    * About details functions, See the {@link VueI18nResolveLocaleMessageTranslation}
    */
  def rt(message: MessageFunction[VueMessageType]): String = js.native
  /**
    * Resolve locale message translation for list interpolations
    *
    * @remarks
    * Overloaded `rt`. About details, see the [call signature](composition#message-messagefunction-message-message-string) details.
    *
    * In this overloaded `rt`, return a pluralized translation message.
    *
    * @VueI18nTip
    * The use-case for `rt` is for programmatic locale messages translation with using `tm`, `v-for`, javascript `for` statement.
    *
    * @VueI18nWarning
    * `rt` differs from `t` in that it processes the locale message directly, not the key of the locale message. There is no internal fallback with `rt`. You need to understand and use the structure of the locale messge returned by `tm`.
    *
    * @param message - A target locale message to be resolved. You will need to specify the locale message returned by `tm`.
    * @param list - A values of list interpolation.
    * @param options - Additional {@link TranslateOptions | options} for translation
    *
    * @returns Translated message
    *
    * @VueI18nSee [List interpolation](../guide/essentials/syntax#list-interpolation)
    */
  /**
    * Resolve locale message translation
    *
    * @remarks
    * About details functions, See the {@link VueI18nResolveLocaleMessageTranslation}
    */
  def rt(message: MessageFunction[VueMessageType], list: js.Array[Any]): String = js.native
  def rt(message: MessageFunction[VueMessageType], list: js.Array[Any], options: TranslateOptions[Locales]): String = js.native
  /**
    * Resolve locale message translation for named interpolations
    *
    * @remarks
    * Overloaded `rt`. About details, see the [call signature](composition#message-messagefunction-message-message-string) details.
    *
    * In this overloaded `rt`, for each placeholder x, the locale messages should contain a `{x}` token.
    *
    * @VueI18nTip
    * The use-case for `rt` is for programmatic locale messages translation with using `tm`, `v-for`, javascript `for` statement.
    *
    * @VueI18nWarning
    * `rt` differs from `t` in that it processes the locale message directly, not the key of the locale message. There is no internal fallback with `rt`. You need to understand and use the structure of the locale messge returned by `tm`.
    *
    * @param message - A target locale message to be resolved. You will need to specify the locale message returned by `tm`.
    * @param named - A values of named interpolation.
    * @param options - Additional {@link TranslateOptions | options} for translation
    *
    * @returns Translated message
    *
    * @VueI18nSee [Named interpolation](../guide/essentials/syntax#named-interpolation)
    */
  /**
    * Resolve locale message translation
    *
    * @remarks
    * About details functions, See the {@link VueI18nResolveLocaleMessageTranslation}
    */
  def rt(message: MessageFunction[VueMessageType], named: NamedValue[js.Object]): String = js.native
  def rt(
    message: MessageFunction[VueMessageType],
    named: NamedValue[js.Object],
    options: TranslateOptions[Locales]
  ): String = js.native
  /**
    * Resolve locale message translation for plurals
    *
    * @remarks
    * Overloaded `rt`. About details, see the [call signature](composition#message-messagefunction-message-message-string) details.
    *
    * In this overloaded `rt`, return a pluralized translation message.
    *
    * @VueI18nTip
    * The use-case for `rt` is for programmatic locale messages translation with using `tm`, `v-for`, javascript `for` statement.
    *
    * @VueI18nWarning
    * `rt` differs from `t` in that it processes the locale message directly, not the key of the locale message. There is no internal fallback with `rt`. You need to understand and use the structure of the locale messge returned by `tm`.
    *
    * @param message - A target locale message to be resolved. You will need to specify the locale message returned by `tm`.
    * @param plural - Which plural string to get. 1 returns the first one.
    * @param options - Additional {@link TranslateOptions | options} for translation
    *
    * @returns Translated message
    *
    * @VueI18nSee [Pluralization](../guide/essentials/pluralization)
    */
  /**
    * Resolve locale message translation
    *
    * @remarks
    * About details functions, See the {@link VueI18nResolveLocaleMessageTranslation}
    */
  def rt(message: MessageFunction[VueMessageType], plural: Double): String = js.native
  def rt(message: MessageFunction[VueMessageType], plural: Double, options: TranslateOptions[Locales]): String = js.native
  def rt(message: VueMessageType): String = js.native
  def rt(message: VueMessageType, list: js.Array[Any]): String = js.native
  def rt(message: VueMessageType, list: js.Array[Any], options: TranslateOptions[Locales]): String = js.native
  def rt(message: VueMessageType, named: NamedValue[js.Object]): String = js.native
  def rt(message: VueMessageType, named: NamedValue[js.Object], options: TranslateOptions[Locales]): String = js.native
  def rt(message: VueMessageType, plural: Double): String = js.native
  def rt(message: VueMessageType, plural: Double, options: TranslateOptions[Locales]): String = js.native
  /**
    * Resolve locale message translation
    *
    * @remarks
    * About details functions, See the {@link VueI18nResolveLocaleMessageTranslation}
    */
  @JSName("rt")
  var rt_Original: VueI18nResolveLocaleMessageTranslation[Locales] = js.native
  
  /**
    * Set datetime format
    *
    * @remarks
    * Set datetime format to VueI18n instance [datetimeFormats](legacy#datetimeformats).
    *
    * @param locale - A target locale
    * @param format - A target datetime format
    */
  var setDateTimeFormat: /* import warning: importer.ImportType#apply Failed type conversion: Composition['setDateTimeFormat'] */ js.Any = js.native
  
  /**
    * Set locale message
    *
    * @remarks
    * Set locale message to VueI18n instance [messages](legacy#messages).
    *
    * @param locale - A target locale
    * @param message - A message
    */
  var setLocaleMessage: /* import warning: importer.ImportType#apply Failed type conversion: Composition['setLocaleMessage'] */ js.Any = js.native
  
  /**
    * Set number format
    *
    * @remarks
    * Set number format to VueI18n instance [numberFormats](legacy#numberFormats).
    *
    * @param locale - A target locale
    * @param format - A target number format
    */
  var setNumberFormat: /* import warning: importer.ImportType#apply Failed type conversion: Composition['setNumberFormat'] */ js.Any = js.native
  
  /**
    * @remarks
    * Whether suppress fallback warnings when localization fails.
    */
  var silentFallbackWarn: /* import warning: importer.ImportType#apply Failed type conversion: Composition['fallbackWarn'] */ js.Any = js.native
  
  /**
    * @remarks
    * Whether suppress warnings outputted when localization fails.
    *
    * @VueI18nSee [Fallbacking](../guide/essentials/fallback)
    */
  var silentTranslationWarn: /* import warning: importer.ImportType#apply Failed type conversion: Composition['missingWarn'] */ js.Any = js.native
  
  /**
    * @remarks
    * Whether synchronize the root level locale to the component localization locale.
    *
    * @VueI18nSee [Local Scope](../guide/essentials/scope#local-scope-2)
    */
  var sync: /* import warning: importer.ImportType#apply Failed type conversion: Composition['inheritLocale'] */ js.Any = js.native
  
  /**
    * Locale message translation.
    *
    * @remarks
    * If this is used in a reactive context, it will re-evaluate once the locale changes.
    *
    * If [i18n component options](injection#i18n) is specified, it’s translated in preferentially local scope locale messages than global scope locale messages.
    *
    * If [i18n component options](injection#i18n) isn't specified, it’s translated with global scope locale messages.
    *
    * @param key - A target locale message key
    *
    * @returns Translated message
    *
    * @VueI18nSee [Scope and Locale Changing](../guide/essentials/scope)
    */
  /**
    * Locale message translation
    *
    * @remarks
    * About details functions, See the {@link VueI18nTranslation}
    */
  def t[Key /* <: String */](key: Key): TranslateResult = js.native
  /**
    * Locale message translation.
    *
    * @remarks
    * Overloaded `t`. About details, see the [call signature](legacy#key-key-resourcekeys-translateresult) details.
    *
    * @param key - A target locale message key
    * @param list - A values of list interpolation
    *
    * @returns Translated message
    *
    * @VueI18nSee [List interpolation](../guide/essentials/syntax#list-interpolation)
    */
  /**
    * Locale message translation
    *
    * @remarks
    * About details functions, See the {@link VueI18nTranslation}
    */
  def t[Key /* <: String */](key: Key, list: js.Array[Any]): TranslateResult = js.native
  /**
    * Locale message translation.
    *
    * @remarks
    * Overloaded `t`. About details, see the [call signature](legacy#key-key-resourcekeys-translateresult) details.
    *
    * @param key - A target locale message key
    * @param locale - A locale, it will be used over than global scope or local scope.
    *
    * @returns Translated message
    */
  /**
    * Locale message translation
    *
    * @remarks
    * About details functions, See the {@link VueI18nTranslation}
    */
  def t[Key /* <: String */](key: Key, locale: Locales): TranslateResult = js.native
  /**
    * Locale message translation.
    *
    * @remarks
    * Overloaded `t`. About details, see the [call signature](legacy#key-key-resourcekeys-translateresult) details.
    *
    * @param key - A target locale message key
    * @param locale - A locale, it will be used over than global scope or local scope.
    * @param list - A values of list interpolation
    *
    * @returns Translated message
    *
    * @VueI18nSee [List interpolation](../guide/essentials/syntax#list-interpolation)
    */
  /**
    * Locale message translation
    *
    * @remarks
    * About details functions, See the {@link VueI18nTranslation}
    */
  def t[Key /* <: String */](key: Key, locale: Locales, list: js.Array[Any]): TranslateResult = js.native
  /**
    * Locale message translation.
    *
    * @remarks
    * Overloaded `t`. About details, see the [call signature](legacy#key-key-resourcekeys-translateresult) details.
    *
    * @param key - A target locale message key
    * @param locale - A locale, it will be used over than global scope or local scope.
    * @param named - A values of named interpolation
    *
    * @returns Translated message
    *
    * @VueI18nSee [Named interpolation](../guide/essentials/syntax#named-interpolation)
    */
  /**
    * Locale message translation
    *
    * @remarks
    * About details functions, See the {@link VueI18nTranslation}
    */
  def t[Key /* <: String */](key: Key, locale: Locales, named: Record[String, Any]): TranslateResult = js.native
  def t[Key /* <: String */](key: Key, locale: Locale): TranslateResult = js.native
  def t[Key /* <: String */](key: Key, locale: Locale, list: js.Array[Any]): TranslateResult = js.native
  def t[Key /* <: String */](key: Key, locale: Locale, named: Record[String, Any]): TranslateResult = js.native
  /**
    * Locale message translation.
    *
    * @remarks
    * Overloaded `t`. About details, see the [call signature](legacy#key-key-resourcekeys-translateresult) details.
    *
    * @param key - A target locale message key
    * @param named - A values of named interpolation
    *
    * @returns Translated message
    *
    * @VueI18nSee [Named interpolation](../guide/essentials/syntax#named-interpolation)
    */
  /**
    * Locale message translation
    *
    * @remarks
    * About details functions, See the {@link VueI18nTranslation}
    */
  def t[Key /* <: String */](key: Key, named: Record[String, Any]): TranslateResult = js.native
  /**
    * Locale message translation
    *
    * @remarks
    * About details functions, See the {@link VueI18nTranslation}
    */
  @JSName("t")
  var t_Original: VueI18nTranslation[
    Messages, 
    Locales, 
    RemoveIndexSignature[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]} */ js.Any
    ], 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : never */ js.Any
  ] = js.native
  @JSName("t")
  def t_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : never */ js.Any
  ): TranslateResult = js.native
  @JSName("t")
  def t_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : never */ js.Any,
    list: js.Array[Any]
  ): TranslateResult = js.native
  @JSName("t")
  def t_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : never */ js.Any,
    locale: Locales
  ): TranslateResult = js.native
  @JSName("t")
  def t_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : never */ js.Any,
    locale: Locales,
    list: js.Array[Any]
  ): TranslateResult = js.native
  @JSName("t")
  def t_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : never */ js.Any,
    locale: Locales,
    named: Record[String, Any]
  ): TranslateResult = js.native
  @JSName("t")
  def t_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : never */ js.Any,
    locale: Locale
  ): TranslateResult = js.native
  @JSName("t")
  def t_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : never */ js.Any,
    locale: Locale,
    list: js.Array[Any]
  ): TranslateResult = js.native
  @JSName("t")
  def t_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : never */ js.Any,
    locale: Locale,
    named: Record[String, Any]
  ): TranslateResult = js.native
  @JSName("t")
  def t_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : never */ js.Any,
    named: Record[String, Any]
  ): TranslateResult = js.native
  
  /**
    * Locale message pluralization
    *
    * @remarks
    * If this is used in a reactive context, it will re-evaluate once the locale changes.
    *
    * If [i18n component options](injection#i18n) is specified, it’s pluraled in preferentially local scope locale messages than global scope locale messages.
    *
    * If [i18n component options](injection#i18n) isn't specified, it’s pluraled with global scope locale messages.
    *
    * The plural choice number is handled with default `1`.
    *
    * @param key - A target locale message key
    *
    * @returns Pluraled message
    *
    * @VueI18nSee [Pluralization](../guide/essentials/pluralization)
    */
  /**
    * Locale message pluralization
    *
    * @remarks
    * About details functions, See the {@link VueI18nTranslationChoice}
    */
  def tc[Key /* <: String */](key: Key): TranslateResult = js.native
  /**
    * Locale message pluralization
    *
    * @remarks
    * Overloaded `tc`. About details, see the [call signature](legacy#key-key-resourcekeys-translateresult-2) details.
    *
    * @param key - A target locale message key
    * @param choice - Which plural string to get. 1 returns the first one.
    *
    * @returns Pluraled message
    */
  /**
    * Locale message pluralization
    *
    * @remarks
    * About details functions, See the {@link VueI18nTranslationChoice}
    */
  def tc[Key /* <: String */](key: Key, choice: Double): TranslateResult = js.native
  /**
    * Locale message pluralization
    *
    * @remarks
    * Overloaded `tc`. About details, see the [call signature](legacy#key-key-resourcekeys-translateresult-2) details.
    *
    * @param key - A target locale message key
    * @param choice - Which plural string to get. 1 returns the first one.
    * @param list - A values of list interpolation
    *
    * @returns Pluraled message
    */
  /**
    * Locale message pluralization
    *
    * @remarks
    * About details functions, See the {@link VueI18nTranslationChoice}
    */
  def tc[Key /* <: String */](key: Key, choice: Double, list: js.Array[Any]): TranslateResult = js.native
  /**
    * Locale message pluralization
    *
    * @remarks
    * Overloaded `tc`. About details, see the [call signature](legacy#key-key-resourcekeys-translateresult-2) details.
    *
    * @param key - A target locale message key
    * @param choice - Which plural string to get. 1 returns the first one.
    * @param locale - A locale, it will be used over than global scope or local scope.
    *
    * @returns Pluraled message
    */
  /**
    * Locale message pluralization
    *
    * @remarks
    * About details functions, See the {@link VueI18nTranslationChoice}
    */
  def tc[Key /* <: String */](key: Key, choice: Double, locale: Locales): TranslateResult = js.native
  def tc[Key /* <: String */](key: Key, choice: Double, locale: Locale): TranslateResult = js.native
  /**
    * Locale message pluralization
    *
    * @remarks
    * Overloaded `tc`. About details, see the [call signature](legacy#key-key-resourcekeys-translateresult-2) details.
    *
    * @param key - A target locale message key
    * @param choice - Which plural string to get. 1 returns the first one.
    * @param named - A values of named interpolation
    *
    * @returns Pluraled message
    */
  /**
    * Locale message pluralization
    *
    * @remarks
    * About details functions, See the {@link VueI18nTranslationChoice}
    */
  def tc[Key /* <: String */](key: Key, choice: Double, named: Record[String, Any]): TranslateResult = js.native
  /**
    * Locale message pluralization
    *
    * @remarks
    * Overloaded `tc`. About details, see the [call signature](legacy#key-key-resourcekeys-translateresult-2) details.
    *
    * @param key - A target locale message key
    * @param list - A values of list interpolation
    *
    * @returns Pluraled message
    */
  /**
    * Locale message pluralization
    *
    * @remarks
    * About details functions, See the {@link VueI18nTranslationChoice}
    */
  def tc[Key /* <: String */](key: Key, list: js.Array[Any]): TranslateResult = js.native
  /**
    * Locale message pluralization
    *
    * @remarks
    * Overloaded `tc`. About details, see the [call signature](legacy#key-key-resourcekeys-translateresult-2) details.
    *
    * @param key - A target locale message key
    * @param locale - A locale, it will be used over than global scope or local scope.
    *
    * @returns Pluraled message
    */
  /**
    * Locale message pluralization
    *
    * @remarks
    * About details functions, See the {@link VueI18nTranslationChoice}
    */
  def tc[Key /* <: String */](key: Key, locale: Locales): TranslateResult = js.native
  def tc[Key /* <: String */](key: Key, locale: Locale): TranslateResult = js.native
  /**
    * Locale message pluralization
    *
    * @remarks
    * Overloaded `tc`. About details, see the [call signature](legacy#key-key-resourcekeys-translateresult-2) details.
    *
    * @param key - A target locale message key
    * @param named - A values of named interpolation
    *
    * @returns Pluraled message
    */
  /**
    * Locale message pluralization
    *
    * @remarks
    * About details functions, See the {@link VueI18nTranslationChoice}
    */
  def tc[Key /* <: String */](key: Key, named: Record[String, Any]): TranslateResult = js.native
  /**
    * Locale message pluralization
    *
    * @remarks
    * About details functions, See the {@link VueI18nTranslationChoice}
    */
  @JSName("tc")
  var tc_Original: VueI18nTranslationChoice[
    Messages, 
    Locales, 
    RemoveIndexSignature[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]} */ js.Any
    ], 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : never */ js.Any
  ] = js.native
  @JSName("tc")
  def tc_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : never */ js.Any
  ): TranslateResult = js.native
  @JSName("tc")
  def tc_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : never */ js.Any,
    choice: Double
  ): TranslateResult = js.native
  @JSName("tc")
  def tc_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : never */ js.Any,
    choice: Double,
    list: js.Array[Any]
  ): TranslateResult = js.native
  @JSName("tc")
  def tc_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : never */ js.Any,
    choice: Double,
    locale: Locales
  ): TranslateResult = js.native
  @JSName("tc")
  def tc_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : never */ js.Any,
    choice: Double,
    locale: Locale
  ): TranslateResult = js.native
  @JSName("tc")
  def tc_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : never */ js.Any,
    choice: Double,
    named: Record[String, Any]
  ): TranslateResult = js.native
  @JSName("tc")
  def tc_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : never */ js.Any,
    list: js.Array[Any]
  ): TranslateResult = js.native
  @JSName("tc")
  def tc_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : never */ js.Any,
    locale: Locales
  ): TranslateResult = js.native
  @JSName("tc")
  def tc_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : never */ js.Any,
    locale: Locale
  ): TranslateResult = js.native
  @JSName("tc")
  def tc_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : never */ js.Any,
    named: Record[String, Any]
  ): TranslateResult = js.native
  
  /**
    * Translation locale message exist
    *
    * @remarks
    * whether do exist locale message on VueI18n instance [messages](legacy#messages).
    *
    * If you specified `locale`, check the locale messages of `locale`.
    *
    * @param key - A target locale message key
    * @param locale - A target locale
    *
    * @returns If found locale message, `true`, else `false`
    */
  def te[Str /* <: String */, Key /* <: PickupKeys[Messages, /* keyof Messages */ String] */](key: Key | Str): Boolean = js.native
  def te[Str /* <: String */, Key /* <: PickupKeys[Messages, /* keyof Messages */ String] */](key: Key | Str, locale: Locales): Boolean = js.native
  
  /**
    * Locale messages getter
    *
    * @remarks
    * If [i18n component options](injection#i18n) is specified, it’s get in preferentially local scope locale messages than global scope locale messages.
    *
    * If [i18n component options](injection#i18n) isn't specified, it’s get with global scope locale messages.
    *
    * Based on the current `locale`, locale messages will be returned from Composer instance messages.
    *
    * If you change the `locale`, the locale messages returned will also correspond to the locale.
    *
    * If there are no locale messages for the given `key` in the composer instance messages, they will be returned with [fallbacking](../guide/essentials/fallback).
    *
    * @VueI18nWarning
    * You need to use `rt` for the locale message returned by `tm`. see the [rt](legacy#rt-message) details.
    *
    * @example
    * template:
    * ```html
    * <div class="container">
    *   <template v-for="content in $tm('contents')">
    *     <h2>{{ $rt(content.title) }}</h2>
    *     <p v-for="paragraph in content.paragraphs">
    *      {{ $rt(paragraph) }}
    *     </p>
    *   </template>
    * </div>
    * ```
    *
    * ```js
    * import { createI18n } from 'vue-i18n'
    *
    * const i18n = createI18n({
    *   messages: {
    *     en: {
    *       contents: [
    *         {
    *           title: 'Title1',
    *           // ...
    *           paragraphs: [
    *             // ...
    *           ]
    *         }
    *       ]
    *     }
    *   }
    *   // ...
    * })
    * ```
    * @param key - A target locale message key
    *
    * @return Locale messages
    */
  var tm: /* import warning: importer.ImportType#apply Failed type conversion: Composition['tm'] */ js.Any = js.native
  
  /**
    * @remarks
    * Whether to allow the use locale messages of HTML formatting.
    *
    * If you set `warn` or` error`, will check the locale messages on the VueI18n instance.
    *
    * If you are specified `warn`, a warning will be output at console.
    *
    * If you are specified `error` will occurred an Error.
    *
    * @VueI18nSee [HTML Message](../guide/essentials/syntax#html-message)
    * @VueI18nSee [Change `warnHtmlInMessage` option default value](../guide/migration/breaking#change-warnhtmlinmessage-option-default-value)
    */
  var warnHtmlInMessage: WarnHtmlInMessageLevel = js.native
}
