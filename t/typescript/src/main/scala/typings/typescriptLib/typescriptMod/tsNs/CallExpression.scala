package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(typescriptLib.typescriptMod.tsNs.Declaration because Would inherit conflicting mutable fields List(decorators, end, flags, kind, modifiers, parent, pos))*/
@js.native
trait CallExpression extends LeftHandSideExpression {
  var arguments: NodeArray[Expression] = js.native
  var expression: LeftHandSideExpression = js.native
  var typeArguments: js.UndefOr[NodeArray[TypeNode]] = js.native
}

