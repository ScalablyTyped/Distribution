package typings.vueDashI18n

import typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Choice
import typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale
import typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path
import typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Values
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

