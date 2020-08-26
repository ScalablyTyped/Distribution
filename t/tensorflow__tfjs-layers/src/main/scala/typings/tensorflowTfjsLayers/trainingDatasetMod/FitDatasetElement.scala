package typings.tensorflowTfjsLayers.trainingDatasetMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsLayers.distTypesMod.TensorOrArrayOrMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FitDatasetElement extends js.Object {
  var xs: TensorOrArrayOrMap = js.native
  var ys: TensorOrArrayOrMap = js.native
}

object FitDatasetElement {
  @scala.inline
  def apply(xs: TensorOrArrayOrMap, ys: TensorOrArrayOrMap): FitDatasetElement = {
    val __obj = js.Dynamic.literal(xs = xs.asInstanceOf[js.Any], ys = ys.asInstanceOf[js.Any])
    __obj.asInstanceOf[FitDatasetElement]
  }
  @scala.inline
  implicit class FitDatasetElementOps[Self <: FitDatasetElement] (val x: Self) extends AnyVal {
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
    def setXsVarargs(value: Tensor[Rank]*): Self = this.set("xs", js.Array(value :_*))
    @scala.inline
    def setXs(value: TensorOrArrayOrMap): Self = this.set("xs", value.asInstanceOf[js.Any])
    @scala.inline
    def setYsVarargs(value: Tensor[Rank]*): Self = this.set("ys", js.Array(value :_*))
    @scala.inline
    def setYs(value: TensorOrArrayOrMap): Self = this.set("ys", value.asInstanceOf[js.Any])
  }
  
}

