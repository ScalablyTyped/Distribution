package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.TopKAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.TopKInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsTopKAttrs extends StObject {
  
  var attrs: TopKAttrs
  
  var backend: MathBackendCPU
  
  var inputs: TopKInputs
}
object AttrsTopKAttrs {
  
  inline def apply(attrs: TopKAttrs, backend: MathBackendCPU, inputs: TopKInputs): AttrsTopKAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsTopKAttrs]
  }
  
  extension [Self <: AttrsTopKAttrs](x: Self) {
    
    inline def setAttrs(value: TopKAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: TopKInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
