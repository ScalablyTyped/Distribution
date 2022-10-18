package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.ResizeNearestNeighborAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.ResizeNearestNeighborInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsResizeNearestNeighborAttrs extends StObject {
  
  var attrs: ResizeNearestNeighborAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: ResizeNearestNeighborInputs
}
object AttrsResizeNearestNeighborAttrs {
  
  inline def apply(attrs: ResizeNearestNeighborAttrs, backend: MathBackendWebGL, inputs: ResizeNearestNeighborInputs): AttrsResizeNearestNeighborAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsResizeNearestNeighborAttrs]
  }
  
  extension [Self <: AttrsResizeNearestNeighborAttrs](x: Self) {
    
    inline def setAttrs(value: ResizeNearestNeighborAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: ResizeNearestNeighborInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
