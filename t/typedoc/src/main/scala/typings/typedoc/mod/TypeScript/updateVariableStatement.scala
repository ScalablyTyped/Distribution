package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Modifier
import typings.typescript.mod.VariableDeclarationList
import typings.typescript.mod.VariableStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.updateVariableStatement")
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
