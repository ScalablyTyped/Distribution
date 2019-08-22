package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignmentPattern
  extends BaseNode
     with Node
     with Parameter {
  var decorators: js.UndefOr[js.Array[Decorator]] = js.undefined
  var left: BindingName
  var optional: js.UndefOr[Boolean] = js.undefined
  var right: js.UndefOr[Expression] = js.undefined
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.AssignmentPattern
  var typeAnnotation: js.UndefOr[TSTypeAnnotation] = js.undefined
}

object AssignmentPattern {
  @scala.inline
  def apply(
    left: BindingName,
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.AssignmentPattern,
    decorators: js.Array[Decorator] = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    parent: Node = null,
    right: Expression = null,
    typeAnnotation: TSTypeAnnotation = null
  ): AssignmentPattern = {
    val __obj = js.Dynamic.literal(left = left, loc = loc, range = range)
    __obj.updateDynamic("type")(`type`)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (right != null) __obj.updateDynamic("right")(right)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    __obj.asInstanceOf[AssignmentPattern]
  }
}

