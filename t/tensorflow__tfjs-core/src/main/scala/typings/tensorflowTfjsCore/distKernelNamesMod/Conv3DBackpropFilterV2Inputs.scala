package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'x' | 'dy'> */
trait Conv3DBackpropFilterV2Inputs extends StObject {
  
  var dy: js.UndefOr[scala.Any] = js.undefined
  
  var x: js.UndefOr[scala.Any] = js.undefined
}
object Conv3DBackpropFilterV2Inputs {
  
  inline def apply(): Conv3DBackpropFilterV2Inputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Conv3DBackpropFilterV2Inputs]
  }
  
  extension [Self <: Conv3DBackpropFilterV2Inputs](x: Self) {
    
    inline def setDy(value: scala.Any): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    inline def setX(value: scala.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
