package typings.ultraStrftime.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ultra-strftime", "strftime")
@js.native
object strftime extends js.Object {
  
  def apply(fmt: String): String = js.native
  def apply(fmt: String, d: js.UndefOr[scala.Nothing], locale: js.UndefOr[scala.Nothing], options: Options): String = js.native
  def apply(fmt: String, d: js.UndefOr[scala.Nothing], locale: Locale): String = js.native
  def apply(fmt: String, d: js.UndefOr[scala.Nothing], locale: Locale, options: Options): String = js.native
  def apply(fmt: String, d: Date): String = js.native
  def apply(fmt: String, d: Date, locale: js.UndefOr[scala.Nothing], options: Options): String = js.native
  def apply(fmt: String, d: Date, locale: Locale): String = js.native
  def apply(fmt: String, d: Date, locale: Locale, options: Options): String = js.native
  def apply(fmt: String, locale: js.UndefOr[scala.Nothing], options: Options): String = js.native
  def apply(fmt: String, locale: Locale): String = js.native
  def apply(fmt: String, locale: Locale, options: Options): String = js.native
}
