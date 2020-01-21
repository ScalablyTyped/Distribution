package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescript.mod.TextRange because Already inherited
- typings.typescript.mod.Node because Already inherited
- typings.typescript.mod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand */ @js.native
trait BinaryExpression extends Expression {
  var _declarationBrand: js.Any = js.native
  @JSName("kind")
  var kind_BinaryExpression: typings.typescript.mod.SyntaxKind.BinaryExpression = js.native
  var left: Expression = js.native
  var operatorToken: BinaryOperatorToken = js.native
  var right: Expression = js.native
}

