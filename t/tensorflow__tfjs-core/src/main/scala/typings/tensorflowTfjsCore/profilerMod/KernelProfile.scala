package typings.tensorflowTfjsCore.profilerMod

import typings.tensorflowTfjsCore.anon.Error
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KernelProfile extends js.Object {
  
  var extraInfo: js.Promise[String] = js.native
  
  var inputs: NamedTensorMap = js.native
  
  var kernelName: String = js.native
  
  var outputs: js.Array[Tensor[Rank]] = js.native
  
  var timeMs: js.Promise[Double | Error] = js.native
}
object KernelProfile {
  
  @scala.inline
  def apply(
    extraInfo: js.Promise[String],
    inputs: NamedTensorMap,
    kernelName: String,
    outputs: js.Array[Tensor[Rank]],
    timeMs: js.Promise[Double | Error]
  ): KernelProfile = {
    val __obj = js.Dynamic.literal(extraInfo = extraInfo.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], kernelName = kernelName.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], timeMs = timeMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[KernelProfile]
  }
  
  @scala.inline
  implicit class KernelProfileOps[Self <: KernelProfile] (val x: Self) extends AnyVal {
    
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
    def setExtraInfo(value: js.Promise[String]): Self = this.set("extraInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: NamedTensorMap): Self = this.set("inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelName(value: String): Self = this.set("kernelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsVarargs(value: Tensor[Rank]*): Self = this.set("outputs", js.Array(value :_*))
    
    @scala.inline
    def setOutputs(value: js.Array[Tensor[Rank]]): Self = this.set("outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeMs(value: js.Promise[Double | Error]): Self = this.set("timeMs", value.asInstanceOf[js.Any])
  }
}
