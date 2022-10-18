package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'data' | 'dataSplits'> */
trait StringNGramsInputs extends StObject {
  
  var data: js.UndefOr[scala.Any] = js.undefined
  
  var dataSplits: js.UndefOr[scala.Any] = js.undefined
}
object StringNGramsInputs {
  
  inline def apply(): StringNGramsInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringNGramsInputs]
  }
  
  extension [Self <: StringNGramsInputs](x: Self) {
    
    inline def setData(value: scala.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataSplits(value: scala.Any): Self = StObject.set(x, "dataSplits", value.asInstanceOf[js.Any])
    
    inline def setDataSplitsUndefined: Self = StObject.set(x, "dataSplits", js.undefined)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
