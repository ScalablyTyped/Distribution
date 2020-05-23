package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createFor")
@js.native
object createFor extends js.Object {
  def apply(
    initializer: js.UndefOr[ForInitializer],
    condition: js.UndefOr[Expression],
    incrementor: js.UndefOr[Expression],
    statement: Statement
  ): ForStatement = js.native
}

