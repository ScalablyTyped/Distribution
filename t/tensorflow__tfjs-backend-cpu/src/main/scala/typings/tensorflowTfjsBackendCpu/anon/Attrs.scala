package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.AllAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.AllInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attrs extends StObject {
  
  var attrs: AllAttrs
  
  var backend: MathBackendCPU
  
  var inputs: AllInputs
}
object Attrs {
  
  inline def apply(attrs: AllAttrs, backend: MathBackendCPU, inputs: AllInputs): Attrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attrs]
  }
  
  extension [Self <: Attrs](x: Self) {
    
    inline def setAttrs(value: AllAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: AllInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
