package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.ResizeNearestNeighborGradAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.ResizeNearestNeighborGradInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsResizeNearestNeighborGradAttrs extends StObject {
  
  var attrs: ResizeNearestNeighborGradAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: ResizeNearestNeighborGradInputs
}
object AttrsResizeNearestNeighborGradAttrs {
  
  inline def apply(
    attrs: ResizeNearestNeighborGradAttrs,
    backend: MathBackendWebGL,
    inputs: ResizeNearestNeighborGradInputs
  ): AttrsResizeNearestNeighborGradAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsResizeNearestNeighborGradAttrs]
  }
  
  extension [Self <: AttrsResizeNearestNeighborGradAttrs](x: Self) {
    
    inline def setAttrs(value: ResizeNearestNeighborGradAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: ResizeNearestNeighborGradInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
