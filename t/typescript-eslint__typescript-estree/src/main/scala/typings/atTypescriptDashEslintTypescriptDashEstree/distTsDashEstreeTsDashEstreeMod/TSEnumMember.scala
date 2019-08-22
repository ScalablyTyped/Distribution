package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSEnumMember
  extends BaseNode
     with Node {
  var id: PropertyName
  var initializer: js.UndefOr[Expression] = js.undefined
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSEnumMember
}

object TSEnumMember {
  @scala.inline
  def apply(
    id: PropertyName,
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSEnumMember,
    initializer: Expression = null,
    parent: Node = null
  ): TSEnumMember = {
    val __obj = js.Dynamic.literal(id = id, loc = loc, range = range)
    __obj.updateDynamic("type")(`type`)
    if (initializer != null) __obj.updateDynamic("initializer")(initializer)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[TSEnumMember]
  }
}

