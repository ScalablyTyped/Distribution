package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'input' | 'numLower' | 'numUpper'> */
trait MatrixBandPartInputs extends StObject {
  
  var input: js.UndefOr[scala.Any] = js.undefined
  
  var numLower: js.UndefOr[scala.Any] = js.undefined
  
  var numUpper: js.UndefOr[scala.Any] = js.undefined
}
object MatrixBandPartInputs {
  
  inline def apply(): MatrixBandPartInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatrixBandPartInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MatrixBandPartInputs] (val x: Self) extends AnyVal {
    
    inline def setInput(value: scala.Any): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setNumLower(value: scala.Any): Self = StObject.set(x, "numLower", value.asInstanceOf[js.Any])
    
    inline def setNumLowerUndefined: Self = StObject.set(x, "numLower", js.undefined)
    
    inline def setNumUpper(value: scala.Any): Self = StObject.set(x, "numUpper", value.asInstanceOf[js.Any])
    
    inline def setNumUpperUndefined: Self = StObject.set(x, "numUpper", js.undefined)
  }
}
