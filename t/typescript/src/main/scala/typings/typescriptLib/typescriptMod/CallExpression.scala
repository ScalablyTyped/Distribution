package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typescriptLib.typescriptMod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand */ @js.native
trait CallExpression
  extends LeftHandSideExpression
     with CallLikeExpression {
  var _declarationBrand: js.Any = js.native
  var arguments: NodeArray[Expression] = js.native
  var expression: LeftHandSideExpression = js.native
  @JSName("kind")
  var kind_CallExpression: typescriptLib.typescriptMod.SyntaxKind.CallExpression = js.native
  var typeArguments: js.UndefOr[NodeArray[TypeNode]] = js.native
}

