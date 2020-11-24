package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.Conv2DBackpropInputAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.Conv2DBackpropInputInputs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrsConv2DBackpropInputAttrs extends js.Object {
  
  var attrs: Conv2DBackpropInputAttrs = js.native
  
  var backend: MathBackendCPU = js.native
  
  var inputs: Conv2DBackpropInputInputs = js.native
}
object AttrsConv2DBackpropInputAttrs {
  
  @scala.inline
  def apply(attrs: Conv2DBackpropInputAttrs, backend: MathBackendCPU, inputs: Conv2DBackpropInputInputs): AttrsConv2DBackpropInputAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsConv2DBackpropInputAttrs]
  }
  
  @scala.inline
  implicit class AttrsConv2DBackpropInputAttrsOps[Self <: AttrsConv2DBackpropInputAttrs] (val x: Self) extends AnyVal {
    
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
    def setAttrs(value: Conv2DBackpropInputAttrs): Self = this.set("attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = this.set("backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: Conv2DBackpropInputInputs): Self = this.set("inputs", value.asInstanceOf[js.Any])
  }
}
