package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.ProdAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.ProdInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsProdAttrs extends StObject {
  
  var attrs: ProdAttrs
  
  var backend: MathBackendCPU
  
  var inputs: ProdInputs
}
object AttrsProdAttrs {
  
  inline def apply(attrs: ProdAttrs, backend: MathBackendCPU, inputs: ProdInputs): AttrsProdAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsProdAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsProdAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: ProdAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: ProdInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
