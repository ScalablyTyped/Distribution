package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_names.UnaryInputs */
trait SoftplusInputs extends StObject {
  
  var x: js.UndefOr[js.Any] = js.undefined
}
object SoftplusInputs {
  
  inline def apply(): SoftplusInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoftplusInputs]
  }
  
  extension [Self <: SoftplusInputs](x: Self) {
    
    inline def setX(value: js.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
