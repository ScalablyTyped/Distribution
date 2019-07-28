package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescript.typescriptMod.LiteralLikeNode because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined text, isUnterminated, hasExtendedUnicodeEscape */ @js.native
trait LiteralExpression extends PrimaryExpression {
  var _literalExpressionBrand: js.Any = js.native
  var hasExtendedUnicodeEscape: js.UndefOr[Boolean] = js.native
  var isUnterminated: js.UndefOr[Boolean] = js.native
  var text: String = js.native
}

