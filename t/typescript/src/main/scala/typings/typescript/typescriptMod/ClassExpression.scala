package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescript.typescriptMod.ClassLikeDeclarationBase because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined name, typeParameters, heritageClauses, members */ @js.native
trait ClassExpression
  extends PrimaryExpression
     with ClassLikeDeclaration {
  var heritageClauses: js.UndefOr[NodeArray[HeritageClause]] = js.native
  @JSName("kind")
  var kind_ClassExpression: typings.typescript.typescriptMod.SyntaxKind.ClassExpression = js.native
  var members: NodeArray[ClassElement] = js.native
  var name: js.UndefOr[Identifier] = js.native
  var typeParameters: js.UndefOr[NodeArray[TypeParameterDeclaration]] = js.native
}

