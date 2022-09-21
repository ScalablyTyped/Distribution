package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'images'> */
trait ResizeNearestNeighborInputs extends StObject {
  
  var images: js.UndefOr[scala.Any] = js.undefined
}
object ResizeNearestNeighborInputs {
  
  inline def apply(): ResizeNearestNeighborInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeNearestNeighborInputs]
  }
  
  extension [Self <: ResizeNearestNeighborInputs](x: Self) {
    
    inline def setImages(value: scala.Any): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
  }
}
