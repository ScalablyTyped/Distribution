package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GradsValue[T /* <: Tensor[Rank] */] extends StObject {
  
  var grads: js.Array[Tensor[Rank]]
  
  var value: T
}
object GradsValue {
  
  inline def apply[T /* <: Tensor[Rank] */](grads: js.Array[Tensor[Rank]], value: T): GradsValue[T] = {
    val __obj = js.Dynamic.literal(grads = grads.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradsValue[T]]
  }
  
  extension [Self <: GradsValue[?], T /* <: Tensor[Rank] */](x: Self & GradsValue[T]) {
    
    inline def setGrads(value: js.Array[Tensor[Rank]]): Self = StObject.set(x, "grads", value.asInstanceOf[js.Any])
    
    inline def setGradsVarargs(value: Tensor[Rank]*): Self = StObject.set(x, "grads", js.Array(value*))
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
