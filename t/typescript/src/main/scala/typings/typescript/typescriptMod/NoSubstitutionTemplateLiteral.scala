package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescript.typescriptMod.TextRange because Already inherited
- typings.typescript.typescriptMod.Node because Already inherited
- typings.typescript.typescriptMod.LiteralLikeNode because Already inherited
- typings.typescript.typescriptMod.TemplateLiteralLikeNode because var conflicts: decorators, end, flags, hasExtendedUnicodeEscape, isUnterminated, kind, modifiers, parent, pos, text. Inlined rawText */ @js.native
trait NoSubstitutionTemplateLiteral
  extends LiteralExpression
     with StringLiteralLike
     with TemplateLiteral
     with TemplateLiteralToken {
  @JSName("kind")
  var kind_NoSubstitutionTemplateLiteral: typings.typescript.typescriptMod.SyntaxKind.NoSubstitutionTemplateLiteral = js.native
  var rawText: js.UndefOr[String] = js.native
}

