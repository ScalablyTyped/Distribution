package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.CastAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.CastInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsBackendInputs extends StObject {
  
  var attrs: CastAttrs
  
  var backend: MathBackendCPU
  
  var inputs: CastInputs
}
object AttrsBackendInputs {
  
  @scala.inline
  def apply(attrs: CastAttrs, backend: MathBackendCPU, inputs: CastInputs): AttrsBackendInputs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsBackendInputs]
  }
  
  @scala.inline
  implicit class AttrsBackendInputsMutableBuilder[Self <: AttrsBackendInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: CastAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: CastInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
