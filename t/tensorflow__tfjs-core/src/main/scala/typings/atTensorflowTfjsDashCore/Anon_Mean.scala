package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mean extends js.Object {
  var mean: Tensor[Rank]
  var variance: Tensor[Rank]
}

object Anon_Mean {
  @scala.inline
  def apply(mean: Tensor[Rank], variance: Tensor[Rank]): Anon_Mean = {
    val __obj = js.Dynamic.literal(mean = mean.asInstanceOf[js.Any], variance = variance.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Mean]
  }
}

