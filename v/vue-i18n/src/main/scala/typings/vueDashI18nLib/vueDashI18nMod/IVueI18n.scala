package typings
package vueDashI18nLib.vueDashI18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVueI18n extends js.Object {
  val dateTimeFormats: vueDashI18nLib.vueDashI18nMod.VueI18nNs.DateTimeFormats = js.native
  var fallbackLocale: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Locale = js.native
  var formatter: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Formatter = js.native
  var locale: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Locale = js.native
  val messages: vueDashI18nLib.vueDashI18nMod.VueI18nNs.LocaleMessages = js.native
  @JSName("missing")
  var missing_Original: vueDashI18nLib.vueDashI18nMod.VueI18nNs.MissingHandler = js.native
  val numberFormats: vueDashI18nLib.vueDashI18nMod.VueI18nNs.NumberFormats = js.native
  var pluralizationRules: vueDashI18nLib.vueDashI18nMod.VueI18nNs.PluralizationRulesMap = js.native
  var preserveDirectiveContent: scala.Boolean = js.native
  var silentTranslationWarn: scala.Boolean = js.native
  def missing(
    locale: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Locale,
    key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path
  ): java.lang.String | scala.Unit = js.native
  def missing(
    locale: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Locale,
    key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path,
    vm: vueLib.typesVueMod.Vue
  ): java.lang.String | scala.Unit = js.native
}

