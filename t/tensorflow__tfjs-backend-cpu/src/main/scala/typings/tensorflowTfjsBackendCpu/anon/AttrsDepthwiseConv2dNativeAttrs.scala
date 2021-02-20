package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.DepthwiseConv2dNativeAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.DepthwiseConv2dNativeInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrsDepthwiseConv2dNativeAttrs extends StObject {
  
  var attrs: DepthwiseConv2dNativeAttrs = js.native
  
  var backend: MathBackendCPU = js.native
  
  var inputs: DepthwiseConv2dNativeInputs = js.native
}
object AttrsDepthwiseConv2dNativeAttrs {
  
  @scala.inline
  def apply(attrs: DepthwiseConv2dNativeAttrs, backend: MathBackendCPU, inputs: DepthwiseConv2dNativeInputs): AttrsDepthwiseConv2dNativeAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsDepthwiseConv2dNativeAttrs]
  }
  
  @scala.inline
  implicit class AttrsDepthwiseConv2dNativeAttrsMutableBuilder[Self <: AttrsDepthwiseConv2dNativeAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: DepthwiseConv2dNativeAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: DepthwiseConv2dNativeInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
