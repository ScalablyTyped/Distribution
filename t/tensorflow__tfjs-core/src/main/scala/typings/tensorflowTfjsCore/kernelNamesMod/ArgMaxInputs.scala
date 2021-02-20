package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'x'> */
@js.native
trait ArgMaxInputs extends StObject {
  
  var x: js.UndefOr[js.Any] = js.native
}
object ArgMaxInputs {
  
  @scala.inline
  def apply(): ArgMaxInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArgMaxInputs]
  }
  
  @scala.inline
  implicit class ArgMaxInputsMutableBuilder[Self <: ArgMaxInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: js.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
