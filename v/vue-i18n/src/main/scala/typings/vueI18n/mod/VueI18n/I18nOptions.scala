package typings.vueI18n.mod.VueI18n

import typings.std.RegExp
import typings.vue.vueMod.Vue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
trait I18nOptions extends js.Object {
  var dateTimeFormats: js.UndefOr[DateTimeFormats] = js.undefined
  var fallbackLocale: js.UndefOr[FallbackLocale] = js.undefined
  var fallbackRoot: js.UndefOr[Boolean] = js.undefined
  var formatFallbackMessages: js.UndefOr[Boolean] = js.undefined
  var formatter: js.UndefOr[Formatter] = js.undefined
  var locale: js.UndefOr[Locale] = js.undefined
  var messages: js.UndefOr[LocaleMessages] = js.undefined
  var missing: js.UndefOr[MissingHandler] = js.undefined
  var modifiers: js.UndefOr[Modifiers] = js.undefined
  var numberFormats: js.UndefOr[NumberFormats] = js.undefined
  var pluralizationRules: js.UndefOr[PluralizationRulesMap] = js.undefined
  var postTranslation: js.UndefOr[PostTranslationHandler] = js.undefined
  var preserveDirectiveContent: js.UndefOr[Boolean] = js.undefined
  var sharedMessages: js.UndefOr[LocaleMessages] = js.undefined
  var silentFallbackWarn: js.UndefOr[Boolean | RegExp] = js.undefined
  var silentTranslationWarn: js.UndefOr[Boolean | RegExp] = js.undefined
  var sync: js.UndefOr[Boolean] = js.undefined
  var warnHtmlInMessage: js.UndefOr[WarnHtmlInMessageLevel] = js.undefined
}

object I18nOptions {
  @scala.inline
  def apply(
    dateTimeFormats: DateTimeFormats = null,
    fallbackLocale: FallbackLocale = null,
    fallbackRoot: js.UndefOr[Boolean] = js.undefined,
    formatFallbackMessages: js.UndefOr[Boolean] = js.undefined,
    formatter: Formatter = null,
    locale: Locale = null,
    messages: LocaleMessages = null,
    missing: (/* locale */ Locale, /* key */ Path, /* vm */ Vue | Null, /* values */ js.Any) => String | Unit = null,
    modifiers: Modifiers = null,
    numberFormats: NumberFormats = null,
    pluralizationRules: PluralizationRulesMap = null,
    postTranslation: (/* str */ String, /* key */ js.UndefOr[String]) => String = null,
    preserveDirectiveContent: js.UndefOr[Boolean] = js.undefined,
    sharedMessages: LocaleMessages = null,
    silentFallbackWarn: Boolean | RegExp = null,
    silentTranslationWarn: Boolean | RegExp = null,
    sync: js.UndefOr[Boolean] = js.undefined,
    warnHtmlInMessage: WarnHtmlInMessageLevel = null
  ): I18nOptions = {
    val __obj = js.Dynamic.literal()
    if (dateTimeFormats != null) __obj.updateDynamic("dateTimeFormats")(dateTimeFormats.asInstanceOf[js.Any])
    if (fallbackLocale != null) __obj.updateDynamic("fallbackLocale")(fallbackLocale.asInstanceOf[js.Any])
    if (!js.isUndefined(fallbackRoot)) __obj.updateDynamic("fallbackRoot")(fallbackRoot.asInstanceOf[js.Any])
    if (!js.isUndefined(formatFallbackMessages)) __obj.updateDynamic("formatFallbackMessages")(formatFallbackMessages.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (missing != null) __obj.updateDynamic("missing")(js.Any.fromFunction4(missing))
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (numberFormats != null) __obj.updateDynamic("numberFormats")(numberFormats.asInstanceOf[js.Any])
    if (pluralizationRules != null) __obj.updateDynamic("pluralizationRules")(pluralizationRules.asInstanceOf[js.Any])
    if (postTranslation != null) __obj.updateDynamic("postTranslation")(js.Any.fromFunction2(postTranslation))
    if (!js.isUndefined(preserveDirectiveContent)) __obj.updateDynamic("preserveDirectiveContent")(preserveDirectiveContent.asInstanceOf[js.Any])
    if (sharedMessages != null) __obj.updateDynamic("sharedMessages")(sharedMessages.asInstanceOf[js.Any])
    if (silentFallbackWarn != null) __obj.updateDynamic("silentFallbackWarn")(silentFallbackWarn.asInstanceOf[js.Any])
    if (silentTranslationWarn != null) __obj.updateDynamic("silentTranslationWarn")(silentTranslationWarn.asInstanceOf[js.Any])
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync.asInstanceOf[js.Any])
    if (warnHtmlInMessage != null) __obj.updateDynamic("warnHtmlInMessage")(warnHtmlInMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18nOptions]
  }
}

