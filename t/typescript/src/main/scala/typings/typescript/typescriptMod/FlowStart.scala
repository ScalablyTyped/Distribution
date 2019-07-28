package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowStart
  extends FlowNodeBase
     with FlowNode {
  var container: js.UndefOr[FunctionExpression | ArrowFunction | MethodDeclaration] = js.undefined
}

object FlowStart {
  @scala.inline
  def apply(
    flags: FlowFlags,
    container: FunctionExpression | ArrowFunction | MethodDeclaration = null,
    id: Int | Double = null
  ): FlowStart = {
    val __obj = js.Dynamic.literal(flags = flags)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowStart]
  }
}

