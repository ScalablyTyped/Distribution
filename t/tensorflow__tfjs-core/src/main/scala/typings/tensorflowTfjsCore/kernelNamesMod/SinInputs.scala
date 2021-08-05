package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_names.UnaryInputs */
trait SinInputs extends StObject {
  
  var x: js.UndefOr[js.Any] = js.undefined
}
object SinInputs {
  
  inline def apply(): SinInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SinInputs]
  }
  
  extension [Self <: SinInputs](x: Self) {
    
    inline def setX(value: js.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
