package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import typings.atTypescriptDashEslintTypescriptDashEstree.atTypescriptDashEslintTypescriptDashEstreeStrings.keyof
import typings.atTypescriptDashEslintTypescriptDashEstree.atTypescriptDashEslintTypescriptDashEstreeStrings.readonly
import typings.atTypescriptDashEslintTypescriptDashEstree.atTypescriptDashEslintTypescriptDashEstreeStrings.unique
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeOperator
  extends BaseNode
     with Node
     with TypeNode {
  var operator: keyof | unique | readonly
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSTypeOperator
  var typeAnnotation: js.UndefOr[TSTypeAnnotation] = js.undefined
}

object TSTypeOperator {
  @scala.inline
  def apply(
    loc: SourceLocation,
    operator: keyof | unique | readonly,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSTypeOperator,
    parent: Node = null,
    typeAnnotation: TSTypeAnnotation = null
  ): TSTypeOperator = {
    val __obj = js.Dynamic.literal(loc = loc, operator = operator.asInstanceOf[js.Any], range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    __obj.asInstanceOf[TSTypeOperator]
  }
}

