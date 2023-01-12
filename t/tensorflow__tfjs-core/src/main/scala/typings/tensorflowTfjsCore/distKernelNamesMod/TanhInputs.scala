package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_names.UnaryInputs */
trait TanhInputs extends StObject {
  
  var x: js.UndefOr[scala.Any] = js.undefined
}
object TanhInputs {
  
  inline def apply(): TanhInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TanhInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TanhInputs] (val x: Self) extends AnyVal {
    
    inline def setX(value: scala.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
