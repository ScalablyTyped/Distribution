package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.UniqueAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.UniqueInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsUniqueAttrs extends StObject {
  
  var attrs: UniqueAttrs
  
  var backend: MathBackendCPU
  
  var inputs: UniqueInputs
}
object AttrsUniqueAttrs {
  
  @scala.inline
  def apply(attrs: UniqueAttrs, backend: MathBackendCPU, inputs: UniqueInputs): AttrsUniqueAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsUniqueAttrs]
  }
  
  @scala.inline
  implicit class AttrsUniqueAttrsMutableBuilder[Self <: AttrsUniqueAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: UniqueAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: UniqueInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
