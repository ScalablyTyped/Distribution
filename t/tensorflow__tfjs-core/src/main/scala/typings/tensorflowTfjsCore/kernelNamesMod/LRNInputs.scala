package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'x'> */
trait LRNInputs extends StObject {
  
  var x: js.UndefOr[js.Any] = js.undefined
}
object LRNInputs {
  
  inline def apply(): LRNInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LRNInputs]
  }
  
  extension [Self <: LRNInputs](x: Self) {
    
    inline def setX(value: js.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
