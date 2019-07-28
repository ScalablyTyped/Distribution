package typings.ultraDashStrftime.ultraDashStrftimeMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ultra-strftime", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(fmt: String): String = js.native
  def apply(fmt: String, d: Date): String = js.native
  def apply(fmt: String, d: Date, locale: Locale): String = js.native
  def apply(fmt: String, d: Date, locale: Locale, options: Options): String = js.native
  def apply(fmt: String, locale: Locale): String = js.native
  def apply(fmt: String, locale: Locale, options: Options): String = js.native
  def localizedStrftime(locale: Locale): StrftimeFunction = js.native
  def strftime(fmt: String): String = js.native
  def strftime(fmt: String, d: Date): String = js.native
  def strftime(fmt: String, d: Date, locale: Locale): String = js.native
  def strftime(fmt: String, d: Date, locale: Locale, options: Options): String = js.native
  def strftime(fmt: String, locale: Locale): String = js.native
  def strftime(fmt: String, locale: Locale, options: Options): String = js.native
  def strftimeTZ(fmt: String, d: Date, locale: Locale, timezone: Double): String = js.native
  def strftimeTZ(fmt: String, d: Date, timezone: Double): String = js.native
  def strftimeUTC(fmt: String): String = js.native
  def strftimeUTC(fmt: String, d: Date): String = js.native
  def strftimeUTC(fmt: String, d: Date, locale: Locale): String = js.native
}

