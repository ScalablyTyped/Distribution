package typings.vueI18n.mod

import typings.intlifyCoreBase.mod.MessageFunction
import typings.intlifyCoreBase.mod.NamedValue
import typings.intlifyCoreBase.mod.TranslateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComposerResolveLocaleMessageTranslation[Locales] extends StObject {
  
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
  def apply(message: MessageFunction[VueMessageType]): String = js.native
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
  def apply(message: MessageFunction[VueMessageType], list: js.Array[Any]): String = js.native
  def apply(message: MessageFunction[VueMessageType], list: js.Array[Any], options: TranslateOptions[Locales]): String = js.native
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
  def apply(message: MessageFunction[VueMessageType], named: NamedValue[js.Object]): String = js.native
  def apply(
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
  def apply(message: MessageFunction[VueMessageType], plural: Double): String = js.native
  def apply(message: MessageFunction[VueMessageType], plural: Double, options: TranslateOptions[Locales]): String = js.native
  def apply(message: VueMessageType): String = js.native
  def apply(message: VueMessageType, list: js.Array[Any]): String = js.native
  def apply(message: VueMessageType, list: js.Array[Any], options: TranslateOptions[Locales]): String = js.native
  def apply(message: VueMessageType, named: NamedValue[js.Object]): String = js.native
  def apply(message: VueMessageType, named: NamedValue[js.Object], options: TranslateOptions[Locales]): String = js.native
  def apply(message: VueMessageType, plural: Double): String = js.native
  def apply(message: VueMessageType, plural: Double, options: TranslateOptions[Locales]): String = js.native
}
