package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.AllAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.AllInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attrs extends StObject {
  
  var attrs: AllAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: AllInputs
}
object Attrs {
  
  inline def apply(attrs: AllAttrs, backend: MathBackendWebGL, inputs: AllInputs): Attrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Attrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: AllAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: AllInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
