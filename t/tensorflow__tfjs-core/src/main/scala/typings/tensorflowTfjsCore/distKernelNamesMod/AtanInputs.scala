package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_names.UnaryInputs */
trait AtanInputs extends StObject {
  
  var x: js.UndefOr[scala.Any] = js.undefined
}
object AtanInputs {
  
  inline def apply(): AtanInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AtanInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AtanInputs] (val x: Self) extends AnyVal {
    
    inline def setX(value: scala.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
