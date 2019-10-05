package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescript.typescriptMod.TextRange because Already inherited
- typings.typescript.typescriptMod.Node because Already inherited
- typings.typescript.typescriptMod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand
- typings.typescript.typescriptMod.NamedDeclaration because var conflicts: decorators, end, flags, kind, modifiers, name, parent, pos. Inlined 
- typings.typescript.typescriptMod.ClassLikeDeclarationBase because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined name, typeParameters, heritageClauses, members */ @js.native
trait ClassExpression
  extends PrimaryExpression
     with ClassLikeDeclaration
     with JSDocContainer {
  var _declarationBrand: js.Any = js.native
  var heritageClauses: js.UndefOr[NodeArray[HeritageClause]] = js.native
  @JSName("kind")
  var kind_ClassExpression: typings.typescript.typescriptMod.SyntaxKind.ClassExpression = js.native
  var members: NodeArray[ClassElement] = js.native
  var name: js.UndefOr[Identifier] = js.native
  var typeParameters: js.UndefOr[NodeArray[TypeParameterDeclaration]] = js.native
}

