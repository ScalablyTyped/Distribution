package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.FusedConv2DAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.FusedConv2DInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsFusedConv2DAttrs extends StObject {
  
  var attrs: FusedConv2DAttrs
  
  var backend: MathBackendCPU
  
  var inputs: FusedConv2DInputs
}
object AttrsFusedConv2DAttrs {
  
  @scala.inline
  def apply(attrs: FusedConv2DAttrs, backend: MathBackendCPU, inputs: FusedConv2DInputs): AttrsFusedConv2DAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsFusedConv2DAttrs]
  }
  
  @scala.inline
  implicit class AttrsFusedConv2DAttrsMutableBuilder[Self <: AttrsFusedConv2DAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: FusedConv2DAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: FusedConv2DInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
