package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadElement
  extends Expression
     with BaseNode
     with Node
     with ObjectLiteralElementLike {
  var argument: BindingName | Expression | PropertyName
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.SpreadElement
}

object SpreadElement {
  @scala.inline
  def apply(
    argument: BindingName | Expression | PropertyName,
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.SpreadElement,
    parent: Node = null
  ): SpreadElement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], loc = loc, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[SpreadElement]
  }
}

