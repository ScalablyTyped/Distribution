package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_names.UnaryInputs */
trait CeilInputs extends StObject {
  
  var x: js.UndefOr[scala.Any] = js.undefined
}
object CeilInputs {
  
  inline def apply(): CeilInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CeilInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CeilInputs] (val x: Self) extends AnyVal {
    
    inline def setX(value: scala.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
