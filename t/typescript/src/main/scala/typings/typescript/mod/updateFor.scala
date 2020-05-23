package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "updateFor")
@js.native
object updateFor extends js.Object {
  def apply(
    node: ForStatement,
    initializer: js.UndefOr[ForInitializer],
    condition: js.UndefOr[Expression],
    incrementor: js.UndefOr[Expression],
    statement: Statement
  ): ForStatement = js.native
}

