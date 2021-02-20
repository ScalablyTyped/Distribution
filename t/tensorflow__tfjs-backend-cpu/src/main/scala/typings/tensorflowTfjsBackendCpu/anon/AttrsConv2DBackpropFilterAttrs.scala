package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.Conv2DBackpropFilterAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.Conv2DBackpropFilterInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrsConv2DBackpropFilterAttrs extends StObject {
  
  var attrs: Conv2DBackpropFilterAttrs = js.native
  
  var backend: MathBackendCPU = js.native
  
  var inputs: Conv2DBackpropFilterInputs = js.native
}
object AttrsConv2DBackpropFilterAttrs {
  
  @scala.inline
  def apply(attrs: Conv2DBackpropFilterAttrs, backend: MathBackendCPU, inputs: Conv2DBackpropFilterInputs): AttrsConv2DBackpropFilterAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsConv2DBackpropFilterAttrs]
  }
  
  @scala.inline
  implicit class AttrsConv2DBackpropFilterAttrsMutableBuilder[Self <: AttrsConv2DBackpropFilterAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: Conv2DBackpropFilterAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: Conv2DBackpropFilterInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
