package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "updateForOf")
@js.native
object updateForOf extends js.Object {
  
  def apply(
    node: ForOfStatement,
    awaitModifier: js.UndefOr[scala.Nothing],
    initializer: ForInitializer,
    expression: Expression,
    statement: Statement
  ): ForOfStatement = js.native
  /** @deprecated Use `factory.updateForOf` or the factory supplied by your transformation context instead. */
  def apply(
    node: ForOfStatement,
    awaitModifier: AwaitKeyword,
    initializer: ForInitializer,
    expression: Expression,
    statement: Statement
  ): ForOfStatement = js.native
}
