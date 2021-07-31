package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'x' | 'filter'> */
trait Conv3DInputs extends StObject {
  
  var filter: js.UndefOr[js.Any] = js.undefined
  
  var x: js.UndefOr[js.Any] = js.undefined
}
object Conv3DInputs {
  
  @scala.inline
  def apply(): Conv3DInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Conv3DInputs]
  }
  
  @scala.inline
  implicit class Conv3DInputsMutableBuilder[Self <: Conv3DInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: js.Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setX(value: js.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
