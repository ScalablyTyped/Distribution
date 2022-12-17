package typings.vueI18n.mod

import typings.intlifyCoreBase.mod.DateTimeFormats
import typings.intlifyCoreBase.mod.Locale
import typings.intlifyCoreBase.mod.LocaleMessages
import typings.intlifyCoreBase.mod.MessageResolver
import typings.intlifyCoreBase.mod.NumberFormats
import typings.intlifyCoreBase.mod.PickupLocales
import typings.std.NonNullable
import typings.vueI18n.anon.Datetime
import typings.vueI18n.anon.DatetimeFormats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VueI18nOptions[Schema /* <: Datetime */, Locales /* <: DatetimeFormats | String */, Options /* <: ComposerOptions[
Schema, 
Locales, 
/* import warning: importer.ImportType#apply Failed type conversion: Locales extends {  messages :infer M} ? M : Locales extends string ? Locales : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: Locales extends {  datetimeFormats :infer D} ? D : Locales extends string ? Locales : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: Locales extends {  numberFormats :infer N} ? N : Locales extends string ? Locales : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: Schema extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: Schema extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}> */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: Schema extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}> */ js.Any, 
LocaleMessages[
  /* import warning: importer.ImportType#apply Failed type conversion: Schema extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: Locales extends {  messages :infer M} ? M : Locales extends string ? Locales : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
  VueMessageType
], 
DateTimeFormats[
  /* import warning: importer.ImportType#apply Failed type conversion: Schema extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}> */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: Locales extends {  datetimeFormats :infer D} ? D : Locales extends string ? Locales : @intlify/core-base.@intlify/core-base.Locale */ js.Any
], 
NumberFormats[
  /* import warning: importer.ImportType#apply Failed type conversion: Schema extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}> */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: Locales extends {  numberFormats :infer N} ? N : Locales extends string ? Locales : @intlify/core-base.@intlify/core-base.Locale */ js.Any
]] */] extends StObject {
  
  /**
    * @remarks
    * The list of available locales in messages in lexical order.
    *
    * @defaultValue `[]`
    */
  var availableLocales: js.UndefOr[js.Array[Locale]] = js.undefined
  
  /**
    * @remarks
    * A handler for getting notified when component-local instance was created.
    *
    * The handler gets called with new and old (root) VueI18n instances.
    *
    * This handler is useful when extending the root VueI18n instance and wanting to also apply those extensions to component-local instance.
    *
    * @defaultValue `null`
    */
  var componentInstanceCreatedListener: js.UndefOr[ComponentInstanceCreatedListener] = js.undefined
  
  /**
    * @remarks
    * The datetime formats of localization.
    *
    * @VueI18nSee [Datetime Formatting](../guide/essentials/datetime)
    *
    * @defaultValue `{}`
    */
  var datetimeFormats: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: Options['datetimeFormats'] */ js.Any
  ] = js.undefined
  
  /**
    * @remarks
    * If `escapeParameterHtml` is configured as true then interpolation parameters are escaped before the message is translated.
    *
    * This is useful when translation output is used in `v-html` and the translation resource contains html markup (e.g. <b> around a user provided value).
    *
    * This usage pattern mostly occurs when passing precomputed text strings into UI components.
    *
    * The escape process involves replacing the following symbols with their respective HTML character entities: `<`, `>`, `"`, `'`.
    *
    * Setting `escapeParameterHtml` as true should not break existing functionality but provides a safeguard against a subtle type of XSS attack vectors.
    *
    * @VueI18nSee [HTML Message](../guide/essentials/syntax#html-message)
    *
    * @defaultValue `false`
    */
  var escapeParameterHtml: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: Options['escapeParameter'] */ js.Any
  ] = js.undefined
  
  /**
    * @remarks
    * The locale of fallback localization.
    *
    * For more complex fallback definitions see fallback.
    *
    * @VueI18nSee [Fallbacking](../guide/essentials/fallback)
    *
    * @defaultValue The default `'en-US'` for the `locale` if it's not specified, or it's `locale` value
    */
  var fallbackLocale: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: Options['fallbackLocale'] */ js.Any
  ] = js.undefined
  
  /**
    * @remarks
    * In the component localization, whether to fall back to root level (global scope) localization when localization fails.
    *
    * If `false`, it's not fallback to root.
    *
    * @VueI18nSee [Fallbacking](../guide/essentials/fallback)
    *
    * @defaultValue `true`
    */
  var fallbackRoot: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: Options['fallbackRoot'] */ js.Any
  ] = js.undefined
  
  /**
    * @remarks
    * Allow use flat json messages or not
    *
    * @defaultValue `false`
    */
  var flatJson: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: Options['flatJson'] */ js.Any
  ] = js.undefined
  
  /**
    * @remarks
    * Whether suppress warnings when falling back to either `fallbackLocale` or root.
    *
    * @VueI18nSee [Fallbacking](../guide/essentials/fallback)
    *
    * @defaultValue `false`
    */
  var formatFallbackMessages: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: Options['fallbackFormat'] */ js.Any
  ] = js.undefined
  
  /**
    * @remarks
    * The formatter that implemented with Formatter interface.
    *
    * @deprecated See the [here](../guide/migration/breaking#remove-custom-formatter)
    */
  var formatter: js.UndefOr[Formatter] = js.undefined
  
  /**
    * @remarks
    * The locale of localization.
    *
    * If the locale contains a territory and a dialect, this locale contains an implicit fallback.
    *
    * @VueI18nSee [Scope and Locale Changing](../guide/essentials/scope)
    *
    * @defaultValue `'en-US'`
    */
  var locale: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: Options['locale'] */ js.Any
  ] = js.undefined
  
  /**
    * @remarks
    * A message resolver to resolve [`messages`](legacy#messages).
    *
    * If not specified, the vue-i18n internal message resolver will be used by default.
    *
    * You need to implement a message resolver yourself that supports the following requirements:
    *
    * - Resolve the message using the locale message of [`locale`](legacy#locale) passed as the first argument of the message resolver, and the path passed as the second argument.
    *
    * - If the message could not be resolved, you need to return `null`.
    *
    * - If you will be returned `null`, the message resolver will also be called on fallback if [`fallbackLocale`](legacy#fallbacklocale-2) is enabled, so the message will need to be resolved as well.
    *
    * The message resolver is called indirectly by the following APIs:
    *
    * - [`t`](legacy#t-key)
    *
    * - [`tc`](legacy#tc-key)
    *
    * - [`te`](legacy#te-key-locale)
    *
    * - [`tm`](legacy#tm-key)
    *
    * - [Translation component](component#translation)
    *
    * @example
    * Here is an example of how to set it up using your `createI18n`:
    * ```js
    * import { createI18n } from 'vue-i18n'
    *
    * // your message resolver
    * function messageResolver(obj, path) {
    *   // simple message resolving!
    *   const msg = obj[path]
    *   return msg != null ? msg : null
    * }
    *
    * // call with I18n option
    * const i18n = createI18n({
    *   locale: 'ja',
    *   messageResolver, // set your message resolver
    *   messages: {
    *     en: { ... },
    *     ja: { ... }
    *   }
    * })
    *
    * // the below your something to do ...
    * // ...
    * ```
    *
    * @VueI18nTip
    * :new: v9.2+
    *
    * @VueI18nWarning
    * If you use the message resolver, the [`flatJson`](legacy#flatjson) setting will be ignored. That is, you need to resolve the flat JSON by yourself.
    *
    * @VueI18nSee [Fallbacking](../guide/essentials/fallback)
    *
    * @defaultValue `undefined`
    */
  var messageResolver: js.UndefOr[MessageResolver] = js.undefined
  
  /**
    * @remarks
    * The locale messages of localization.
    *
    * @VueI18nSee [Getting Started](../guide/)
    *
    * @defaultValue `{}`
    */
  var messages: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: Options['messages'] */ js.Any
  ] = js.undefined
  
  /**
    * @remarks
    * A handler for localization missing.
    *
    * The handler gets called with the localization target locale, localization path key, the Vue instance and values.
    *
    * If missing handler is assigned, and occurred localization missing, it's not warned.
    *
    * @defaultValue `null`
    */
  var missing: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: Options['missing'] */ js.Any
  ] = js.undefined
  
  /**
    * @remarks
    * Custom Modifiers for linked messages.
    *
    * @VueI18nSee [Custom Modifiers](../guide/essentials/syntax#custom-modifiers)
    */
  var modifiers: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: Options['modifiers'] */ js.Any
  ] = js.undefined
  
  /**
    * @remarks
    * The number formats of localization.
    *
    * @VueI18nSee [Number Formatting](../guide/essentials/number)
    *
    * @defaultValue `{}`
    */
  var numberFormats: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: Options['numberFormats'] */ js.Any
  ] = js.undefined
  
  /**
    * @remarks
    * A set of rules for word pluralization
    *
    * @VueI18nSee [Custom Pluralization](../guide/essentials/pluralization#custom-pluralization)
    *
    * @defaultValue `{}`
    */
  var pluralizationRules: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: Options['pluralRules'] */ js.Any
  ] = js.undefined
  
  /**
    * @remarks
    * A handler for post processing of translation. The handler gets after being called with the `$t`, `t`, `$tc`, and `tc`.
    *
    * This handler is useful if you want to filter on translated text such as space trimming.
    *
    * @defaultValue `null`
    */
  var postTranslation: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: Options['postTranslation'] */ js.Any
  ] = js.undefined
  
  /**
    * @remarks
    * Whether `v-t` directive's element should preserve `textContent` after directive is unbinded.
    *
    * @VueI18nSee [Custom Directive](../guide/advanced/directive)
    * @VueI18nSee [Remove `preserveDirectiveContent` option](../guide/migration/breaking#remove-preservedirectivecontent-option)
    *
    * @defaultValue `false`
    *
    * @deprecated The `v-t` directive for Vue 3 now preserves the default content. Therefore, this option and its properties have been removed from the VueI18n instance.
    */
  var preserveDirectiveContent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @remarks
    * The shared locale messages of localization for components. More detail see Component based localization.
    *
    * @VueI18nSee [Shared locale messages for components](../guide/essentials/local#shared-locale-messages-for-components)
    *
    * @defaultValue `undefined`
    */
  var sharedMessages: js.UndefOr[LocaleMessages[VueMessageType, Locale, String]] = js.undefined
  
  /**
    * @remarks
    * Whether do template interpolation on translation keys when your language lacks a translation for a key.
    *
    * If `true`, skip writing templates for your "base" language; the keys are your templates.
    *
    * @VueI18nSee [Fallbacking](../guide/essentials/fallback)
    *
    * @defaultValue `false`
    */
  var silentFallbackWarn: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: Options['fallbackWarn'] */ js.Any
  ] = js.undefined
  
  /**
    * @remarks
    * Whether suppress warnings outputted when localization fails.
    *
    * If `true`, suppress localization fail warnings.
    *
    * If you use regular expression, you can suppress localization fail warnings that it match with translation key (e.g. `t`).
    *
    * @VueI18nSee [Fallbacking](../guide/essentials/fallback)
    *
    * @defaultValue `false`
    */
  var silentTranslationWarn: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: Options['missingWarn'] */ js.Any
  ] = js.undefined
  
  /**
    * @remarks
    * Whether synchronize the root level locale to the component localization locale.
    *
    * If `false`, regardless of the root level locale, localize for each component locale.
    *
    * @VueI18nSee [Local Scope](../guide/essentials/scope#local-scope-2)
    *
    * @defaultValue `true`
    */
  var sync: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @remarks
    * Whether to allow the use locale messages of HTML formatting.
    *
    * See the warnHtmlInMessage property.
    *
    * @VueI18nSee [HTML Message](../guide/essentials/syntax#html-message)
    * @VueI18nSee [Change `warnHtmlInMessage` option default value](../guide/migration/breaking#change-warnhtmlinmessage-option-default-value)
    *
    * @defaultValue `'off'`
    */
  var warnHtmlInMessage: js.UndefOr[WarnHtmlInMessageLevel] = js.undefined
}
object VueI18nOptions {
  
  inline def apply[Schema /* <: Datetime */, Locales /* <: DatetimeFormats | String */, Options /* <: ComposerOptions[
    Schema, 
    Locales, 
    /* import warning: importer.ImportType#apply Failed type conversion: Locales extends {  messages :infer M} ? M : Locales extends string ? Locales : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: Locales extends {  datetimeFormats :infer D} ? D : Locales extends string ? Locales : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: Locales extends {  numberFormats :infer N} ? N : Locales extends string ? Locales : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: Schema extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: Schema extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: Schema extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {}> */ js.Any, 
    LocaleMessages[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Locales extends {  messages :infer M} ? M : Locales extends string ? Locales : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
      VueMessageType
    ], 
    DateTimeFormats[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Locales extends {  datetimeFormats :infer D} ? D : Locales extends string ? Locales : @intlify/core-base.@intlify/core-base.Locale */ js.Any
    ], 
    NumberFormats[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {}> */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Locales extends {  numberFormats :infer N} ? N : Locales extends string ? Locales : @intlify/core-base.@intlify/core-base.Locale */ js.Any
    ]
  ] */](): VueI18nOptions[Schema, Locales, Options] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VueI18nOptions[Schema, Locales, Options]]
  }
  
  extension [Self <: VueI18nOptions[?, ?, ?], Schema /* <: Datetime */, Locales /* <: DatetimeFormats | String */, Options /* <: ComposerOptions[
    Schema, 
    Locales, 
    /* import warning: importer.ImportType#apply Failed type conversion: Locales extends {  messages :infer M} ? M : Locales extends string ? Locales : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: Locales extends {  datetimeFormats :infer D} ? D : Locales extends string ? Locales : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: Locales extends {  numberFormats :infer N} ? N : Locales extends string ? Locales : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: Schema extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: Schema extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: Schema extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {}> */ js.Any, 
    LocaleMessages[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Locales extends {  messages :infer M} ? M : Locales extends string ? Locales : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
      VueMessageType
    ], 
    DateTimeFormats[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
  {}> */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Locales extends {  datetimeFormats :infer D} ? D : Locales extends string ? Locales : @intlify/core-base.@intlify/core-base.Locale */ js.Any
    ], 
    NumberFormats[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
  {}> */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Locales extends {  numberFormats :infer N} ? N : Locales extends string ? Locales : @intlify/core-base.@intlify/core-base.Locale */ js.Any
    ]
  ] */](x: Self & (VueI18nOptions[Schema, Locales, Options])) {
    
    inline def setAvailableLocales(value: js.Array[Locale]): Self = StObject.set(x, "availableLocales", value.asInstanceOf[js.Any])
    
    inline def setAvailableLocalesUndefined: Self = StObject.set(x, "availableLocales", js.undefined)
    
    inline def setAvailableLocalesVarargs(value: Locale*): Self = StObject.set(x, "availableLocales", js.Array(value*))
    
    inline def setComponentInstanceCreatedListener(
      value: (/* target */ VueI18n[
          Any, 
          js.Object, 
          js.Object, 
          Locale, 
          PickupLocales[NonNullable[Any] | js.Object, /* keyof std.NonNullable<any> */ String], 
          /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends string ? [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<any>, keyof std.NonNullable<any>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<any>, keyof std.NonNullable<any>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}> : @intlify/core-base.@intlify/core-base.Locale | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<any>, keyof std.NonNullable<any>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}> */ js.Any, 
          Composer[
            Any, 
            js.Object, 
            js.Object, 
            Locale, 
            PickupLocales[NonNullable[Any] | js.Object, /* keyof std.NonNullable<any> */ String], 
            /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends @intlify/core-base.@intlify/core-base.Locale ? [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<any>, keyof std.NonNullable<any>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<any>, keyof std.NonNullable<any>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}> : @intlify/core-base.@intlify/core-base.Locale | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<any>, keyof std.NonNullable<any>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}> */ js.Any
          ]
        ], /* global */ VueI18n[
          Any, 
          js.Object, 
          js.Object, 
          Locale, 
          PickupLocales[NonNullable[Any] | js.Object, /* keyof std.NonNullable<any> */ String], 
          /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends string ? [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<any>, keyof std.NonNullable<any>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<any>, keyof std.NonNullable<any>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}> : @intlify/core-base.@intlify/core-base.Locale | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<any>, keyof std.NonNullable<any>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}> */ js.Any, 
          Composer[
            Any, 
            js.Object, 
            js.Object, 
            Locale, 
            PickupLocales[NonNullable[Any] | js.Object, /* keyof std.NonNullable<any> */ String], 
            /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends @intlify/core-base.@intlify/core-base.Locale ? [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<any>, keyof std.NonNullable<any>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<any>, keyof std.NonNullable<any>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}> : @intlify/core-base.@intlify/core-base.Locale | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<any>, keyof std.NonNullable<any>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}> */ js.Any
          ]
        ]) => Unit
    ): Self = StObject.set(x, "componentInstanceCreatedListener", js.Any.fromFunction2(value))
    
    inline def setComponentInstanceCreatedListenerUndefined: Self = StObject.set(x, "componentInstanceCreatedListener", js.undefined)
    
    inline def setDatetimeFormats(
      value: /* import warning: importer.ImportType#apply Failed type conversion: Options['datetimeFormats'] */ js.Any
    ): Self = StObject.set(x, "datetimeFormats", value.asInstanceOf[js.Any])
    
    inline def setDatetimeFormatsUndefined: Self = StObject.set(x, "datetimeFormats", js.undefined)
    
    inline def setEscapeParameterHtml(
      value: /* import warning: importer.ImportType#apply Failed type conversion: Options['escapeParameter'] */ js.Any
    ): Self = StObject.set(x, "escapeParameterHtml", value.asInstanceOf[js.Any])
    
    inline def setEscapeParameterHtmlUndefined: Self = StObject.set(x, "escapeParameterHtml", js.undefined)
    
    inline def setFallbackLocale(
      value: /* import warning: importer.ImportType#apply Failed type conversion: Options['fallbackLocale'] */ js.Any
    ): Self = StObject.set(x, "fallbackLocale", value.asInstanceOf[js.Any])
    
    inline def setFallbackLocaleUndefined: Self = StObject.set(x, "fallbackLocale", js.undefined)
    
    inline def setFallbackRoot(
      value: /* import warning: importer.ImportType#apply Failed type conversion: Options['fallbackRoot'] */ js.Any
    ): Self = StObject.set(x, "fallbackRoot", value.asInstanceOf[js.Any])
    
    inline def setFallbackRootUndefined: Self = StObject.set(x, "fallbackRoot", js.undefined)
    
    inline def setFlatJson(
      value: /* import warning: importer.ImportType#apply Failed type conversion: Options['flatJson'] */ js.Any
    ): Self = StObject.set(x, "flatJson", value.asInstanceOf[js.Any])
    
    inline def setFlatJsonUndefined: Self = StObject.set(x, "flatJson", js.undefined)
    
    inline def setFormatFallbackMessages(
      value: /* import warning: importer.ImportType#apply Failed type conversion: Options['fallbackFormat'] */ js.Any
    ): Self = StObject.set(x, "formatFallbackMessages", value.asInstanceOf[js.Any])
    
    inline def setFormatFallbackMessagesUndefined: Self = StObject.set(x, "formatFallbackMessages", js.undefined)
    
    inline def setFormatter(value: Formatter): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setLocale(
      value: /* import warning: importer.ImportType#apply Failed type conversion: Options['locale'] */ js.Any
    ): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMessageResolver(value: MessageResolver): Self = StObject.set(x, "messageResolver", value.asInstanceOf[js.Any])
    
    inline def setMessageResolverUndefined: Self = StObject.set(x, "messageResolver", js.undefined)
    
    inline def setMessages(
      value: /* import warning: importer.ImportType#apply Failed type conversion: Options['messages'] */ js.Any
    ): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMissing(
      value: /* import warning: importer.ImportType#apply Failed type conversion: Options['missing'] */ js.Any
    ): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    
    inline def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
    
    inline def setModifiers(
      value: /* import warning: importer.ImportType#apply Failed type conversion: Options['modifiers'] */ js.Any
    ): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    inline def setNumberFormats(
      value: /* import warning: importer.ImportType#apply Failed type conversion: Options['numberFormats'] */ js.Any
    ): Self = StObject.set(x, "numberFormats", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatsUndefined: Self = StObject.set(x, "numberFormats", js.undefined)
    
    inline def setPluralizationRules(
      value: /* import warning: importer.ImportType#apply Failed type conversion: Options['pluralRules'] */ js.Any
    ): Self = StObject.set(x, "pluralizationRules", value.asInstanceOf[js.Any])
    
    inline def setPluralizationRulesUndefined: Self = StObject.set(x, "pluralizationRules", js.undefined)
    
    inline def setPostTranslation(
      value: /* import warning: importer.ImportType#apply Failed type conversion: Options['postTranslation'] */ js.Any
    ): Self = StObject.set(x, "postTranslation", value.asInstanceOf[js.Any])
    
    inline def setPostTranslationUndefined: Self = StObject.set(x, "postTranslation", js.undefined)
    
    inline def setPreserveDirectiveContent(value: Boolean): Self = StObject.set(x, "preserveDirectiveContent", value.asInstanceOf[js.Any])
    
    inline def setPreserveDirectiveContentUndefined: Self = StObject.set(x, "preserveDirectiveContent", js.undefined)
    
    inline def setSharedMessages(value: LocaleMessages[VueMessageType, Locale, String]): Self = StObject.set(x, "sharedMessages", value.asInstanceOf[js.Any])
    
    inline def setSharedMessagesUndefined: Self = StObject.set(x, "sharedMessages", js.undefined)
    
    inline def setSilentFallbackWarn(
      value: /* import warning: importer.ImportType#apply Failed type conversion: Options['fallbackWarn'] */ js.Any
    ): Self = StObject.set(x, "silentFallbackWarn", value.asInstanceOf[js.Any])
    
    inline def setSilentFallbackWarnUndefined: Self = StObject.set(x, "silentFallbackWarn", js.undefined)
    
    inline def setSilentTranslationWarn(
      value: /* import warning: importer.ImportType#apply Failed type conversion: Options['missingWarn'] */ js.Any
    ): Self = StObject.set(x, "silentTranslationWarn", value.asInstanceOf[js.Any])
    
    inline def setSilentTranslationWarnUndefined: Self = StObject.set(x, "silentTranslationWarn", js.undefined)
    
    inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    
    inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    
    inline def setWarnHtmlInMessage(value: WarnHtmlInMessageLevel): Self = StObject.set(x, "warnHtmlInMessage", value.asInstanceOf[js.Any])
    
    inline def setWarnHtmlInMessageUndefined: Self = StObject.set(x, "warnHtmlInMessage", js.undefined)
  }
}
