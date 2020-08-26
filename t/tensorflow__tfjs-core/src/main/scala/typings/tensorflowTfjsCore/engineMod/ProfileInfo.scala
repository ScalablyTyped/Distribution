package typings.tensorflowTfjsCore.engineMod

import typings.tensorflowTfjsCore.tensorTypesMod.TensorContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfileInfo extends js.Object {
  var kernels: js.Array[KernelProfile] = js.native
  var newBytes: Double = js.native
  var newTensors: Double = js.native
  var peakBytes: Double = js.native
  var result: TensorContainer = js.native
}

object ProfileInfo {
  @scala.inline
  def apply(
    kernels: js.Array[KernelProfile],
    newBytes: Double,
    newTensors: Double,
    peakBytes: Double,
    result: TensorContainer
  ): ProfileInfo = {
    val __obj = js.Dynamic.literal(kernels = kernels.asInstanceOf[js.Any], newBytes = newBytes.asInstanceOf[js.Any], newTensors = newTensors.asInstanceOf[js.Any], peakBytes = peakBytes.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileInfo]
  }
  @scala.inline
  implicit class ProfileInfoOps[Self <: ProfileInfo] (val x: Self) extends AnyVal {
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
    def setKernelsVarargs(value: KernelProfile*): Self = this.set("kernels", js.Array(value :_*))
    @scala.inline
    def setKernels(value: js.Array[KernelProfile]): Self = this.set("kernels", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewBytes(value: Double): Self = this.set("newBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewTensors(value: Double): Self = this.set("newTensors", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeakBytes(value: Double): Self = this.set("peakBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: TensorContainer): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}

