package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.BincountAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.BincountInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsBincountAttrs extends StObject {
  
  var attrs: BincountAttrs
  
  var backend: MathBackendCPU
  
  var inputs: BincountInputs
}
object AttrsBincountAttrs {
  
  inline def apply(attrs: BincountAttrs, backend: MathBackendCPU, inputs: BincountInputs): AttrsBincountAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsBincountAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsBincountAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: BincountAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: BincountInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
