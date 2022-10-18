package typings.tensorflowTfjsCore.distKernelNamesMod

import typings.tensorflowTfjsCore.distOpsFusedTypesMod.Activation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FusedMatMulAttrs extends StObject {
  
  var activation: Activation
  
  var leakyreluAlpha: js.UndefOr[Double] = js.undefined
  
  var transposeA: Boolean
  
  var transposeB: Boolean
}
object FusedMatMulAttrs {
  
  inline def apply(activation: Activation, transposeA: Boolean, transposeB: Boolean): FusedMatMulAttrs = {
    val __obj = js.Dynamic.literal(activation = activation.asInstanceOf[js.Any], transposeA = transposeA.asInstanceOf[js.Any], transposeB = transposeB.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusedMatMulAttrs]
  }
  
  extension [Self <: FusedMatMulAttrs](x: Self) {
    
    inline def setActivation(value: Activation): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
    
    inline def setLeakyreluAlpha(value: Double): Self = StObject.set(x, "leakyreluAlpha", value.asInstanceOf[js.Any])
    
    inline def setLeakyreluAlphaUndefined: Self = StObject.set(x, "leakyreluAlpha", js.undefined)
    
    inline def setTransposeA(value: Boolean): Self = StObject.set(x, "transposeA", value.asInstanceOf[js.Any])
    
    inline def setTransposeB(value: Boolean): Self = StObject.set(x, "transposeB", value.asInstanceOf[js.Any])
  }
}
