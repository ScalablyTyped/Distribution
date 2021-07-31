package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'x'> */
trait SeluInputs extends StObject {
  
  var x: js.UndefOr[js.Any] = js.undefined
}
object SeluInputs {
  
  @scala.inline
  def apply(): SeluInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeluInputs]
  }
  
  @scala.inline
  implicit class SeluInputsMutableBuilder[Self <: SeluInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: js.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
