package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createTypeParameterDeclaration")
@js.native
object createTypeParameterDeclaration extends js.Object {
  def apply(name: java.lang.String): TypeParameterDeclaration = js.native
  def apply(name: java.lang.String, constraint: js.UndefOr[scala.Nothing], defaultType: TypeNode): TypeParameterDeclaration = js.native
  def apply(name: java.lang.String, constraint: TypeNode): TypeParameterDeclaration = js.native
  def apply(name: java.lang.String, constraint: TypeNode, defaultType: TypeNode): TypeParameterDeclaration = js.native
  def apply(name: Identifier): TypeParameterDeclaration = js.native
  def apply(name: Identifier, constraint: js.UndefOr[scala.Nothing], defaultType: TypeNode): TypeParameterDeclaration = js.native
  def apply(name: Identifier, constraint: TypeNode): TypeParameterDeclaration = js.native
  def apply(name: Identifier, constraint: TypeNode, defaultType: TypeNode): TypeParameterDeclaration = js.native
}

