package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.Conv3DBackpropInputAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.Conv3DBackpropInputInputs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrsConv3DBackpropInputAttrs extends js.Object {
  
  var attrs: Conv3DBackpropInputAttrs = js.native
  
  var backend: MathBackendCPU = js.native
  
  var inputs: Conv3DBackpropInputInputs = js.native
}
object AttrsConv3DBackpropInputAttrs {
  
  @scala.inline
  def apply(attrs: Conv3DBackpropInputAttrs, backend: MathBackendCPU, inputs: Conv3DBackpropInputInputs): AttrsConv3DBackpropInputAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsConv3DBackpropInputAttrs]
  }
  
  @scala.inline
  implicit class AttrsConv3DBackpropInputAttrsOps[Self <: AttrsConv3DBackpropInputAttrs] (val x: Self) extends AnyVal {
    
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
    def setAttrs(value: Conv3DBackpropInputAttrs): Self = this.set("attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = this.set("backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: Conv3DBackpropInputInputs): Self = this.set("inputs", value.asInstanceOf[js.Any])
  }
}
