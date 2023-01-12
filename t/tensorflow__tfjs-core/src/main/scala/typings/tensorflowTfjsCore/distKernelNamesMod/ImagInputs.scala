package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'input'> */
trait ImagInputs extends StObject {
  
  var input: js.UndefOr[scala.Any] = js.undefined
}
object ImagInputs {
  
  inline def apply(): ImagInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImagInputs] (val x: Self) extends AnyVal {
    
    inline def setInput(value: scala.Any): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
  }
}
