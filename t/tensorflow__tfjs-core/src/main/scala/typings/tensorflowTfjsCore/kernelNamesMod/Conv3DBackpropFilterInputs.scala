package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'x' | 'y'> */
@js.native
trait Conv3DBackpropFilterInputs extends js.Object {
  var x: js.UndefOr[js.Any] = js.native
  var y: js.UndefOr[js.Any] = js.native
}

object Conv3DBackpropFilterInputs {
  @scala.inline
  def apply(): Conv3DBackpropFilterInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Conv3DBackpropFilterInputs]
  }
  @scala.inline
  implicit class Conv3DBackpropFilterInputsOps[Self <: Conv3DBackpropFilterInputs] (val x: Self) extends AnyVal {
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
    def setX(value: js.Any): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: js.Any): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

