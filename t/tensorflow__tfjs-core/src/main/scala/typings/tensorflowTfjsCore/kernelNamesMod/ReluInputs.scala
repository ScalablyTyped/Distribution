package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'x'> */
@js.native
trait ReluInputs extends StObject {
  
  var x: js.UndefOr[js.Any] = js.native
}
object ReluInputs {
  
  @scala.inline
  def apply(): ReluInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReluInputs]
  }
  
  @scala.inline
  implicit class ReluInputsMutableBuilder[Self <: ReluInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: js.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
