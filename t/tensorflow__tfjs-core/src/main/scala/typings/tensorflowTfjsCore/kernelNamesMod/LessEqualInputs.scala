package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_names.BinaryInputs */
trait LessEqualInputs extends StObject {
  
  var a: js.UndefOr[js.Any] = js.undefined
  
  var b: js.UndefOr[js.Any] = js.undefined
}
object LessEqualInputs {
  
  inline def apply(): LessEqualInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LessEqualInputs]
  }
  
  extension [Self <: LessEqualInputs](x: Self) {
    
    inline def setA(value: js.Any): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setAUndefined: Self = StObject.set(x, "a", js.undefined)
    
    inline def setB(value: js.Any): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setBUndefined: Self = StObject.set(x, "b", js.undefined)
  }
}
