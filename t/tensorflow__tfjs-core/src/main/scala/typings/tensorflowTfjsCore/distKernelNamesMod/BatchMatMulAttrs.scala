package typings.tensorflowTfjsCore.distKernelNamesMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchMatMulAttrs] (val x: Self) extends AnyVal {
    
    inline def setTransposeA(value: Boolean): Self = StObject.set(x, "transposeA", value.asInstanceOf[js.Any])
    
    inline def setTransposeB(value: Boolean): Self = StObject.set(x, "transposeB", value.asInstanceOf[js.Any])
  }
}
