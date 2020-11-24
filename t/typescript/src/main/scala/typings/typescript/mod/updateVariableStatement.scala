package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "updateVariableStatement")
@js.native
object updateVariableStatement extends js.Object {
  
  def apply(
    node: VariableStatement,
    modifiers: js.UndefOr[scala.Nothing],
    declarationList: VariableDeclarationList
  ): VariableStatement = js.native
  /** @deprecated Use `factory.updateVariableStatement` or the factory supplied by your transformation context instead. */
  def apply(node: VariableStatement, modifiers: js.Array[Modifier], declarationList: VariableDeclarationList): VariableStatement = js.native
}
