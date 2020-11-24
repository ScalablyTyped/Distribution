package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typescript.mod.ReadonlyTextRange because Already inherited
- typings.typescript.mod.Node because Already inherited
- typings.typescript.mod.LiteralLikeNode because Already inherited
- typings.typescript.mod.TemplateLiteralLikeNode because var conflicts: hasExtendedUnicodeEscape, isUnterminated, text. Inlined rawText */ @js.native
trait NoSubstitutionTemplateLiteral
  extends LiteralExpression
     with Declaration
     with LiteralToken
     with StringLiteralLike
     with TemplateLiteral
     with TemplateLiteralToken {
  
  @JSName("kind")
  val kind_NoSubstitutionTemplateLiteral: typings.typescript.mod.SyntaxKind.NoSubstitutionTemplateLiteral = js.native
  
  var rawText: js.UndefOr[java.lang.String] = js.native
}
