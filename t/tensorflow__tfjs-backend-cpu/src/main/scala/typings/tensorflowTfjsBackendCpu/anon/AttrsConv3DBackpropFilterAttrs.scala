package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.Conv3DBackpropFilterAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.Conv3DBackpropFilterInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsConv3DBackpropFilterAttrs extends StObject {
  
  var attrs: Conv3DBackpropFilterAttrs
  
  var backend: MathBackendCPU
  
  var inputs: Conv3DBackpropFilterInputs
}
object AttrsConv3DBackpropFilterAttrs {
  
  @scala.inline
  def apply(attrs: Conv3DBackpropFilterAttrs, backend: MathBackendCPU, inputs: Conv3DBackpropFilterInputs): AttrsConv3DBackpropFilterAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsConv3DBackpropFilterAttrs]
  }
  
  @scala.inline
  implicit class AttrsConv3DBackpropFilterAttrsMutableBuilder[Self <: AttrsConv3DBackpropFilterAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: Conv3DBackpropFilterAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: Conv3DBackpropFilterInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
