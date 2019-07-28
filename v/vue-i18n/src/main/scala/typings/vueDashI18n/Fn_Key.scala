package typings.vueDashI18n

import typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale
import typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path
import typings.vueDashI18n.vueDashI18nMod.VueI18nNs.TranslateResult
import typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Values
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Key extends js.Object {
  def apply(key: Path): TranslateResult = js.native
  def apply(key: Path, locale: Locale): TranslateResult = js.native
  def apply(key: Path, locale: Locale, values: Values): TranslateResult = js.native
  def apply(key: Path, values: Values): TranslateResult = js.native
}

