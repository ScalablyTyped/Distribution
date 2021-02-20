package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait X extends StObject {
  
  def x(): Tensor[Rank] = js.native
}
object X {
  
  @scala.inline
  def apply(x: () => Tensor[Rank]): X = {
    val __obj = js.Dynamic.literal(x = js.Any.fromFunction0(x))
    __obj.asInstanceOf[X]
  }
  
  @scala.inline
  implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: () => Tensor[Rank]): Self = StObject.set(x, "x", js.Any.fromFunction0(value))
  }
}
