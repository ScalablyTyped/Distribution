package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelNamesMod.Conv2DBackpropInputAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.Conv2DBackpropInputInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsConv2DBackpropInputAttrs extends StObject {
  
  var attrs: Conv2DBackpropInputAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: Conv2DBackpropInputInputs
}
object AttrsConv2DBackpropInputAttrs {
  
  inline def apply(attrs: Conv2DBackpropInputAttrs, backend: MathBackendWebGL, inputs: Conv2DBackpropInputInputs): AttrsConv2DBackpropInputAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsConv2DBackpropInputAttrs]
  }
  
  extension [Self <: AttrsConv2DBackpropInputAttrs](x: Self) {
    
    inline def setAttrs(value: Conv2DBackpropInputAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: Conv2DBackpropInputInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
