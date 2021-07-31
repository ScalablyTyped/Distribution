package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'dy' | 'filter'> */
trait Conv3DBackpropInputInputs extends StObject {
  
  var dy: js.UndefOr[js.Any] = js.undefined
  
  var filter: js.UndefOr[js.Any] = js.undefined
}
object Conv3DBackpropInputInputs {
  
  @scala.inline
  def apply(): Conv3DBackpropInputInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Conv3DBackpropInputInputs]
  }
  
  @scala.inline
  implicit class Conv3DBackpropInputInputsMutableBuilder[Self <: Conv3DBackpropInputInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDy(value: js.Any): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    @scala.inline
    def setFilter(value: js.Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
