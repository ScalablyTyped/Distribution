package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.MaxPoolAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.MaxPoolInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrsMaxPoolAttrs extends StObject {
  
  var attrs: MaxPoolAttrs = js.native
  
  var backend: MathBackendCPU = js.native
  
  var inputs: MaxPoolInputs = js.native
}
object AttrsMaxPoolAttrs {
  
  @scala.inline
  def apply(attrs: MaxPoolAttrs, backend: MathBackendCPU, inputs: MaxPoolInputs): AttrsMaxPoolAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsMaxPoolAttrs]
  }
  
  @scala.inline
  implicit class AttrsMaxPoolAttrsMutableBuilder[Self <: AttrsMaxPoolAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: MaxPoolAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: MaxPoolInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
