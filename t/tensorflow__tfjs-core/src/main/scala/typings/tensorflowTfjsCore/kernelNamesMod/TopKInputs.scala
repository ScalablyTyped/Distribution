package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'x'> */
trait TopKInputs extends StObject {
  
  var x: js.UndefOr[js.Any] = js.undefined
}
object TopKInputs {
  
  @scala.inline
  def apply(): TopKInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopKInputs]
  }
  
  @scala.inline
  implicit class TopKInputsMutableBuilder[Self <: TopKInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: js.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
