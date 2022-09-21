package typings.tensorflowTfjsBackendWebgl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core.NamedTensorInfoMap, 'x' | 'y' | 'dy'> */
trait PickNamedTensorInfoMapxyd extends StObject {
  
  var dy: js.UndefOr[Any] = js.undefined
  
  var x: js.UndefOr[Any] = js.undefined
  
  var y: js.UndefOr[Any] = js.undefined
}
object PickNamedTensorInfoMapxyd {
  
  inline def apply(): PickNamedTensorInfoMapxyd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickNamedTensorInfoMapxyd]
  }
  
  extension [Self <: PickNamedTensorInfoMapxyd](x: Self) {
    
    inline def setDy(value: Any): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    inline def setX(value: Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Any): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
