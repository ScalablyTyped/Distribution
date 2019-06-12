package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typescriptLib.typescriptMod.TypeNode because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _typeNodeBrand */ @js.native
trait BooleanLiteral extends PrimaryExpression {
  var _typeNodeBrand: js.Any = js.native
  @JSName("kind")
  var kind_BooleanLiteral: typescriptLib.typescriptMod.SyntaxKind.TrueKeyword | typescriptLib.typescriptMod.SyntaxKind.FalseKeyword = js.native
}

