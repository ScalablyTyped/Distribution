package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.TransposeAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.TransposeInputs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrsTransposeAttrs extends js.Object {
  
  var attrs: TransposeAttrs = js.native
  
  var backend: MathBackendCPU = js.native
  
  var inputs: TransposeInputs = js.native
}
object AttrsTransposeAttrs {
  
  @scala.inline
  def apply(attrs: TransposeAttrs, backend: MathBackendCPU, inputs: TransposeInputs): AttrsTransposeAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsTransposeAttrs]
  }
  
  @scala.inline
  implicit class AttrsTransposeAttrsOps[Self <: AttrsTransposeAttrs] (val x: Self) extends AnyVal {
    
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
    def setAttrs(value: TransposeAttrs): Self = this.set("attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = this.set("backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: TransposeInputs): Self = this.set("inputs", value.asInstanceOf[js.Any])
  }
}
