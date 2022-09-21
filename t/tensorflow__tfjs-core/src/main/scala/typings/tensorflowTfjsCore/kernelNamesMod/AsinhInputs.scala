package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_names.UnaryInputs */
trait AsinhInputs extends StObject {
  
  var x: js.UndefOr[scala.Any] = js.undefined
}
object AsinhInputs {
  
  inline def apply(): AsinhInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsinhInputs]
  }
  
  extension [Self <: AsinhInputs](x: Self) {
    
    inline def setX(value: scala.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
