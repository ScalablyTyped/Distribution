package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescript.mod.TextRange because Already inherited
- typings.typescript.mod.Node because Already inherited
- typings.typescript.mod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand */ @js.native
trait StringLiteral
  extends LiteralExpression
     with ModuleName
     with PropertyName
     with StringLiteralLike {
  var _declarationBrand: js.Any = js.native
  @JSName("kind")
  var kind_StringLiteral: typings.typescript.mod.SyntaxKind.StringLiteral = js.native
}

