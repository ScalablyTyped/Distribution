package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AfterFinallyFlow
  extends FlowNodeBase
     with FlowLock
     with FlowNode {
  var antecedent: FlowNode
}

object AfterFinallyFlow {
  @scala.inline
  def apply(
    antecedent: FlowNode,
    flags: FlowFlags,
    id: Int | Double = null,
    locked: js.UndefOr[Boolean] = js.undefined
  ): AfterFinallyFlow = {
    val __obj = js.Dynamic.literal(antecedent = antecedent, flags = flags)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked)
    __obj.asInstanceOf[AfterFinallyFlow]
  }
}

