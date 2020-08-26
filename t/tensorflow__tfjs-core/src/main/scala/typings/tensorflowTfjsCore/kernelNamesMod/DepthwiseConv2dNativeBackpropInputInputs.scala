package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'dy'> */
@js.native
trait DepthwiseConv2dNativeBackpropInputInputs extends js.Object {
  var dy: js.UndefOr[js.Any] = js.native
}

object DepthwiseConv2dNativeBackpropInputInputs {
  @scala.inline
  def apply(): DepthwiseConv2dNativeBackpropInputInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DepthwiseConv2dNativeBackpropInputInputs]
  }
  @scala.inline
  implicit class DepthwiseConv2dNativeBackpropInputInputsOps[Self <: DepthwiseConv2dNativeBackpropInputInputs] (val x: Self) extends AnyVal {
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
  }
  
}

