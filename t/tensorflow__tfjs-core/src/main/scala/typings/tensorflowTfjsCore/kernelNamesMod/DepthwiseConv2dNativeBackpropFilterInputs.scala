package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'x' | 'dy'> */
@js.native
trait DepthwiseConv2dNativeBackpropFilterInputs extends js.Object {
  var dy: js.UndefOr[js.Any] = js.native
  var x: js.UndefOr[js.Any] = js.native
}

object DepthwiseConv2dNativeBackpropFilterInputs {
  @scala.inline
  def apply(): DepthwiseConv2dNativeBackpropFilterInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DepthwiseConv2dNativeBackpropFilterInputs]
  }
  @scala.inline
  implicit class DepthwiseConv2dNativeBackpropFilterInputsOps[Self <: DepthwiseConv2dNativeBackpropFilterInputs] (val x: Self) extends AnyVal {
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
    def setX(value: js.Any): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
  }
  
}

