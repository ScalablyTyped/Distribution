package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'indices'> */
@js.native
trait OneHotInputs extends StObject {
  
  var indices: js.UndefOr[js.Any] = js.native
}
object OneHotInputs {
  
  @scala.inline
  def apply(): OneHotInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OneHotInputs]
  }
  
  @scala.inline
  implicit class OneHotInputsMutableBuilder[Self <: OneHotInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndices(value: js.Any): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
  }
}
