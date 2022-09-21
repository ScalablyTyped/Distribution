package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelNamesMod.StringNGramsAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.StringNGramsInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsStringNGramsAttrs extends StObject {
  
  var attrs: StringNGramsAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: StringNGramsInputs
}
object AttrsStringNGramsAttrs {
  
  inline def apply(attrs: StringNGramsAttrs, backend: MathBackendWebGL, inputs: StringNGramsInputs): AttrsStringNGramsAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsStringNGramsAttrs]
  }
  
  extension [Self <: AttrsStringNGramsAttrs](x: Self) {
    
    inline def setAttrs(value: StringNGramsAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: StringNGramsInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
