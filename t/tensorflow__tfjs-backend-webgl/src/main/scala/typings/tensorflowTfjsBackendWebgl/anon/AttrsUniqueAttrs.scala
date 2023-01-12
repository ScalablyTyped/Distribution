package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.UniqueAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.UniqueInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsUniqueAttrs extends StObject {
  
  var attrs: UniqueAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: UniqueInputs
}
object AttrsUniqueAttrs {
  
  inline def apply(attrs: UniqueAttrs, backend: MathBackendWebGL, inputs: UniqueInputs): AttrsUniqueAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsUniqueAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsUniqueAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: UniqueAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: UniqueInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
