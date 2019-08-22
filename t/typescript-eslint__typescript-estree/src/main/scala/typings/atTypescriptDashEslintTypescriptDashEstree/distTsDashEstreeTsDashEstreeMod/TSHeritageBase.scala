package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSHeritageBase extends BaseNode {
  var expression: Expression
  var typeParameters: js.UndefOr[TSTypeParameterInstantiation] = js.undefined
}

object TSHeritageBase {
  @scala.inline
  def apply(
    expression: Expression,
    loc: SourceLocation,
    range: Range,
    parent: Node = null,
    typeParameters: TSTypeParameterInstantiation = null
  ): TSHeritageBase = {
    val __obj = js.Dynamic.literal(expression = expression, loc = loc, range = range)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[TSHeritageBase]
  }
}

