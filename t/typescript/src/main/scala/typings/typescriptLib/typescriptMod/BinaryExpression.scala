package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typescriptLib.typescriptMod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand */ @js.native
trait BinaryExpression extends Expression {
  var _declarationBrand: js.Any = js.native
  @JSName("kind")
  var kind_BinaryExpression: typescriptLib.typescriptMod.SyntaxKind.BinaryExpression = js.native
  var left: Expression = js.native
  var operatorToken: BinaryOperatorToken = js.native
  var right: Expression = js.native
}

