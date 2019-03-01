package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typescriptLib.typescriptMod.tsNs.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand */ @js.native
trait CallExpression
  extends LeftHandSideExpression
     with CallLikeExpression {
  var _declarationBrand: js.Any = js.native
  var arguments: NodeArray[Expression] = js.native
  var expression: LeftHandSideExpression = js.native
  var typeArguments: js.UndefOr[NodeArray[TypeNode]] = js.native
}

