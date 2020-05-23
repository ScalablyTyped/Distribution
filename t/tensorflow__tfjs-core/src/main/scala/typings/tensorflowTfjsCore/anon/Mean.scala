package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mean extends js.Object {
  var mean: Tensor[Rank]
  var variance: Tensor[Rank]
}

object Mean {
  @scala.inline
  def apply(mean: Tensor[Rank], variance: Tensor[Rank]): Mean = {
    val __obj = js.Dynamic.literal(mean = mean.asInstanceOf[js.Any], variance = variance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mean]
  }
}

