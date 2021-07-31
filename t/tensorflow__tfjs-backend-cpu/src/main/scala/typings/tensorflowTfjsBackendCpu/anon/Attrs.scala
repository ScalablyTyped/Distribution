package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.AvgPoolAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.AvgPoolInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attrs extends StObject {
  
  var attrs: AvgPoolAttrs
  
  var backend: MathBackendCPU
  
  var inputs: AvgPoolInputs
}
object Attrs {
  
  @scala.inline
  def apply(attrs: AvgPoolAttrs, backend: MathBackendCPU, inputs: AvgPoolInputs): Attrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attrs]
  }
  
  @scala.inline
  implicit class AttrsMutableBuilder[Self <: Attrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: AvgPoolAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: AvgPoolInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
