package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typescript.mod.TextRange because Already inherited
- typings.typescript.mod.Node because Already inherited
- typings.typescript.mod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand */ @js.native
trait NewExpression
  extends PrimaryExpression
     with CallLikeExpression
     with HasTypeArguments {
  var _declarationBrand: js.Any = js.native
  var arguments: js.UndefOr[NodeArray[Expression]] = js.native
  var expression: LeftHandSideExpression = js.native
  @JSName("kind")
  var kind_NewExpression: typings.typescript.mod.SyntaxKind.NewExpression = js.native
  var typeArguments: js.UndefOr[NodeArray[TypeNode]] = js.native
}

