package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSInterfaceBody
  extends BaseNode
     with Node {
  var body: js.Array[TypeElement]
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSInterfaceBody
}

object TSInterfaceBody {
  @scala.inline
  def apply(
    body: js.Array[TypeElement],
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSInterfaceBody,
    parent: Node = null
  ): TSInterfaceBody = {
    val __obj = js.Dynamic.literal(body = body, loc = loc, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[TSInterfaceBody]
  }
}

