package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayPattern
  extends PrimaryExpression
     with BaseNode
     with BindingPattern
     with Node
     with Parameter {
  var decorators: js.UndefOr[js.Array[Decorator]] = js.undefined
  var elements: js.Array[Expression]
  var optional: js.UndefOr[Boolean] = js.undefined
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ArrayPattern
  var typeAnnotation: js.UndefOr[TSTypeAnnotation] = js.undefined
}

object ArrayPattern {
  @scala.inline
  def apply(
    elements: js.Array[Expression],
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ArrayPattern,
    decorators: js.Array[Decorator] = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    parent: Node = null,
    typeAnnotation: TSTypeAnnotation = null
  ): ArrayPattern = {
    val __obj = js.Dynamic.literal(elements = elements, loc = loc, range = range)
    __obj.updateDynamic("type")(`type`)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    __obj.asInstanceOf[ArrayPattern]
  }
}

