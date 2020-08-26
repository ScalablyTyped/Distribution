package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreFinallyFlow
  extends FlowNodeBase
     with FlowNode {
  var antecedent: FlowNode = js.native
  var lock: FlowLock = js.native
}

object PreFinallyFlow {
  @scala.inline
  def apply(antecedent: FlowNode, flags: FlowFlags, lock: FlowLock): PreFinallyFlow = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], lock = lock.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreFinallyFlow]
  }
  @scala.inline
  implicit class PreFinallyFlowOps[Self <: PreFinallyFlow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAntecedent(value: FlowNode): Self = this.set("antecedent", value.asInstanceOf[js.Any])
    @scala.inline
    def setLock(value: FlowLock): Self = this.set("lock", value.asInstanceOf[js.Any])
  }
  
}

