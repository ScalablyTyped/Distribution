package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterfaceDeclaration
  extends DeclarationStatement
     with JSDocContainer
     with DeclarationWithTypeParameterChildren
     with ObjectTypeDeclaration
     with _HasJSDoc {
  
  val heritageClauses: js.UndefOr[NodeArray[HeritageClause]] = js.native
  
  @JSName("kind")
  val kind_InterfaceDeclaration: typings.typescript.mod.SyntaxKind.InterfaceDeclaration = js.native
  
  val members: NodeArray[TypeElement] = js.native
  
  @JSName("name")
  val name_InterfaceDeclaration: Identifier = js.native
  
  val typeParameters: js.UndefOr[NodeArray[TypeParameterDeclaration]] = js.native
}
