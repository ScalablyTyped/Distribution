package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSConditionalType
  extends BaseNode
     with Node
     with TypeNode {
  var checkType: TypeNode
  var extendsType: TypeNode
  var falseType: TypeNode
  var trueType: TypeNode
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSConditionalType
}

object TSConditionalType {
  @scala.inline
  def apply(
    checkType: TypeNode,
    extendsType: TypeNode,
    falseType: TypeNode,
    loc: SourceLocation,
    range: Range,
    trueType: TypeNode,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSConditionalType,
    parent: Node = null
  ): TSConditionalType = {
    val __obj = js.Dynamic.literal(checkType = checkType, extendsType = extendsType, falseType = falseType, loc = loc, range = range, trueType = trueType)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[TSConditionalType]
  }
}

