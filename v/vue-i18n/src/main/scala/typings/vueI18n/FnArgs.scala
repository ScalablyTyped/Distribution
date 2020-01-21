package typings.vueI18n

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.vueI18n.mod.VueI18n.DateTimeFormatResult
import typings.vueI18n.mod.VueI18n.Locale
import typings.vueI18n.mod.VueI18n.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnArgs extends js.Object {
  def apply(value: Double): DateTimeFormatResult = js.native
  def apply(value: Double, args: StringDictionary[String]): DateTimeFormatResult = js.native
  def apply(value: Double, key: Path): DateTimeFormatResult = js.native
  def apply(value: Double, key: Path, locale: Locale): DateTimeFormatResult = js.native
  def apply(value: Date): DateTimeFormatResult = js.native
  def apply(value: Date, args: StringDictionary[String]): DateTimeFormatResult = js.native
  def apply(value: Date, key: Path): DateTimeFormatResult = js.native
  def apply(value: Date, key: Path, locale: Locale): DateTimeFormatResult = js.native
}

