package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImagRealRank extends js.Object {
  var imag: Tensor[Rank]
  var real: Tensor[Rank]
}

object AnonImagRealRank {
  @scala.inline
  def apply(imag: Tensor[Rank], real: Tensor[Rank]): AnonImagRealRank = {
    val __obj = js.Dynamic.literal(imag = imag.asInstanceOf[js.Any], real = real.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonImagRealRank]
  }
}

