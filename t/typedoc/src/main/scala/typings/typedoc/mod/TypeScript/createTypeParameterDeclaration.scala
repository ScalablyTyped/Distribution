package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Identifier
import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createTypeParameterDeclaration")
@js.native
object createTypeParameterDeclaration extends js.Object {
  def apply(name: String): TypeParameterDeclaration = js.native
  def apply(name: String, constraint: js.UndefOr[scala.Nothing], defaultType: TypeNode): TypeParameterDeclaration = js.native
  def apply(name: String, constraint: TypeNode): TypeParameterDeclaration = js.native
  def apply(name: String, constraint: TypeNode, defaultType: TypeNode): TypeParameterDeclaration = js.native
  def apply(name: Identifier): TypeParameterDeclaration = js.native
  def apply(name: Identifier, constraint: js.UndefOr[scala.Nothing], defaultType: TypeNode): TypeParameterDeclaration = js.native
  def apply(name: Identifier, constraint: TypeNode): TypeParameterDeclaration = js.native
  def apply(name: Identifier, constraint: TypeNode, defaultType: TypeNode): TypeParameterDeclaration = js.native
}

