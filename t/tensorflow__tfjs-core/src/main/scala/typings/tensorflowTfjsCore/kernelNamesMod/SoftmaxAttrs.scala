package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SoftmaxAttrs extends StObject {
  
  var dim: Double = js.native
}
object SoftmaxAttrs {
  
  @scala.inline
  def apply(dim: Double): SoftmaxAttrs = {
    val __obj = js.Dynamic.literal(dim = dim.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoftmaxAttrs]
  }
  
  @scala.inline
  implicit class SoftmaxAttrsMutableBuilder[Self <: SoftmaxAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDim(value: Double): Self = StObject.set(x, "dim", value.asInstanceOf[js.Any])
  }
}
