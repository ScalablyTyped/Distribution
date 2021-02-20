package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.Conv2DAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.Conv2DInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrsConv2DAttrs extends StObject {
  
  var attrs: Conv2DAttrs = js.native
  
  var backend: MathBackendCPU = js.native
  
  var inputs: Conv2DInputs = js.native
}
object AttrsConv2DAttrs {
  
  @scala.inline
  def apply(attrs: Conv2DAttrs, backend: MathBackendCPU, inputs: Conv2DInputs): AttrsConv2DAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsConv2DAttrs]
  }
  
  @scala.inline
  implicit class AttrsConv2DAttrsMutableBuilder[Self <: AttrsConv2DAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: Conv2DAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: Conv2DInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
