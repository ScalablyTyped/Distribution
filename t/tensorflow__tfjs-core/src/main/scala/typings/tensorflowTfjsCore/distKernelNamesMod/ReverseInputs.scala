package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'x'> */
trait ReverseInputs extends StObject {
  
  var x: js.UndefOr[scala.Any] = js.undefined
}
object ReverseInputs {
  
  inline def apply(): ReverseInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReverseInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReverseInputs] (val x: Self) extends AnyVal {
    
    inline def setX(value: scala.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
