package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'x' | 'alpha'> */
@js.native
trait PreluInputs extends StObject {
  
  var alpha: js.UndefOr[js.Any] = js.native
  
  var x: js.UndefOr[js.Any] = js.native
}
object PreluInputs {
  
  @scala.inline
  def apply(): PreluInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreluInputs]
  }
  
  @scala.inline
  implicit class PreluInputsMutableBuilder[Self <: PreluInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: js.Any): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    @scala.inline
    def setX(value: js.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
