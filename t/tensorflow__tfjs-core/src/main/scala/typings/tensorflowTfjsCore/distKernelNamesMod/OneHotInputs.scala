package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'indices'> */
trait OneHotInputs extends StObject {
  
  var indices: js.UndefOr[scala.Any] = js.undefined
}
object OneHotInputs {
  
  inline def apply(): OneHotInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OneHotInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OneHotInputs] (val x: Self) extends AnyVal {
    
    inline def setIndices(value: scala.Any): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
  }
}
