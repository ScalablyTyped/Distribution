package typings.vueI18n.anon

import org.scalablytyped.runtime.StringDictionary
import typings.intlifyCoreBase.mod.FallbackLocales
import typings.intlifyCoreBase.mod.LinkedModifiers
import typings.intlifyCoreBase.mod.Locale
import typings.intlifyCoreBase.mod.LocaleMessage
import typings.intlifyCoreBase.mod.MessageFunction
import typings.intlifyCoreBase.mod.NamedValue
import typings.intlifyCoreBase.mod.PickupKeys
import typings.intlifyCoreBase.mod.PickupLocales
import typings.intlifyCoreBase.mod.PluralizationRules
import typings.intlifyCoreBase.mod.PostTranslationHandler
import typings.intlifyCoreBase.mod.RemoveIndexSignature
import typings.intlifyCoreBase.mod.TranslateOptions
import typings.std.NonNullable
import typings.std.Record
import typings.vueI18n.mod.Choice
import typings.vueI18n.mod.DateTimeFormatResult
import typings.vueI18n.mod.Formatter
import typings.vueI18n.mod.MissingHandler
import typings.vueI18n.mod.NumberFormatResult
import typings.vueI18n.mod.TranslateResult
import typings.vueI18n.mod.VueI18nDateTimeFormatting
import typings.vueI18n.mod.VueI18nNumberFormatting
import typings.vueI18n.mod.VueI18nResolveLocaleMessageTranslation
import typings.vueI18n.mod.VueI18nTranslation
import typings.vueI18n.mod.VueI18nTranslationChoice
import typings.vueI18n.mod.VueMessageType
import typings.vueI18n.mod.WarnHtmlInMessageLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vue-i18n.vue-i18n.VueI18n<{}, {}, {}, string, never, string, vue-i18n.vue-i18n.Composer<{}, {}, {}, string, never, string>> & {install (Vue : any, options : any | undefined): void} */
@js.native
trait VueI18nstringneverstringC extends StObject {
  
  /**
    * @remarks
    * The list of available locales in `messages` in lexical order.
    */
  val availableLocales: js.Array[String] = js.native
  
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
  def d[Key /* <: String */](value: js.Date, key: Key, locale: String): DateTimeFormatResult = js.native
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
  def d[Key /* <: String */](value: Double, key: Key, locale: String): DateTimeFormatResult = js.native
  /**
    * Datetime formatting
    *
    * @remarks
    * About details functions, See the {@link VueI18nDateTimeFormatting}
    */
  @JSName("d")
  var d_Original: VueI18nDateTimeFormatting[
    js.Object, 
    String, 
    js.Object, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<{}, keyof {}> : never */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<{}, keyof {}> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<{}, keyof {}> : never : never */ js.Any
  ] = js.native
  @JSName("d")
  def d_false[Key /* <: String */](
    value: js.Date,
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<{}, keyof {}> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<{}, keyof {}> : never : never */ js.Any
  ): DateTimeFormatResult = js.native
  @JSName("d")
  def d_false[Key /* <: String */](
    value: js.Date,
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<{}, keyof {}> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<{}, keyof {}> : never : never */ js.Any,
    locale: String
  ): DateTimeFormatResult = js.native
  @JSName("d")
  def d_false[Key /* <: String */](
    value: Double,
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<{}, keyof {}> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<{}, keyof {}> : never : never */ js.Any
  ): DateTimeFormatResult = js.native
  @JSName("d")
  def d_false[Key /* <: String */](
    value: Double,
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<{}, keyof {}> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<{}, keyof {}> : never : never */ js.Any,
    locale: String
  ): DateTimeFormatResult = js.native
  
  /**
    * @remarks
    * Whether interpolation parameters are escaped before the message is translated.
    *
    * @VueI18nSee [HTML Message](../guide/essentials/syntax#html-message)
    */
  var escapeParameterHtml: Boolean = js.native
  
  /**
    * @remarks
    * The current fallback locales this VueI18n instance is using.
    *
    * @VueI18nSee [Fallbacking](../guide/essentials/fallback)
    */
  var fallbackLocale: FallbackLocales[String] = js.native
  
