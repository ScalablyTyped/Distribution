package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_names.UnaryInputs */
trait ExpInputs extends StObject {
  
  var x: js.UndefOr[scala.Any] = js.undefined
}
object ExpInputs {
  
  inline def apply(): ExpInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpInputs] (val x: Self) extends AnyVal {
    
    inline def setX(value: scala.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
