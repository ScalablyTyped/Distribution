package typings.tensorflowTfjsBackendWebgl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core.NamedTensorInfoMap, 'y' | 'dy'> */
trait PickNamedTensorInfoMapydy extends StObject {
  
  var dy: js.UndefOr[Any] = js.undefined
  
  var y: js.UndefOr[Any] = js.undefined
}
object PickNamedTensorInfoMapydy {
  
  inline def apply(): PickNamedTensorInfoMapydy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickNamedTensorInfoMapydy]
  }
  
  extension [Self <: PickNamedTensorInfoMapydy](x: Self) {
    
    inline def setDy(value: Any): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    inline def setY(value: Any): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
