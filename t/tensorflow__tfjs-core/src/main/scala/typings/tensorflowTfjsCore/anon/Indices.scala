package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Indices[T /* <: Tensor[Rank] */] extends js.Object {
  var indices: T = js.native
  var values: T = js.native
}

object Indices {
  @scala.inline
  def apply[/* <: typings.tensorflowTfjsCore.tensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */ T](indices: T, values: T): Indices[T] = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indices[T]]
  }
  @scala.inline
  implicit class IndicesOps[Self <: Indices[_], /* <: typings.tensorflowTfjsCore.tensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */ T] (val x: Self with Indices[T]) extends AnyVal {
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
    def setIndices(value: T): Self = this.set("indices", value.asInstanceOf[js.Any])
    @scala.inline
    def setValues(value: T): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

