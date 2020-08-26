package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'indices'> */
@js.native
trait OneHotInputs extends js.Object {
  var indices: js.UndefOr[js.Any] = js.native
}

object OneHotInputs {
  @scala.inline
  def apply(): OneHotInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OneHotInputs]
  }
  @scala.inline
  implicit class OneHotInputsOps[Self <: OneHotInputs] (val x: Self) extends AnyVal {
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
    def setIndices(value: js.Any): Self = this.set("indices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndices: Self = this.set("indices", js.undefined)
  }
  
}

