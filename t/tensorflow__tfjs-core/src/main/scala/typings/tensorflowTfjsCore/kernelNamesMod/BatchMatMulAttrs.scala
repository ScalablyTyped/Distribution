package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchMatMulAttrs extends StObject {
  
  var transposeA: Boolean
  
  var transposeB: Boolean
}
object BatchMatMulAttrs {
  
  @scala.inline
  def apply(transposeA: Boolean, transposeB: Boolean): BatchMatMulAttrs = {
    val __obj = js.Dynamic.literal(transposeA = transposeA.asInstanceOf[js.Any], transposeB = transposeB.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchMatMulAttrs]
  }
  
  @scala.inline
  implicit class BatchMatMulAttrsMutableBuilder[Self <: BatchMatMulAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransposeA(value: Boolean): Self = StObject.set(x, "transposeA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransposeB(value: Boolean): Self = StObject.set(x, "transposeB", value.asInstanceOf[js.Any])
  }
}
