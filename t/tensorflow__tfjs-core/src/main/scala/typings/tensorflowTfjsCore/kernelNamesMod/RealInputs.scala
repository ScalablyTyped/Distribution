package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'input'> */
trait RealInputs extends StObject {
  
  var input: js.UndefOr[js.Any] = js.undefined
}
object RealInputs {
  
  @scala.inline
  def apply(): RealInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RealInputs]
  }
  
  @scala.inline
  implicit class RealInputsMutableBuilder[Self <: RealInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput(value: js.Any): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
  }
}
