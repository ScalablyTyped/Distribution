package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescript.typescriptMod.TextRange because Already inherited
- typings.typescript.typescriptMod.Node because Already inherited
- typings.typescript.typescriptMod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand */ @js.native
trait NumericLiteral
  extends LiteralExpression
     with DeclarationName
     with PropertyName {
  var _declarationBrand: js.Any = js.native
  @JSName("kind")
  var kind_NumericLiteral: typings.typescript.typescriptMod.SyntaxKind.NumericLiteral = js.native
}

