package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Expression
import typings.typescript.mod.ForInitializer
import typings.typescript.mod.ForStatement
import typings.typescript.mod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createFor")
@js.native
object createFor extends js.Object {
  def apply(
    initializer: js.UndefOr[ForInitializer],
    condition: js.UndefOr[Expression],
    incrementor: js.UndefOr[Expression],
    statement: Statement
  ): ForStatement = js.native
}

