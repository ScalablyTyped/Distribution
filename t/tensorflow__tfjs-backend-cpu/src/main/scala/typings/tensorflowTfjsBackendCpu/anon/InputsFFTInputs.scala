package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.FFTInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsFFTInputs extends StObject {
  
  var backend: MathBackendCPU
  
  var inputs: FFTInputs
}
object InputsFFTInputs {
  
  inline def apply(backend: MathBackendCPU, inputs: FFTInputs): InputsFFTInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsFFTInputs]
  }
  
  extension [Self <: InputsFFTInputs](x: Self) {
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: FFTInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
