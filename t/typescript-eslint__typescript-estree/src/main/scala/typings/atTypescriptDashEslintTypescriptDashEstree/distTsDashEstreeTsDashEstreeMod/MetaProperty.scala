package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaProperty
  extends PrimaryExpression
     with BaseNode
     with Node {
  var meta: Identifier
  var property: Identifier
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.MetaProperty
}

object MetaProperty {
  @scala.inline
  def apply(
    loc: SourceLocation,
    meta: Identifier,
    property: Identifier,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.MetaProperty,
    parent: Node = null
  ): MetaProperty = {
    val __obj = js.Dynamic.literal(loc = loc, meta = meta, property = property, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[MetaProperty]
  }
}

