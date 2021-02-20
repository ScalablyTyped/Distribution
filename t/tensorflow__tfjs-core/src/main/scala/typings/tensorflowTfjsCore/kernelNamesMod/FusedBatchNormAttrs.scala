package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FusedBatchNormAttrs extends StObject {
  
  var varianceEpsilon: Double = js.native
}
object FusedBatchNormAttrs {
  
  @scala.inline
  def apply(varianceEpsilon: Double): FusedBatchNormAttrs = {
    val __obj = js.Dynamic.literal(varianceEpsilon = varianceEpsilon.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusedBatchNormAttrs]
  }
  
  @scala.inline
  implicit class FusedBatchNormAttrsMutableBuilder[Self <: FusedBatchNormAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVarianceEpsilon(value: Double): Self = StObject.set(x, "varianceEpsilon", value.asInstanceOf[js.Any])
  }
}
