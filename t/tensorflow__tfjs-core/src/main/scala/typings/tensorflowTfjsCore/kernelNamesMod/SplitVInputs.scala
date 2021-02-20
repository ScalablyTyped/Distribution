package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'x'> */
@js.native
trait SplitVInputs extends StObject {
  
  var x: js.UndefOr[js.Any] = js.native
}
object SplitVInputs {
  
  @scala.inline
  def apply(): SplitVInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplitVInputs]
  }
  
  @scala.inline
  implicit class SplitVInputsMutableBuilder[Self <: SplitVInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: js.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
