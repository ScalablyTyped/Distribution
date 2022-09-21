package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'x'> */
trait LogicalNotInputs extends StObject {
  
  var x: js.UndefOr[scala.Any] = js.undefined
}
object LogicalNotInputs {
  
  inline def apply(): LogicalNotInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogicalNotInputs]
  }
  
  extension [Self <: LogicalNotInputs](x: Self) {
    
    inline def setX(value: scala.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
