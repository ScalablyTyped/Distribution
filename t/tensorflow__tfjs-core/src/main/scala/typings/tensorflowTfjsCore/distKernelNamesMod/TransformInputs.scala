package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'image' | 'transforms'> */
trait TransformInputs extends StObject {
  
  var image: js.UndefOr[scala.Any] = js.undefined
  
  var transforms: js.UndefOr[scala.Any] = js.undefined
}
object TransformInputs {
  
  inline def apply(): TransformInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformInputs] (val x: Self) extends AnyVal {
    
    inline def setImage(value: scala.Any): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setTransforms(value: scala.Any): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
    
    inline def setTransformsUndefined: Self = StObject.set(x, "transforms", js.undefined)
  }
}
