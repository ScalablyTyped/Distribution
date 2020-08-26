package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'condition' | 't' | 'e'> */
@js.native
trait SelectV2Inputs extends js.Object {
  var condition: js.UndefOr[js.Any] = js.native
  var e: js.UndefOr[js.Any] = js.native
  var t: js.UndefOr[js.Any] = js.native
}

object SelectV2Inputs {
  @scala.inline
  def apply(): SelectV2Inputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectV2Inputs]
  }
  @scala.inline
  implicit class SelectV2InputsOps[Self <: SelectV2Inputs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCondition(value: js.Any): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    @scala.inline
    def setE(value: js.Any): Self = this.set("e", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteE: Self = this.set("e", js.undefined)
    @scala.inline
    def setT(value: js.Any): Self = this.set("t", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteT: Self = this.set("t", js.undefined)
  }
  
}

