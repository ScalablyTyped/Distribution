package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_names.UnaryInputs */
trait Expm1Inputs extends StObject {
  
  var x: js.UndefOr[scala.Any] = js.undefined
}
object Expm1Inputs {
  
  inline def apply(): Expm1Inputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Expm1Inputs]
  }
  
  extension [Self <: Expm1Inputs](x: Self) {
    
    inline def setX(value: scala.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
