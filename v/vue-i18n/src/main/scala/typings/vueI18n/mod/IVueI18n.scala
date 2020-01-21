package typings.vueI18n.mod

import typings.std.RegExp
import typings.vue.vueMod.Vue
import typings.vueI18n.mod.VueI18n.PluralizationRulesMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVueI18n extends js.Object {
  val dateTimeFormats: typings.vueI18n.mod.VueI18n.DateTimeFormats = js.native
  var fallbackLocale: typings.vueI18n.mod.VueI18n.Locale = js.native
  var formatFallbackMessages: Boolean = js.native
  var formatter: typings.vueI18n.mod.VueI18n.Formatter = js.native
  var locale: typings.vueI18n.mod.VueI18n.Locale = js.native
  val messages: typings.vueI18n.mod.VueI18n.LocaleMessages = js.native
  @JSName("missing")
  var missing_Original: typings.vueI18n.mod.VueI18n.MissingHandler = js.native
  val numberFormats: typings.vueI18n.mod.VueI18n.NumberFormats = js.native
  var pluralizationRules: PluralizationRulesMap = js.native
  var preserveDirectiveContent: Boolean = js.native
  var silentFallbackWarn: Boolean | RegExp = js.native
  var silentTranslationWarn: Boolean | RegExp = js.native
  var warnHtmlInMessage: typings.vueI18n.mod.VueI18n.WarnHtmlInMessageLevel = js.native
  def missing(
    locale: typings.vueI18n.mod.VueI18n.Locale,
    key: typings.vueI18n.mod.VueI18n.Path,
    vm: Null,
    values: js.Any
  ): String | Unit = js.native
  def missing(
    locale: typings.vueI18n.mod.VueI18n.Locale,
    key: typings.vueI18n.mod.VueI18n.Path,
    vm: Vue,
    values: js.Any
  ): String | Unit = js.native
}

