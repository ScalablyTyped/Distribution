package typings
package vueDashI18nLib.vueDashI18nMod.VueI18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
trait I18nOptions extends js.Object {
  var dateTimeFormats: js.UndefOr[DateTimeFormats] = js.undefined
  var fallbackLocale: js.UndefOr[Locale] = js.undefined
  var fallbackRoot: js.UndefOr[scala.Boolean] = js.undefined
  var formatter: js.UndefOr[Formatter] = js.undefined
  var locale: js.UndefOr[Locale] = js.undefined
  var messages: js.UndefOr[LocaleMessages] = js.undefined
  var missing: js.UndefOr[MissingHandler] = js.undefined
  var numberFormats: js.UndefOr[NumberFormats] = js.undefined
  var pluralizationRules: js.UndefOr[PluralizationRulesMap] = js.undefined
  var preserveDirectiveContent: js.UndefOr[scala.Boolean] = js.undefined
  var silentFallbackWarn: js.UndefOr[scala.Boolean] = js.undefined
  var silentTranslationWarn: js.UndefOr[scala.Boolean] = js.undefined
  var sync: js.UndefOr[scala.Boolean] = js.undefined
}

object I18nOptions {
  @scala.inline
  def apply(
    dateTimeFormats: DateTimeFormats = null,
    fallbackLocale: Locale = null,
    fallbackRoot: js.UndefOr[scala.Boolean] = js.undefined,
    formatter: Formatter = null,
    locale: Locale = null,
    messages: LocaleMessages = null,
    missing: MissingHandler = null,
    numberFormats: NumberFormats = null,
    pluralizationRules: PluralizationRulesMap = null,
    preserveDirectiveContent: js.UndefOr[scala.Boolean] = js.undefined,
    silentFallbackWarn: js.UndefOr[scala.Boolean] = js.undefined,
    silentTranslationWarn: js.UndefOr[scala.Boolean] = js.undefined,
    sync: js.UndefOr[scala.Boolean] = js.undefined
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
    if (!js.isUndefined(silentFallbackWarn)) __obj.updateDynamic("silentFallbackWarn")(silentFallbackWarn)
    if (!js.isUndefined(silentTranslationWarn)) __obj.updateDynamic("silentTranslationWarn")(silentTranslationWarn)
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync)
    __obj.asInstanceOf[I18nOptions]
  }
}

