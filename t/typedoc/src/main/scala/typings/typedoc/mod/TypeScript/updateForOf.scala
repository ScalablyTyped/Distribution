package typings.typedoc.mod.TypeScript

import typings.typescript.mod.AwaitKeywordToken
import typings.typescript.mod.Expression
import typings.typescript.mod.ForInitializer
import typings.typescript.mod.ForOfStatement
import typings.typescript.mod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateForOf")
@js.native
object updateForOf extends js.Object {
  def apply(
    node: ForOfStatement,
    awaitModifier: js.UndefOr[scala.Nothing],
    initializer: ForInitializer,
    expression: Expression,
    statement: Statement
  ): ForOfStatement = js.native
  def apply(
    node: ForOfStatement,
    awaitModifier: AwaitKeywordToken,
    initializer: ForInitializer,
    expression: Expression,
    statement: Statement
  ): ForOfStatement = js.native
}

