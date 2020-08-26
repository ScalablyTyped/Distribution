package typings.tensorflowTfjsConverter.tensorArrayMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TensorWithState extends js.Object {
  var cleared: js.UndefOr[Boolean] = js.native
  var read: js.UndefOr[Boolean] = js.native
  var tensor: js.UndefOr[Tensor[Rank]] = js.native
  var written: js.UndefOr[Boolean] = js.native
}

object TensorWithState {
  @scala.inline
  def apply(): TensorWithState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TensorWithState]
  }
  @scala.inline
  implicit class TensorWithStateOps[Self <: TensorWithState] (val x: Self) extends AnyVal {
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
    def setCleared(value: Boolean): Self = this.set("cleared", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCleared: Self = this.set("cleared", js.undefined)
    @scala.inline
    def setRead(value: Boolean): Self = this.set("read", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    @scala.inline
    def setTensor(value: Tensor[Rank]): Self = this.set("tensor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTensor: Self = this.set("tensor", js.undefined)
    @scala.inline
    def setWritten(value: Boolean): Self = this.set("written", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWritten: Self = this.set("written", js.undefined)
  }
  
}

