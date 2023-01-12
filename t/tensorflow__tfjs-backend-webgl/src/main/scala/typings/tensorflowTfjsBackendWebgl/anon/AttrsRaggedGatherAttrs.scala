package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.RaggedGatherAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.RaggedGatherInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsRaggedGatherAttrs extends StObject {
  
  var attrs: RaggedGatherAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: RaggedGatherInputs
}
object AttrsRaggedGatherAttrs {
  
  inline def apply(attrs: RaggedGatherAttrs, backend: MathBackendWebGL, inputs: RaggedGatherInputs): AttrsRaggedGatherAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsRaggedGatherAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsRaggedGatherAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: RaggedGatherAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: RaggedGatherInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
