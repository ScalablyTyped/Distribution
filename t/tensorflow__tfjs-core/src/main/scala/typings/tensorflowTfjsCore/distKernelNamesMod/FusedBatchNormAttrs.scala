package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FusedBatchNormAttrs extends StObject {
  
  var varianceEpsilon: Double
}
object FusedBatchNormAttrs {
  
  inline def apply(varianceEpsilon: Double): FusedBatchNormAttrs = {
    val __obj = js.Dynamic.literal(varianceEpsilon = varianceEpsilon.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusedBatchNormAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FusedBatchNormAttrs] (val x: Self) extends AnyVal {
    
    inline def setVarianceEpsilon(value: Double): Self = StObject.set(x, "varianceEpsilon", value.asInstanceOf[js.Any])
  }
}
