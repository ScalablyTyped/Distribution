package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'x' | 'filter'> */
@js.native
trait DepthwiseConv2dNativeInputs extends js.Object {
  var filter: js.UndefOr[js.Any] = js.native
  var x: js.UndefOr[js.Any] = js.native
}

object DepthwiseConv2dNativeInputs {
  @scala.inline
  def apply(): DepthwiseConv2dNativeInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DepthwiseConv2dNativeInputs]
  }
  @scala.inline
  implicit class DepthwiseConv2dNativeInputsOps[Self <: DepthwiseConv2dNativeInputs] (val x: Self) extends AnyVal {
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
    def setFilter(value: js.Any): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setX(value: js.Any): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
  }
  
}

