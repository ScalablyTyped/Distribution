package typings.vueI18n.mod

import typings.intlifyCoreBase.mod.DateTimeFormats
import typings.intlifyCoreBase.mod.FallbackLocale
import typings.intlifyCoreBase.mod.LinkedModifiers
import typings.intlifyCoreBase.mod.Locale
import typings.intlifyCoreBase.mod.LocaleMessages
import typings.intlifyCoreBase.mod.MessageResolver
import typings.intlifyCoreBase.mod.MessageType
import typings.intlifyCoreBase.mod.NumberFormats
import typings.intlifyCoreBase.mod.Path
import typings.intlifyCoreBase.mod.PluralizationRules
import typings.intlifyCoreBase.mod.PostTranslationHandler
import typings.vueI18n.anon.Datetime
import typings.vueI18n.anon.DatetimeFormats
import typings.vueRuntimeCore.mod.ComponentInternalInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComposerOptions[Schema /* <: Datetime */, Locales /* <: DatetimeFormats | String */, MessagesLocales, DateTimeFormatsLocales, NumberFormatsLocales, MessageSchema, DateTimeSchema, NumberSchema, _Messages /* <: LocaleMessages[MessageSchema, MessagesLocales, VueMessageType] */, _DateTimeFormats /* <: DateTimeFormats[DateTimeSchema, DateTimeFormatsLocales] */, _NumberFormats /* <: NumberFormats[NumberSchema, NumberFormatsLocales] */] extends StObject {
  
  /**
    * @remarks
    * The datetime formats of localization.
    *
    * @VueI18nSee [Datetime Formatting](../guide/essentials/datetime)
    *
    * @defaultValue `{}`
    */
  var datetimeFormats: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof _DateTimeFormats ]: DateTimeSchema} */ js.Any
  ] = js.undefined
  
  /**
    * @remarks
    * If `escapeParameter` is configured as true then interpolation parameters are escaped before the message is translated.
    *
    * This is useful when translation output is used in `v-html` and the translation resource contains html markup (e.g. <b> around a user provided value).
    *
    * This usage pattern mostly occurs when passing precomputed text strings into UI components.
    *
    * The escape process involves replacing the following symbols with their respective HTML character entities: `<`, `>`, `"`, `'`.
    *
    * Setting `escapeParameter` as true should not break existing functionality but provides a safeguard against a subtle type of XSS attack vectors.
    *
    * @VueI18nSee [HTML Message](../guide/essentials/syntax#html-message)
    *
    * @defaultValue `false`
    */
  var escapeParameter: js.UndefOr[Boolean] = js.undefined
  
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
  var fallbackFormat: js.UndefOr[Boolean] = js.undefined
  
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
  var fallbackLocale: js.UndefOr[FallbackLocale] = js.undefined
  
  /**
    * @remarks
    * In the component localization, whether to fallback to root level (global scope) localization when localization fails.
    *
    * If `false`, it's not fallback to root.
    *
    * @VueI18nSee [Fallbacking](../guide/essentials/fallback)
    *
    * @defaultValue `true`
    */
  var fallbackRoot: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @remarks
    * Whether suppress warnings when falling back to either `fallbackLocale` or root.
    *
    * If `false`, suppress fall back warnings.
    *
    * If you use regular expression, you can suppress fallback warnings that it match with translation key (e.g. `t`).
    *
    * @VueI18nSee [Fallbacking](../guide/essentials/fallback)
    *
    * @defaultValue `true`
    */
  var fallbackWarn: js.UndefOr[Boolean | js.RegExp] = js.undefined
  
  /**
    * @remarks
    * Allow use flat json messages or not
    *
    * @defaultValue `false`
    */
  var flatJson: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @remarks
    * Whether inheritance the root level locale to the component localization locale.
    *
    * If `false`, regardless of the root level locale, localize for each component locale.
    *
    * @VueI18nSee [Local Scope](../guide/essentials/scope#local-scope-2)
    *
    * @defaultValue `true`
    */
  var inheritLocale: js.UndefOr[Boolean] = js.undefined
  
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
  var locale: js.UndefOr[Locale] = js.undefined
  
  /**
    * @remarks
    * A message resolver to resolve [`messages`](composition#messages).
    *
    * If not specified, the vue-i18n internal message resolver will be used by default.
    *
    * You need to implement a message resolver yourself that supports the following requirements:
    *
    * - Resolve the message using the locale message of [`locale`](composition#locale) passed as the first argument of the message resolver, and the path passed as the second argument.
    *
    * - If the message could not be resolved, you need to return `null`.
    *
    * - If you will be returned `null`, the message resolver will also be called on fallback if [`fallbackLocale`](composition#fallbacklocale-2) is enabled, so the message will need to be resolved as well.
    *
    * The message resolver is called indirectly by the following APIs:
    *
    * - [`t`](composition#t-key)
    *
    * - [`te`](composition#te-key-locale)
    *
    * - [`tm`](composition#tm-key)
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
    *   legacy: false,
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
    * If you use the message resolver, the [`flatJson`](composition#flatjson) setting will be ignored. That is, you need to resolve the flat JSON by yourself.
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
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof _Messages ]: MessageSchema} */ js.Any
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
  var missing: js.UndefOr[MissingHandler] = js.undefined
  
  /**
    * @remarks
    * Whether suppress warnings outputted when localization fails.
    *
    * If `false`, suppress localization fail warnings.
    *
    * If you use regular expression, you can suppress localization fail warnings that it match with translation key (e.g. `t`).
    *
    * @VueI18nSee [Fallbacking](../guide/essentials/fallback)
    *
    * @defaultValue `true`
    */
  var missingWarn: js.UndefOr[Boolean | js.RegExp] = js.undefined
  
  /**
    * @remarks
    * Custom Modifiers for linked messages.
    *
    * @VueI18nSee [Custom Modifiers](../guide/essentials/syntax#custom-modifiers)
    */
  var modifiers: js.UndefOr[LinkedModifiers[VueMessageType]] = js.undefined
  
  /**
    * @remarks
    * The number formats of localization.
    *
    * @VueI18nSee [Number Formatting](../guide/essentials/number)
    *
    * @defaultValue `{}`
    */
  var numberFormats: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof _NumberFormats ]: NumberSchema} */ js.Any
  ] = js.undefined
  
  /**
    * @remarks
    * A set of rules for word pluralization
    *
    * @VueI18nSee [Custom Pluralization](../guide/essentials/pluralization#custom-pluralization)
    *
    * @defaultValue `{}`
    */
  var pluralRules: js.UndefOr[PluralizationRules] = js.undefined
  
  /**
    * @remarks
    * A handler for post processing of translation.
    *
    * The handler gets after being called with the `t`.
    *
    * This handler is useful if you want to filter on translated text such as space trimming.
    *
    * @defaultValue `null`
    */
  var postTranslation: js.UndefOr[PostTranslationHandler[VueMessageType]] = js.undefined
  
  /**
    * @remarks
    * Whether to allow the use locale messages of HTML formatting.
    *
    * See the warnHtmlMessage property.
    *
    * @VueI18nSee [HTML Message](../guide/essentials/syntax#html-message)
    * @VueI18nSee [Change `warnHtmlInMessage` option default value](../guide/migration/breaking#change-warnhtmlinmessage-option-default-value)
    *
    * @defaultValue `'off'`
    */
  var warnHtmlMessage: js.UndefOr[Boolean] = js.undefined
}
object ComposerOptions {
  
