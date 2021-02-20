package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'images'> */
@js.native
trait ResizeNearestNeighborInputs extends StObject {
  
  var images: js.UndefOr[js.Any] = js.native
}
object ResizeNearestNeighborInputs {
  
  @scala.inline
  def apply(): ResizeNearestNeighborInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeNearestNeighborInputs]
  }
  
  @scala.inline
  implicit class ResizeNearestNeighborInputsMutableBuilder[Self <: ResizeNearestNeighborInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImages(value: js.Any): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
  }
}
