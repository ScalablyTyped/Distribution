package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createVariableDeclaration")
@js.native
object createVariableDeclaration extends js.Object {
  def apply(name: String): VariableDeclaration = js.native
  def apply(name: String, `type`: TypeNode): VariableDeclaration = js.native
  def apply(name: String, `type`: TypeNode, initializer: Expression): VariableDeclaration = js.native
  def apply(name: BindingName): VariableDeclaration = js.native
  def apply(name: BindingName, `type`: TypeNode): VariableDeclaration = js.native
  def apply(name: BindingName, `type`: TypeNode, initializer: Expression): VariableDeclaration = js.native
}

