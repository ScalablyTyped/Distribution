package typings.stylelint.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stylelint", "lint")
@js.native
object lint extends js.Object {
  def apply(): js.Promise[LinterResult] = js.native
  def apply(options: Partial[LinterOptions]): js.Promise[LinterResult] = js.native
}

