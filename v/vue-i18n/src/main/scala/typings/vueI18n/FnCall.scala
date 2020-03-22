package typings.vueI18n

import typings.vueI18n.mod.VueI18n.Locale
import typings.vueI18n.mod.VueI18n.Path
import typings.vueI18n.mod.VueI18n.TranslateResult
import typings.vueI18n.mod.VueI18n.Values
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(key: Path): TranslateResult = js.native
  def apply(key: Path, locale: Locale): TranslateResult = js.native
  def apply(key: Path, locale: Locale, values: Values): TranslateResult = js.native
  def apply(key: Path, values: Values): TranslateResult = js.native
}

