package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchMatMulAttrs extends StObject {
  
  var transposeA: Boolean
  
  var transposeB: Boolean
}
object BatchMatMulAttrs {
  
  inline def apply(transposeA: Boolean, transposeB: Boolean): BatchMatMulAttrs = {
    val __obj = js.Dynamic.literal(transposeA = transposeA.asInstanceOf[js.Any], transposeB = transposeB.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchMatMulAttrs]
  }
  
  extension [Self <: BatchMatMulAttrs](x: Self) {
    
    inline def setTransposeA(value: Boolean): Self = StObject.set(x, "transposeA", value.asInstanceOf[js.Any])
    
    inline def setTransposeB(value: Boolean): Self = StObject.set(x, "transposeB", value.asInstanceOf[js.Any])
  }
}
