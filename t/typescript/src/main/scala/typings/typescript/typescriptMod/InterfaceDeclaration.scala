package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterfaceDeclaration
  extends DeclarationStatement
     with JSDocContainer
     with DeclarationWithTypeParameterChildren
     with ObjectTypeDeclaration
     with _HasJSDoc {
  var heritageClauses: js.UndefOr[NodeArray[HeritageClause]] = js.native
  @JSName("kind")
  var kind_InterfaceDeclaration: typings.typescript.typescriptMod.SyntaxKind.InterfaceDeclaration = js.native
  var members: NodeArray[TypeElement] = js.native
  @JSName("name")
  var name_InterfaceDeclaration: Identifier = js.native
  var typeParameters: js.UndefOr[NodeArray[TypeParameterDeclaration]] = js.native
}

