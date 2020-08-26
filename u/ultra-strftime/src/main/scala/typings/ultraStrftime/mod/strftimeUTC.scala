package typings.ultraStrftime.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ultra-strftime", "strftimeUTC")
@js.native
object strftimeUTC extends js.Object {
  def apply(fmt: String): String = js.native
  def apply(fmt: String, d: js.UndefOr[scala.Nothing], locale: Locale): String = js.native
  def apply(fmt: String, d: Date): String = js.native
  def apply(fmt: String, d: Date, locale: Locale): String = js.native
}

