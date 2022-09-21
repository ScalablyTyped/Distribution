package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'dy' | 'y'> */
trait EluGradInputs extends StObject {
  
  var dy: js.UndefOr[scala.Any] = js.undefined
  
  var y: js.UndefOr[scala.Any] = js.undefined
}
object EluGradInputs {
  
  inline def apply(): EluGradInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EluGradInputs]
  }
  
  extension [Self <: EluGradInputs](x: Self) {
    
    inline def setDy(value: scala.Any): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    inline def setY(value: scala.Any): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
