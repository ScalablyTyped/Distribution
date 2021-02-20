package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.FusedDepthwiseConv2DAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.FusedDepthwiseConv2DInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrsFusedDepthwiseConv2DAttrs extends StObject {
  
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
  implicit class AttrsFusedDepthwiseConv2DAttrsMutableBuilder[Self <: AttrsFusedDepthwiseConv2DAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: FusedDepthwiseConv2DAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: FusedDepthwiseConv2DInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
