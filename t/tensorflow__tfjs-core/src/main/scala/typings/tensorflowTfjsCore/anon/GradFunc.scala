package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GradFunc[T /* <: Tensor[Rank] */] extends StObject {
  
  def gradFunc(dy: T, saved: js.Array[Tensor[Rank]]): Tensor[Rank] | js.Array[Tensor[Rank]]
  
  var value: T
}
object GradFunc {
  
  inline def apply[T /* <: Tensor[Rank] */](gradFunc: (T, js.Array[Tensor[Rank]]) => Tensor[Rank] | js.Array[Tensor[Rank]], value: T): GradFunc[T] = {
    val __obj = js.Dynamic.literal(gradFunc = js.Any.fromFunction2(gradFunc), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradFunc[T]]
  }
  
  extension [Self <: GradFunc[?], T /* <: Tensor[Rank] */](x: Self & GradFunc[T]) {
    
    inline def setGradFunc(value: (T, js.Array[Tensor[Rank]]) => Tensor[Rank] | js.Array[Tensor[Rank]]): Self = StObject.set(x, "gradFunc", js.Any.fromFunction2(value))
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
