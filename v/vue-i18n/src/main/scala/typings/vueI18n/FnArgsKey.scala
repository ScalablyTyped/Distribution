package typings.vueI18n

import org.scalablytyped.runtime.StringDictionary
import typings.vueI18n.mod.VueI18n.Locale
import typings.vueI18n.mod.VueI18n.NumberFormatResult
import typings.vueI18n.mod.VueI18n.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnArgsKey extends js.Object {
  def apply(value: Double): NumberFormatResult = js.native
  def apply(value: Double, args: StringDictionary[String]): NumberFormatResult = js.native
  def apply(value: Double, key: Path): NumberFormatResult = js.native
  def apply(value: Double, key: Path, locale: Locale): NumberFormatResult = js.native
}

