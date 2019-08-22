package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import typings.atTypescriptDashEslintTypescriptDashEstree.Anon_Flags
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_TOKEN_TYPES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends BaseNode {
  var regex: js.UndefOr[Anon_Flags] = js.undefined
  var `type`: AST_TOKEN_TYPES
  var value: String
}

object Token {
  @scala.inline
  def apply(
    loc: SourceLocation,
    range: Range,
    `type`: AST_TOKEN_TYPES,
    value: String,
    parent: Node = null,
    regex: Anon_Flags = null
  ): Token = {
    val __obj = js.Dynamic.literal(loc = loc, range = range, value = value)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (regex != null) __obj.updateDynamic("regex")(regex)
    __obj.asInstanceOf[Token]
  }
}

