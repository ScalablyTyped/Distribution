package typings.tensorflowTfjsBackendWebgl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core.NamedTensorInfoMap, 'image' | 'boxes' | 'boxInd'> */
trait PickNamedTensorInfoMapima extends StObject {
  
  var boxInd: js.UndefOr[Any] = js.undefined
  
  var boxes: js.UndefOr[Any] = js.undefined
  
  var image: js.UndefOr[Any] = js.undefined
}
object PickNamedTensorInfoMapima {
  
  inline def apply(): PickNamedTensorInfoMapima = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickNamedTensorInfoMapima]
  }
  
  extension [Self <: PickNamedTensorInfoMapima](x: Self) {
    
    inline def setBoxInd(value: Any): Self = StObject.set(x, "boxInd", value.asInstanceOf[js.Any])
    
    inline def setBoxIndUndefined: Self = StObject.set(x, "boxInd", js.undefined)
    
    inline def setBoxes(value: Any): Self = StObject.set(x, "boxes", value.asInstanceOf[js.Any])
    
    inline def setBoxesUndefined: Self = StObject.set(x, "boxes", js.undefined)
    
    inline def setImage(value: Any): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
