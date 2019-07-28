package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeParameterDeclaration extends NamedDeclaration {
  /** Note: Consider calling `getEffectiveConstraintOfTypeParameter` */
  var constraint: js.UndefOr[TypeNode] = js.native
  var default: js.UndefOr[TypeNode] = js.native
  var expression: js.UndefOr[Expression] = js.native
  @JSName("kind")
  var kind_TypeParameterDeclaration: typings.typescript.typescriptMod.SyntaxKind.TypeParameter = js.native
  @JSName("name")
  var name_TypeParameterDeclaration: Identifier = js.native
  @JSName("parent")
  var parent_TypeParameterDeclaration: DeclarationWithTypeParameterChildren | InferTypeNode = js.native
}

