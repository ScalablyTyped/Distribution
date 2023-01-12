package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.MinAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.MinInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsMinAttrs extends StObject {
  
  var attrs: MinAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: MinInputs
}
object AttrsMinAttrs {
  
  inline def apply(attrs: MinAttrs, backend: MathBackendWebGL, inputs: MinInputs): AttrsMinAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsMinAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsMinAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: MinAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: MinInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
