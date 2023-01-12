package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'dy' | 'filter'> */
trait DepthwiseConv2dNativeBackpropInputInputs extends StObject {
  
  var dy: js.UndefOr[scala.Any] = js.undefined
  
  var filter: js.UndefOr[scala.Any] = js.undefined
}
object DepthwiseConv2dNativeBackpropInputInputs {
  
  inline def apply(): DepthwiseConv2dNativeBackpropInputInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DepthwiseConv2dNativeBackpropInputInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DepthwiseConv2dNativeBackpropInputInputs] (val x: Self) extends AnyVal {
    
    inline def setDy(value: scala.Any): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    inline def setFilter(value: scala.Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
