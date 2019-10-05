package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createTypeParameterDeclaration")
@js.native
object createTypeParameterDeclaration extends js.Object {
  def apply(name: String): TypeParameterDeclaration = js.native
  def apply(name: String, constraint: TypeNode): TypeParameterDeclaration = js.native
  def apply(name: String, constraint: TypeNode, defaultType: TypeNode): TypeParameterDeclaration = js.native
  def apply(name: Identifier): TypeParameterDeclaration = js.native
  def apply(name: Identifier, constraint: TypeNode): TypeParameterDeclaration = js.native
  def apply(name: Identifier, constraint: TypeNode, defaultType: TypeNode): TypeParameterDeclaration = js.native
}

