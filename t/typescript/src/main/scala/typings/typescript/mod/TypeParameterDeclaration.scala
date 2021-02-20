package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeParameterDeclaration extends NamedDeclaration {
  
  val default: js.UndefOr[TypeNode] = js.native
  
  /** Note: Consider calling `getEffectiveConstraintOfTypeParameter` */
  val constraint: js.UndefOr[TypeNode] = js.native
  
  var expression: js.UndefOr[Expression] = js.native
  
  @JSName("kind")
  val kind_TypeParameterDeclaration: typings.typescript.mod.SyntaxKind.TypeParameter = js.native
  
  @JSName("name")
  val name_TypeParameterDeclaration: Identifier = js.native
  
  @JSName("parent")
  val parent_TypeParameterDeclaration: DeclarationWithTypeParameterChildren | InferTypeNode = js.native
}
