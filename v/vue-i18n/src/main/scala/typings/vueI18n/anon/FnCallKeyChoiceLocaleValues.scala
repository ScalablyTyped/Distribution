package typings.vueI18n.anon

import typings.vueI18n.mod.VueI18n.Choice
import typings.vueI18n.mod.VueI18n.Locale
import typings.vueI18n.mod.VueI18n.Path
import typings.vueI18n.mod.VueI18n.Values
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallKeyChoiceLocaleValues extends js.Object {
  def apply(key: Path): String = js.native
  def apply(key: Path, choice: js.UndefOr[scala.Nothing], values: Values): String = js.native
  def apply(key: Path, choice: Choice): String = js.native
  def apply(key: Path, choice: Choice, locale: Locale): String = js.native
  def apply(key: Path, choice: Choice, locale: Locale, values: Values): String = js.native
  def apply(key: Path, choice: Choice, values: Values): String = js.native
}

