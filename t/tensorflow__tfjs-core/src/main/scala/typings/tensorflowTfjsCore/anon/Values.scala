package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Values[T /* <: Tensor[Rank] */] extends js.Object {
  
  var indices: Tensor1D = js.native
  
  var values: T = js.native
}
object Values {
  
  @scala.inline
  def apply[T /* <: Tensor[Rank] */](indices: Tensor1D, values: T): Values[T] = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Values[T]]
  }
  
  @scala.inline
  implicit class ValuesOps[Self <: Values[_], T /* <: Tensor[Rank] */] (val x: Self with Values[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIndices(value: Tensor1D): Self = this.set("indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: T): Self = this.set("values", value.asInstanceOf[js.Any])
  }
}
