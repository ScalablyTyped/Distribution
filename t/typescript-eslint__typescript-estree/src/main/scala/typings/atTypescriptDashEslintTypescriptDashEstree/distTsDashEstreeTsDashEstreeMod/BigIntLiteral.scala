package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import typings.atTypescriptDashEslintTypescriptDashEstree.Anon_Flags
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BigIntLiteral
  extends LiteralExpression
     with LiteralBase
     with Node {
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.BigIntLiteral
}

object BigIntLiteral {
  @scala.inline
  def apply(
    loc: SourceLocation,
    range: Range,
    raw: String,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.BigIntLiteral,
    parent: Node = null,
    regex: Anon_Flags = null,
    value: Boolean | Double | RegExp | String = null
  ): BigIntLiteral = {
    val __obj = js.Dynamic.literal(loc = loc, range = range, raw = raw)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (regex != null) __obj.updateDynamic("regex")(regex)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BigIntLiteral]
  }
}

