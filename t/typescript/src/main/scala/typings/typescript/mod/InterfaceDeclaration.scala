package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterfaceDeclaration
  extends StObject
     with DeclarationStatement
     with DeclarationWithTypeParameterChildren
     with HasJSDoc
     with HasModifiers
     with ObjectTypeDeclaration {
  
  val heritageClauses: js.UndefOr[NodeArray[HeritageClause]] = js.native
  
  @JSName("kind")
  val kind_InterfaceDeclaration: typings.typescript.mod.SyntaxKind.InterfaceDeclaration = js.native
  
  val members: NodeArray[TypeElement] = js.native
  
  val modifiers: js.UndefOr[NodeArray[ModifierLike]] = js.native
  
  @JSName("name")
  val name_InterfaceDeclaration: Identifier = js.native
  
  val typeParameters: js.UndefOr[NodeArray[TypeParameterDeclaration]] = js.native
}
