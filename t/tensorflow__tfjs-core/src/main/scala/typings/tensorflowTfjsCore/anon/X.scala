package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X extends StObject {
  
  def x(): Tensor[Rank]
}
object X {
  
  inline def apply(x: () => Tensor[Rank]): X = {
    val __obj = js.Dynamic.literal(x = js.Any.fromFunction0(x))
    __obj.asInstanceOf[X]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: X] (val x: Self) extends AnyVal {
    
    inline def setX(value: () => Tensor[Rank]): Self = StObject.set(x, "x", js.Any.fromFunction0(value))
  }
}
