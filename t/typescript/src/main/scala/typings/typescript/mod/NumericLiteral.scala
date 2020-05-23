package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typescript.mod.TextRange because Already inherited
- typings.typescript.mod.Node because Already inherited
- typings.typescript.mod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand */ @js.native
trait NumericLiteral
  extends LiteralExpression
     with DeclarationName
     with PropertyName {
  var _declarationBrand: js.Any = js.native
  @JSName("kind")
  var kind_NumericLiteral: typings.typescript.mod.SyntaxKind.NumericLiteral = js.native
}

