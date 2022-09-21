package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'sortedSequence' | 'values'> */
trait SearchSortedInputs extends StObject {
  
  var sortedSequence: js.UndefOr[scala.Any] = js.undefined
  
  var values: js.UndefOr[scala.Any] = js.undefined
}
object SearchSortedInputs {
  
  inline def apply(): SearchSortedInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchSortedInputs]
  }
  
  extension [Self <: SearchSortedInputs](x: Self) {
    
    inline def setSortedSequence(value: scala.Any): Self = StObject.set(x, "sortedSequence", value.asInstanceOf[js.Any])
    
    inline def setSortedSequenceUndefined: Self = StObject.set(x, "sortedSequence", js.undefined)
    
    inline def setValues(value: scala.Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
