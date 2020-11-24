package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.FusedDepthwiseConv2DAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.FusedDepthwiseConv2DInputs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrsFusedDepthwiseConv2DAttrs extends js.Object {
  
  var attrs: FusedDepthwiseConv2DAttrs = js.native
  
  var backend: MathBackendCPU = js.native
  
  var inputs: FusedDepthwiseConv2DInputs = js.native
}
object AttrsFusedDepthwiseConv2DAttrs {
  
  @scala.inline
  def apply(attrs: FusedDepthwiseConv2DAttrs, backend: MathBackendCPU, inputs: FusedDepthwiseConv2DInputs): AttrsFusedDepthwiseConv2DAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsFusedDepthwiseConv2DAttrs]
  }
  
  @scala.inline
  implicit class AttrsFusedDepthwiseConv2DAttrsOps[Self <: AttrsFusedDepthwiseConv2DAttrs] (val x: Self) extends AnyVal {
    
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
    def setAttrs(value: FusedDepthwiseConv2DAttrs): Self = this.set("attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = this.set("backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: FusedDepthwiseConv2DInputs): Self = this.set("inputs", value.asInstanceOf[js.Any])
  }
}
