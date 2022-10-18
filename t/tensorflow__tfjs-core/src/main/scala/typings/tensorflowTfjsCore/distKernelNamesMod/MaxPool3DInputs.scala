package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'x'> */
trait MaxPool3DInputs extends StObject {
  
  var x: js.UndefOr[scala.Any] = js.undefined
}
object MaxPool3DInputs {
  
  inline def apply(): MaxPool3DInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxPool3DInputs]
  }
  
  extension [Self <: MaxPool3DInputs](x: Self) {
    
    inline def setX(value: scala.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
