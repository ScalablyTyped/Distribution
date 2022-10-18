package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.MultinomialAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.MultinomialInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsMultinomialAttrs extends StObject {
  
  var attrs: MultinomialAttrs
  
  var backend: MathBackendCPU
  
  var inputs: MultinomialInputs
}
object AttrsMultinomialAttrs {
  
  inline def apply(attrs: MultinomialAttrs, backend: MathBackendCPU, inputs: MultinomialInputs): AttrsMultinomialAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsMultinomialAttrs]
  }
  
  extension [Self <: AttrsMultinomialAttrs](x: Self) {
    
    inline def setAttrs(value: MultinomialAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: MultinomialInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
