package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'images' | 'dy'> */
trait ResizeBilinearGradInputs extends StObject {
  
  var dy: js.UndefOr[scala.Any] = js.undefined
  
  var images: js.UndefOr[scala.Any] = js.undefined
}
object ResizeBilinearGradInputs {
  
  inline def apply(): ResizeBilinearGradInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeBilinearGradInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResizeBilinearGradInputs] (val x: Self) extends AnyVal {
    
    inline def setDy(value: scala.Any): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    inline def setImages(value: scala.Any): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
  }
}
