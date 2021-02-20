package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Indices[T /* <: Tensor[Rank] */] extends StObject {
  
  var indices: T = js.native
  
  var values: T = js.native
}
object Indices {
  
  @scala.inline
  def apply[T /* <: Tensor[Rank] */](indices: T, values: T): Indices[T] = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indices[T]]
  }
  
  @scala.inline
  implicit class IndicesMutableBuilder[Self <: Indices[_], T /* <: Tensor[Rank] */] (val x: Self with Indices[T]) extends AnyVal {
    
    @scala.inline
    def setIndices(value: T): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: T): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
