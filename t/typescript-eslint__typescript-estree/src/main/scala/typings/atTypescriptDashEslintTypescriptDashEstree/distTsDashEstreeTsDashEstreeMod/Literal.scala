package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import typings.atTypescriptDashEslintTypescriptDashEstree.Anon_Flags
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.ForInitialiser because Already inherited
- typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Expression because Already inherited
- typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.TSUnaryExpression because Already inherited
- typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.LeftHandSideExpression because Already inherited
- typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.PrimaryExpression because Already inherited */ trait Literal
  extends LiteralExpression
     with LiteralBase
     with Node
     with PropertyName {
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.Literal
}

object Literal {
  @scala.inline
  def apply(
    loc: SourceLocation,
    range: Range,
    raw: String,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.Literal,
    parent: Node = null,
    regex: Anon_Flags = null,
    value: Boolean | Double | RegExp | String = null
  ): Literal = {
    val __obj = js.Dynamic.literal(loc = loc, range = range, raw = raw)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (regex != null) __obj.updateDynamic("regex")(regex)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
}

