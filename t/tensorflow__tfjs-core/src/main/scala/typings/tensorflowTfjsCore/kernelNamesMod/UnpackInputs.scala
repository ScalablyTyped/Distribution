package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'value'> */
@js.native
trait UnpackInputs extends StObject {
  
  var value: js.UndefOr[js.Any] = js.native
}
object UnpackInputs {
  
  @scala.inline
  def apply(): UnpackInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnpackInputs]
  }
  
  @scala.inline
  implicit class UnpackInputsMutableBuilder[Self <: UnpackInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
