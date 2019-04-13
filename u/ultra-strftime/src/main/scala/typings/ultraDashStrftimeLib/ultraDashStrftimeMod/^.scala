package typings
package ultraDashStrftimeLib.ultraDashStrftimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ultra-strftime", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(fmt: java.lang.String): java.lang.String = js.native
  def apply(fmt: java.lang.String, d: stdLib.Date): java.lang.String = js.native
  def apply(fmt: java.lang.String, d: stdLib.Date, locale: Locale): java.lang.String = js.native
  def apply(fmt: java.lang.String, d: stdLib.Date, locale: Locale, options: Options): java.lang.String = js.native
  def apply(fmt: java.lang.String, locale: Locale): java.lang.String = js.native
  def apply(fmt: java.lang.String, locale: Locale, options: Options): java.lang.String = js.native
  def localizedStrftime(locale: Locale): StrftimeFunction = js.native
  def strftime(fmt: java.lang.String): java.lang.String = js.native
  def strftime(fmt: java.lang.String, d: stdLib.Date): java.lang.String = js.native
  def strftime(fmt: java.lang.String, d: stdLib.Date, locale: Locale): java.lang.String = js.native
  def strftime(fmt: java.lang.String, d: stdLib.Date, locale: Locale, options: Options): java.lang.String = js.native
  def strftime(fmt: java.lang.String, locale: Locale): java.lang.String = js.native
  def strftime(fmt: java.lang.String, locale: Locale, options: Options): java.lang.String = js.native
  def strftimeTZ(fmt: java.lang.String, d: stdLib.Date, locale: Locale, timezone: scala.Double): java.lang.String = js.native
  def strftimeTZ(fmt: java.lang.String, d: stdLib.Date, timezone: scala.Double): java.lang.String = js.native
  def strftimeUTC(fmt: java.lang.String): java.lang.String = js.native
  def strftimeUTC(fmt: java.lang.String, d: stdLib.Date): java.lang.String = js.native
  def strftimeUTC(fmt: java.lang.String, d: stdLib.Date, locale: Locale): java.lang.String = js.native
}

