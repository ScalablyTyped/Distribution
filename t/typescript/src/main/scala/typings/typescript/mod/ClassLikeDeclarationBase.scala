package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassLikeDeclarationBase
  extends NamedDeclaration
     with JSDocContainer {
  var heritageClauses: js.UndefOr[NodeArray[HeritageClause]] = js.native
  @JSName("kind")
  var kind_ClassLikeDeclarationBase: typings.typescript.mod.SyntaxKind.ClassDeclaration | typings.typescript.mod.SyntaxKind.ClassExpression = js.native
  var members: NodeArray[ClassElement] = js.native
  @JSName("name")
  var name_ClassLikeDeclarationBase: js.UndefOr[Identifier] = js.native
  var typeParameters: js.UndefOr[NodeArray[TypeParameterDeclaration]] = js.native
}

