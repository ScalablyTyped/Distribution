package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelNamesMod.RangeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsRangeAttrs extends StObject {
  
  var attrs: RangeAttrs
  
  var backend: MathBackendWebGL
}
object AttrsRangeAttrs {
  
  inline def apply(attrs: RangeAttrs, backend: MathBackendWebGL): AttrsRangeAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsRangeAttrs]
  }
  
  extension [Self <: AttrsRangeAttrs](x: Self) {
    
    inline def setAttrs(value: RangeAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
  }
}
