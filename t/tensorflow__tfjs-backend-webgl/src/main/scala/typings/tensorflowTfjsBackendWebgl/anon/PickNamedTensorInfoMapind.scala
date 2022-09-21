package typings.tensorflowTfjsBackendWebgl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core.NamedTensorInfoMap, 'indices'> */
trait PickNamedTensorInfoMapind extends StObject {
  
  var indices: js.UndefOr[Any] = js.undefined
}
object PickNamedTensorInfoMapind {
  
  inline def apply(): PickNamedTensorInfoMapind = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickNamedTensorInfoMapind]
  }
  
  extension [Self <: PickNamedTensorInfoMapind](x: Self) {
    
    inline def setIndices(value: Any): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
  }
}
