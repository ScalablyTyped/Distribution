package typings.vueDashI18n.vueDashI18nMod.VueI18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
trait I18nOptions extends js.Object {
  var dateTimeFormats: js.UndefOr[typings.vueDashI18n.vueDashI18nMod.VueI18nNs.DateTimeFormats] = js.undefined
  var fallbackLocale: js.UndefOr[typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale] = js.undefined
  var fallbackRoot: js.UndefOr[Boolean] = js.undefined
  var formatter: js.UndefOr[typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Formatter] = js.undefined
  var locale: js.UndefOr[typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale] = js.undefined
  var messages: js.UndefOr[typings.vueDashI18n.vueDashI18nMod.VueI18nNs.LocaleMessages] = js.undefined
  var missing: js.UndefOr[typings.vueDashI18n.vueDashI18nMod.VueI18nNs.MissingHandler] = js.undefined
  var numberFormats: js.UndefOr[typings.vueDashI18n.vueDashI18nMod.VueI18nNs.NumberFormats] = js.undefined
  var pluralizationRules: js.UndefOr[PluralizationRulesMap] = js.undefined
  var preserveDirectiveContent: js.UndefOr[Boolean] = js.undefined
  var sharedMessages: js.UndefOr[typings.vueDashI18n.vueDashI18nMod.VueI18nNs.LocaleMessages] = js.undefined
  var silentFallbackWarn: js.UndefOr[Boolean] = js.undefined
  var silentTranslationWarn: js.UndefOr[Boolean] = js.undefined
  var sync: js.UndefOr[Boolean] = js.undefined
  var warnHtmlInMessage: js.UndefOr[typings.vueDashI18n.vueDashI18nMod.VueI18nNs.WarnHtmlInMessageLevel] = js.undefined
}

object I18nOptions {
  @scala.inline
  def apply(
    dateTimeFormats: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.DateTimeFormats = null,
    fallbackLocale: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale = null,
    fallbackRoot: js.UndefOr[Boolean] = js.undefined,
    formatter: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Formatter = null,
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale = null,
    messages: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.LocaleMessages = null,
    missing: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.MissingHandler = null,
    numberFormats: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.NumberFormats = null,
    pluralizationRules: PluralizationRulesMap = null,
    preserveDirectiveContent: js.UndefOr[Boolean] = js.undefined,
    sharedMessages: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.LocaleMessages = null,
    silentFallbackWarn: js.UndefOr[Boolean] = js.undefined,
    silentTranslationWarn: js.UndefOr[Boolean] = js.undefined,
    sync: js.UndefOr[Boolean] = js.undefined,
    warnHtmlInMessage: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.WarnHtmlInMessageLevel = null
  ): I18nOptions = {
    val __obj = js.Dynamic.literal()
    if (dateTimeFormats != null) __obj.updateDynamic("dateTimeFormats")(dateTimeFormats)
    if (fallbackLocale != null) __obj.updateDynamic("fallbackLocale")(fallbackLocale)
    if (!js.isUndefined(fallbackRoot)) __obj.updateDynamic("fallbackRoot")(fallbackRoot)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (missing != null) __obj.updateDynamic("missing")(missing)
    if (numberFormats != null) __obj.updateDynamic("numberFormats")(numberFormats)
    if (pluralizationRules != null) __obj.updateDynamic("pluralizationRules")(pluralizationRules)
    if (!js.isUndefined(preserveDirectiveContent)) __obj.updateDynamic("preserveDirectiveContent")(preserveDirectiveContent)
    if (sharedMessages != null) __obj.updateDynamic("sharedMessages")(sharedMessages)
    if (!js.isUndefined(silentFallbackWarn)) __obj.updateDynamic("silentFallbackWarn")(silentFallbackWarn)
    if (!js.isUndefined(silentTranslationWarn)) __obj.updateDynamic("silentTranslationWarn")(silentTranslationWarn)
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync)
    if (warnHtmlInMessage != null) __obj.updateDynamic("warnHtmlInMessage")(warnHtmlInMessage)
    __obj.asInstanceOf[I18nOptions]
  }
}

