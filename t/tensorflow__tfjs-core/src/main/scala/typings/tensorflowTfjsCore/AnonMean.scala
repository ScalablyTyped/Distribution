package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMean extends js.Object {
  var mean: Tensor[Rank]
  var variance: Tensor[Rank]
}

object AnonMean {
  @scala.inline
  def apply(mean: Tensor[Rank], variance: Tensor[Rank]): AnonMean = {
    val __obj = js.Dynamic.literal(mean = mean.asInstanceOf[js.Any], variance = variance.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMean]
  }
}

