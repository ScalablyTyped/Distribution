package typings.ultraStrftime.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ultra-strftime", "strftimeTZ")
@js.native
object strftimeTZ extends js.Object {
  def apply(fmt: String, d: Date, locale: Locale, timezone: Double): String = js.native
  def apply(fmt: String, d: Date, timezone: Double): String = js.native
}

