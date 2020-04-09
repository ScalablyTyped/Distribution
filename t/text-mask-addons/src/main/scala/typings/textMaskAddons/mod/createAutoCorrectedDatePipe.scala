package typings.textMaskAddons.mod

import typings.textMaskCore.mod.Pipe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("text-mask-addons", "createAutoCorrectedDatePipe")
@js.native
object createAutoCorrectedDatePipe extends js.Object {
  def apply(): Pipe = js.native
  def apply(dateFormat: String): Pipe = js.native
  def apply(dateFormat: String, validYears: DatePipeYears): Pipe = js.native
}

