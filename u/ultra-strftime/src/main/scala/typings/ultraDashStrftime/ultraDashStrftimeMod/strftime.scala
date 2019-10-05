package typings.ultraDashStrftime.ultraDashStrftimeMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ultra-strftime", "strftime")
@js.native
object strftime extends js.Object {
  def apply(fmt: String): String = js.native
  def apply(fmt: String, d: Date): String = js.native
  def apply(fmt: String, d: Date, locale: Locale): String = js.native
  def apply(fmt: String, d: Date, locale: Locale, options: Options): String = js.native
  def apply(fmt: String, locale: Locale): String = js.native
  def apply(fmt: String, locale: Locale, options: Options): String = js.native
}

