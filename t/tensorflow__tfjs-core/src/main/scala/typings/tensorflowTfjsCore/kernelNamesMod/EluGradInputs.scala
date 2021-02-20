package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'dy' | 'y'> */
@js.native
trait EluGradInputs extends StObject {
  
  var dy: js.UndefOr[js.Any] = js.native
  
  var y: js.UndefOr[js.Any] = js.native
}
object EluGradInputs {
  
  @scala.inline
  def apply(): EluGradInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EluGradInputs]
  }
  
  @scala.inline
  implicit class EluGradInputsMutableBuilder[Self <: EluGradInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDy(value: js.Any): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    @scala.inline
    def setY(value: js.Any): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
