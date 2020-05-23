package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Modifier
import typings.typescript.mod.VariableDeclaration
import typings.typescript.mod.VariableDeclarationList
import typings.typescript.mod.VariableStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createVariableStatement")
@js.native
object createVariableStatement extends js.Object {
  def apply(modifiers: js.UndefOr[js.Array[Modifier]], declarationList: js.Array[VariableDeclaration]): VariableStatement = js.native
  def apply(modifiers: js.UndefOr[js.Array[Modifier]], declarationList: VariableDeclarationList): VariableStatement = js.native
}

