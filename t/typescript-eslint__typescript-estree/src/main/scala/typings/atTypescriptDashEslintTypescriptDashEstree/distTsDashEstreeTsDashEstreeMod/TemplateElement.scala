package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import typings.atTypescriptDashEslintTypescriptDashEstree.Anon_Cooked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateElement
  extends BaseNode
     with Node {
  var tail: Boolean
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TemplateElement
  var value: Anon_Cooked
}

object TemplateElement {
  @scala.inline
  def apply(
    loc: SourceLocation,
    range: Range,
    tail: Boolean,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TemplateElement,
    value: Anon_Cooked,
    parent: Node = null
  ): TemplateElement = {
    val __obj = js.Dynamic.literal(loc = loc, range = range, tail = tail, value = value)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[TemplateElement]
  }
}

