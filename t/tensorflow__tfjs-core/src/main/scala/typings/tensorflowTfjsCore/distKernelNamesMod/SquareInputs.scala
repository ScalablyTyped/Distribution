package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'x'> */
trait SquareInputs extends StObject {
  
  var x: js.UndefOr[scala.Any] = js.undefined
}
object SquareInputs {
  
  inline def apply(): SquareInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SquareInputs]
  }
  
  extension [Self <: SquareInputs](x: Self) {
    
    inline def setX(value: scala.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
