package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSParenthesizedType
  extends BaseNode
     with Node
     with TypeNode {
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSParenthesizedType
  var typeAnnotation: TypeNode
}

object TSParenthesizedType {
  @scala.inline
  def apply(
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSParenthesizedType,
    typeAnnotation: TypeNode,
    parent: Node = null
  ): TSParenthesizedType = {
    val __obj = js.Dynamic.literal(loc = loc, range = range, typeAnnotation = typeAnnotation)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[TSParenthesizedType]
  }
}

