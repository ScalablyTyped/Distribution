package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'image'> */
trait RotateWithOffsetInputs extends StObject {
  
  var image: js.UndefOr[scala.Any] = js.undefined
}
object RotateWithOffsetInputs {
  
  inline def apply(): RotateWithOffsetInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotateWithOffsetInputs]
  }
  
  extension [Self <: RotateWithOffsetInputs](x: Self) {
    
    inline def setImage(value: scala.Any): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
