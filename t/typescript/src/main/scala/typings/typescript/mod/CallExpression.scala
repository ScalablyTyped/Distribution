package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typescript.mod.TextRange because Already inherited
- typings.typescript.mod.Node because Already inherited
- typings.typescript.mod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand */ @js.native
trait CallExpression
  extends LeftHandSideExpression
     with CallLikeExpression
     with HasTypeArguments {
  var _declarationBrand: js.Any = js.native
  var arguments: NodeArray[Expression] = js.native
  var expression: LeftHandSideExpression = js.native
  @JSName("kind")
  var kind_CallExpression: typings.typescript.mod.SyntaxKind.CallExpression = js.native
  var questionDotToken: js.UndefOr[QuestionDotToken] = js.native
  var typeArguments: js.UndefOr[NodeArray[TypeNode]] = js.native
}

