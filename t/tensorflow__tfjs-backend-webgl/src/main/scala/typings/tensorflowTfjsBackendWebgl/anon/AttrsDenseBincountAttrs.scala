package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelNamesMod.DenseBincountAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.DenseBincountInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsDenseBincountAttrs extends StObject {
  
  var attrs: DenseBincountAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: DenseBincountInputs
}
object AttrsDenseBincountAttrs {
  
  inline def apply(attrs: DenseBincountAttrs, backend: MathBackendWebGL, inputs: DenseBincountInputs): AttrsDenseBincountAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsDenseBincountAttrs]
  }
  
  extension [Self <: AttrsDenseBincountAttrs](x: Self) {
    
    inline def setAttrs(value: DenseBincountAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: DenseBincountInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
