package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'dy' | 'input'> */
@js.native
trait AvgPool3DBackpropInputs extends js.Object {
  var dy: js.UndefOr[js.Any] = js.native
  var input: js.UndefOr[js.Any] = js.native
}

object AvgPool3DBackpropInputs {
  @scala.inline
  def apply(): AvgPool3DBackpropInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvgPool3DBackpropInputs]
  }
  @scala.inline
  implicit class AvgPool3DBackpropInputsOps[Self <: AvgPool3DBackpropInputs] (val x: Self) extends AnyVal {
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
    def setDy(value: js.Any): Self = this.set("dy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDy: Self = this.set("dy", js.undefined)
    @scala.inline
    def setInput(value: js.Any): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
  }
  
}

