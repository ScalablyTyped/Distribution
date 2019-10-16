package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypePredicate
  extends BaseNode
     with Node
     with TypeNode {
  var asserts: Boolean
  var parameterName: Identifier | TSThisType
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSTypePredicate
  var typeAnnotation: TSTypeAnnotation | Null
}

object TSTypePredicate {
  @scala.inline
  def apply(
    asserts: Boolean,
    loc: SourceLocation,
    parameterName: Identifier | TSThisType,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSTypePredicate,
    parent: Node = null,
    typeAnnotation: TSTypeAnnotation = null
  ): TSTypePredicate = {
    val __obj = js.Dynamic.literal(asserts = asserts, loc = loc, parameterName = parameterName.asInstanceOf[js.Any], range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    __obj.asInstanceOf[TSTypePredicate]
  }
}

