package typings.typedoc.mod.TypeScript

import typings.typescript.mod.BindingName
import typings.typescript.mod.Expression
import typings.typescript.mod.TypeNode
import typings.typescript.mod.VariableDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateVariableDeclaration")
@js.native
object updateVariableDeclaration extends js.Object {
  def apply(node: VariableDeclaration, name: BindingName): VariableDeclaration = js.native
  def apply(node: VariableDeclaration, name: BindingName, `type`: TypeNode): VariableDeclaration = js.native
  def apply(node: VariableDeclaration, name: BindingName, `type`: TypeNode, initializer: Expression): VariableDeclaration = js.native
}

