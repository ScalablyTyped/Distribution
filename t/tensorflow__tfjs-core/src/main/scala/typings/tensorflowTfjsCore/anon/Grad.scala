package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Grad[O /* <: Tensor[Rank] */, I /* <: Tensor[Rank] */] extends StObject {
  
  var grad: I
  
  var value: O
}
object Grad {
  
  inline def apply[O /* <: Tensor[Rank] */, I /* <: Tensor[Rank] */](grad: I, value: O): Grad[O, I] = {
    val __obj = js.Dynamic.literal(grad = grad.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grad[O, I]]
  }
  
  extension [Self <: Grad[?, ?], O /* <: Tensor[Rank] */, I /* <: Tensor[Rank] */](x: Self & (Grad[O, I])) {
    
    inline def setGrad(value: I): Self = StObject.set(x, "grad", value.asInstanceOf[js.Any])
    
    inline def setValue(value: O): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
