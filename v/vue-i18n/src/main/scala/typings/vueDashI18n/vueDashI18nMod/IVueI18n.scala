package typings.vueDashI18n.vueDashI18nMod

import typings.std.RegExp
import typings.vue.typesVueMod.Vue
import typings.vueDashI18n.vueDashI18nMod.VueI18n.PluralizationRulesMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVueI18n extends js.Object {
  val dateTimeFormats: typings.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormats = js.native
  var fallbackLocale: typings.vueDashI18n.vueDashI18nMod.VueI18n.Locale = js.native
  var formatFallbackMessages: Boolean = js.native
  var formatter: typings.vueDashI18n.vueDashI18nMod.VueI18n.Formatter = js.native
  var locale: typings.vueDashI18n.vueDashI18nMod.VueI18n.Locale = js.native
  val messages: typings.vueDashI18n.vueDashI18nMod.VueI18n.LocaleMessages = js.native
  @JSName("missing")
  var missing_Original: typings.vueDashI18n.vueDashI18nMod.VueI18n.MissingHandler = js.native
  val numberFormats: typings.vueDashI18n.vueDashI18nMod.VueI18n.NumberFormats = js.native
  var pluralizationRules: PluralizationRulesMap = js.native
  var preserveDirectiveContent: Boolean = js.native
  var silentFallbackWarn: Boolean | RegExp = js.native
  var silentTranslationWarn: Boolean | RegExp = js.native
  var warnHtmlInMessage: typings.vueDashI18n.vueDashI18nMod.VueI18n.WarnHtmlInMessageLevel = js.native
  def missing(
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18n.Locale,
    key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path,
    vm: Null,
    values: js.Any
  ): String | Unit = js.native
  def missing(
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18n.Locale,
    key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path,
    vm: Vue,
    values: js.Any
  ): String | Unit = js.native
}

