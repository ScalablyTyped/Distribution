package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.CumprodAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.CumprodInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsCumprodAttrs extends StObject {
  
  var attrs: CumprodAttrs
  
  var backend: MathBackendCPU
  
  var inputs: CumprodInputs
}
object AttrsCumprodAttrs {
  
  inline def apply(attrs: CumprodAttrs, backend: MathBackendCPU, inputs: CumprodInputs): AttrsCumprodAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsCumprodAttrs]
  }
  
  extension [Self <: AttrsCumprodAttrs](x: Self) {
    
    inline def setAttrs(value: CumprodAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: CumprodInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
