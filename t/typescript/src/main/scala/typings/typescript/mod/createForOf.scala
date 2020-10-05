package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createForOf")
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

