package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'x'> */
trait SplitVInputs extends StObject {
  
  var x: js.UndefOr[scala.Any] = js.undefined
}
object SplitVInputs {
  
  inline def apply(): SplitVInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplitVInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SplitVInputs] (val x: Self) extends AnyVal {
    
    inline def setX(value: scala.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
