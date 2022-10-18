package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.SearchSortedAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.SearchSortedInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsSearchSortedAttrs extends StObject {
  
  var attrs: SearchSortedAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: SearchSortedInputs
}
object AttrsSearchSortedAttrs {
  
  inline def apply(attrs: SearchSortedAttrs, backend: MathBackendWebGL, inputs: SearchSortedInputs): AttrsSearchSortedAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsSearchSortedAttrs]
  }
  
  extension [Self <: AttrsSearchSortedAttrs](x: Self) {
    
    inline def setAttrs(value: SearchSortedAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: SearchSortedInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
