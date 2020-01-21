package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createVariableDeclaration")
@js.native
object createVariableDeclaration extends js.Object {
  def apply(name: java.lang.String): VariableDeclaration = js.native
  def apply(name: java.lang.String, `type`: TypeNode): VariableDeclaration = js.native
  def apply(name: java.lang.String, `type`: TypeNode, initializer: Expression): VariableDeclaration = js.native
  def apply(name: BindingName): VariableDeclaration = js.native
  def apply(name: BindingName, `type`: TypeNode): VariableDeclaration = js.native
  def apply(name: BindingName, `type`: TypeNode, initializer: Expression): VariableDeclaration = js.native
}

