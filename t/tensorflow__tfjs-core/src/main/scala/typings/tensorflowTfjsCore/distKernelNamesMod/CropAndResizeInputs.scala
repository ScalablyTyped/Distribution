package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'image' | 'boxes' | 'boxInd'> */
trait CropAndResizeInputs extends StObject {
  
  var boxInd: js.UndefOr[scala.Any] = js.undefined
  
  var boxes: js.UndefOr[scala.Any] = js.undefined
  
  var image: js.UndefOr[scala.Any] = js.undefined
}
object CropAndResizeInputs {
  
  inline def apply(): CropAndResizeInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CropAndResizeInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CropAndResizeInputs] (val x: Self) extends AnyVal {
    
    inline def setBoxInd(value: scala.Any): Self = StObject.set(x, "boxInd", value.asInstanceOf[js.Any])
    
    inline def setBoxIndUndefined: Self = StObject.set(x, "boxInd", js.undefined)
    
    inline def setBoxes(value: scala.Any): Self = StObject.set(x, "boxes", value.asInstanceOf[js.Any])
    
    inline def setBoxesUndefined: Self = StObject.set(x, "boxes", js.undefined)
    
    inline def setImage(value: scala.Any): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
