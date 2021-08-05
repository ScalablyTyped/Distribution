package typings.tensorflowTfjsBackendCpu.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core.NamedTensorInfoMap, 'x'> */
trait PickNamedTensorInfoMapx extends StObject {
  
  var x: js.UndefOr[js.Any] = js.undefined
}
object PickNamedTensorInfoMapx {
  
  inline def apply(): PickNamedTensorInfoMapx = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickNamedTensorInfoMapx]
  }
  
  extension [Self <: PickNamedTensorInfoMapx](x: Self) {
    
    inline def setX(value: js.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
