package typings
package typescriptLib.typescriptMod.tsNs

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
  def apply(antecedent: FlowNode, flags: FlowFlags, lock: FlowLock, id: scala.Int | scala.Double = null): PreFinallyFlow = {
    val __obj = js.Dynamic.literal(antecedent = antecedent, flags = flags, lock = lock)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreFinallyFlow]
  }
}

