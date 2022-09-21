package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelNamesMod.SumAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.SumInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsSumAttrs extends StObject {
  
  var attrs: SumAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: SumInputs
}
object AttrsSumAttrs {
  
  inline def apply(attrs: SumAttrs, backend: MathBackendWebGL, inputs: SumInputs): AttrsSumAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsSumAttrs]
  }
  
  extension [Self <: AttrsSumAttrs](x: Self) {
    
    inline def setAttrs(value: SumAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: SumInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
