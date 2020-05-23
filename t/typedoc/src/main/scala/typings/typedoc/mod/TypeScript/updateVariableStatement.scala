package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Modifier
import typings.typescript.mod.VariableDeclarationList
import typings.typescript.mod.VariableStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateVariableStatement")
@js.native
object updateVariableStatement extends js.Object {
  def apply(
    node: VariableStatement,
    modifiers: js.UndefOr[js.Array[Modifier]],
    declarationList: VariableDeclarationList
  ): VariableStatement = js.native
}

