package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypePredicate
  extends BaseNode
     with Node
     with TypeNode {
  var parameterName: Identifier | TSThisType
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSTypePredicate
  var typeAnnotation: TSTypeAnnotation
}

object TSTypePredicate {
  @scala.inline
  def apply(
    loc: SourceLocation,
    parameterName: Identifier | TSThisType,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSTypePredicate,
    typeAnnotation: TSTypeAnnotation,
    parent: Node = null
  ): TSTypePredicate = {
    val __obj = js.Dynamic.literal(loc = loc, parameterName = parameterName.asInstanceOf[js.Any], range = range, typeAnnotation = typeAnnotation)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[TSTypePredicate]
  }
}

