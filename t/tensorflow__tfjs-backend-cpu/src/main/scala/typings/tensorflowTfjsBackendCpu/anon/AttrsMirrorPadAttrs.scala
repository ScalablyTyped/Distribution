package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.MirrorPadAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.MirrorPadInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsMirrorPadAttrs extends StObject {
  
  var attrs: MirrorPadAttrs
  
  var backend: MathBackendCPU
  
  var inputs: MirrorPadInputs
}
object AttrsMirrorPadAttrs {
  
  @scala.inline
  def apply(attrs: MirrorPadAttrs, backend: MathBackendCPU, inputs: MirrorPadInputs): AttrsMirrorPadAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsMirrorPadAttrs]
  }
  
  @scala.inline
  implicit class AttrsMirrorPadAttrsMutableBuilder[Self <: AttrsMirrorPadAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: MirrorPadAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: MirrorPadInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
