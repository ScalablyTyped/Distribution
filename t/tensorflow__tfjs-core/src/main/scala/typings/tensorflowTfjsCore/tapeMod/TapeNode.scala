package typings.tensorflowTfjsCore.tapeMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TapeNode extends js.Object {
  var gradient: js.UndefOr[js.Function1[/* dys */ js.Array[Tensor[Rank]], NamedGradientMap]] = js.native
  var id: Double = js.native
  var inputs: NamedTensorMap = js.native
  var kernelName: String = js.native
  var outputs: js.Array[Tensor[Rank]] = js.native
  var saved: js.UndefOr[js.Array[Tensor[Rank]]] = js.native
}

object TapeNode {
  @scala.inline
  def apply(id: Double, inputs: NamedTensorMap, kernelName: String, outputs: js.Array[Tensor[Rank]]): TapeNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], kernelName = kernelName.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TapeNode]
  }
  @scala.inline
  implicit class TapeNodeOps[Self <: TapeNode] (val x: Self) extends AnyVal {
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputs(value: NamedTensorMap): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setKernelName(value: String): Self = this.set("kernelName", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputsVarargs(value: Tensor[Rank]*): Self = this.set("outputs", js.Array(value :_*))
    @scala.inline
    def setOutputs(value: js.Array[Tensor[Rank]]): Self = this.set("outputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setGradient(value: /* dys */ js.Array[Tensor[Rank]] => NamedGradientMap): Self = this.set("gradient", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGradient: Self = this.set("gradient", js.undefined)
    @scala.inline
    def setSavedVarargs(value: Tensor[Rank]*): Self = this.set("saved", js.Array(value :_*))
    @scala.inline
    def setSaved(value: js.Array[Tensor[Rank]]): Self = this.set("saved", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaved: Self = this.set("saved", js.undefined)
  }
  
}

