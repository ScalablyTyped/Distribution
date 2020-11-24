package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.SpaceToBatchNDAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.SpaceToBatchNDInputs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrsSpaceToBatchNDAttrs extends js.Object {
  
  var attrs: SpaceToBatchNDAttrs = js.native
  
  var backend: MathBackendCPU = js.native
  
  var inputs: SpaceToBatchNDInputs = js.native
}
object AttrsSpaceToBatchNDAttrs {
  
  @scala.inline
  def apply(attrs: SpaceToBatchNDAttrs, backend: MathBackendCPU, inputs: SpaceToBatchNDInputs): AttrsSpaceToBatchNDAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsSpaceToBatchNDAttrs]
  }
  
  @scala.inline
  implicit class AttrsSpaceToBatchNDAttrsOps[Self <: AttrsSpaceToBatchNDAttrs] (val x: Self) extends AnyVal {
    
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
    def setAttrs(value: SpaceToBatchNDAttrs): Self = this.set("attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = this.set("backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: SpaceToBatchNDInputs): Self = this.set("inputs", value.asInstanceOf[js.Any])
  }
}
