package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SoftmaxAttrs extends StObject {
  
  var dim: Double
}
object SoftmaxAttrs {
  
  inline def apply(dim: Double): SoftmaxAttrs = {
    val __obj = js.Dynamic.literal(dim = dim.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoftmaxAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SoftmaxAttrs] (val x: Self) extends AnyVal {
    
    inline def setDim(value: Double): Self = StObject.set(x, "dim", value.asInstanceOf[js.Any])
  }
}
