package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'input' | 'delimiter'> */
trait StringSplitInputs extends StObject {
  
  var delimiter: js.UndefOr[scala.Any] = js.undefined
  
  var input: js.UndefOr[scala.Any] = js.undefined
}
object StringSplitInputs {
  
  inline def apply(): StringSplitInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringSplitInputs]
  }
  
  extension [Self <: StringSplitInputs](x: Self) {
    
    inline def setDelimiter(value: scala.Any): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    inline def setInput(value: scala.Any): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
  }
}
