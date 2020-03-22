package typings.typedoc.mod.TypeScript

import typings.typescript.mod.AwaitKeywordToken
import typings.typescript.mod.Expression
import typings.typescript.mod.ForInitializer
import typings.typescript.mod.ForOfStatement
import typings.typescript.mod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createForOf")
@js.native
object createForOf extends js.Object {
  def apply(
    awaitModifier: js.UndefOr[scala.Nothing],
    initializer: ForInitializer,
    expression: Expression,
    statement: Statement
  ): ForOfStatement = js.native
  def apply(
    awaitModifier: AwaitKeywordToken,
    initializer: ForInitializer,
    expression: Expression,
    statement: Statement
  ): ForOfStatement = js.native
}

