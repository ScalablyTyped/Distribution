package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'value'> */
trait UnpackInputs extends StObject {
  
  var value: js.UndefOr[js.Any] = js.undefined
}
object UnpackInputs {
  
  inline def apply(): UnpackInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnpackInputs]
  }
  
  extension [Self <: UnpackInputs](x: Self) {
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
