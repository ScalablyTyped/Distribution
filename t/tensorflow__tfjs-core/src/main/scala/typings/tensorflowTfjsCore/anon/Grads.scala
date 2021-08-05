package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Grads[O /* <: Tensor[Rank] */] extends StObject {
  
  var grads: js.Array[Tensor[Rank]]
  
  var value: O
}
object Grads {
  
  inline def apply[O /* <: Tensor[Rank] */](grads: js.Array[Tensor[Rank]], value: O): Grads[O] = {
    val __obj = js.Dynamic.literal(grads = grads.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grads[O]]
  }
  
  extension [Self <: Grads[?], O /* <: Tensor[Rank] */](x: Self & Grads[O]) {
    
    inline def setGrads(value: js.Array[Tensor[Rank]]): Self = StObject.set(x, "grads", value.asInstanceOf[js.Any])
    
    inline def setGradsVarargs(value: Tensor[Rank]*): Self = StObject.set(x, "grads", js.Array(value :_*))
    
    inline def setValue(value: O): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
