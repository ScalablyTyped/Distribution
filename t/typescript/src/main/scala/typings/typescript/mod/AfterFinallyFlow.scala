package typings.typescript.mod

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
    id: js.UndefOr[Double] = js.undefined,
    locked: js.UndefOr[Boolean] = js.undefined
  ): AfterFinallyFlow = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterFinallyFlow]
  }
}

