package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'sortedSequence' | 'values'> */
trait LowerBoundInputs extends StObject {
  
  var sortedSequence: js.UndefOr[scala.Any] = js.undefined
  
  var values: js.UndefOr[scala.Any] = js.undefined
}
object LowerBoundInputs {
  
  inline def apply(): LowerBoundInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LowerBoundInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LowerBoundInputs] (val x: Self) extends AnyVal {
    
    inline def setSortedSequence(value: scala.Any): Self = StObject.set(x, "sortedSequence", value.asInstanceOf[js.Any])
    
    inline def setSortedSequenceUndefined: Self = StObject.set(x, "sortedSequence", js.undefined)
    
    inline def setValues(value: scala.Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
