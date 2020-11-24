package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.DepthwiseConv2dNativeBackpropInputAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.DepthwiseConv2dNativeBackpropInputInputs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrsDepthwiseConv2dNativeBackpropInputAttrs extends js.Object {
  
  var attrs: DepthwiseConv2dNativeBackpropInputAttrs = js.native
  
  var backend: MathBackendCPU = js.native
  
  var inputs: DepthwiseConv2dNativeBackpropInputInputs = js.native
}
object AttrsDepthwiseConv2dNativeBackpropInputAttrs {
  
  @scala.inline
  def apply(
    attrs: DepthwiseConv2dNativeBackpropInputAttrs,
    backend: MathBackendCPU,
    inputs: DepthwiseConv2dNativeBackpropInputInputs
  ): AttrsDepthwiseConv2dNativeBackpropInputAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsDepthwiseConv2dNativeBackpropInputAttrs]
  }
  
  @scala.inline
  implicit class AttrsDepthwiseConv2dNativeBackpropInputAttrsOps[Self <: AttrsDepthwiseConv2dNativeBackpropInputAttrs] (val x: Self) extends AnyVal {
    
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
    def setAttrs(value: DepthwiseConv2dNativeBackpropInputAttrs): Self = this.set("attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = this.set("backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: DepthwiseConv2dNativeBackpropInputInputs): Self = this.set("inputs", value.asInstanceOf[js.Any])
  }
}
