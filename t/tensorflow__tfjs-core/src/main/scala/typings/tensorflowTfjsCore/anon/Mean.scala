package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mean extends js.Object {
  var mean: Tensor[Rank] = js.native
  var variance: Tensor[Rank] = js.native
}

object Mean {
  @scala.inline
  def apply(mean: Tensor[Rank], variance: Tensor[Rank]): Mean = {
    val __obj = js.Dynamic.literal(mean = mean.asInstanceOf[js.Any], variance = variance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mean]
  }
  @scala.inline
  implicit class MeanOps[Self <: Mean] (val x: Self) extends AnyVal {
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
    def setMean(value: Tensor[Rank]): Self = this.set("mean", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariance(value: Tensor[Rank]): Self = this.set("variance", value.asInstanceOf[js.Any])
  }
  
}

