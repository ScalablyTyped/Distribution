package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "updateCatchClause")
@js.native
object updateCatchClause extends js.Object {
  
  def apply(node: CatchClause, variableDeclaration: js.UndefOr[scala.Nothing], block: Block): CatchClause = js.native
  /** @deprecated Use `factory.updateCatchClause` or the factory supplied by your transformation context instead. */
  def apply(node: CatchClause, variableDeclaration: VariableDeclaration, block: Block): CatchClause = js.native
}
