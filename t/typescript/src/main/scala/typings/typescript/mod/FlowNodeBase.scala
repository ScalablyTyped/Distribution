package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowNodeBase extends js.Object {
  var flags: FlowFlags = js.native
  var id: js.UndefOr[Double] = js.native
}

object FlowNodeBase {
  @scala.inline
  def apply(flags: FlowFlags): FlowNodeBase = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowNodeBase]
  }
  @scala.inline
  implicit class FlowNodeBaseOps[Self <: FlowNodeBase] (val x: Self) extends AnyVal {
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
    def setFlags(value: FlowFlags): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

