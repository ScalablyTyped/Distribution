package typings.typedoc.mod.TypeScript

import typings.typescript.mod.BindingName
import typings.typescript.mod.Expression
import typings.typescript.mod.TypeNode
import typings.typescript.mod.VariableDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createVariableDeclaration")
@js.native
object createVariableDeclaration extends js.Object {
  def apply(name: String): VariableDeclaration = js.native
  def apply(name: String, `type`: js.UndefOr[scala.Nothing], initializer: Expression): VariableDeclaration = js.native
  def apply(name: String, `type`: TypeNode): VariableDeclaration = js.native
  def apply(name: String, `type`: TypeNode, initializer: Expression): VariableDeclaration = js.native
  def apply(name: BindingName): VariableDeclaration = js.native
  def apply(name: BindingName, `type`: js.UndefOr[scala.Nothing], initializer: Expression): VariableDeclaration = js.native
  def apply(name: BindingName, `type`: TypeNode): VariableDeclaration = js.native
  def apply(name: BindingName, `type`: TypeNode, initializer: Expression): VariableDeclaration = js.native
}

