package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestElement
  extends Expression
     with BaseNode
     with Node
     with ObjectLiteralElementLike
     with Parameter {
  var argument: BindingName | Expression | PropertyName
  var decorators: js.UndefOr[js.Array[Decorator]] = js.undefined
  var optional: js.UndefOr[Boolean] = js.undefined
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.RestElement
  var typeAnnotation: js.UndefOr[TSTypeAnnotation] = js.undefined
  var value: js.UndefOr[AssignmentPattern] = js.undefined
}

object RestElement {
  @scala.inline
  def apply(
    argument: BindingName | Expression | PropertyName,
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.RestElement,
    decorators: js.Array[Decorator] = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    parent: Node = null,
    typeAnnotation: TSTypeAnnotation = null,
    value: AssignmentPattern = null
  ): RestElement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], loc = loc, range = range)
    __obj.updateDynamic("type")(`type`)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[RestElement]
  }
}

