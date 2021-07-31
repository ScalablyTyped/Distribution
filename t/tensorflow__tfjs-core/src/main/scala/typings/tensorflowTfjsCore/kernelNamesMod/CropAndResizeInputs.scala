package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'image' | 'boxes' | 'boxInd'> */
trait CropAndResizeInputs extends StObject {
  
  var boxInd: js.UndefOr[js.Any] = js.undefined
  
  var boxes: js.UndefOr[js.Any] = js.undefined
  
  var image: js.UndefOr[js.Any] = js.undefined
}
object CropAndResizeInputs {
  
  @scala.inline
  def apply(): CropAndResizeInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CropAndResizeInputs]
  }
  
  @scala.inline
  implicit class CropAndResizeInputsMutableBuilder[Self <: CropAndResizeInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoxInd(value: js.Any): Self = StObject.set(x, "boxInd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxIndUndefined: Self = StObject.set(x, "boxInd", js.undefined)
    
    @scala.inline
    def setBoxes(value: js.Any): Self = StObject.set(x, "boxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxesUndefined: Self = StObject.set(x, "boxes", js.undefined)
    
    @scala.inline
    def setImage(value: js.Any): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
