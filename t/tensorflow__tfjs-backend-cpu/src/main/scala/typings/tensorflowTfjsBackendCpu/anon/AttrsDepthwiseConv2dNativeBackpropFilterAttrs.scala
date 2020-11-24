package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.DepthwiseConv2dNativeBackpropFilterAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.DepthwiseConv2dNativeBackpropFilterInputs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrsDepthwiseConv2dNativeBackpropFilterAttrs extends js.Object {
  
  var attrs: DepthwiseConv2dNativeBackpropFilterAttrs = js.native
  
  var backend: MathBackendCPU = js.native
  
  var inputs: DepthwiseConv2dNativeBackpropFilterInputs = js.native
}
object AttrsDepthwiseConv2dNativeBackpropFilterAttrs {
  
  @scala.inline
  def apply(
    attrs: DepthwiseConv2dNativeBackpropFilterAttrs,
    backend: MathBackendCPU,
    inputs: DepthwiseConv2dNativeBackpropFilterInputs
  ): AttrsDepthwiseConv2dNativeBackpropFilterAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsDepthwiseConv2dNativeBackpropFilterAttrs]
  }
  
  @scala.inline
  implicit class AttrsDepthwiseConv2dNativeBackpropFilterAttrsOps[Self <: AttrsDepthwiseConv2dNativeBackpropFilterAttrs] (val x: Self) extends AnyVal {
    
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
    def setAttrs(value: DepthwiseConv2dNativeBackpropFilterAttrs): Self = this.set("attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = this.set("backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: DepthwiseConv2dNativeBackpropFilterInputs): Self = this.set("inputs", value.asInstanceOf[js.Any])
  }
}
