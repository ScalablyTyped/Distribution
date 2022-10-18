package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'x' | 'filter'> */
trait Conv3DInputs extends StObject {
  
  var filter: js.UndefOr[scala.Any] = js.undefined
  
  var x: js.UndefOr[scala.Any] = js.undefined
}
object Conv3DInputs {
  
  inline def apply(): Conv3DInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Conv3DInputs]
  }
  
  extension [Self <: Conv3DInputs](x: Self) {
    
    inline def setFilter(value: scala.Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setX(value: scala.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
