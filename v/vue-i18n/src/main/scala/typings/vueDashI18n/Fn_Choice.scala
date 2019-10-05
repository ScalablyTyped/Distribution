package typings.vueDashI18n

import typings.vueDashI18n.vueDashI18nMod.VueI18n.Choice
import typings.vueDashI18n.vueDashI18nMod.VueI18n.Locale
import typings.vueDashI18n.vueDashI18nMod.VueI18n.Path
import typings.vueDashI18n.vueDashI18nMod.VueI18n.Values
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Choice extends js.Object {
  def apply(key: Path): String = js.native
  def apply(key: Path, choice: Choice): String = js.native
  def apply(key: Path, choice: Choice, locale: Locale): String = js.native
  def apply(key: Path, choice: Choice, locale: Locale, values: Values): String = js.native
  def apply(key: Path, choice: Choice, values: Values): String = js.native
}

