package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'dy' | 'filter'> */
trait Conv2DBackpropInputInputs extends StObject {
  
  var dy: js.UndefOr[js.Any] = js.undefined
  
  var filter: js.UndefOr[js.Any] = js.undefined
}
object Conv2DBackpropInputInputs {
  
  inline def apply(): Conv2DBackpropInputInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Conv2DBackpropInputInputs]
  }
  
  extension [Self <: Conv2DBackpropInputInputs](x: Self) {
    
    inline def setDy(value: js.Any): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    inline def setFilter(value: js.Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
