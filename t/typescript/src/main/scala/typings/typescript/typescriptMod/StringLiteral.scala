package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescript.typescriptMod.TextRange because Already inherited
- typings.typescript.typescriptMod.Node because Already inherited
- typings.typescript.typescriptMod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand */ @js.native
trait StringLiteral
  extends LiteralExpression
     with ModuleName
     with PropertyName
     with StringLiteralLike {
  var _declarationBrand: js.Any = js.native
  @JSName("kind")
  var kind_StringLiteral: typings.typescript.typescriptMod.SyntaxKind.StringLiteral = js.native
}

