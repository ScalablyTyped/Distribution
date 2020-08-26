package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'real' | 'imag'> */
@js.native
trait ComplexInputs extends js.Object {
  var imag: js.UndefOr[js.Any] = js.native
  var real: js.UndefOr[js.Any] = js.native
}

object ComplexInputs {
  @scala.inline
  def apply(): ComplexInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplexInputs]
  }
  @scala.inline
  implicit class ComplexInputsOps[Self <: ComplexInputs] (val x: Self) extends AnyVal {
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
    def setImag(value: js.Any): Self = this.set("imag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImag: Self = this.set("imag", js.undefined)
    @scala.inline
    def setReal(value: js.Any): Self = this.set("real", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReal: Self = this.set("real", js.undefined)
  }
  
}