  /**
    * @remarks
    * Whether suppress warnings when falling back to either `fallbackLocale` or root.
    *
    * @VueI18nSee [Fallbacking](../guide/essentials/fallback)
    */
  var formatFallbackMessages: Boolean = js.native
  
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
  def getDateTimeFormat[DateTimeSchema /* <: Record[String, Any] */, LocaleSchema /* <: String */, Locale /* <: PickupLocales[NonNullable[js.Object], /* keyof std.NonNullable<{}> */ String] */, Return](locale: Locale | LocaleSchema): Return = js.native
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
  @JSName("getDateTimeFormat")
  var getDateTimeFormat_Original: js.Function1[
    /* locale */ String | (PickupLocales[NonNullable[js.Object], /* keyof std.NonNullable<{}> */ String]), 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<never> extends true ? @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends true ? / * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {} : std.NonNullable<{}>[@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<{}>, keyof std.NonNullable<{}>>] : never */ js.Any
  ] = js.native
  
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
  def getLocaleMessage[MessageSchema /* <: LocaleMessage[VueMessageType] */, LocaleSchema /* <: String */, Locale /* <: PickupLocales[NonNullable[js.Object], /* keyof std.NonNullable<{}> */ String] */, Return](locale: Locale | LocaleSchema): Return = js.native
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
  @JSName("getLocaleMessage")
  var getLocaleMessage_Original: js.Function1[
    /* locale */ String | (PickupLocales[NonNullable[js.Object], /* keyof std.NonNullable<{}> */ String]), 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<never> extends true ? @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends true ? @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> : std.NonNullable<{}>[@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<{}>, keyof std.NonNullable<{}>>] : never */ js.Any
  ] = js.native
  
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
  def getNumberFormat[NumberSchema /* <: Record[String, Any] */, LocaleSchema /* <: String */, Locale /* <: PickupLocales[NonNullable[js.Object], /* keyof std.NonNullable<{}> */ String] */, Return](locale: Locale | LocaleSchema): Return = js.native
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
  @JSName("getNumberFormat")
  var getNumberFormat_Original: js.Function1[
    /* locale */ String | (PickupLocales[NonNullable[js.Object], /* keyof std.NonNullable<{}> */ String]), 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<never> extends true ? @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends true ? / * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {} : std.NonNullable<{}>[@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<{}>, keyof std.NonNullable<{}>>] : never */ js.Any
  ] = js.native
  
  /**
    * @remarks
    * Instance ID.
    */
  var id: Double = js.native
  
  def install(Vue: Any): Unit = js.native
  def install(Vue: Any, options: Any): Unit = js.native
  
  /**
    * @remarks
    * The current locale this VueI18n instance is using.
    *
    * If the locale contains a territory and a dialect, this locale contains an implicit fallback.
    *
    * @VueI18nSee [Scope and Locale Changing](../guide/essentials/scope)
    */
  var locale: String = js.native
  
  /**
    * Merge datetime format
    *
    * @remarks
    * Merge datetime format to VueI18n instance [datetimeFormats](legacy#datetimeformats).
    *
    * @param locale - A target locale
    * @param format - A target datetime format
    */
  def mergeDateTimeFormat[DateTimeSchema /* <: Record[String, Any] */, LocaleSchema /* <: String */, Locale /* <: PickupLocales[NonNullable[js.Object], /* keyof std.NonNullable<{}> */ String] */, Formats](locale: Locale | LocaleSchema, format: Formats): Unit = js.native
  /**
    * Merge datetime format
    *
    * @remarks
    * Merge datetime format to VueI18n instance [datetimeFormats](legacy#datetimeformats).
    *
    * @param locale - A target locale
    * @param format - A target datetime format
    */
  @JSName("mergeDateTimeFormat")
  var mergeDateTimeFormat_Original: js.Function2[
    /* locale */ String | (PickupLocales[NonNullable[js.Object], /* keyof std.NonNullable<{}> */ String]), 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<never> extends true ? std.Record<string, any> : never */ /* format */ js.Any, 
    Unit
  ] = js.native
  
  /**
    * Merge locale message
    *
    * @remarks
    * Merge locale message to VueI18n instance [messages](legacy#messages).
    *
    * @param locale - A target locale
    * @param message - A message
    */
  def mergeLocaleMessage[MessageSchema /* <: LocaleMessage[VueMessageType] */, LocaleSchema /* <: String */, Locale /* <: PickupLocales[NonNullable[js.Object], /* keyof std.NonNullable<{}> */ String] */, Message](locale: Locale | LocaleSchema, message: Message): Unit = js.native
  /**
    * Merge locale message
    *
    * @remarks
    * Merge locale message to VueI18n instance [messages](legacy#messages).
    *
    * @param locale - A target locale
    * @param message - A message
    */
  @JSName("mergeLocaleMessage")
  var mergeLocaleMessage_Original: js.Function2[
    /* locale */ String | (PickupLocales[NonNullable[js.Object], /* keyof std.NonNullable<{}> */ String]), 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<never> extends true ? std.Record<string, any> : never */ /* message */ js.Any, 
    Unit
  ] = js.native
  
  /**
    * Merge number format
    *
    * @remarks
    * Merge number format to VueI18n instance [numberFormats](legacy#numberFormats).
    *
    * @param locale - A target locale
    * @param format - A target number format
    */
  def mergeNumberFormat[NumberSchema /* <: Record[String, Any] */, LocaleSchema /* <: String */, Locale /* <: PickupLocales[NonNullable[js.Object], /* keyof std.NonNullable<{}> */ String] */, Formats](locale: Locale | LocaleSchema, format: Formats): Unit = js.native
  /**
    * Merge number format
    *
    * @remarks
    * Merge number format to VueI18n instance [numberFormats](legacy#numberFormats).
    *
    * @param locale - A target locale
    * @param format - A target number format
    */
  @JSName("mergeNumberFormat")
  var mergeNumberFormat_Original: js.Function2[
    /* locale */ String | (PickupLocales[NonNullable[js.Object], /* keyof std.NonNullable<{}> */ String]), 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<never> extends true ? std.Record<string, any> : never */ /* format */ js.Any, 
    Unit
  ] = js.native
  
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
  val modifiers: LinkedModifiers[VueMessageType] = js.native
  
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
  def n[Key /* <: String */](value: Double, key: Key, locale: String): NumberFormatResult = js.native
  /**
    * Number Formatting
    *
    * @remarks
    * About details functions, See the {@link VueI18nNumberFormatting}
    */
  @JSName("n")
  var n_Original: VueI18nNumberFormatting[
    js.Object, 
    String, 
    js.Object, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}>[K]} * /
  {}> : never */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<{}, keyof {}> : never */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}>[K]} * /
  {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}>[K]} * /
  {}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<{}, keyof {}> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}>[K]} * /
  {}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<{}, keyof {}> : never : never */ js.Any
  ] = js.native
  @JSName("n")
  def n_false[Key /* <: String */](
    value: Double,
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}>[K]} * /
  {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}>[K]} * /
  {}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<{}, keyof {}> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}>[K]} * /
  {}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<{}, keyof {}> : never : never */ js.Any
  ): NumberFormatResult = js.native
  @JSName("n")
  def n_false[Key /* <: String */](
    value: Double,
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}>[K]} * /
  {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}>[K]} * /
  {}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<{}, keyof {}> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}>[K]} * /
  {}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<{}, keyof {}> : never : never */ js.Any,
    locale: String
  ): NumberFormatResult = js.native
  
  /**
    * A set of rules for word pluralization
    *
    * @VueI18nSee [Custom Pluralization](../guide/essentials/pluralization#custom-pluralization)
    */
  var pluralizationRules: PluralizationRules = js.native
  
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
  def rt(message: MessageFunction[VueMessageType], list: js.Array[Any], options: TranslateOptions[String]): String = js.native
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
    options: TranslateOptions[String]
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
  def rt(message: MessageFunction[VueMessageType], plural: Double, options: TranslateOptions[String]): String = js.native
  def rt(message: VueMessageType): String = js.native
  def rt(message: VueMessageType, list: js.Array[Any]): String = js.native
  def rt(message: VueMessageType, list: js.Array[Any], options: TranslateOptions[String]): String = js.native
  def rt(message: VueMessageType, named: NamedValue[js.Object]): String = js.native
  def rt(message: VueMessageType, named: NamedValue[js.Object], options: TranslateOptions[String]): String = js.native
  def rt(message: VueMessageType, plural: Double): String = js.native
  def rt(message: VueMessageType, plural: Double, options: TranslateOptions[String]): String = js.native
  /**
    * Resolve locale message translation
    *
    * @remarks
    * About details functions, See the {@link VueI18nResolveLocaleMessageTranslation}
    */
  @JSName("rt")
  var rt_Original: VueI18nResolveLocaleMessageTranslation[String] = js.native
  
  /**
    * Set datetime format
    *
    * @remarks
    * Set datetime format to VueI18n instance [datetimeFormats](legacy#datetimeformats).
    *
    * @param locale - A target locale
    * @param format - A target datetime format
    */
  def setDateTimeFormat[DateTimeSchema /* <: Record[String, Any] */, LocaleSchema /* <: String */, Locale /* <: PickupLocales[NonNullable[js.Object], /* keyof std.NonNullable<{}> */ String] */, FormatsType, Formats /* <: FormatsType */](locale: Locale | LocaleSchema, format: Formats): Unit = js.native
  /**
    * Set datetime format
    *
    * @remarks
    * Set datetime format to VueI18n instance [datetimeFormats](legacy#datetimeformats).
    *
    * @param locale - A target locale
    * @param format - A target datetime format
    */
  @JSName("setDateTimeFormat")
  var setDateTimeFormat_Original: js.Function2[
    /* locale */ String | (PickupLocales[NonNullable[js.Object], /* keyof std.NonNullable<{}> */ String]), 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<DateTimeSchema> extends true ? @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends true ? / * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {} : std.NonNullable<{}>[Locale] : DateTimeSchema */ /* format */ js.Any, 
    Unit
  ] = js.native
  
  /**
    * Set locale message
    *
    * @remarks
    * Set locale message to VueI18n instance [messages](legacy#messages).
    *
    * @param locale - A target locale
    * @param message - A message
    */
  def setLocaleMessage[MessageSchema /* <: LocaleMessage[VueMessageType] */, LocaleSchema /* <: String */, Locale /* <: PickupLocales[NonNullable[js.Object], /* keyof std.NonNullable<{}> */ String] */, MessageType, Message /* <: MessageType */](locale: Locale | LocaleSchema, message: Message): Unit = js.native
  /**
    * Set locale message
    *
    * @remarks
    * Set locale message to VueI18n instance [messages](legacy#messages).
    *
    * @param locale - A target locale
    * @param message - A message
    */
  @JSName("setLocaleMessage")
  var setLocaleMessage_Original: js.Function2[
    /* locale */ String | (PickupLocales[NonNullable[js.Object], /* keyof std.NonNullable<{}> */ String]), 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<MessageSchema> extends true ? @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends true ? @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> : std.NonNullable<{}>[Locale] : MessageSchema */ /* message */ js.Any, 
    Unit
  ] = js.native
  
  /**
    * Set number format
    *
    * @remarks
    * Set number format to VueI18n instance [numberFormats](legacy#numberFormats).
    *
    * @param locale - A target locale
    * @param format - A target number format
    */
  def setNumberFormat[NumberSchema /* <: Record[String, Any] */, LocaleSchema /* <: String */, Locale /* <: PickupLocales[NonNullable[js.Object], /* keyof std.NonNullable<{}> */ String] */, FormatsType, Formats /* <: FormatsType */](locale: Locale | LocaleSchema, format: Formats): Unit = js.native
  /**
    * Set number format
    *
    * @remarks
    * Set number format to VueI18n instance [numberFormats](legacy#numberFormats).
    *
    * @param locale - A target locale
    * @param format - A target number format
    */
  @JSName("setNumberFormat")
  var setNumberFormat_Original: js.Function2[
    /* locale */ String | (PickupLocales[NonNullable[js.Object], /* keyof std.NonNullable<{}> */ String]), 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<NumberSchema> extends true ? @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends true ? / * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {} : std.NonNullable<{}>[Locale] : NumberSchema */ /* format */ js.Any, 
    Unit
  ] = js.native
  
  /**
    * @remarks
    * Whether suppress fallback warnings when localization fails.
    */
  var silentFallbackWarn: Boolean | js.RegExp = js.native
  
  /**
    * @remarks
    * Whether suppress warnings outputted when localization fails.
    *
    * @VueI18nSee [Fallbacking](../guide/essentials/fallback)
    */
  var silentTranslationWarn: Boolean | js.RegExp = js.native
  
  /**
    * @remarks
    * Whether synchronize the root level locale to the component localization locale.
    *
    * @VueI18nSee [Local Scope](../guide/essentials/scope#local-scope-2)
    */
  var sync: Boolean = js.native
  
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
  def t[Key /* <: String */](key: Key, locale: Locale | String): TranslateResult = js.native
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
  def t[Key /* <: String */](key: Key, locale: Locale | String, list: js.Array[Any]): TranslateResult = js.native
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
  def t[Key /* <: String */](key: Key, locale: Locale | String, named: Record[String, Any]): TranslateResult = js.native
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
    js.Object, 
    String, 
    RemoveIndexSignature[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]} */ js.Any
    ], 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never : never */ js.Any
  ] = js.native
  @JSName("t")
  def t_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never : never */ js.Any
  ): TranslateResult = js.native
  @JSName("t")
  def t_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never : never */ js.Any,
    list: js.Array[Any]
  ): TranslateResult = js.native
  @JSName("t")
  def t_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never : never */ js.Any,
    locale: Locale | String
  ): TranslateResult = js.native
  @JSName("t")
  def t_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never : never */ js.Any,
    locale: Locale | String,
    list: js.Array[Any]
  ): TranslateResult = js.native
  @JSName("t")
  def t_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never : never */ js.Any,
    locale: Locale | String,
    named: Record[String, Any]
  ): TranslateResult = js.native
  @JSName("t")
  def t_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never : never */ js.Any,
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
  def tc[Key /* <: String */](key: Key, choice: Double, locale: Locale | String): TranslateResult = js.native
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
  def tc[Key /* <: String */](key: Key, locale: Locale | String): TranslateResult = js.native
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
    js.Object, 
    String, 
    RemoveIndexSignature[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]} */ js.Any
    ], 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never : never */ js.Any
  ] = js.native
  @JSName("tc")
  def tc_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never : never */ js.Any
  ): TranslateResult = js.native
  @JSName("tc")
  def tc_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never : never */ js.Any,
    choice: Double
  ): TranslateResult = js.native
  @JSName("tc")
  def tc_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never : never */ js.Any,
    choice: Double,
    list: js.Array[Any]
  ): TranslateResult = js.native
  @JSName("tc")
  def tc_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never : never */ js.Any,
    choice: Double,
    locale: Locale | String
  ): TranslateResult = js.native
  @JSName("tc")
  def tc_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never : never */ js.Any,
    choice: Double,
    named: Record[String, Any]
  ): TranslateResult = js.native
  @JSName("tc")
  def tc_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never : never */ js.Any,
    list: js.Array[Any]
  ): TranslateResult = js.native
  @JSName("tc")
  def tc_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never : never */ js.Any,
    locale: Locale | String
  ): TranslateResult = js.native
  @JSName("tc")
  def tc_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> : never : never */ js.Any,
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
  def te[Str /* <: String */, Key /* <: PickupKeys[js.Object, /* keyof {} */ String] */](key: Key | Str): Boolean = js.native
  def te[Str /* <: String */, Key /* <: PickupKeys[js.Object, /* keyof {} */ String] */](key: Key | Str, locale: String): Boolean = js.native
  
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
  def tm[Key /* <: String */, ResourceKeys /* <: PickupKeys[js.Object, /* keyof {} */ String] */, Locale /* <: PickupLocales[NonNullable[js.Object], /* keyof std.NonNullable<{}> */ String] */, Target, Return](key: Key | ResourceKeys): Return = js.native
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
  @JSName("tm")
  var tm_Original: js.Function1[
    /* key */ String | (PickupKeys[js.Object, /* keyof {} */ String]), 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}> extends @intlify/core-base.@intlify/core-base.ResourcePath<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? std.NonNullable<{}>[Locale] : @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> ? @intlify/core-base.@intlify/core-base.ResourceValue<@intlify/core-base.@intlify/core-base.IsEmptyObject<{}> extends false ? std.NonNullable<{}>[Locale] : @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>, @intlify/core-base.@intlify/core-base.PickupKeys<{}, keyof {}>> : std.Record<string, any> */ js.Any
  ] = js.native
  
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