  inline def apply[Schema /* <: Datetime */, Locales /* <: DatetimeFormats | String */, MessagesLocales, DateTimeFormatsLocales, NumberFormatsLocales, MessageSchema, DateTimeSchema, NumberSchema, _Messages /* <: LocaleMessages[MessageSchema, MessagesLocales, VueMessageType] */, _DateTimeFormats /* <: DateTimeFormats[DateTimeSchema, DateTimeFormatsLocales] */, _NumberFormats /* <: NumberFormats[NumberSchema, NumberFormatsLocales] */](): ComposerOptions[
    Schema, 
    Locales, 
    MessagesLocales, 
    DateTimeFormatsLocales, 
    NumberFormatsLocales, 
    MessageSchema, 
    DateTimeSchema, 
    NumberSchema, 
    _Messages, 
    _DateTimeFormats, 
    _NumberFormats
  ] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComposerOptions[
    Schema, 
    Locales, 
    MessagesLocales, 
    DateTimeFormatsLocales, 
    NumberFormatsLocales, 
    MessageSchema, 
    DateTimeSchema, 
    NumberSchema, 
    _Messages, 
    _DateTimeFormats, 
    _NumberFormats
  ]]
  }
  
  extension [Self <: ComposerOptions[?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?], Schema /* <: Datetime */, Locales /* <: DatetimeFormats | String */, MessagesLocales, DateTimeFormatsLocales, NumberFormatsLocales, MessageSchema, DateTimeSchema, NumberSchema, _Messages /* <: LocaleMessages[MessageSchema, MessagesLocales, VueMessageType] */, _DateTimeFormats /* <: DateTimeFormats[DateTimeSchema, DateTimeFormatsLocales] */, _NumberFormats /* <: NumberFormats[NumberSchema, NumberFormatsLocales] */](x: Self & (ComposerOptions[
        Schema, 
        Locales, 
        MessagesLocales, 
        DateTimeFormatsLocales, 
        NumberFormatsLocales, 
        MessageSchema, 
        DateTimeSchema, 
        NumberSchema, 
        _Messages, 
        _DateTimeFormats, 
        _NumberFormats
      ])) {
    
    inline def setDatetimeFormats(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof _DateTimeFormats ]: DateTimeSchema} */ js.Any
    ): Self = StObject.set(x, "datetimeFormats", value.asInstanceOf[js.Any])
    
    inline def setDatetimeFormatsUndefined: Self = StObject.set(x, "datetimeFormats", js.undefined)
    
    inline def setEscapeParameter(value: Boolean): Self = StObject.set(x, "escapeParameter", value.asInstanceOf[js.Any])
    
    inline def setEscapeParameterUndefined: Self = StObject.set(x, "escapeParameter", js.undefined)
    
    inline def setFallbackFormat(value: Boolean): Self = StObject.set(x, "fallbackFormat", value.asInstanceOf[js.Any])
    
    inline def setFallbackFormatUndefined: Self = StObject.set(x, "fallbackFormat", js.undefined)
    
    inline def setFallbackLocale(value: FallbackLocale): Self = StObject.set(x, "fallbackLocale", value.asInstanceOf[js.Any])
    
    inline def setFallbackLocaleUndefined: Self = StObject.set(x, "fallbackLocale", js.undefined)
    
    inline def setFallbackLocaleVarargs(value: Locale*): Self = StObject.set(x, "fallbackLocale", js.Array(value*))
    
    inline def setFallbackRoot(value: Boolean): Self = StObject.set(x, "fallbackRoot", value.asInstanceOf[js.Any])
    
    inline def setFallbackRootUndefined: Self = StObject.set(x, "fallbackRoot", js.undefined)
    
    inline def setFallbackWarn(value: Boolean | js.RegExp): Self = StObject.set(x, "fallbackWarn", value.asInstanceOf[js.Any])
    
    inline def setFallbackWarnUndefined: Self = StObject.set(x, "fallbackWarn", js.undefined)
    
    inline def setFlatJson(value: Boolean): Self = StObject.set(x, "flatJson", value.asInstanceOf[js.Any])
    
    inline def setFlatJsonUndefined: Self = StObject.set(x, "flatJson", js.undefined)
    
    inline def setInheritLocale(value: Boolean): Self = StObject.set(x, "inheritLocale", value.asInstanceOf[js.Any])
    
    inline def setInheritLocaleUndefined: Self = StObject.set(x, "inheritLocale", js.undefined)
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMessageResolver(value: MessageResolver): Self = StObject.set(x, "messageResolver", value.asInstanceOf[js.Any])
    
    inline def setMessageResolverUndefined: Self = StObject.set(x, "messageResolver", js.undefined)
    
    inline def setMessages(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof _Messages ]: MessageSchema} */ js.Any
    ): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMissing(
      value: (/* locale */ Locale, /* key */ Path, /* instance */ js.UndefOr[ComponentInternalInstance], /* type */ js.UndefOr[String]) => String | Unit
    ): Self = StObject.set(x, "missing", js.Any.fromFunction4(value))
    
    inline def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
    
    inline def setMissingWarn(value: Boolean | js.RegExp): Self = StObject.set(x, "missingWarn", value.asInstanceOf[js.Any])
    
    inline def setMissingWarnUndefined: Self = StObject.set(x, "missingWarn", js.undefined)
    
    inline def setModifiers(value: LinkedModifiers[VueMessageType]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    inline def setNumberFormats(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof _NumberFormats ]: NumberSchema} */ js.Any
    ): Self = StObject.set(x, "numberFormats", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatsUndefined: Self = StObject.set(x, "numberFormats", js.undefined)
    
    inline def setPluralRules(value: PluralizationRules): Self = StObject.set(x, "pluralRules", value.asInstanceOf[js.Any])
    
    inline def setPluralRulesUndefined: Self = StObject.set(x, "pluralRules", js.undefined)
    
    inline def setPostTranslation(
      value: (/* translated */ MessageType[VueMessageType], /* key */ String) => MessageType[VueMessageType]
    ): Self = StObject.set(x, "postTranslation", js.Any.fromFunction2(value))
    
    inline def setPostTranslationUndefined: Self = StObject.set(x, "postTranslation", js.undefined)
    
    inline def setWarnHtmlMessage(value: Boolean): Self = StObject.set(x, "warnHtmlMessage", value.asInstanceOf[js.Any])
    
    inline def setWarnHtmlMessageUndefined: Self = StObject.set(x, "warnHtmlMessage", js.undefined)
  }
}
