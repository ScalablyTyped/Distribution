package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'x' | 'dy'> */
trait DepthwiseConv2dNativeBackpropFilterInputs extends StObject {
  
  var dy: js.UndefOr[scala.Any] = js.undefined
  
  var x: js.UndefOr[scala.Any] = js.undefined
}
object DepthwiseConv2dNativeBackpropFilterInputs {
  
  inline def apply(): DepthwiseConv2dNativeBackpropFilterInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DepthwiseConv2dNativeBackpropFilterInputs]
  }
  
  extension [Self <: DepthwiseConv2dNativeBackpropFilterInputs](x: Self) {
    
    inline def setDy(value: scala.Any): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    inline def setX(value: scala.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
