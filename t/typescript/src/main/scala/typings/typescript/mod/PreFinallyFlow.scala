package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreFinallyFlow
  extends FlowNodeBase
     with FlowNode {
  var antecedent: FlowNode
  var lock: FlowLock
}

object PreFinallyFlow {
  @scala.inline
  def apply(antecedent: FlowNode, flags: FlowFlags, lock: FlowLock, id: js.UndefOr[Double] = js.undefined): PreFinallyFlow = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], lock = lock.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreFinallyFlow]
  }
}

