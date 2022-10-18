package typings.vueI18n.mod

import typings.intlifyCoreBase.mod.DateTimeOptions
import typings.intlifyCoreBase.mod.FallbackLocales
import typings.intlifyCoreBase.mod.LinkedModifiers
import typings.intlifyCoreBase.mod.LocaleMessage
import typings.intlifyCoreBase.mod.MessageFunction
import typings.intlifyCoreBase.mod.NamedValue
import typings.intlifyCoreBase.mod.NumberOptions
import typings.intlifyCoreBase.mod.PickupKeys
import typings.intlifyCoreBase.mod.PickupLocales
import typings.intlifyCoreBase.mod.PluralizationRules
import typings.intlifyCoreBase.mod.PostTranslationHandler
import typings.intlifyCoreBase.mod.RemoveIndexSignature
import typings.intlifyCoreBase.mod.TranslateOptions
import typings.std.NonNullable
import typings.std.Record
import typings.vueReactivity.mod.ComputedRef
import typings.vueReactivity.mod.WritableComputedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Composer[Messages, DateTimeFormats, NumberFormats, OptionLocale, ResourceLocales, Locales]
  extends StObject
     with ComposerCustom {
  
  /**
    * @remarks
    * The list of available locales in `messages` in lexical order.
    */
  val availableLocales: js.Array[Locales] = js.native
  
  def d(value: String): String = js.native
  def d(value: js.Date): String = js.native
  /**
    * Datetime formatting
    *
    * @remarks
    * If this is used in a reactive context, it will re-evaluate once the locale changes.
    *
    * If [UseI18nScope](general#usei18nscope) `'local'` or Some [UseI18nOptions](composition#usei18noptions) are specified at `useI18n`, it’s translated in preferentially local scope datetime formats than global scope datetime formats.
    *
    * If not, then it’s formatted with global scope datetime formats.
    *
    * @param value - A value, timestamp number or `Date` instance or ISO 8601 string
    *
    * @returns Formatted value
    *
    * @VueI18nSee [Datetime formatting](../guide/essentials/datetime)
    */
  /**
    * Datetime formatting
    *
    * @remarks
    * About details functions, See the {@link ComposerDateTimeFormatting}
    */
  def d(value: Double): String = js.native
  /**
    * Datetime formatting
    *
    * @remarks
    * About details functions, See the {@link ComposerDateTimeFormatting}
    */
  def d[Key /* <: String */](value: String, keyOrOptions: Key): String = js.native
  /**
    * Datetime formatting
    *
    * @remarks
    * About details functions, See the {@link ComposerDateTimeFormatting}
    */
  def d[Key /* <: String */](value: String, keyOrOptions: Key, locale: Locales): String = js.native
  /**
    * Datetime formatting
    *
    * @remarks
    * About details functions, See the {@link ComposerDateTimeFormatting}
    */
  def d[Key /* <: String */](value: js.Date, keyOrOptions: Key): String = js.native
  /**
    * Datetime formatting
    *
    * @remarks
    * About details functions, See the {@link ComposerDateTimeFormatting}
    */
  def d[Key /* <: String */](value: js.Date, keyOrOptions: Key, locale: Locales): String = js.native
  /**
    * Datetime formatting
    *
    * @remarks
    * Overloaded `d`. About details, see the [call signature](composition#value-number-date-string-string) details.
    *
    * In this overloaded `d`, format in datetime format for a key registered in datetime formats.
    *
    * @param value - A value, timestamp number or `Date` instance or ISO 8601 string
    * @param keyOrOptions - A key of datetime formats, or additional {@link DateTimeOptions | options} for datetime formatting
    *
    * @returns Formatted value
    */
  /**
    * Datetime formatting
    *
    * @remarks
    * About details functions, See the {@link ComposerDateTimeFormatting}
    */
  def d[Key /* <: String */](value: Double, keyOrOptions: Key): String = js.native
  /**
    * Datetime formatting
    *
    * @remarks
    * Overloaded `d`. About details, see the [call signature](composition#value-number-date-string-string) details.
    *
    * In this overloaded `d`, format in datetime format for a key registered in datetime formats at target locale
    *
    * @param value - A value, timestamp number or `Date` instance or ISO 8601 string
    * @param keyOrOptions - A key of datetime formats, or additional {@link DateTimeOptions | options} for datetime formatting
    * @param locale - A locale, it will be used over than global scope or local scope.
    *
    * @returns Formatted value
    */
  /**
    * Datetime formatting
    *
    * @remarks
    * About details functions, See the {@link ComposerDateTimeFormatting}
    */
  def d[Key /* <: String */](value: Double, keyOrOptions: Key, locale: Locales): String = js.native
  /**
    * Datetime formatting
    *
    * @remarks
    * About details functions, See the {@link ComposerDateTimeFormatting}
    */
  @JSName("d")
  var d_Original: ComposerDateTimeFormatting[
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
    value: String,
    keyOrOptions: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never : never */ js.Any
  ): String = js.native
  @JSName("d")
  def d_false[Key /* <: String */](
    value: String,
    keyOrOptions: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never : never */ js.Any,
    locale: Locales
  ): String = js.native
  @JSName("d")
  def d_false[Key /* <: String */](
    value: String,
    keyOrOptions: DateTimeOptions[
      Key | (/* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never : never */ js.Any), 
      Locales
    ]
  ): String = js.native
  @JSName("d")
  def d_false[Key /* <: String */](
    value: String,
    keyOrOptions: DateTimeOptions[
      Key | (/* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never : never */ js.Any), 
      Locales
    ],
    locale: Locales
  ): String = js.native
  @JSName("d")
  def d_false[Key /* <: String */](
    value: js.Date,
    keyOrOptions: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never : never */ js.Any
  ): String = js.native
  @JSName("d")
  def d_false[Key /* <: String */](
    value: js.Date,
    keyOrOptions: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never : never */ js.Any,
    locale: Locales
  ): String = js.native
  @JSName("d")
  def d_false[Key /* <: String */](
    value: js.Date,
    keyOrOptions: DateTimeOptions[
      Key | (/* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never : never */ js.Any), 
      Locales
    ]
  ): String = js.native
  @JSName("d")
  def d_false[Key /* <: String */](
    value: js.Date,
    keyOrOptions: DateTimeOptions[
      Key | (/* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never : never */ js.Any), 
      Locales
    ],
    locale: Locales
  ): String = js.native
  @JSName("d")
  def d_false[Key /* <: String */](
    value: Double,
    keyOrOptions: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never : never */ js.Any
  ): String = js.native
  @JSName("d")
  def d_false[Key /* <: String */](
    value: Double,
    keyOrOptions: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never : never */ js.Any,
    locale: Locales
  ): String = js.native
  @JSName("d")
  def d_false[Key /* <: String */](
    value: Double,
    keyOrOptions: DateTimeOptions[
      Key | (/* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never : never */ js.Any), 
      Locales
    ]
  ): String = js.native
  @JSName("d")
  def d_false[Key /* <: String */](
    value: Double,
    keyOrOptions: DateTimeOptions[
      Key | (/* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}>[K]} * /
  {}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<DateTimeFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<DateTimeFormats, keyof DateTimeFormats> : never : never */ js.Any), 
      Locales
    ],
    locale: Locales
  ): String = js.native
  
  /**
    * @remarks
    * The datetime formats of localization.
    *
    * @VueI18nSee [Datetime Formatting](../guide/essentials/datetime)
    */
  val datetimeFormats: ComputedRef[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof DateTimeFormats ]: DateTimeFormats[K]} */ js.Any
  ] = js.native
  
  /**
    * @remarks
    * Whether interpolation parameters are escaped before the message is translated.
    *
    * @VueI18nSee [HTML Message](../guide/essentials/syntax#html-message)
    */
  var escapeParameter: Boolean = js.native
  
  /**
    * @remarks
    * Whether suppress warnings when falling back to either `fallbackLocale` or root.
    *
    * @VueI18nSee [Fallbacking](../guide/essentials/fallback)
    */
  var fallbackFormat: Boolean = js.native
  
  /**
    * @remarks
    * The current fallback locales this Composer instance is using.
    *
    * @VueI18nSee [Fallbacking](../guide/essentials/fallback)
    */
  var fallbackLocale: WritableComputedRef[FallbackLocales[Locales]] = js.native
  
  /**
    * @remarks
    * Whether to fall back to root level (global scope) localization when localization fails.
    *
    * @VueI18nSee [Fallbacking](../guide/essentials/fallback)
    */
  var fallbackRoot: Boolean = js.native
  
  /**
    * @remarks
    * Whether suppress fall back warnings when localization fails.
    *
    * @VueI18nSee [Fallbacking](../guide/essentials/fallback)
    */
  var fallbackWarn: Boolean | js.RegExp = js.native
  
  /**
    * Get datetime format
    *
    * @remarks
    * get datetime format from Composer instance [datetimeFormats](composition#datetimeformats).
    *
    * @param locale - A target locale
    *
    * @typeParam DateTimeSchema - The datetime format schema, default `never`
    *
    * @returns Datetime format
    */
  def getDateTimeFormat[DateTimeSchema /* <: Record[String, Any] */, LocaleSchema /* <: String */, Locale /* <: PickupLocales[NonNullable[DateTimeFormats], /* keyof std.NonNullable<DateTimeFormats> */ String] */, Return](locale: Locale | LocaleSchema): Return = js.native
  
  /**
    * Get locale message
    *
    * @remarks
    * get locale message from Composer instance [messages](composition#messages).
    *
    * @param locale - A target locale
    *
    * @typeParam MessageSchema - The locale message schema, default `never`
    *
    * @returns Locale messages
    */
  def getLocaleMessage[MessageSchema /* <: LocaleMessage[VueMessageType] */, LocaleSchema /* <: String */, Locale /* <: PickupLocales[NonNullable[Messages], /* keyof std.NonNullable<Messages> */ String] */, Return](locale: Locale | LocaleSchema): Return = js.native
  
  /**
    * Get missing handler
    *
    * @returns {@link MissingHandler}
    *
    * @VueI18nSee [missing](composition#missing)
    */
  def getMissingHandler(): MissingHandler | Null = js.native
  
  /**
    * Get number format
    *
    * @remarks
    * get number format from Composer instance [numberFormats](composition#numberFormats).
    *
    * @param locale - A target locale
    *
    * @typeParam NumberSchema - The number format schema, default `never`
    *
    * @returns Number format
    */
  def getNumberFormat[NumberSchema /* <: Record[String, Any] */, LocaleSchema /* <: String */, Locale /* <: PickupLocales[NonNullable[NumberFormats], /* keyof std.NonNullable<NumberFormats> */ String] */, Return](locale: Locale | LocaleSchema): Return = js.native
  
  /**
    * Get post translation handler
    *
    * @returns {@link PostTranslationHandler}
    *
    * @VueI18nSee [missing](composition#posttranslation)
    */
  def getPostTranslationHandler(): PostTranslationHandler[VueMessageType] | Null = js.native
  
  /**
    * @remarks
    * Instance ID.
    */
  var id: Double = js.native
  
  /**
    * @remarks
    * Whether inherit the root level locale to the component localization locale.
    *
    * @VueI18nSee [Local Scope](../guide/essentials/scope#local-scope-2)
    */
  var inheritLocale: Boolean = js.native
  
  /**
    * @remarks
    * Whether this composer instance is global or not
    */
  val isGlobal: Boolean = js.native
  
  /**
    * @remarks
    * The current locale this Composer instance is using.
    *
    * If the locale contains a territory and a dialect, this locale contains an implicit fallback.
    *
    * @VueI18nSee [Scope and Locale Changing](../guide/essentials/scope)
    */
  var locale: WritableComputedRef[Locales] = js.native
  
  /**
    * Merge datetime format
    *
    * @remarks
    * Merge datetime format to Composer instance [datetimeFormats](composition#datetimeformats).
    *
    * @param locale - A target locale
    * @param format - A target datetime format
    *
    * @typeParam DateTimeSchema - The datetime format schema, default `never`
    */
  def mergeDateTimeFormat[DateTimeSchema /* <: Record[String, Any] */, LocaleSchema /* <: String */, Locale /* <: PickupLocales[NonNullable[DateTimeFormats], /* keyof std.NonNullable<DateTimeFormats> */ String] */, Formats](locale: Locale | LocaleSchema, format: Formats): Unit = js.native
  
  /**
    * Merge locale message
    *
    * @remarks
    * Merge locale message to Composer instance [messages](composition#messages).
    *
    * @param locale - A target locale
    * @param message - A message
    *
    * @typeParam MessageSchema - The locale message schema, default `never`
    */
  def mergeLocaleMessage[MessageSchema /* <: LocaleMessage[VueMessageType] */, LocaleSchema /* <: String */, Locale /* <: PickupLocales[NonNullable[Messages], /* keyof std.NonNullable<Messages> */ String] */, Message](locale: Locale | LocaleSchema, message: Message): Unit = js.native
  
  /**
    * Merge number format
    *
    * @remarks
    * Merge number format to Composer instance [numberFormats](composition#numberFormats).
    *
    * @param locale - A target locale
    * @param format - A target number format
    *
    * @typeParam NumberSchema - The number format schema, default `never`
    */
  def mergeNumberFormat[NumberSchema /* <: Record[String, Any] */, LocaleSchema /* <: String */, Locale /* <: PickupLocales[NonNullable[NumberFormats], /* keyof std.NonNullable<NumberFormats> */ String] */, Formats](locale: Locale | LocaleSchema, format: Formats): Unit = js.native
  
  /**
    * @remarks
    * The locale messages of localization.
    *
    * @VueI18nSee [Getting Started](../guide/)
    */
  val messages: ComputedRef[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Messages ]: Messages[K]} */ js.Any
  ] = js.native
  
  /**
    * @remarks
    * Whether suppress warnings outputted when localization fails.
    *
    * @VueI18nSee [Fallbacking](../guide/essentials/fallback)
    */
  var missingWarn: Boolean | js.RegExp = js.native
  
  /**
    * @remarks
    * Custom Modifiers for linked messages.
    *
    * @VueI18nSee [Custom Modifiers](../guide/essentials/syntax#custom-modifiers)
    */
  val modifiers: LinkedModifiers[VueMessageType] = js.native
  
  /**
    * Number Formatting
    *
    * @remarks
    * If this is used in a reactive context, it will re-evaluate once the locale changes.
    *
    * If [UseI18nScope](general#usei18nscope) `'local'` or Some [UseI18nOptions](composition#usei18noptions) are specified at `useI18n`, it’s translated in preferentially local scope datetime formats than global scope datetime formats.
    *
    * If not, then it’s formatted with global scope number formats.
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
    * About details functions, See the {@link ComposerNumberFormatting}
    */
  def n(value: Double): String = js.native
  /**
    * Number Formatting
    *
    * @remarks
    * Overloaded `n`. About details, see the [call signature](composition#value-number-string) details.
    *
    * In this overloaded `n`, format in number format for a key registered in number formats.
    *
    * @param value - A number value
    * @param keyOrOptions - A key of number formats, or additional {@link NumberOptions | options} for number formatting
    *
    * @returns Formatted value
    */
  /**
    * Number Formatting
    *
    * @remarks
    * About details functions, See the {@link ComposerNumberFormatting}
    */
  def n[Key /* <: String */](value: Double, keyOrOptions: Key): String = js.native
  /**
    * Number Formatting
    *
    * @remarks
    * Overloaded `n`. About details, see the [call signature](composition#value-number-string) details.
    *
    * In this overloaded `n`, format in number format for a key registered in number formats at target locale.
    *
    * @param value - A number value
    * @param keyOrOptions - A key of number formats, or additional {@link NumberOptions | options} for number formatting
    * @param locale - A locale, it will be used over than global scope or local scope.
    *
    * @returns Formatted value
    */
  /**
    * Number Formatting
    *
    * @remarks
    * About details functions, See the {@link ComposerNumberFormatting}
    */
  def n[Key /* <: String */](value: Double, keyOrOptions: Key, locale: Locales): String = js.native
  /**
    * Number Formatting
    *
    * @remarks
    * About details functions, See the {@link ComposerNumberFormatting}
    */
  @JSName("n")
  var n_Original: ComposerNumberFormatting[
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
    keyOrOptions: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}>[K]} * /
  {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<NumberFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<NumberFormats, keyof NumberFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}>[K]} * /
  {}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<NumberFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<NumberFormats, keyof NumberFormats> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}>[K]} * /
  {}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<NumberFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<NumberFormats, keyof NumberFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<NumberFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<NumberFormats, keyof NumberFormats> : never : never */ js.Any
  ): String = js.native
  @JSName("n")
  def n_false[Key /* <: String */](
    value: Double,
    keyOrOptions: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}>[K]} * /
  {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<NumberFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<NumberFormats, keyof NumberFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}>[K]} * /
  {}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<NumberFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<NumberFormats, keyof NumberFormats> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}>[K]} * /
  {}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<NumberFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<NumberFormats, keyof NumberFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<NumberFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<NumberFormats, keyof NumberFormats> : never : never */ js.Any,
    locale: Locales
  ): String = js.native
  @JSName("n")
  def n_false[Key /* <: String */](
    value: Double,
    keyOrOptions: NumberOptions[
      Key | (/* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}>[K]} * /
  {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<NumberFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<NumberFormats, keyof NumberFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}>[K]} * /
  {}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<NumberFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<NumberFormats, keyof NumberFormats> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}>[K]} * /
  {}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<NumberFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<NumberFormats, keyof NumberFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<NumberFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<NumberFormats, keyof NumberFormats> : never : never */ js.Any), 
      Locales
    ]
  ): String = js.native
  @JSName("n")
  def n_false[Key /* <: String */](
    value: Double,
    keyOrOptions: NumberOptions[
      Key | (/* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}>[K]} * /
  {}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<NumberFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<NumberFormats, keyof NumberFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}>[K]} * /
  {}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<NumberFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<NumberFormats, keyof NumberFormats> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {}> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatPathKeys</ * Inlined {[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}>[K]} * /
  {}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<NumberFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<NumberFormats, keyof NumberFormats> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<NumberFormats> extends false ? @intlify/core-base.@intlify/core-base.PickupFormatKeys<NumberFormats, keyof NumberFormats> : never : never */ js.Any), 
      Locales
    ],
    locale: Locales
  ): String = js.native
  
  /**
    * @remarks
    * The number formats of localization.
    *
    * @VueI18nSee [Number Formatting](../guide/essentials/number)
    */
  val numberFormats: ComputedRef[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof NumberFormats ]: NumberFormats[K]} */ js.Any
  ] = js.native
  
  /**
    * @remarks
    * A set of rules for word pluralization
    *
    * @VueI18nSee [Custom Pluralization](../guide/essentials/pluralization#custom-pluralization)
    */
  val pluralRules: PluralizationRules = js.native
  
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
    * About details functions, See the {@link ComposerResolveLocaleMessageTranslation}
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
    * About details functions, See the {@link ComposerResolveLocaleMessageTranslation}
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
    * About details functions, See the {@link ComposerResolveLocaleMessageTranslation}
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
    * About details functions, See the {@link ComposerResolveLocaleMessageTranslation}
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
    * About details functions, See the {@link ComposerResolveLocaleMessageTranslation}
    */
  @JSName("rt")
  var rt_Original: ComposerResolveLocaleMessageTranslation[Locales] = js.native
  
  /**
    * Set datetime format
    *
    * @remarks
    * Set datetime format to Composer instance [datetimeFormats](composition#datetimeformats).
    *
    * @param locale - A target locale
    * @param format - A target datetime format
    *
    * @typeParam DateTimeSchema - The datetime format schema, default `never`
    */
  def setDateTimeFormat[DateTimeSchema /* <: Record[String, Any] */, LocaleSchema /* <: String */, Locale /* <: PickupLocales[NonNullable[DateTimeFormats], /* keyof std.NonNullable<DateTimeFormats> */ String] */, FormatsType, Formats /* <: FormatsType */](locale: Locale | LocaleSchema, format: Formats): Unit = js.native
  
  /**
    * Set locale message
    *
    * @remarks
    * Set locale message to Composer instance [messages](composition#messages).
    *
    * @param locale - A target locale
    * @param message - A message
    *
    * @typeParam MessageSchema - The locale message schema, default `never`
    */
  def setLocaleMessage[MessageSchema /* <: LocaleMessage[VueMessageType] */, LocaleSchema /* <: String */, Locale /* <: PickupLocales[NonNullable[Messages], /* keyof std.NonNullable<Messages> */ String] */, MessageType, Message /* <: MessageType */](locale: Locale | LocaleSchema, message: Message): Unit = js.native
  
  /**
    * Set missing handler
    *
    * @param handler - A {@link MissingHandler}
    *
    * @VueI18nSee [missing](composition#missing)
    */
  def setMissingHandler(): Unit = js.native
  def setMissingHandler(handler: MissingHandler): Unit = js.native
  
  /**
    * Set number format
    *
    * @remarks
    * Set number format to Composer instance [numberFormats](composition#numberFormats).
    *
    * @param locale - A target locale
    * @param format - A target number format
    *
    * @typeParam NumberSchema - The number format schema, default `never`
    */
  def setNumberFormat[NumberSchema /* <: Record[String, Any] */, LocaleSchema /* <: String */, Locale /* <: PickupLocales[NonNullable[NumberFormats], /* keyof std.NonNullable<NumberFormats> */ String] */, FormatsType, Formats /* <: FormatsType */](locale: Locale | LocaleSchema, format: Formats): Unit = js.native
  
  /**
    * Set post translation handler
    *
    * @param handler - A {@link PostTranslationHandler}
    *
    * @VueI18nSee [missing](composition#posttranslation)
    */
  def setPostTranslationHandler(): Unit = js.native
  def setPostTranslationHandler(handler: PostTranslationHandler[VueMessageType]): Unit = js.native
  
  /**
    * Locale message translation
    *
    * @remarks
    * If this is used in a reactive context, it will re-evaluate once the locale changes.
    *
    * If [UseI18nScope](general#usei18nscope) `'local'` or Some [UseI18nOptions](composition#usei18noptions) are specified at `useI18n`, it’s translated in preferentially local scope locale messages than global scope locale messages.
    *
    * If not, then it’s translated with global scope locale messages.
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
    * About details functions, See the {@link ComposerTranslation}
    */
  def t[Key /* <: String */](key: Key): String = js.native
  /**
    * Locale message translation for missing default message
    *
    * @remarks
    * Overloaded `t`. About details, see the [call signature](composition#key-key-resourcekeys-number-string) details.
    *
    * In this overloaded `t`, if no translation was found, return a default message.
    *
    * You can also suppress the warning, when the translation missing according to the options.
    *
    * About details of options, see the {@link TranslateOptions}.
    *
    * @param key - A target locale message key
    * @param defaultMsg - A default message to return if no translation was found
    * @param options - Additional {@link TranslateOptions | options} for translation
    *
    * @returns Translated message
    */
  /**
    * Locale message translation
    *
    * @remarks
    * About details functions, See the {@link ComposerTranslation}
    */
  def t[Key /* <: String */](key: Key, defaultMsg: String): String = js.native
  def t[Key /* <: String */](key: Key, defaultMsg: String, options: TranslateOptions[Locales]): String = js.native
  /**
    * Locale message translation for list interpolations
    *
    * @remarks
    * Overloaded `t`. About details, see the [call signature](composition#key-key-resourcekeys-number-string) details.
    *
    * In this overloaded `t`, the locale messages should contain a `{0}`, `{1}`, … for each placeholder in the list.
    *
    * You can also suppress the warning, when the translation missing according to the options.
    *
    * About details of options, see the {@link TranslateOptions}.
    *
    * @param key - A target locale message key
    * @param list - A values of list interpolation
    * @param options - Additional {@link TranslateOptions | options} for translation
    *
    * @returns Translated message
    *
    * @VueI18nSee [List interpolation](../guide/essentials/syntax#list-interpolation)
    */
  /**
    * Locale message translation
    *
    * @remarks
    * About details functions, See the {@link ComposerTranslation}
    */
  def t[Key /* <: String */](key: Key, list: js.Array[Any]): String = js.native
  /**
    * Locale message translation for list interpolations and missing default message
    *
    * @remarks
    * Overloaded `t`. About details, see the [call signature](composition#key-key-resourcekeys-number-string) details.
    *
    * In this overloaded `t`, the locale messages should contain a `{0}`, `{1}`, … for each placeholder in the list, and if no translation was found, return a default message.
    *
    * @param key - A target locale message key
    * @param list - A values of list interpolation
    * @param defaultMsg - A default message to return if no translation was found
    *
    * @returns Translated message
    *
    * @VueI18nSee [List interpolation](../guide/essentials/syntax#list-interpolation)
    */
  /**
    * Locale message translation
    *
    * @remarks
    * About details functions, See the {@link ComposerTranslation}
    */
  def t[Key /* <: String */](key: Key, list: js.Array[Any], defaultMsg: String): String = js.native
  def t[Key /* <: String */](key: Key, list: js.Array[Any], options: TranslateOptions[Locales]): String = js.native
  /**
    * Locale message translation for list interpolations and plurals
    *
    * @remarks
    * Overloaded `t`. About details, see the [call signature](composition#key-key-resourcekeys-number-string) details.
    *
    * In this overloaded `t`, the locale messages should contain a `{0}`, `{1}`, … for each placeholder in the list, and return a pluralized translation message.
    *
    * @param key - A target locale message key
    * @param list - A values of list interpolation
    * @param plural - Which plural string to get. 1 returns the first one.
    *
    * @returns Translated message
    *
    * @VueI18nSee [Pluralization](../guide/essentials/pluralization)
    * @VueI18nSee [List interpolation](../guide/essentials/syntax#list-interpolation)
    */
  /**
    * Locale message translation
    *
    * @remarks
    * About details functions, See the {@link ComposerTranslation}
    */
  def t[Key /* <: String */](key: Key, list: js.Array[Any], plural: Double): String = js.native
  /**
    * Locale message translation for named interpolations
    *
    * @remarks
    * Overloaded `t`. About details, see the [call signature](composition#key-key-resourcekeys-number-string) details.
    *
    * In this overloaded `t`, for each placeholder x, the locale messages should contain a `{x}` token.
    *
    * You can also suppress the warning, when the translation missing according to the options.
    *
    * About details of options, see the {@link TranslateOptions}.
    *
    * @param key - A target locale message key
    * @param named - A values of named interpolation
    * @param options - Additional {@link TranslateOptions | options} for translation
    *
    * @returns Translated message
    *
    * @VueI18nSee [Named interpolation](../guide/essentials/syntax#named-interpolation)
    */
  /**
    * Locale message translation
    *
    * @remarks
    * About details functions, See the {@link ComposerTranslation}
    */
  def t[Key /* <: String */](key: Key, named: NamedValue[js.Object]): String = js.native
  /**
    * Locale message translation for named interpolations and plurals
    *
    * @remarks
    * Overloaded `t`. About details, see the [call signature](composition#key-key-resourcekeys-number-string) details.
    *
    * In this overloaded `t`, for each placeholder x, the locale messages should contain a `{x}` token, and if no translation was found, return a default message.
    *
    * @param key - A target locale message key
    * @param named - A values of named interpolation
    * @param defaultMsg - A default message to return if no translation was found
    *
    * @returns Translated message
    *
    * @VueI18nSee [Named interpolation](../guide/essentials/syntax#named-interpolation)
    */
  /**
    * Locale message translation
    *
    * @remarks
    * About details functions, See the {@link ComposerTranslation}
    */
  def t[Key /* <: String */](key: Key, named: NamedValue[js.Object], defaultMsg: String): String = js.native
  def t[Key /* <: String */](key: Key, named: NamedValue[js.Object], options: TranslateOptions[Locales]): String = js.native
  /**
    * Locale message translation for named interpolations and plurals
    *
    * @remarks
    * Overloaded `t`. About details, see the [call signature](composition#key-key-resourcekeys-number-string) details.
    *
    * In this overloaded `t`, for each placeholder x, the locale messages should contain a `{x}` token, and return a pluralized translation message.
    *
    * @param key - A target locale message key
    * @param named - A values of named interpolation
    * @param plural - Which plural string to get. 1 returns the first one.
    *
    * @returns Translated message
    *
    * @VueI18nSee [Pluralization](../guide/essentials/pluralization)
    * @VueI18nSee [Named interpolation](../guide/essentials/syntax#named-interpolation)
    */
  /**
    * Locale message translation
    *
    * @remarks
    * About details functions, See the {@link ComposerTranslation}
    */
  def t[Key /* <: String */](key: Key, named: NamedValue[js.Object], plural: Double): String = js.native
  /**
    * Locale message translation for plurals
    *
    * @remarks
    * Overloaded `t`. About details, see the [call signature](composition#key-key-resourcekeys-number-string) details.
    *
    * In this overloaded `t`, return a pluralized translation message.
    *
    * You can also suppress the warning, when the translation missing according to the options.
    *
    * About details of options, see the {@link TranslateOptions}.
    *
    * @param key - A target locale message key
    * @param plural - Which plural string to get. 1 returns the first one.
    * @param options - Additional {@link TranslateOptions | options} for translation
    *
    * @returns Translated message
    *
    * @VueI18nSee [Pluralization](../guide/essentials/pluralization)
    */
  /**
    * Locale message translation
    *
    * @remarks
    * About details functions, See the {@link ComposerTranslation}
    */
  def t[Key /* <: String */](key: Key, plural: Double): String = js.native
  def t[Key /* <: String */](key: Key, plural: Double, options: TranslateOptions[Locales]): String = js.native
  def t[Key /* <: String */](key: Double): String = js.native
  def t[Key /* <: String */](key: Double, defaultMsg: String): String = js.native
  def t[Key /* <: String */](key: Double, defaultMsg: String, options: TranslateOptions[Locales]): String = js.native
  def t[Key /* <: String */](key: Double, list: js.Array[Any]): String = js.native
  def t[Key /* <: String */](key: Double, list: js.Array[Any], defaultMsg: String): String = js.native
  def t[Key /* <: String */](key: Double, list: js.Array[Any], options: TranslateOptions[Locales]): String = js.native
  def t[Key /* <: String */](key: Double, list: js.Array[Any], plural: Double): String = js.native
  def t[Key /* <: String */](key: Double, named: NamedValue[js.Object]): String = js.native
  def t[Key /* <: String */](key: Double, named: NamedValue[js.Object], defaultMsg: String): String = js.native
  def t[Key /* <: String */](key: Double, named: NamedValue[js.Object], options: TranslateOptions[Locales]): String = js.native
  def t[Key /* <: String */](key: Double, named: NamedValue[js.Object], plural: Double): String = js.native
  def t[Key /* <: String */](key: Double, plural: Double): String = js.native
  def t[Key /* <: String */](key: Double, plural: Double, options: TranslateOptions[Locales]): String = js.native
  /**
    * Locale message translation
    *
    * @remarks
    * About details functions, See the {@link ComposerTranslation}
    */
  @JSName("t")
  var t_Original: ComposerTranslation[
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
  ): String = js.native
  @JSName("t")
  def t_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : never */ js.Any,
    defaultMsg: String
  ): String = js.native
  @JSName("t")
  def t_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : never */ js.Any,
    defaultMsg: String,
    options: TranslateOptions[Locales]
  ): String = js.native
  @JSName("t")
  def t_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : never */ js.Any,
    list: js.Array[Any]
  ): String = js.native
  @JSName("t")
  def t_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : never */ js.Any,
    list: js.Array[Any],
    defaultMsg: String
  ): String = js.native
  @JSName("t")
  def t_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : never */ js.Any,
    list: js.Array[Any],
    options: TranslateOptions[Locales]
  ): String = js.native
  @JSName("t")
  def t_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : never */ js.Any,
    list: js.Array[Any],
    plural: Double
  ): String = js.native
  @JSName("t")
  def t_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : never */ js.Any,
    named: NamedValue[js.Object]
  ): String = js.native
  @JSName("t")
  def t_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : never */ js.Any,
    named: NamedValue[js.Object],
    defaultMsg: String
  ): String = js.native
  @JSName("t")
  def t_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : never */ js.Any,
    named: NamedValue[js.Object],
    options: TranslateOptions[Locales]
  ): String = js.native
  @JSName("t")
  def t_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : never */ js.Any,
    named: NamedValue[js.Object],
    plural: Double
  ): String = js.native
  @JSName("t")
  def t_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : never */ js.Any,
    plural: Double
  ): String = js.native
  @JSName("t")
  def t_false[Key /* <: String */](
    key: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never> extends false ? @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never | @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : @intlify/core-base.@intlify/core-base.IsEmptyObject<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> extends false ? @intlify/core-base.@intlify/core-base.PickupPaths<{[ K in keyof @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}> ]: @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>[K]}> : never : @intlify/core-base.@intlify/core-base.IsNever<@intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never> extends false ? @intlify/core-base.@intlify/core-base.IsEmptyObject<Messages> extends false ? @intlify/core-base.@intlify/core-base.PickupKeys<Messages, keyof Messages> : never : never */ js.Any,
    plural: Double,
    options: TranslateOptions[Locales]
  ): String = js.native
  
  /**
    * Translation locale message exist
    *
    * @remarks
    * whether do exist locale message on Composer instance [messages](composition#messages).
    *
    * If you specified `locale`, check the locale messages of `locale`.
    *
    * @param key - A target locale message key
    * @param locale - A locale, it will be used over than global scope or local scope
    *
    * @returns If found locale message, `true`, else `false`
    */
  def te[Str /* <: String */, Key /* <: PickupKeys[Messages, /* keyof Messages */ String] */](key: Key | Str): Boolean = js.native
  def te[Str /* <: String */, Key /* <: PickupKeys[Messages, /* keyof Messages */ String] */](key: Key | Str, locale: Locales): Boolean = js.native
  
  /**
    * Locale messages getter
    *
    * @remarks
    * If [UseI18nScope](general#usei18nscope) `'local'` or Some [UseI18nOptions](composition#usei18noptions) are specified at `useI18n`, it’s translated in preferentially local scope locale messages than global scope locale messages.
    *
    * Based on the current `locale`, locale messages will be returned from Composer instance messages.
    *
    * If you change the `locale`, the locale messages returned will also correspond to the locale.
    *
    * If there are no locale messages for the given `key` in the composer instance messages, they will be returned with [fallbacking](../guide/essentials/fallback).
    *
    * @VueI18nWarning
    * You need to use `rt` for the locale message returned by `tm`. see the [rt](composition#rt-message) details.
    *
    * @example
    * template block:
    * ```html
    * <div class="container">
    *   <template v-for="content in tm('contents')">
    *     <h2>{{ rt(content.title) }}</h2>
    *     <p v-for="paragraph in content.paragraphs">
    *      {{ rt(paragraph) }}
    *     </p>
    *   </template>
    * </div>
    * ```
    * script block:
    * ```js
    * import { defineComponent } from 'vue
    * import { useI18n } from 'vue-i18n'
    *
    * export default defineComponent({
    *   setup() {
    *     const { rt, tm } = useI18n({
    *       messages: {
    *         en: {
    *           contents: [
    *             {
    *               title: 'Title1',
    *               // ...
    *               paragraphs: [
    *                 // ...
    *               ]
    *             }
    *           ]
    *         }
    *       }
    *       // ...
    *     })
    *     // ...
    *     return { ... , rt, tm }
    *   }
    * })
    * ```
    *
    * @param key - A target locale message key
    *
    * @return Locale messages
    */
  def tm[Key /* <: String */, ResourceKeys /* <: PickupKeys[Messages, /* keyof Messages */ String] */, Locale /* <: PickupLocales[NonNullable[Messages], /* keyof std.NonNullable<Messages> */ String] */, Target, Return](key: Key | ResourceKeys): Return = js.native
  
  /**
    * @remarks
    * Whether to allow the use locale messages of HTML formatting.
    *
    * If you set `false`, will check the locale messages on the Composer instance.
    *
    * If you are specified `true`, a warning will be output at console.
    *
    * @VueI18nSee [HTML Message](../guide/essentials/syntax#html-message)
    * @VueI18nSee [Change `warnHtmlInMessage` option default value](../guide/migration/breaking#change-warnhtmlinmessage-option-default-value)
    */
  var warnHtmlMessage: Boolean = js.native
}
