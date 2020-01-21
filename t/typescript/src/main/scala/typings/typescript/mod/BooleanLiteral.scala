package typings.typescript.mod

import typings.typescript.mod.SyntaxKind.FalseKeyword
import typings.typescript.mod.SyntaxKind.TrueKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescript.mod.TextRange because Already inherited
- typings.typescript.mod.Node because Already inherited
- typings.typescript.mod.TypeNode because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _typeNodeBrand */ @js.native
trait BooleanLiteral extends PrimaryExpression {
  var _typeNodeBrand: js.Any = js.native
  @JSName("kind")
  var kind_BooleanLiteral: TrueKeyword | FalseKeyword = js.native
}

